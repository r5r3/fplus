package org.fplus;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.fplus.parser.fplusBaseListener;
import org.fplus.parser.fplusParser;
import org.stringtemplate.v4.AutoIndentWriter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 * The actual work is done within this class. 
 * 
 * @author
 * Robert Schuster
 */
public class Translator extends fplusBaseListener {

    // a reference to the parser itself
    private fplusParser parser = null;
    private CharStream charstream = null;
    private TokenStream tokenstream = null;
    private ParseTree head = null;
    
    // all expensions are stored in parse tree properties
    private ParseTreeProperty<String> expansions = new ParseTreeProperty<String>();
    
    // all variables are stored in tree properties
    private ParseTreeProperty<HashMap<String,Variable>> variables = new ParseTreeProperty<HashMap<String, Variable>>();
    
    // in addition, loop variables are stored in this extra property
    private ParseTreeProperty<Variable> loop_variables = new ParseTreeProperty<Variable>();
    
    // are we in the first pass of a loop?
    private ParseTreeProperty<Boolean> loop_in_first_pass = new ParseTreeProperty<Boolean>();
    
    // interfaces block locations are detected on the first walk, but the expansion
    // is created when the template is reached
    private HashMap<String, fplusParser.InterfaceLineContext> interfaceLines = new HashMap<String, fplusParser.InterfaceLineContext>();
    
    // this list is used to store the procedures that are found while walker trough a template
    private ArrayList<String> proceduresInCurrentTemplate = null;
    
    // the complete translation
    private String translation = null;
    
    // this variable is set to true if a expansion causes a expansion somewhere 
    // else in the tree to change.
    private boolean needSecondWalk = false;
    
    // a sign used to add comments to the file
    private char LineCommentPrefix = '!';

    public Translator(fplusParser parser, ParseTree head) {
        this.parser = parser;
        this.tokenstream = parser.getInputStream();
        this.charstream = tokenstream.getTokenSource().getInputStream();
        this.head = head;
    }
    
    /**
     * Store the expansion for a node
     * @param ctx
     * @param expansion
     */
    private void setExpansion(ParseTree ctx, String expansion) {
        this.expansions.put(ctx, expansion);
    }
    
    /**
     * Read an expansion for a node
     * @param ctx
     * @return
     */
    private String getExpansion(ParseTree ctx) {
        return this.expansions.get(ctx);
    }
    
    /**
     * Add a variable to a node, it is visible for this node and all children
     * @param ctx
     * @param var
     */
    private void addVariable(ParseTree ctx, Variable var) {
        // are there already variables?
        HashMap<String,Variable> vars = this.variables.get(ctx);
        if (vars == null) {
            vars = new HashMap<String, Variable>();
            //store the variable
            vars.put(var.name, var);
            this.variables.put(ctx, vars);
        } else {
            vars.put(var.name, var);
        }
        
    }
    
    /**
     * Find a variable defined in ths context or in a parent context.
     * @param ctx
     * @param name
     * @return
     */
    private Variable getVariable(ParseTree ctx, String name) {
        // are there any variables in this context?
        HashMap<String,Variable> vars = this.variables.get(ctx);
        if (vars != null) {
            // we have variables, is the searched one included?
            if (vars.containsKey(name)) return vars.get(name);            
        }
        // nothing found, take a look into the parent
        if (ctx.getParent() != null) return getVariable(ctx.getParent(), name);
        // nothing found and no parent
        return null;
    }
    
    /**
     * The start of a loop is used to retrieve loop variable
     * @param ctx 
     */
    @Override
    public void enterLoopBlock(fplusParser.LoopBlockContext ctx) {
        //create the loop variable
        Variable loop_variable = getList(ctx.loopBegin().listAssignment());
        
        // check if we already have a variable with this name
        Variable test = this.getVariable(ctx, loop_variable.name);
        if (test != null) {
            Logger.Warning("Loop variable " + loop_variable.name + " hides a variable with the same name!", null);
        }
        
        // store the first element of the loop variable in the context, 
        // this ensures that the placeholders are expanded on the first visit
        this.addVariable(ctx, loop_variable.getElement(0));
        
        // store the variable also for later usage in the loop_variables 
        this.loop_variables.put(ctx, loop_variable);
        
        // we are now in the first pass of the loop body
        this.loop_in_first_pass.put(ctx, true);
    }

