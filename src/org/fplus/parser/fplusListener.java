// Generated from fplus.g4 by ANTLR 4.5
package org.fplus.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fplusParser}.
 */
public interface fplusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 */
	void enterFortranFile(fplusParser.FortranFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 */
	void exitFortranFile(fplusParser.FortranFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlock(fplusParser.ProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlock(fplusParser.ProgramBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void enterModuleBlock(fplusParser.ModuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void exitModuleBlock(fplusParser.ModuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBlock(fplusParser.TemplateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBlock(fplusParser.TemplateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(fplusParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(fplusParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 */
	void enterLoopBegin(fplusParser.LoopBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 */
	void exitLoopBegin(fplusParser.LoopBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBlock(fplusParser.ProcedureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBlock(fplusParser.ProcedureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(fplusParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(fplusParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineBlock(fplusParser.SubroutineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineBlock(fplusParser.SubroutineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionBlock(fplusParser.TypeDefinitionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionBlock(fplusParser.TypeDefinitionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 */
	void enterFortranInterfaceBlock(fplusParser.FortranInterfaceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 */
	void exitFortranInterfaceBlock(fplusParser.FortranInterfaceBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributes(fplusParser.TypeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributes(fplusParser.TypeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeBoundLine(fplusParser.GenericTypeBoundLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeBoundLine(fplusParser.GenericTypeBoundLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceLine(fplusParser.InterfaceLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceLine(fplusParser.InterfaceLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(fplusParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(fplusParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(fplusParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(fplusParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListAssignment(fplusParser.ListAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListAssignment(fplusParser.ListAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(fplusParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(fplusParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 */
	void enterIfSingleLine(fplusParser.IfSingleLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 */
	void exitIfSingleLine(fplusParser.IfSingleLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(fplusParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(fplusParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 */
	void enterContentBlock(fplusParser.ContentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 */
	void exitContentBlock(fplusParser.ContentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void enterContentLine(fplusParser.ContentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void exitContentLine(fplusParser.ContentLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(fplusParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(fplusParser.PlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(fplusParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(fplusParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void enterLineComment(fplusParser.LineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void exitLineComment(fplusParser.LineCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(fplusParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(fplusParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(fplusParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(fplusParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConstants}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConstants(fplusParser.ExprConstantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConstants}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConstants(fplusParser.ExprConstantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(fplusParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(fplusParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArraySubscript}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArraySubscript(fplusParser.ExprArraySubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArraySubscript}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArraySubscript(fplusParser.ExprArraySubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(fplusParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(fplusParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExprNot}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprNot(fplusParser.LogicalExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExprNot}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprNot(fplusParser.LogicalExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExprOr}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprOr(fplusParser.LogicalExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExprOr}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprOr(fplusParser.LogicalExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExprAnd}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprAnd(fplusParser.LogicalExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExprAnd}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprAnd(fplusParser.LogicalExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExprCompare}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprCompare(fplusParser.LogicalExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExprCompare}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprCompare(fplusParser.LogicalExprCompareContext ctx);
}