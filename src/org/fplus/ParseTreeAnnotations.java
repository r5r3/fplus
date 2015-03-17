package org.fplus;

import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.fplus.parser.fplusParser;

/**
 * The Informations created during the different parsing steps are collected 
 * in this class. 
 * 
 * @author Robert Redl
 */
public class ParseTreeAnnotations {

    // head of the parse tree
    protected ParseTree head = null;
    // a reference to the parser itself
    protected fplusParser parser = null;
    protected CharStream charstream = null;
    protected TokenStream tokenstream = null;

    // all expensions are stored in parse tree properties
    protected ParseTreeProperty<String> expansions = new ParseTreeProperty<String>();

    // all variables are stored in tree properties
    protected ParseTreeProperty<HashMap<String,Variable>> variables = new ParseTreeProperty<HashMap<String, Variable>>();

    // interfaces block locations are detected on the first walk, but the expansion
    // is created when the template is reached
    protected HashMap<String, fplusParser.InterfaceLineContext> interfaceLines = new HashMap<String, fplusParser.InterfaceLineContext>();

    // generic type bound procedures are located in the first walk, but the expansion
    // is generated when the template is reached
    protected HashMap<String, fplusParser.GenericTypeBoundLineContext> genericLines = new HashMap<String, fplusParser.GenericTypeBoundLineContext>();

    // content to be added at the end of a program or module
    protected ParseTreeProperty<ArrayList<String>> endOfModuleOrProgramContent = new ParseTreeProperty<ArrayList<String>>();
    
    // content to be added at the end of the declaration part of a modue or program
    protected ParseTreeProperty<ArrayList<String>> endOfDeclarationContent = new ParseTreeProperty<ArrayList<String>>();    
       
    // a sign used to add comments to the file
    protected char LineCommentPrefix = '!';
    
    public ParseTreeAnnotations(ParseTree head, fplusParser parser) {
        this.head = head;
        this.parser = parser;
        this.tokenstream = this.parser.getInputStream();
        this.charstream = this.parser.getInputStream().getTokenSource().getInputStream();
    }

    
    /**
     * Store the expansion for a node
     * @param ctx
     * @param expansion
     */
    public void setExpansion(ParseTree ctx, String expansion) {
        this.expansions.put(ctx, expansion);
    }
    
    /**
     * Read an expansion for a node
     * @param ctx
     * @return
     */
    public String getExpansion(ParseTree ctx) {
        return this.expansions.get(ctx);
    }
    
    /**
     * Add auto generated content for the end of a module or a program
     * @param ctx       the context from which the content was created. 
     *                  The corresponding module or program is retrieved 
     *                  automatically.
     * @param content   the content to be added.
     * @param createContains    in a program, create a contains statement if not present
     * @return          true, if the content was not already present.
     */
    public boolean addEndOFModuleOrProgramContent(ParserRuleContext ctx, String content, boolean createContains) {
        // find the parent module or program.
        ParserRuleContext parent = this.getModuleOrProgram(ctx);
        
        // add the content
        ArrayList<String> cont = this.endOfModuleOrProgramContent.get(parent);
        if (cont == null) {
            cont = new ArrayList<String>();
            this.endOfModuleOrProgramContent.put(parent, cont);
        }
        // add a conatins line if required
        if (createContains && cont.isEmpty()) {
            boolean hasContains = false;
            if (parent instanceof fplusParser.ModuleBlockContext) {
                hasContains = ((fplusParser.ModuleBlockContext)parent).containsLine() != null;
            }
            if (parent instanceof fplusParser.ProgramBlockContext) {
                hasContains = ((fplusParser.ProgramBlockContext)parent).containsLine() != null;
            }
            if (!hasContains) {
                cont.add("contains");
                cont.add("\n");
            }
        }
        if (cont.contains(content)) {
            return false;
        } else {
            cont.add(content);
            return true;
        }
    }
    
    /**
     * Add auto generated content for the end of a module or a program
     * @param ctx       the context from which the content was created. 
     *                  The corresponding module or program is retrieved 
     *                  automatically.
     * @param content   the content to be added.
     * @param moduleOnly    if true, the content is only added if we are in a module
     * @return          true, if the new content was added, false if this content is already present or not added
     */
    public boolean addEndOfDeclarationContent(ParserRuleContext ctx, String content, boolean moduleOnly) {
        // find the parent module or program.
        ParserRuleContext parent = this.getModuleOrProgram(ctx);
        
        // is this module only content? 
        if (parent instanceof fplusParser.ProgramBlockContext && moduleOnly) return false;
        
        // add the content
        ArrayList<String> cont = this.endOfDeclarationContent.get(parent);
        if (cont == null) {
            cont = new ArrayList<String>();
            this.endOfDeclarationContent.put(parent, cont);
        }
        if (cont.contains(content)) {
            return false;
        } else {
            cont.add(content);
            return true;
        }
    }
    
    /**
     * Add a variable to a node, it is visible for this node and all children
     * @param ctx
     * @param var
     */
    public void addVariable(ParseTree ctx, Variable var) {
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
     * find the module or program to which a rule belongs.
     * @param ctx
     * @return 
     */
    private ParserRuleContext getModuleOrProgram(ParserRuleContext ctx) {
        // find the module or program which is the parent of this dynamic_cast
        ParserRuleContext parent = ctx.getParent();
        boolean found = false;
        while (parent.depth() != 1) {
            if (parent instanceof fplusParser.ProgramBlockContext || parent instanceof fplusParser.ModuleBlockContext) {
                found = true;
                break;
            }
            parent = parent.getParent();
        }
        if (!found) {
            Logger.Error("construct only allowed inside of program or module bodys!", ctx.getStart().getLine());
        }        
        return parent;
    }
    
    /**
     * Find a variable defined in ths context or in a parent context.
     * @param ctx
     * @param name
     * @return
     */
    public Variable getVariable(ParseTree ctx, String name) {
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
     * Returns true for rule contexts that have their own expansion
     * @param tree
     * @return
     */
    public boolean hasOwnExpansion(ParserRuleContext ctx) {
        if (ctx instanceof fplusParser.LoopBlockContext) return true;
        if (ctx instanceof fplusParser.PlaceholderContext) return true;
        if (ctx instanceof fplusParser.VariableDefinitionContext) return true;
        if (ctx instanceof fplusParser.InterfaceLineContext) return true;
        if (ctx instanceof fplusParser.GenericTypeBoundLineContext) return true;
        if (ctx instanceof fplusParser.TemplateBlockContext) return true;
        if (ctx instanceof fplusParser.ExprContext) return true;
        if (ctx instanceof fplusParser.LogicalExprContext) return true;
        if (ctx instanceof fplusParser.IfSingleLineContext) return true;
        if (ctx instanceof fplusParser.IfBlockContext) return true;
        if (ctx instanceof fplusParser.DynamicCastContext) return true;
        return false;
    }
}
