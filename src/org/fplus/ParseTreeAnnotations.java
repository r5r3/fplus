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
 * @author Robert Schuster
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
    //
    //    // in addition, loop variables are stored in this extra property
    //    protected ParseTreeProperty<Variable> loop_variables = new ParseTreeProperty<Variable>();
    //
    //    // the values of expressions are evaluated and stored here
    //    protected ParseTreeProperty<Variable> expressions = new ParseTreeProperty<Variable>();
    //
    //    // the result of logical expressions are stored in booleans
    //    protected ParseTreeProperty<Variable> logicalExpressions = new ParseTreeProperty<Variable>();
    //
    //    // are we in the first pass of a loop?
    //    protected ParseTreeProperty<Boolean> loop_in_first_pass = new ParseTreeProperty<Boolean>();
    //
    // interfaces block locations are detected on the first walk, but the expansion
    // is created when the template is reached
    protected HashMap<String, fplusParser.InterfaceLineContext> interfaceLines = new HashMap<String, fplusParser.InterfaceLineContext>();
    //
    // generic type bound procedures are located in the first walk, but the expansion
    // is generated when the tamplate is reached
    protected HashMap<String, fplusParser.GenericTypeBoundLineContext> genericLines = new HashMap<String, fplusParser.GenericTypeBoundLineContext>();
    //
    //    protected ArrayList<String> proceduresInCurrentTemplate = null;
    //    protected ArrayList<String> proceduresInCurrentTemplate = null;

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
        return false;
    }
}