    /**
     * The actual loop iteration is done here 
     * @param ctx 
     */
    @Override
    public void exitLoopBlock(fplusParser.LoopBlockContext ctx) {
        // get the loop variable
        Variable loop_variable = this.loop_variables.get(ctx);
        
        // create a new walker to walk the subtree of the loop block centent over and over again within the loop
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // the string for the expansion
        StringBuilder expansion = new StringBuilder();
        
        // get the single value of the loop variable that is stored in the tree
        Variable var = this.getVariable(ctx, loop_variable.name);

        // set the head of the subtreecleaner to this context
        SubtreeCleaner scleaner = new SubtreeCleaner(ctx);
        
        // we have now left the first pass and loop not over the loop body again
        this.loop_in_first_pass.put(ctx, false);
        
        // loop over all elements of the loop variable
        for (int i=0;i<loop_variable.length();i++) {
            // remove all variables that are stored in deeper levels of the tree
            walker.walk(scleaner, ctx);
            // set the value of the loop variable
            var.setValue(0, loop_variable.getValue(i));
            // walk the subtree
            walker.walk(this, ctx.contentBlock());
            // get the expansion
            expansion.append(this.getExpansion(ctx.contentBlock()));
        }
        
        // store the expansion 
        this.setExpansion(ctx, expansion.toString());
    }
    
    /**
     * this method is used to store the expansion of every rule.
     * This expansion is changed for some Rules in the exit methods.
     * @param ctx 
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        this.setExpansion(ctx, ctx.getText());
    }

    /**
     * Merge the Expansions from all children
     * @param ctx 
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // contatinate the expansions from all children
        mergeRuleExpansions(ctx);
 
        // is this is the head node, then walk the tree again to get the 
        // changes from interfaces for templates
        if (ctx != this.head) return;
        
        // walk again?
        if (needSecondWalk) {
            //create a tree walker
            ParseTreeWalker walker = new ParseTreeWalker();

            //create the merger
            ExpansionMerger merger = new ExpansionMerger();

            //walk the tree to merge all expansion
            walker.walk(merger, ctx);
        }
        
        // are there unexpanded interface lines?
        if (!interfaceLines.isEmpty()) {
            for (fplusParser.InterfaceLineContext ilc:interfaceLines.values()) {
                Logger.Warning(String.format("unused interface line '%s'.", ilc.Identifier().getText()), ilc.Interface().getSymbol().getLine());
            }
        }
        
        // store the final result if this head node
        translation = this.getExpansion(ctx);
        System.out.println("");
        System.out.println("RESULT:");
        System.out.println(translation);
    }

    /**
     * Combine the Expansions from all children of a rule
     * @param ctx
     */
    private void mergeRuleExpansions(ParserRuleContext ctx) {
        // some rules have there own merging method
        if (ctx instanceof fplusParser.LoopBlockContext) return;
        if (ctx instanceof fplusParser.PlaceholderContext) return;
        if (ctx instanceof fplusParser.VariableDefinitionContext) return;
        if (ctx instanceof fplusParser.InterfaceLineContext) return;
        if (ctx instanceof fplusParser.TemplateBlockContext) return;

        StringBuilder buffer = new StringBuilder();
        for (int i=0; i<ctx.getChildCount();i++) {
            ParseTree child = ctx.getChild(i);
            String expansion = this.getExpansion(child);
            if (expansion != null) {
                buffer.append(expansion);
            } else {
                buffer.append(child.getText());
            }
        }
        if (buffer.length() > 0) this.setExpansion(ctx, buffer.toString());
    }   

    @Override
    public void exitPlaceholder(fplusParser.PlaceholderContext ctx) {
        //get at first the name of the variable
        List<TerminalNode> ids = ctx.Identifier();
        String varname = ids.get(0).getSymbol().getText();
        //is there a subscript?
        String subscriptname = null;
        if (ids.size() > 1) subscriptname = ids.get(1).getSymbol().getText();
        
        //find the variable in a the current context
        Variable var = this.getVariable(ctx, varname);
        if (var == null) {
            Logger.Error("Variable not found: "+varname, null);
        } else {
            
            //is there a subscript?
            int subscript = 0;
            if (subscriptname != null) {
                Variable subscriptvar = this.getVariable(ctx, subscriptname);
                if (subscriptvar == null) {
                    Logger.Error("Variable not found: "+subscriptname, null);
                } else {
                    //try to convert the subscript to an integer
                    String subvalue = subscriptvar.getValue(0);
                    try {
                        subscript = Integer.parseInt(subvalue);
                    } catch (NumberFormatException ne) {
                        Logger.Error("Unable to convert the value of "+subscriptname+" ("+subvalue+") to an integer.", null);
                    }
                }
            }

            // subscript in range?
            if (subscript+1 > var.length()) {
                Logger.Error(String.format("Subscript out of range for variable %s(%d)", varname, subscript), null);
            }
            
            // set the expansion for this placeholder
            this.setExpansion(ctx, var.getValue(subscript));    
        }
    }

