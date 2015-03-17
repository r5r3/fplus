package org.fplus;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.fplus.parser.fplusBaseVisitor;
import org.fplus.parser.fplusParser;
import org.stringtemplate.v4.AutoIndentWriter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 * This visitor walks the complete tree and creates expansions for some 
 * rules. The expansions the in a second step merged by a Listener.
 * 
 * @author Robert Redl
 */
public class TreeVisitor extends fplusBaseVisitor<Object> {

    // all informations created during parsing goes here
    private ParseTreeAnnotations info;
    ExpansionMerger merger;

    // this list is used to store the procedures that are found while walking trough a template
    private ArrayList<String> proceduresInCurrentTemplate = null;
    
    public TreeVisitor(ParseTreeAnnotations info, ExpansionMerger merger) {
        this.info = info;
        this.merger = merger;
    }

    /**
     * set the default expansion for a rule
     * @param rn
     * @return 
     */
    @Override
    public Object visitChildren(RuleNode rn) {
        // set the text of the rule as new expansion
        Object result = super.visitChildren(rn);
        merger.mergeRuleExpansions((ParserRuleContext) rn.getRuleContext());
        return result;
    }

    private Variable visitExpr(fplusParser.ExprContext ctx) {
        if (ctx instanceof fplusParser.ExprAddSubContext) 
            return (Variable) visitExprAddSub((fplusParser.ExprAddSubContext)ctx);
        if (ctx instanceof fplusParser.ExprArraySubscriptContext) 
            return (Variable) visitExprArraySubscript((fplusParser.ExprArraySubscriptContext)ctx);
        if (ctx instanceof fplusParser.ExprConstantsContext) 
            return (Variable) visitExprConstants((fplusParser.ExprConstantsContext)ctx);
        if (ctx instanceof fplusParser.ExprMulDivContext) 
            return (Variable) visitExprMulDiv((fplusParser.ExprMulDivContext)ctx);
        if (ctx instanceof fplusParser.ExprParensContext) 
            return (Variable) visitExprParens((fplusParser.ExprParensContext)ctx);
        if (ctx instanceof fplusParser.ExprVariableContext) 
            return (Variable) visitExprVariable((fplusParser.ExprVariableContext)ctx);
        return null;
    }

    @Override
    public Object visitExprAddSub(fplusParser.ExprAddSubContext ctx) {
        // get the first operand
        Variable var1 = visitExpr(ctx.expr(0));
        // get the second operand
        Variable var2 = visitExpr(ctx.expr(1));
        // perform the calculation
        Variable result = var1.mathematicalOperation(ctx.op.getText().charAt(0), var2);
        if (result == null) {
            Logger.Error("evaluation of mathematical expressin failed", ctx.op.getLine());
            return null;
        }
        // store the expansion as a text
        if (result.length() == 1) {
            info.setExpansion(ctx, result.getValue(1));
        } else if (result.length() > 1) {
            info.setExpansion(ctx, result.getElementsString());
        }
        // store the variable for further usage
        return result;
    }
    
    @Override
    public Object visitExprArraySubscript(fplusParser.ExprArraySubscriptContext ctx) {
        String varname = ctx.Identifier().getText();
        //find the variable in a the current context
        Variable var = info.getVariable(ctx, varname);
        if (var == null) {
            Logger.Error("Variable not found: "+varname, null);  
        } else {
            //get the index from the expression in parens 
            fplusParser.ExprContext index = ctx.expr();
            // get the corresponding variable
            Variable indexvar = visitExpr(ctx.expr());
            //only one element?
            if (indexvar.length() != 1) {
                Logger.Error("A variable subscript must have exactly one element.", index.start.getLine());
            } else {
                // variable contains an integer value?
                Integer intval = indexvar.getValueAsInt(1);
                if (intval == null) {
                    Logger.Error(String.format("unable to convert variable '%s' to an integer: %s", indexvar.name, indexvar.getValue(1)), index.start.getLine());
                } else {
                    // subscript out of range? 
                    if (intval > var.length() || intval < 1) {
                        Logger.Error(String.format("variable '%s' out of range with subscript %d", var.name, intval), index.start.getLine());
                    } else {
                        // everything fine, use the value of var at index expr
                        if (var.length() == 1) {
                            info.setExpansion(ctx, var.getValue(1));
                            return var.getElement(1);
                        } else if (var.length() > 1) {
                            info.setExpansion(ctx, var.getValue(intval));
                            return var.getElement(intval);
                        } else {
                            Logger.Error("empty variable used in expression", ctx.Identifier().getSymbol().getLine());
                        }                      
                    }
                }
            }
        } 
        return null;
    }

