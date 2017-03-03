// Generated from C:/Users/maurice_2/IdeaProjects/OwnLanguage/src\Grammar.g4 by ANTLR 4.6
package nl.saxion.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            NEWLINE = 25, INT = 26, CHAR = 27, WS = 28;
    public static final int
            RULE_prog = 0, RULE_variable = 1, RULE_variableDeclaration = 2, RULE_variableInitializer = 3,
            RULE_dataType = 4, RULE_expr = 5, RULE_addExpr = 6, RULE_rekExpr = 7,
            RULE_logExpr = 8, RULE_program = 9, RULE_array = 10, RULE_statement = 11,
            RULE_condition = 12;
    public static final String[] ruleNames = {
            "prog", "variable", "variableDeclaration", "variableInitializer", "dataType",
            "expr", "addExpr", "rekExpr", "logExpr", "program", "array", "statement",
            "condition"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'='", "'INT'", "'CHAR'", "'+'", "'-'", "'('", "')'", "'*'",
            "'/'", "'%'", "'<'", "'<='", "'!='", "'>='", "'>'", "'OR'", "'AND'", "'NOT'",
            "'IF'", "'{'", "'}'", "'ELSE IF'", "'ELSE'", null, null, null, "' '"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, "NEWLINE", "INT", "CHAR", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Grammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public GrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgramContext program() {
            return getRuleContext(ProgramContext.class, 0);
        }

        public List<VariableContext> variable() {
            return getRuleContexts(VariableContext.class);
        }

        public VariableContext variable(int i) {
            return getRuleContext(VariableContext.class, i);
        }

        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitProg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2 || _la == T__3) {
                    {
                        {
                            setState(26);
                            variable();
                        }
                    }
                    setState(31);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(32);
                program();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableContext extends ParserRuleContext {
        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode CHAR() {
            return getToken(GrammarParser.CHAR, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public VariableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVariable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVariable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitVariable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableContext variable() throws RecognitionException {
        VariableContext _localctx = new VariableContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_variable);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                dataType();
                setState(35);
                match(CHAR);
                setState(37);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(36);
                        variableDeclaration();
                    }
                }

                setState(39);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclarationContext extends ParserRuleContext {
        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVariableDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor)
                return ((GrammarVisitor<? extends T>) visitor).visitVariableDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
        VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(41);
                match(T__1);
                setState(42);
                variableInitializer();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableInitializerContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public ArrayContext array() {
            return getRuleContext(ArrayContext.class, 0);
        }

        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableInitializer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVariableInitializer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVariableInitializer(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor)
                return ((GrammarVisitor<? extends T>) visitor).visitVariableInitializer(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableInitializerContext variableInitializer() throws RecognitionException {
        VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_variableInitializer);
        try {
            setState(46);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__6:
                case INT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(44);
                    expr();
                }
                break;
                case T__0:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(45);
                    array();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataTypeContext extends ParserRuleContext {
        public DataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DataTypeContext dataType() throws RecognitionException {
        DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_dataType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(48);
                _la = _input.LA(1);
                if (!(_la == T__2 || _la == T__3)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public RekExprContext rekExpr() {
            return getRuleContext(RekExprContext.class, 0);
        }

        public AddExprContext addExpr() {
            return getRuleContext(AddExprContext.class, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_expr);
        try {
            setState(52);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(50);
                    rekExpr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(51);
                    addExpr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddExprContext extends ParserRuleContext {
        public TerminalNode INT() {
            return getToken(GrammarParser.INT, 0);
        }

        public List<AddExprContext> addExpr() {
            return getRuleContexts(AddExprContext.class);
        }

        public AddExprContext addExpr(int i) {
            return getRuleContext(AddExprContext.class, i);
        }

        public AddExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterAddExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitAddExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitAddExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AddExprContext addExpr() throws RecognitionException {
        return addExpr(0);
    }

    private AddExprContext addExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
        AddExprContext _prevctx = _localctx;
        int _startState = 12;
        enterRecursionRule(_localctx, 12, RULE_addExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(60);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT: {
                        setState(55);
                        match(INT);
                    }
                    break;
                    case T__6: {
                        setState(56);
                        match(T__6);
                        setState(57);
                        addExpr(0);
                        setState(58);
                        match(T__7);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(67);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new AddExprContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
                                setState(62);
                                if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                setState(63);
                                _la = _input.LA(1);
                                if (!(_la == T__4 || _la == T__5)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(64);
                                addExpr(4);
                            }
                        }
                    }
                    setState(69);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class RekExprContext extends ParserRuleContext {
        public TerminalNode INT() {
            return getToken(GrammarParser.INT, 0);
        }

        public List<RekExprContext> rekExpr() {
            return getRuleContexts(RekExprContext.class);
        }

        public RekExprContext rekExpr(int i) {
            return getRuleContext(RekExprContext.class, i);
        }

        public RekExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rekExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterRekExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitRekExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitRekExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RekExprContext rekExpr() throws RecognitionException {
        return rekExpr(0);
    }

    private RekExprContext rekExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        RekExprContext _localctx = new RekExprContext(_ctx, _parentState);
        RekExprContext _prevctx = _localctx;
        int _startState = 14;
        enterRecursionRule(_localctx, 14, RULE_rekExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT: {
                        setState(71);
                        match(INT);
                    }
                    break;
                    case T__6: {
                        setState(72);
                        match(T__6);
                        setState(73);
                        rekExpr(0);
                        setState(74);
                        match(T__7);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(83);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new RekExprContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_rekExpr);
                                setState(78);
                                if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                setState(79);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(80);
                                rekExpr(4);
                            }
                        }
                    }
                    setState(85);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class LogExprContext extends ParserRuleContext {
        public TerminalNode INT() {
            return getToken(GrammarParser.INT, 0);
        }

        public List<LogExprContext> logExpr() {
            return getRuleContexts(LogExprContext.class);
        }

        public LogExprContext logExpr(int i) {
            return getRuleContext(LogExprContext.class, i);
        }

        public LogExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterLogExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitLogExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitLogExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LogExprContext logExpr() throws RecognitionException {
        return logExpr(0);
    }

    private LogExprContext logExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        LogExprContext _localctx = new LogExprContext(_ctx, _parentState);
        LogExprContext _prevctx = _localctx;
        int _startState = 16;
        enterRecursionRule(_localctx, 16, RULE_logExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT: {
                        setState(87);
                        match(INT);
                    }
                    break;
                    case T__6: {
                        setState(88);
                        match(T__6);
                        setState(89);
                        logExpr(0);
                        setState(90);
                        match(T__7);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(99);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new LogExprContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_logExpr);
                                setState(94);
                                if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                setState(95);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(96);
                                logExpr(4);
                            }
                        }
                    }
                    setState(101);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ProgramContext extends ParserRuleContext {
        public AddExprContext addExpr() {
            return getRuleContext(AddExprContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<TerminalNode> NEWLINE() {
            return getTokens(GrammarParser.NEWLINE);
        }

        public TerminalNode NEWLINE(int i) {
            return getToken(GrammarParser.NEWLINE, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__19) {
                    {
                        {
                            setState(102);
                            statement();
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                {
                    setState(108);
                    addExpr(0);
                }
                setState(112);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NEWLINE) {
                    {
                        {
                            setState(109);
                            match(NEWLINE);
                        }
                    }
                    setState(114);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayContext extends ParserRuleContext {
        public ArrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayContext array() throws RecognitionException {
        ArrayContext _localctx = new ArrayContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_array);
        try {
            enterOuterAlt(_localctx, 1);
            {
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public List<ConditionContext> condition() {
            return getRuleContexts(ConditionContext.class);
        }

        public ConditionContext condition(int i) {
            return getRuleContext(ConditionContext.class, i);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(T__19);
                setState(118);
                match(T__6);
                setState(119);
                condition();
                setState(120);
                match(T__7);
                setState(121);
                match(T__20);
                setState(122);
                expr();
                setState(123);
                match(T__21);
                setState(134);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__22) {
                    {
                        {
                            setState(124);
                            match(T__22);
                            setState(125);
                            match(T__6);
                            setState(126);
                            condition();
                            setState(127);
                            match(T__7);
                            setState(128);
                            match(T__20);
                            setState(129);
                            expr();
                            setState(130);
                            match(T__21);
                        }
                    }
                    setState(136);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(142);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__23) {
                    {
                        setState(137);
                        match(T__23);
                        setState(138);
                        match(T__20);
                        setState(139);
                        expr();
                        setState(140);
                        match(T__21);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConditionContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public LogExprContext logExpr() {
            return getRuleContext(LogExprContext.class, 0);
        }

        public TerminalNode CHAR() {
            return getToken(GrammarParser.CHAR, 0);
        }

        public ConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_condition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterCondition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitCondition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitCondition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConditionContext condition() throws RecognitionException {
        ConditionContext _localctx = new ConditionContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_condition);
        try {
            setState(147);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(144);
                    expr();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    logExpr(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(146);
                    match(CHAR);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 6:
                return addExpr_sempred((AddExprContext) _localctx, predIndex);
            case 7:
                return rekExpr_sempred((RekExprContext) _localctx, predIndex);
            case 8:
                return logExpr_sempred((LogExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean rekExpr_sempred(RekExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean logExpr_sempred(LogExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0098\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2" +
                    "\3\3\3\3\3\3\5\3(\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\61\n\5\3\6\3\6\3" +
                    "\7\3\7\5\7\67\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\b\3\b\3\b\7\bD\n" +
                    "\b\f\b\16\bG\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\7\tT\n" +
                    "\t\f\t\16\tW\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\n\3\n\3\n\7\nd\n" +
                    "\n\f\n\16\ng\13\n\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\7\13q\n" +
                    "\13\f\13\16\13t\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3\r\3\r\3\r" +
                    "\3\r\5\r\u0091\n\r\3\16\3\16\3\16\5\16\u0096\n\16\3\16\2\5\16\20\22\17" +
                    "\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\5\6\3\2\7\b\3\2\13\r\4\2\4\4" +
                    "\16\25\u009a\2\37\3\2\2\2\4$\3\2\2\2\6+\3\2\2\2\b\60\3\2\2\2\n\62\3\2" +
                    "\2\2\f\66\3\2\2\2\16>\3\2\2\2\20N\3\2\2\2\22^\3\2\2\2\24k\3\2\2\2\26u" +
                    "\3\2\2\2\30w\3\2\2\2\32\u0095\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!" +
                    "\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\5\24\13\2" +
                    "#\3\3\2\2\2$%\5\n\6\2%\'\7\35\2\2&(\5\6\4\2\'&\3\2\2\2\'(\3\2\2\2()\3" +
                    "\2\2\2)*\7\3\2\2*\5\3\2\2\2+,\7\4\2\2,-\5\b\5\2-\7\3\2\2\2.\61\5\f\7\2" +
                    "/\61\5\26\f\2\60.\3\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62\63\t\2\2\2\63\13" +
                    "\3\2\2\2\64\67\5\20\t\2\65\67\5\16\b\2\66\64\3\2\2\2\66\65\3\2\2\2\67" +
                    "\r\3\2\2\289\b\b\1\29?\7\34\2\2:;\7\t\2\2;<\5\16\b\2<=\7\n\2\2=?\3\2\2" +
                    "\2>8\3\2\2\2>:\3\2\2\2?E\3\2\2\2@A\f\5\2\2AB\t\3\2\2BD\5\16\b\6C@\3\2" +
                    "\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GE\3\2\2\2HI\b\t\1\2IO\7" +
                    "\34\2\2JK\7\t\2\2KL\5\20\t\2LM\7\n\2\2MO\3\2\2\2NH\3\2\2\2NJ\3\2\2\2O" +
                    "U\3\2\2\2PQ\f\5\2\2QR\t\4\2\2RT\5\20\t\6SP\3\2\2\2TW\3\2\2\2US\3\2\2\2" +
                    "UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2XY\b\n\1\2Y_\7\34\2\2Z[\7\t\2\2[\\\5\22" +
                    "\n\2\\]\7\n\2\2]_\3\2\2\2^X\3\2\2\2^Z\3\2\2\2_e\3\2\2\2`a\f\5\2\2ab\t" +
                    "\5\2\2bd\5\22\n\6c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2" +
                    "ge\3\2\2\2hj\5\30\r\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2" +
                    "\2mk\3\2\2\2nr\5\16\b\2oq\7\33\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2" +
                    "\2\2s\25\3\2\2\2tr\3\2\2\2uv\3\2\2\2v\27\3\2\2\2wx\7\26\2\2xy\7\t\2\2" +
                    "yz\5\32\16\2z{\7\n\2\2{|\7\27\2\2|}\5\f\7\2}\u0088\7\30\2\2~\177\7\31" +
                    "\2\2\177\u0080\7\t\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\n\2\2\u0082" +
                    "\u0083\7\27\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\30\2\2\u0085\u0087\3" +
                    "\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089" +
                    "\3\2\2\2\u0089\u0090\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\32\2\2" +
                    "\u008c\u008d\7\27\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\30\2\2\u008f\u0091" +
                    "\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u0091\3\2\2\2\u0091\31\3\2\2\2\u0092" +
                    "\u0096\5\f\7\2\u0093\u0096\5\22\n\2\u0094\u0096\7\35\2\2\u0095\u0092\3" +
                    "\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\33\3\2\2\2\21\37" +
                    "\'\60\66>ENU^ekr\u0088\u0090\u0095";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}