    /**
     * An interface line is the location where the interface block for a template 
     * is created. 
     * @param ctx 
     */
    @Override
    public void exitInterfaceLine(fplusParser.InterfaceLineContext ctx) {
        String name = ctx.Identifier().getSymbol().getText();
        interfaceLines.put(name, ctx);
    }

    /**
     * An empty list of procedures is created at the beginning of an template
     * @param ctx 
     */
    @Override
    public void enterTemplateBlock(fplusParser.TemplateBlockContext ctx) {
        // ensure that we ware not in an nested template
        if (proceduresInCurrentTemplate != null) Logger.Error("Nested templates are not allowed!", ctx.Template(0).getSymbol().getLine());
        
        // create the new list
        proceduresInCurrentTemplate = new ArrayList<String>();
    }

    
    
    /**
     * The interface block is created on exit of the template block
     * @param ctx 
     */
    @Override
    public void exitTemplateBlock(fplusParser.TemplateBlockContext ctx) {
        // we need a second run for the interface block expansion to be included into the translation result
        needSecondWalk = true;
        
        // get the interface block context
        String name = ctx.Identifier(0).getSymbol().getText();
        fplusParser.InterfaceLineContext ilc = interfaceLines.get(name);
        if (ilc == null) {
            Logger.Warning(String.format("Template %s has no interface block.", name), ctx.Template(0).getSymbol().getLine());
        } else {
            // create the interface block from the procedure names
            STGroup tgroup = new STGroupFile("org/fplus/templates/interfaceBlock.stg");
            ST intface = tgroup.getInstanceOf("interface");
            intface.add("name", name);
            intface.add("procname", proceduresInCurrentTemplate);
            StringWriter sw = new StringWriter();
            AutoIndentWriter aiw = new AutoIndentWriter(sw);
            TerminalNode firstWS = ilc.WS(0);
            TerminalNode prefix = ilc.Prefix();
            if (firstWS.getSymbol().getTokenIndex() < prefix.getSymbol().getTokenIndex()) {
                aiw.pushIndentation(firstWS.getSymbol().getText());
                
            }
            try {
                intface.write(aiw);
            } catch (IOException ex) {}
            //store the created string as expansion for the interface block
            this.setExpansion(ilc, sw.toString());

            //remove the interface line from the hash map of interface lines. each interface line
            // should be used exactly ones.
            interfaceLines.remove(name);
        }
        
        // remove the list of procedures, not longer needed
        proceduresInCurrentTemplate = null;
        
        // the the expansion to the expansion of the contentblock
        this.setExpansion(ctx, this.getExpansion(ctx.contentBlock()));     
    }

    /**
     * If we are within a template, we need to store the function or subroutine name
     * @param ctx 
     */
    @Override
    public void exitProcedureBlock(fplusParser.ProcedureBlockContext ctx) {
        // are we in a template?
        if (proceduresInCurrentTemplate == null) return;
        
        // are we in a loop? and if so, are we in the first pass
        ParseTree tree = ctx;
        while (tree != head) {
            tree = tree.getParent();
            Boolean inFirstPass = this.loop_in_first_pass.get(tree);
            if (inFirstPass != null && inFirstPass == true) return;
        }
        
        // get the identifier
        List<TerminalNode> id = null;
        ParserRuleContext subroutineOrFunctionBlock = null;
        TerminalNode subroutineOrFunction = null;
        int endline = 0;
        if (ctx.functionBlock() != null) {
            id = ctx.functionBlock().Identifier();
            endline = ctx.functionBlock().End().getSymbol().getLine();
            subroutineOrFunctionBlock = ctx.functionBlock();
            subroutineOrFunction = ctx.functionBlock().Function(0);
        }
        if (ctx.subroutineBlock() != null) {
            id = ctx.subroutineBlock().Identifier();
            endline = ctx.subroutineBlock().End().getSymbol().getLine();
            subroutineOrFunctionBlock = ctx.subroutineBlock();
            subroutineOrFunction = ctx.subroutineBlock().Subroutine(0);
        }
        
        // id will never be null, but we can avoid a warning with this line
        if (id == null) return;
        
        // get the original name
        int nameIDindex = 0;
        while (id.get(nameIDindex).getSymbol().getTokenIndex() < subroutineOrFunction.getSymbol().getTokenIndex()) {
            nameIDindex += 1;
        }
        String id1 = id.get(nameIDindex).getSymbol().getText();
        
        // create the new name
        String newname = String.format("%s_%d", id1, proceduresInCurrentTemplate.size()+1);
        
        // add this procedure to the list of all procedures in this template
        proceduresInCurrentTemplate.add(newname);
        
        // the the expansion for the identifier
        this.setExpansion(id.get(nameIDindex), newname);
        
        // how many identifiers?
        if (id.size() > 1 && id.get(id.size()-1).getSymbol().getLine() == endline) {
            // check if the first and the last identifier are identical
            String id2 = id.get(id.size()-1).getSymbol().getText();
            if (!id1.equalsIgnoreCase(id2)) Logger.Error(String.format("Identifiers at begin and end don't match: %s != %s", id1, id2), id.get(0).getSymbol().getLine());
            // the the expansion for the identifier
            this.setExpansion(id.get(id.size()-1), newname);
        }
        
        // we have changed some expansions, that means we have to merge the expansion for this block again
        mergeRuleExpansions(subroutineOrFunctionBlock);
        mergeRuleExpansions(ctx);
    }
    
    
    
