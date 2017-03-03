// Generated from C:/Users/maurice_2/IdeaProjects/OwnLanguage/src\Grammar.g4 by ANTLR 4.6
package nl.saxion.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link GrammarParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(GrammarParser.ProgContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#variable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariable(GrammarParser.VariableContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#variableInitializer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableInitializer(GrammarParser.VariableInitializerContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#dataType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDataType(GrammarParser.DataTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(GrammarParser.ExprContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#addExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddExpr(GrammarParser.AddExprContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#rekExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRekExpr(GrammarParser.RekExprContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#logExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogExpr(GrammarParser.LogExprContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(GrammarParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#array}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArray(GrammarParser.ArrayContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(GrammarParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#condition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCondition(GrammarParser.ConditionContext ctx);
}