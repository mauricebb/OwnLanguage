// Generated from C:/Users/maurice_2/IdeaProjects/OwnLanguage/src\Grammar.g4 by ANTLR 4.6
package nl.saxion.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link GrammarParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(GrammarParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(GrammarParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#variable}.
     *
     * @param ctx the parse tree
     */
    void enterVariable(GrammarParser.VariableContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#variable}.
     *
     * @param ctx the parse tree
     */
    void exitVariable(GrammarParser.VariableContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#variableInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterVariableInitializer(GrammarParser.VariableInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#variableInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitVariableInitializer(GrammarParser.VariableInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterDataType(GrammarParser.DataTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitDataType(GrammarParser.DataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(GrammarParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(GrammarParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#addExpr}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpr(GrammarParser.AddExprContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#addExpr}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpr(GrammarParser.AddExprContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#rekExpr}.
     *
     * @param ctx the parse tree
     */
    void enterRekExpr(GrammarParser.RekExprContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#rekExpr}.
     *
     * @param ctx the parse tree
     */
    void exitRekExpr(GrammarParser.RekExprContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#logExpr}.
     *
     * @param ctx the parse tree
     */
    void enterLogExpr(GrammarParser.LogExprContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#logExpr}.
     *
     * @param ctx the parse tree
     */
    void exitLogExpr(GrammarParser.LogExprContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(GrammarParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(GrammarParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#array}.
     *
     * @param ctx the parse tree
     */
    void enterArray(GrammarParser.ArrayContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#array}.
     *
     * @param ctx the parse tree
     */
    void exitArray(GrammarParser.ArrayContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(GrammarParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(GrammarParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#condition}.
     *
     * @param ctx the parse tree
     */
    void enterCondition(GrammarParser.ConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#condition}.
     *
     * @param ctx the parse tree
     */
    void exitCondition(GrammarParser.ConditionContext ctx);
}