    /**
     * Define a variable in the parent context
     * @param ctx 
     */
    @Override
    public void exitVariableDefinition(fplusParser.VariableDefinitionContext ctx) {
        // create the new variable
        Variable new_var = getList(ctx.listAssignment());
        // place it inside the parents context
        this.addVariable(ctx.getParent(), new_var);
        // this line has no expansion
        this.setExpansion(ctx, String.format("%s%s %s\n", ctx.WS(0).getSymbol().getText(), LineCommentPrefix, new_var.toString()));
    }
    
    /**
     * Remove lines that start with !$FP
     * @param text
     * @return
     */
    private String removePrefixedLines(String text) {
        StringBuilder buffer = new StringBuilder();
        String[] lines = text.split("\n");
        for (String line:lines) {
            if (!line.trim().startsWith("!$FP")) buffer.append(line).append("\n");
        }
        return buffer.toString();
    }
    
    /**
     * Creates a new Variable from a List Assignment
     * @param ctx
     * @return
     */
    private Variable getList(fplusParser.ListAssignmentContext ctx) {
        // create the variable
        String name = ctx.Identifier().getText();
        Variable result = new Variable(name);
        // store the values, try at first the do loop like innitialization: name = start, ende
        List<TerminalNode> ints =  ctx.IntegerConstant();
        if (!ints.isEmpty()) {
            int start = Integer.parseInt(ints.get(0).getText());
            int end = Integer.parseInt(ints.get(1).getText());
            for (int i=start; i<=end; i++) {
                result.addValue(Integer.toString(i));
            }
        // try the list like initialization
        } else {
            List<fplusParser.ListItemContext> items = ctx.list().listItem();
            for (int i=0;i<items.size();i++) {
                Token start = items.get(i).getStart();
                Token stop = items.get(i).getStop();
                if (start == stop) {
                    result.addValue(start.getText());
                } else {
                    // skip the '{' and '}'
                    int startindex = start.getTokenIndex();
                    int stopindex = stop.getTokenIndex();
                    if (startindex+1 == stopindex) {
                        result.addValue("");
                    } else {
                        start = tokenstream.get(startindex+1);
                        stop = tokenstream.get(stopindex-1);
                        Interval range = new Interval(start.getStartIndex(), stop.getStopIndex());
                        result.addValue(charstream.getText(range));
                    }
                }
            }
        }
        return result;   
    }
        
    /**
     * Used to remove variable definitiions in deeper levels of the tree 
     * to aviod overwrite warnings
     */
    private class SubtreeCleaner extends fplusBaseListener {

        private ParserRuleContext head;
        
        /**
         * if set, then the head is not cleaned
         * @param newhead
         */
        public SubtreeCleaner(ParserRuleContext newhead) {
            this.head = newhead;
        }
        
        @Override
        public void exitEveryRule(ParserRuleContext ctx) {
            // don't clean the head
            if (head != null && ctx == head) return;
            
            // check if we have variables at this position of the tree
            HashMap<String, Variable> vars = variables.get(ctx);
            if (vars != null) variables.removeFrom(ctx);
        }
       
    }
    
    /**
     * Used to walk the tree after the first walk again and to merge 
     * all expansion.
     * 
     * This is needed because interfaces blocks are not in the same subtree then
     * their corresponding template definitions
     */
    private class ExpansionMerger extends fplusBaseListener {

        /**
         * Merge the Expansions from all children
         * @param ctx 
         */
        @Override
        public void exitEveryRule(ParserRuleContext ctx) {
            // contatinate the expansions from all children
            mergeRuleExpansions(ctx);
        }

    }
    
}
