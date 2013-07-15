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