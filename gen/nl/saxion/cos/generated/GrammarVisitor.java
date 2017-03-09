// Generated from C:/Users/maurice_2/IdeaProjects/OwnLanguage/src\Grammar.g4 by ANTLR 4.6
package nl.saxion.cos.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormVariable(GrammarParser.NormVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormVariableDeclaration(GrammarParser.NormVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normVariableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormVariableInitializer(GrammarParser.NormVariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(GrammarParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(GrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(GrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(GrammarParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(GrammarParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link GrammarParser#rekExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(GrammarParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GrammarParser#rekExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(GrammarParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GrammarParser#rekExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(GrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammarParser#rekExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logparenExpr}
	 * labeled alternative in {@link GrammarParser#logExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogparenExpr(GrammarParser.LogparenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logIdExpr}
	 * labeled alternative in {@link GrammarParser#logExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogIdExpr(GrammarParser.LogIdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAtomExpr}
	 * labeled alternative in {@link GrammarParser#logExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAtomExpr(GrammarParser.LogAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logaExpr}
	 * labeled alternative in {@link GrammarParser#logExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogaExpr(GrammarParser.LogaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(GrammarParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#contstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContstatement(GrammarParser.ContstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(GrammarParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GrammarParser.ConditionContext ctx);
}