    @Override
    public Object visitExprConstants(fplusParser.ExprConstantsContext ctx) {
        // create a new variable
        String name = String.format("anonymous_l%d_c%d", ctx.IntegerConstant().getSymbol().getLine(), ctx.IntegerConstant().getSymbol().getCharPositionInLine());
        Variable var = new Variable(name);
        var.addValue(ctx.IntegerConstant().getText());
        // set expansion and expression value
        info.setExpansion(ctx, ctx.IntegerConstant().getText());
        return var;       
    }

    @Override
    public Object visitExprMulDiv(fplusParser.ExprMulDivContext ctx) {
        // get the first operand
        Variable var1 = visitExpr(ctx.expr(0));
        // get the second operand
        Variable var2 = visitExpr(ctx.expr(1));
        // perform the calculation
        Variable result = var1.mathematicalOperation(ctx.op.getText().charAt(0), var2);
        if (result == null) {
            Logger.Error("evaluation of mathematical expressin failed", ctx.op.getLine());
            return null;
        }
        // store the expansion as a text
        if (result.length() == 1) {
            info.setExpansion(ctx, result.getValue(1));
        } else if (result.length() > 1) {
            info.setExpansion(ctx, result.getElementsString());
        }
        // store the variable for further usage
        return result;
    }

    @Override
    public Object visitExprParens(fplusParser.ExprParensContext ctx) {
        info.setExpansion(ctx, info.getExpansion(ctx.expr()));
        return visitExpr(ctx.expr());
    }
    
    /**
     * A variable expression expands to the value of the variable.
     * @param ctx 
     */
    @Override
    public Object visitExprVariable(fplusParser.ExprVariableContext ctx) {
        String varname = ctx.Identifier().getText();
        //find the variable in a the current context
        Variable var = info.getVariable(ctx, varname);
        if (var == null) {
            Logger.Error("Variable not found: "+varname, null);  
            return null;
        } else {
            // store the expansion as a text
            if (var.length() == 1) {
                info.setExpansion(ctx, var.getValue(1));
            } else if (var.length() > 1) {
                info.setExpansion(ctx, var.getElementsString());
            } else {
                Logger.Error("empty variable used in expression", ctx.Identifier().getSymbol().getLine());
            }
            return var;
        }
    }

    /**
     * Store the name and position of a type-bound procedure generic line
     * @param ctx
     * @return 
     */
    @Override
    public Object visitGenericTypeBoundLine(fplusParser.GenericTypeBoundLineContext ctx) {
        // the name is the last identifier
        String name = ctx.Identifier().get(ctx.Identifier().size()-1).getText();
        info.genericLines.put(name, ctx);
        return null;
    }

