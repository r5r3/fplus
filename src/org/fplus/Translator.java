package org.fplus;

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

        StringBuilder buffer = new StringBuilder();
        for (int i=0; i<ctx.getChildCount();i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof ParserRuleContext) {
                String expansion = this.getExpansion(child);
                buffer.append(expansion);
                //System.out.println(expansion);
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
