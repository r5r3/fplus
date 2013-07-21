// Generated from fplus.g4 by ANTLR 4.1
package org.fplus.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fplusParser}.
 */
public interface fplusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprConstants}.
	 * @param ctx the parse tree
	 */
	void enterExprConstants(@NotNull fplusParser.ExprConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprConstants}.
	 * @param ctx the parse tree
	 */
	void exitExprConstants(@NotNull fplusParser.ExprConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionBlock(@NotNull fplusParser.TypeDefinitionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionBlock(@NotNull fplusParser.TypeDefinitionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprAddSub}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(@NotNull fplusParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprAddSub}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(@NotNull fplusParser.ExprAddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void enterLineComment(@NotNull fplusParser.LineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 */
	void exitLineComment(@NotNull fplusParser.LineCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#LogicalExprOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprOr(@NotNull fplusParser.LogicalExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#LogicalExprOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprOr(@NotNull fplusParser.LogicalExprOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(@NotNull fplusParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(@NotNull fplusParser.LoopBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeBoundLine(@NotNull fplusParser.GenericTypeBoundLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeBoundLine(@NotNull fplusParser.GenericTypeBoundLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(@NotNull fplusParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(@NotNull fplusParser.FunctionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 */
	void enterLoopBegin(@NotNull fplusParser.LoopBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 */
	void exitLoopBegin(@NotNull fplusParser.LoopBeginContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttributes(@NotNull fplusParser.TypeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttributes(@NotNull fplusParser.TypeAttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineBlock(@NotNull fplusParser.SubroutineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineBlock(@NotNull fplusParser.SubroutineBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprArraySubscript}.
	 * @param ctx the parse tree
	 */
	void enterExprArraySubscript(@NotNull fplusParser.ExprArraySubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprArraySubscript}.
	 * @param ctx the parse tree
	 */
	void exitExprArraySubscript(@NotNull fplusParser.ExprArraySubscriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#LogicalExprCompare}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprCompare(@NotNull fplusParser.LogicalExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#LogicalExprCompare}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprCompare(@NotNull fplusParser.LogicalExprCompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 */
	void enterFortranInterfaceBlock(@NotNull fplusParser.FortranInterfaceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 */
	void exitFortranInterfaceBlock(@NotNull fplusParser.FortranInterfaceBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlock(@NotNull fplusParser.ProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlock(@NotNull fplusParser.ProgramBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprVariable}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(@NotNull fplusParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprVariable}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(@NotNull fplusParser.ExprVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(@NotNull fplusParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(@NotNull fplusParser.VariableDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceLine(@NotNull fplusParser.InterfaceLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceLine(@NotNull fplusParser.InterfaceLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(@NotNull fplusParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(@NotNull fplusParser.IfBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void enterModuleBlock(@NotNull fplusParser.ModuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void exitModuleBlock(@NotNull fplusParser.ModuleBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprMulDiv}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(@NotNull fplusParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprMulDiv}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(@NotNull fplusParser.ExprMulDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(@NotNull fplusParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(@NotNull fplusParser.PlaceholderContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void enterContentLine(@NotNull fplusParser.ContentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void exitContentLine(@NotNull fplusParser.ContentLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull fplusParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull fplusParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 */
	void enterFortranFile(@NotNull fplusParser.FortranFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 */
	void exitFortranFile(@NotNull fplusParser.FortranFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull fplusParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull fplusParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#LogicalExprNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprNot(@NotNull fplusParser.LogicalExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#LogicalExprNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprNot(@NotNull fplusParser.LogicalExprNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(@NotNull fplusParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(@NotNull fplusParser.ListItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 */
	void enterContentBlock(@NotNull fplusParser.ContentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 */
	void exitContentBlock(@NotNull fplusParser.ContentBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 */
	void enterIfSingleLine(@NotNull fplusParser.IfSingleLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 */
	void exitIfSingleLine(@NotNull fplusParser.IfSingleLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#ExprParens}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(@NotNull fplusParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#ExprParens}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(@NotNull fplusParser.ExprParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBlock(@NotNull fplusParser.ProcedureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBlock(@NotNull fplusParser.ProcedureBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#LogicalExprAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExprAnd(@NotNull fplusParser.LogicalExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#LogicalExprAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExprAnd(@NotNull fplusParser.LogicalExprAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListAssignment(@NotNull fplusParser.ListAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListAssignment(@NotNull fplusParser.ListAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBlock(@NotNull fplusParser.TemplateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBlock(@NotNull fplusParser.TemplateBlockContext ctx);
}