    @Override
    public Object visitIfBlock(fplusParser.IfBlockContext ctx) {
        //get the value of the logical extression
        Variable lexpr = visitLogicalExpr(ctx.logicalExpr());
        if (lexpr.length() > 1) {
            Logger.Error("single value expected in logical expression, found: "+lexpr.getElementsString(), ctx.start.getLine());
        } else {
            // the condition is true, uncomment the content line
            if (lexpr.getValue(1).equals(Variable.TRUE)) {
                // visit the content block
                visitContentBlock(ctx.contentBlock(0));
                info.setExpansion(ctx, info.getExpansion(ctx.contentBlock(0)));
            } else {
                // is there a second contentblock
                if (ctx.contentBlock().size()>1) {
                    // visit the second content block
                    visitContentBlock(ctx.contentBlock(1));
                    info.setExpansion(ctx, info.getExpansion(ctx.contentBlock(1)));                    
                } else {
                    // there is no else block
                    String expansion = Helper.getLeadingWS(ctx) + info.LineCommentPrefix + ctx.If(0).getText() + "(" + info.getExpansion(ctx.logicalExpr()) + ") then ... \n"; 
                    info.setExpansion(ctx, expansion);
                }
            }
        }
        return null;        
    }
    
    @Override
    public Object visitIfSingleLine(fplusParser.IfSingleLineContext ctx) {
        //get the value of the logical extression
        Variable lexpr = visitLogicalExpr(ctx.logicalExpr());
        if (lexpr.length() > 1) {
            Logger.Error("single value expected in logical expression, found: "+lexpr.getElementsString(), ctx.start.getLine());
        } else {
            // the condition is true, uncomment the content line
            if (lexpr.getValue(1).equals(Variable.TRUE)) {
                // visit the content line to create its expansion
                visitContentLine(ctx.contentLine());
                info.setExpansion(ctx, Helper.getLeadingWS(ctx) + info.getExpansion(ctx.contentLine()));
            } else {
                // the condition if false, the content line remains commented and is not visited!
                info.setExpansion(ctx, Helper.getLeadingWS(ctx) + info.LineCommentPrefix + " " + ctx.contentLine().getText());
            }
        }
        return null;
    }
    
    /**
     * Store the name and position of an interface block in a list.
     * @param ctx
     * @return 
     */
    @Override
    public Object visitInterfaceLine(fplusParser.InterfaceLineContext ctx) {
        String name = ctx.Identifier().getSymbol().getText();
        if (ctx.OperatorOverload() != null) name += " " + ctx.OperatorOverload().getText();
        info.interfaceLines.put(name, ctx);
        return null;
    } 
    
