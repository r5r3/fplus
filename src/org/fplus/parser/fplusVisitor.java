// Generated from fplus.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link fplusParser#fortranFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortranFile(fplusParser.FortranFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#programBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBlock(fplusParser.ProgramBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#moduleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBlock(fplusParser.ModuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#containsLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsLine(fplusParser.ContainsLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#templateBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBlock(fplusParser.TemplateBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(fplusParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#loopBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBegin(fplusParser.LoopBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#procedureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBlock(fplusParser.ProcedureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(fplusParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#subroutineBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineBlock(fplusParser.SubroutineBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(fplusParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#parameterListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListElement(fplusParser.ParameterListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#functionResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionResult(fplusParser.FunctionResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#procedureBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBinding(fplusParser.ProcedureBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#typeDefinitionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionBlock(fplusParser.TypeDefinitionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(fplusParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#dataTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeParameter(fplusParser.DataTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#fortranInterfaceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortranInterfaceBlock(fplusParser.FortranInterfaceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#typeAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAttributes(fplusParser.TypeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#genericTypeBoundLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeBoundLine(fplusParser.GenericTypeBoundLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#interfaceLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceLine(fplusParser.InterfaceLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(fplusParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#listItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItem(fplusParser.ListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#listAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssignment(fplusParser.ListAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(fplusParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#ifSingleLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingleLine(fplusParser.IfSingleLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(fplusParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#contentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentBlock(fplusParser.ContentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(fplusParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#lineContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineContinuation(fplusParser.LineContinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#contentLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentLine(fplusParser.ContentLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(fplusParser.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#dynamicCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicCast(fplusParser.DynamicCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#inPlaceOperationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPlaceOperationLine(fplusParser.InPlaceOperationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(fplusParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fplusParser#lineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineComment(fplusParser.LineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(fplusParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(fplusParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConstants}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstants(fplusParser.ExprConstantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(fplusParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParens(fplusParser.ExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArraySubscript}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArraySubscript(fplusParser.ExprArraySubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link fplusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(fplusParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExprNot}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprNot(fplusParser.LogicalExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExprOr}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprOr(fplusParser.LogicalExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExprAnd}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprAnd(fplusParser.LogicalExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExprCompare}
	 * labeled alternative in {@link fplusParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExprCompare(fplusParser.LogicalExprCompareContext ctx);
}