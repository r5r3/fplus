// Generated from fplus.g4 by ANTLR 4.1
package org.fplus.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fplusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fplusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstants(@NotNull fplusParser.ExprConstantsContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionBlock(@NotNull fplusParser.TypeDefinitionBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(@NotNull fplusParser.ExprAddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineComment(@NotNull fplusParser.LineCommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#LogicalExprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprOr(@NotNull fplusParser.LogicalExprOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(@NotNull fplusParser.LoopBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeBoundLine(@NotNull fplusParser.GenericTypeBoundLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(@NotNull fplusParser.FunctionBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBegin(@NotNull fplusParser.LoopBeginContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAttributes(@NotNull fplusParser.TypeAttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineBlock(@NotNull fplusParser.SubroutineBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprArraySubscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArraySubscript(@NotNull fplusParser.ExprArraySubscriptContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#LogicalExprCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprCompare(@NotNull fplusParser.LogicalExprCompareContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortranInterfaceBlock(@NotNull fplusParser.FortranInterfaceBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBlock(@NotNull fplusParser.ProgramBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(@NotNull fplusParser.ExprVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(@NotNull fplusParser.VariableDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceLine(@NotNull fplusParser.InterfaceLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(@NotNull fplusParser.IfBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBlock(@NotNull fplusParser.ModuleBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprMulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(@NotNull fplusParser.ExprMulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(@NotNull fplusParser.PlaceholderContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentLine(@NotNull fplusParser.ContentLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull fplusParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortranFile(@NotNull fplusParser.FortranFileContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull fplusParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#LogicalExprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprNot(@NotNull fplusParser.LogicalExprNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItem(@NotNull fplusParser.ListItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentBlock(@NotNull fplusParser.ContentBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingleLine(@NotNull fplusParser.IfSingleLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#ExprParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParens(@NotNull fplusParser.ExprParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBlock(@NotNull fplusParser.ProcedureBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#LogicalExprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprAnd(@NotNull fplusParser.LogicalExprAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssignment(@NotNull fplusParser.ListAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBlock(@NotNull fplusParser.TemplateBlockContext ctx);
}