    /**
     * Creates a new Variable from a List Assignment
     * @param ctx
     * @return
     */
    @Override
    public Object visitListAssignment(fplusParser.ListAssignmentContext ctx) {
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
                        start = info.tokenstream.get(startindex+1);
                        stop = info.tokenstream.get(stopindex-1);
                        Interval range = new Interval(start.getStartIndex(), stop.getStopIndex());
                        result.addValue(info.charstream.getText(range));
                    }
                }
            }
        }
        return result;   
    }

    /**
     * A wrapper for all logical expression types
     * @param ctx
     * @return
     */
    public Variable visitLogicalExpr(fplusParser.LogicalExprContext ctx) {
        if (ctx instanceof fplusParser.LogicalExprAndContext) 
            return (Variable) visitLogicalExprAnd((fplusParser.LogicalExprAndContext)ctx);
        if (ctx instanceof fplusParser.LogicalExprCompareContext) 
            return (Variable) visitLogicalExprCompare((fplusParser.LogicalExprCompareContext)ctx);
        if (ctx instanceof fplusParser.LogicalExprNotContext) 
            return (Variable) visitLogicalExprNot((fplusParser.LogicalExprNotContext)ctx);
        if (ctx instanceof fplusParser.LogicalExprOrContext) 
            return (Variable) visitLogicalExprOr((fplusParser.LogicalExprOrContext)ctx);
        return null;
    }

    @Override
    public Object visitLogicalExprCompare(fplusParser.LogicalExprCompareContext ctx) {
        // find the both variables included in this logical epression
        Variable var1 = visitExpr(ctx.expr(0));
        Variable var2 = visitExpr(ctx.expr(1));
        // both variables have to have the same length
        Variable result = var1.logicalOperation(ctx.op.getType(), var2);
        if (result == null) {
            Logger.Error("evaluation of logical expressin failed", ctx.op.getLine());
            return null;
        }
        // store the expansion as a text
        if (result.length() == 1) {
            info.setExpansion(ctx, result.getValue(1));
        } else if (result.length() > 1) {
            info.setExpansion(ctx, result.getElementsString());
        }
        return result;
    }

    @Override
    public Object visitLogicalExprNot(fplusParser.LogicalExprNotContext ctx) {
        Variable var = visitLogicalExpr(ctx.logicalExpr());
        // negate the included logical expression
        Variable result = new Variable(".not."+var.name);
        for (int i=1;i<=var.length(); i++) {
            String value = var.getValue(i);
            if (value.equals(Variable.TRUE)) value = Variable.FALSE;
            else value = Variable.TRUE;
            result.addValue(value);
        }
        return result;
    }

    @Override
    public Object visitLogicalExprAnd(fplusParser.LogicalExprAndContext ctx) {
        // a variable for the result
        Variable result;
        // find the first variable. 
        Variable var1 = visitLogicalExpr(ctx.logicalExpr(0));
        // check if any element is true, if not, stop the evaluation of this expression
        boolean anyTrueInVar1 = false;
        for (int i=1;i<=var1.length();i++) {
            if (var1.getValue(i).equals(Variable.TRUE)) {
                anyTrueInVar1 = true;
                break;
            }
        }
        if (!anyTrueInVar1) {
            result = new Variable(var1.name+".and. (not evaluated)");
            for (int i=1;i<=var1.length();i++) result.addValue(Variable.FALSE);
            return result;
        } 
        // now we need the second variable
        Variable var2 = visitLogicalExpr(ctx.logicalExpr(1));
        // both variables have to have the same length
        result = var1.logicalOperation(fplusParser.And, var2);
        if (result == null) {
            Logger.Error("evaluation of logical expressin failed", ctx.start.getLine());
            return null;
        }
        // store the expansion as a text
        if (result.length() == 1) {
            info.setExpansion(ctx, result.getValue(1));
        } else if (result.length() > 1) {
            info.setExpansion(ctx, result.getElementsString());
        }
        return result;
    }

    @Override
    public Object visitLogicalExprOr(fplusParser.LogicalExprOrContext ctx) {
        // a variable for the result
        Variable result;
        // find the both variables 
        Variable var1 = visitLogicalExpr(ctx.logicalExpr(0));
        Variable var2 = visitLogicalExpr(ctx.logicalExpr(1));
        result = var1.logicalOperation(fplusParser.Or, var2);
        if (result == null) {
            Logger.Error("evaluation of logical expressin failed", ctx.start.getLine());
            return null;
        }
        // store the expansion as a text
        if (result.length() == 1) {
            info.setExpansion(ctx, result.getValue(1));
        } else if (result.length() > 1) {
            info.setExpansion(ctx, result.getElementsString());
        }
        return result;
    }
    
    @Override
    public Object visitLoopBlock(fplusParser.LoopBlockContext ctx) {
        //create the loop variable
        Variable loop_variable = (Variable) visitListAssignment(ctx.loopBegin().listAssignment());

        // check if we already have a variable with this name
        Variable test = info.getVariable(ctx, loop_variable.name);
        if (test != null) {
            Logger.Warning("Loop variable " + loop_variable.name + " hides a variable with the same name!", null);
        }
        
        // the string for the expansion
        StringBuilder expansion = new StringBuilder();
        
        // create a subtree cleaner to clean up the contentblock after every loop iteration
        SubtreeCleaner scleaner = new SubtreeCleaner(info, ctx.contentBlock());

        // loop over the content block
        for (int i=1; i<=loop_variable.length(); i++) {
            // set the value of the loop variable
            info.addVariable(ctx, loop_variable.getElement(i));
            // visit the content block
            visitContentBlock(ctx.contentBlock());
            // merge the expansions from this visit
            merger.mergeRuleExpansions(ctx.contentBlock());
            // add the expanded content block to the result
            expansion.append(info.getExpansion(ctx.contentBlock()));
            // clean up
            scleaner.clean();
        }
        
        // the the expansion for this loop block
        info.setExpansion(ctx, expansion.toString());
        return null;
    }

    @Override
    public Object visitPlaceholder(fplusParser.PlaceholderContext ctx) {
        visitChildren(ctx);
        if (ctx.expr() != null) info.setExpansion(ctx, info.getExpansion(ctx.expr()));
        if (ctx.logicalExpr() != null) info.setExpansion(ctx, info.getExpansion(ctx.logicalExpr()));
        return null;
    }

    @Override
    public Object visitProcedureBlock(fplusParser.ProcedureBlockContext ctx) {        
        // visit all children of this block
        visitChildren(ctx);
        
        // are we in a template?
        if (proceduresInCurrentTemplate == null) return null;

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
        info.setExpansion(id.get(nameIDindex), newname);
        
        // how many identifiers?
        if (id.size() > 1 && id.get(id.size()-1).getSymbol().getLine() == endline) {
            // check if the first and the last identifier are identical
            String id2 = id.get(id.size()-1).getSymbol().getText();
            if (!id1.equalsIgnoreCase(id2)) Logger.Error(String.format("Identifiers at begin and end don't match: %s != %s", id1, id2), id.get(0).getSymbol().getLine());
            // the the expansion for the identifier
            info.setExpansion(id.get(id.size()-1), newname);
        }
        
        // we have changed some expansions, that means we have to merge the expansion for this block again
        merger.mergeRuleExpansions(subroutineOrFunctionBlock);
        merger.mergeRuleExpansions(ctx);
        return null;
    }
    
    @Override
    public Object visitTemplateBlock(fplusParser.TemplateBlockContext ctx) {
        // ensure that we ware not in an nested template
        if (proceduresInCurrentTemplate != null) Logger.Error("Nested templates are not allowed!", ctx.Template(0).getSymbol().getLine());
        
        // create the new list
        proceduresInCurrentTemplate = new ArrayList<String>();
        
        // visit now the content block to create its expansion
        visitContentBlock(ctx.contentBlock());
        
        // get the interface block or generic line context
        String name = ctx.Identifier(0).getSymbol().getText();
        if (ctx.OperatorOverload() != null) name += " " + ctx.OperatorOverload().getText();
        fplusParser.InterfaceLineContext ilc = info.interfaceLines.get(name);
        fplusParser.GenericTypeBoundLineContext glc = info.genericLines.get(name);
        // only one of the alternatives is allowed
        if (ilc != null && glc != null) {
            Logger.Error(String.format("template %s can not be used for an interface block and for and type-bound procedure at the same time", name), ctx.Template(0).getSymbol().getLine());
        }
        // but one of the alternatives must be there
        if (ilc == null && glc == null) {
            Logger.Warning(String.format("Template %s has no interface block and is not used for a type-bound procedure", name), ctx.Template(0).getSymbol().getLine());
        }
        
        // create the interface block
        if (ilc != null) {
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
            // store the created string as expansion for the interface block
            info.setExpansion(ilc, sw.toString());

            // remove the interface line from the hash map of interface lines. each interface line
            // should be used exactly ones.
            info.interfaceLines.remove(name);
        }
        
        // create the type-bound procedure block
        if (glc != null) {
            // create the interface block from the procedure names
            STGroup tgroup = new STGroupFile("org/fplus/templates/genericTypeBound.stg");
            ST intface = tgroup.getInstanceOf("genericLine");
            // create the genric line without the => 
            int index1 = glc.Generic().getSymbol().getStartIndex();
            int index2 = glc.AssignPointer().getSymbol().getStopIndex();
            intface.add("line", info.charstream.getText(new Interval(index1, index2)));
            intface.add("procname", proceduresInCurrentTemplate);
            intface.add("access", "private");
            StringWriter sw = new StringWriter();
            AutoIndentWriter aiw = new AutoIndentWriter(sw);
            TerminalNode firstWS = glc.WS(0);
            TerminalNode prefix = glc.Prefix();
            if (firstWS.getSymbol().getTokenIndex() < prefix.getSymbol().getTokenIndex()) {
                aiw.pushIndentation(firstWS.getSymbol().getText());  
            }
            try {
                intface.write(aiw);
            } catch (IOException ex) {}
            // store the created string as expansion for the interface block
            info.setExpansion(glc, sw.toString());

            // remove the generic line from the hash map of genric lines. each generic line
            // should be used exactly ones.
            info.genericLines.remove(name);            
        }
        
        // remove the list of procedures, not longer needed
        proceduresInCurrentTemplate = null;
        
        // the the expansion to the expansion of the contentblock
        info.setExpansion(ctx, info.getExpansion(ctx.contentBlock()));     
        return null;
    }
    
    @Override
    public Object visitVariableDefinition(fplusParser.VariableDefinitionContext ctx) {
        // create the new variable
        Variable new_var = (Variable) visitListAssignment(ctx.listAssignment());
        // place it inside the parents context
        info.addVariable(ctx.getParent(), new_var);
        // this line has no expansion
        info.setExpansion(ctx, String.format("%s%s %s\n", ctx.WS(0).getSymbol().getText(), info.LineCommentPrefix, new_var.toString()));
        return null;
    }

    @Override
    public Object visitDynamicCast(fplusParser.DynamicCastContext ctx) {       
        // create type for function name
        String fname_type = ctx.dataType().getText();
        for (fplusParser.DataTypeParameterContext dpctx:ctx.dataTypeParameter()) {
            fname_type += "_" + dpctx.getText();
        }
        fname_type = fname_type.replaceAll("[:,(]", "_");
        fname_type = fname_type.replaceAll("[)]", "");
        // create the expansion for this cast
        String functionName = String.format("fplus_autogenerated_dynamic_cast_to_%s", fname_type);
        String contentText = "";
        for (fplusParser.ContentContext cctx:ctx.content()) {
            contentText += Helper.getLeadingWS(cctx.start, info.tokenstream);
            contentText += cctx.getText();
        }
        info.setExpansion(ctx, String.format("%s(%s, %d, %d)", functionName, contentText, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));

        // create the private line for this cast, but only in a module
        String private_line = "    private :: " + functionName;
        info.addEndOfDeclarationContent(ctx, private_line, true);

        // create the function block 
        STGroup tgroup = new STGroupFile("org/fplus/templates/dynamicCast.stg");
        ST functionBlock = tgroup.getInstanceOf("implementationBlock");
        // add type and function name
        functionBlock.add("typename", ctx.dataType().getText());
        functionBlock.add("fname", functionName);
        // add class or type
        if (ctx.dataType().Class() != null) {
            functionBlock.add("type_or_class", "class");
        } else {
            functionBlock.add("type_or_class", "type");            
        }
        // type name for the select construct
        if (ctx.dataType().Type() != null || ctx.dataType().Class() != null) {
            functionBlock.add("typename_for_selection", ctx.dataType().Identifier().getText());
        } else {
            functionBlock.add("typename_for_selection", ctx.dataType().getText());
        }
        // any parameters?
        String assignment_oper = "=";
        if (ctx.dataTypeParameter().size() > 0) {
            ArrayList<String> type_parameters = new ArrayList<String>();
            for (fplusParser.DataTypeParameterContext dctx:ctx.dataTypeParameter()) {
                if (dctx.Pointer() != null) assignment_oper = "=>";
                type_parameters.add(dctx.getText());
            }
            functionBlock.add("type_parameter", type_parameters);
            functionBlock.add("has_type_parameter", true);
        } else {
            functionBlock.add("has_type_parameter", false);
        }
        functionBlock.add("assignment_oper", assignment_oper);
        info.addEndOFModuleOrProgramContent(ctx, functionBlock.render(), true);
        return null;
    }

    @Override
    public Object visitProgramBlock(fplusParser.ProgramBlockContext ctx) {
        // visit all children
        visitChildren(ctx);
        // create autogenerated content at the end of the program
        insertAutogeneratedContent(ctx);
        return null;
    }

    @Override
    public Object visitModuleBlock(fplusParser.ModuleBlockContext ctx) {
        // visit all children
        visitChildren(ctx);
        // create autogenerated content at the end of the module
        insertAutogeneratedContent(ctx);
        return null;
    }
    
    /**
     * create the dynamic_cast implementation at the end of a module or a program
     * This includes also the content above the contains line.
     * @param ctx 
     */
    private void insertAutogeneratedContent(ParserRuleContext ctx) {
        // is there any content to be added?
        ArrayList<String> content = info.endOfModuleOrProgramContent.get(ctx);
        if (content == null) return;
                
        // a writer for the expansion
        StringWriter sw = new StringWriter();
        AutoIndentWriter aiw = new AutoIndentWriter(sw);
        // add the indention of the end token 
        TerminalNode endNode = null;
        if (ctx instanceof fplusParser.ProgramBlockContext) {
            endNode = ((fplusParser.ProgramBlockContext)ctx).End();
        }
        if (ctx instanceof fplusParser.ModuleBlockContext) {
            endNode = ((fplusParser.ModuleBlockContext)ctx).End();
        }
        aiw.pushIndentation(Helper.getLeadingWS(endNode, info.tokenstream));

        try {
            // add content before contains in a module if contains was added during parsing
            if (ctx instanceof fplusParser.ModuleBlockContext && content.get(0).equals("contains")) {
                ArrayList<String> aboveContains = info.endOfDeclarationContent.get(ctx);
                if (aboveContains != null) {
                    for (String line:aboveContains) {
                        aiw.write(line);
                        aiw.write("\n");
                    }
                }
                // remove the content from the annotations
                info.endOfDeclarationContent.removeFrom(ctx);
            }
            // add comment above functions
            aiw.write("\n\n! automatically generated by fplus:\n\n");
            // add the content 
            for (String line:content) {
                aiw.write(line);
                aiw.write("\n");
            }
            // add the end token again
            aiw.write(endNode.getText());
            info.setExpansion(endNode, sw.toString());
                    
            // add content above the conatins line (if already present in the source code)
            ArrayList<String> aboveContains = info.endOfDeclarationContent.get(ctx);
            if (aboveContains != null) {
                fplusParser.ContainsLineContext cctx = null;
                if (ctx instanceof fplusParser.ProgramBlockContext) {
                    cctx = ((fplusParser.ProgramBlockContext)ctx).containsLine();
                }
                if (ctx instanceof fplusParser.ModuleBlockContext) {
                    cctx = ((fplusParser.ModuleBlockContext)ctx).containsLine();
                }
                // do nothing if we don't have a contains line
                if (cctx == null) {
                    return;
                }
                // create a new writer
                StringWriter sw2 = new StringWriter();
                AutoIndentWriter aiw2 = new AutoIndentWriter(sw2);
                // get the indention of the contains statement
                aiw2.pushIndentation(Helper.getLeadingWS(cctx)); 
                // write the content
                for (String line:aboveContains) {
                    aiw2.write(line);
                    aiw2.write("\n");
                }
                // add the end token again
                aiw2.write(cctx.Contains().getText());
                info.setExpansion(cctx.Contains(), sw2.toString());
            }
        } catch (IOException ex) {} 
    }   
}
