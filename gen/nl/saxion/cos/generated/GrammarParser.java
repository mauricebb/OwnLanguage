// Generated from C:/Users/maurice_2/IdeaProjects/OwnLanguage/src\Grammar.g4 by ANTLR 4.6
package nl.saxion.cos.generated;
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IF=18, ELSEIF=19, ELSE=20, WHILE=21, PRINT=22, RETURN=23, END=24, CLASS=25, 
		CLASSNAME=26, ID=27, INT=28, CHAR=29, BOOLEAN=30, MULT=31, DIV=32, PLUS=33, 
		MINUS=34, MOD=35, LST=36, LSTEQL=37, EQL=38, NEQL=39, GRTEQL=40, GRT=41, 
		OR=42, AND=43, NOT=44, COMMENT=45, WS=46;
	public static final int
		RULE_prog = 0, RULE_variable = 1, RULE_normVariable = 2, RULE_normVariableDeclaration = 3, 
		RULE_normVariableInitializer = 4, RULE_arrayVariable = 5, RULE_arrayDeclaration = 6, 
		RULE_arrayInitializer = 7, RULE_parameter = 8, RULE_parameterList = 9, 
		RULE_modifier = 10, RULE_returnType = 11, RULE_method = 12, RULE_dataType = 13, 
		RULE_expr = 14, RULE_rekExpr = 15, RULE_logExpr = 16, RULE_content = 17, 
		RULE_statement = 18, RULE_contstatement = 19, RULE_ifStatement = 20, RULE_whileStatement = 21, 
		RULE_printStatement = 22, RULE_returnStatement = 23, RULE_condition = 24;
	public static final String[] ruleNames = {
		"prog", "variable", "normVariable", "normVariableDeclaration", "normVariableInitializer", 
		"arrayVariable", "arrayDeclaration", "arrayInitializer", "parameter", 
		"parameterList", "modifier", "returnType", "method", "dataType", "expr", 
		"rekExpr", "logExpr", "content", "statement", "contstatement", "ifStatement", 
		"whileStatement", "printStatement", "returnStatement", "condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'='", "'[]'", "'new'", "'['", "']'", "','", 
		"'PUBLIC'", "'PRIVATE'", "'VOID'", "'('", "')'", "'INT'", "'CHAR'", "'BOOLEAN'", 
		"'IF'", "'ELSE IF'", "'ELSE'", "'WHILE'", "'PRINT'", "'RETURN'", "'END'", 
		"'CLASS'", null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'%'", 
		"'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'OR'", "'AND'", "'NOT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IF", "ELSEIF", "ELSE", "WHILE", "PRINT", 
		"RETURN", "END", "CLASS", "CLASSNAME", "ID", "INT", "CHAR", "BOOLEAN", 
		"MULT", "DIV", "PLUS", "MINUS", "MOD", "LST", "LSTEQL", "EQL", "NEQL", 
		"GRTEQL", "GRT", "OR", "AND", "NOT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GrammarParser.CLASS, 0); }
		public TerminalNode CLASSNAME() { return getToken(GrammarParser.CLASSNAME, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
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
			setState(50);
			match(CLASS);
			setState(51);
			match(CLASSNAME);
			setState(52);
			match(T__0);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(53);
				variable();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(59);
				method();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__1);
			setState(66);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public NormVariableContext normVariable() {
			return getRuleContext(NormVariableContext.class,0);
		}
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				normVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				arrayVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormVariableContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NormVariableDeclarationContext normVariableDeclaration() {
			return getRuleContext(NormVariableDeclarationContext.class,0);
		}
		public NormVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNormVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormVariableContext normVariable() throws RecognitionException {
		NormVariableContext _localctx = new NormVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_normVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			dataType();
			setState(73);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(74);
				normVariableDeclaration();
				}
			}

			setState(77);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormVariableDeclarationContext extends ParserRuleContext {
		public NormVariableInitializerContext normVariableInitializer() {
			return getRuleContext(NormVariableInitializerContext.class,0);
		}
		public NormVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNormVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormVariableDeclarationContext normVariableDeclaration() throws RecognitionException {
		NormVariableDeclarationContext _localctx = new NormVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(80);
			normVariableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormVariableInitializerContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public NormVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normVariableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNormVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormVariableInitializerContext normVariableInitializer() throws RecognitionException {
		NormVariableInitializerContext _localctx = new NormVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normVariableInitializer);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case ID:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expr();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArrayVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableContext arrayVariable() throws RecognitionException {
		ArrayVariableContext _localctx = new ArrayVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			dataType();
			setState(87);
			match(T__4);
			setState(88);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(89);
				arrayDeclaration();
				}
			}

			setState(92);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
			arrayInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayInitializer);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__5);
				setState(98);
				dataType();
				setState(99);
				match(T__6);
				setState(100);
				match(INT);
				setState(101);
				match(T__7);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__0);
				setState(104);
				match(INT);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(105);
					match(T__8);
					setState(106);
					match(INT);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			dataType();
			setState(116);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			parameter();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(119);
				match(T__8);
				setState(120);
				parameter();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnType);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				dataType();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			modifier();
			setState(133);
			returnType();
			setState(134);
			match(ID);
			setState(135);
			match(T__12);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(136);
				parameterList();
				}
			}

			setState(139);
			match(T__13);
			setState(140);
			match(T__0);
			setState(141);
			content();
			setState(142);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public RekExprContext rekExpr() {
			return getRuleContext(RekExprContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				rekExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RekExprContext extends ParserRuleContext {
		public RekExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rekExpr; }
	 
		public RekExprContext() { }
		public void copyFrom(RekExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpExprContext extends RekExprContext {
		public RekExprContext left;
		public Token op;
		public RekExprContext right;
		public List<RekExprContext> rekExpr() {
			return getRuleContexts(RekExprContext.class);
		}
		public RekExprContext rekExpr(int i) {
			return getRuleContext(RekExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public OpExprContext(RekExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends RekExprContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public AtomExprContext(RekExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends RekExprContext {
		public RekExprContext rekExpr() {
			return getRuleContext(RekExprContext.class,0);
		}
		public ParenExprContext(RekExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends RekExprContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdExprContext(RekExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdExpr(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_rekExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ID);
				}
				break;
			case T__12:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__12);
				setState(156);
				rekExpr(0);
				setState(157);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpExprContext(new RekExprContext(_parentctx, _parentState));
					((OpExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_rekExpr);
					setState(161);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(162);
					((OpExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PLUS) | (1L << MINUS) | (1L << MOD))) != 0)) ) {
						((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(163);
					((OpExprContext)_localctx).right = rekExpr(5);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogExprContext extends ParserRuleContext {
		public LogExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logExpr; }
	 
		public LogExprContext() { }
		public void copyFrom(LogExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogparenExprContext extends LogExprContext {
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public LogparenExprContext(LogExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogparenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogIdExprContext extends LogExprContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public LogIdExprContext(LogExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogAtomExprContext extends LogExprContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public LogAtomExprContext(LogExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogaExprContext extends LogExprContext {
		public LogExprContext left;
		public Token op;
		public LogExprContext right;
		public List<LogExprContext> logExpr() {
			return getRuleContexts(LogExprContext.class);
		}
		public LogExprContext logExpr(int i) {
			return getRuleContext(LogExprContext.class,i);
		}
		public TerminalNode LST() { return getToken(GrammarParser.LST, 0); }
		public TerminalNode LSTEQL() { return getToken(GrammarParser.LSTEQL, 0); }
		public TerminalNode EQL() { return getToken(GrammarParser.EQL, 0); }
		public TerminalNode NEQL() { return getToken(GrammarParser.NEQL, 0); }
		public TerminalNode GRTEQL() { return getToken(GrammarParser.GRTEQL, 0); }
		public TerminalNode GRT() { return getToken(GrammarParser.GRT, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public LogaExprContext(LogExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogaExpr(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new LogAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new LogIdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(ID);
				}
				break;
			case T__12:
				{
				_localctx = new LogparenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__12);
				setState(173);
				logExpr(0);
				setState(174);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogaExprContext(new LogExprContext(_parentctx, _parentState));
					((LogaExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logExpr);
					setState(178);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(179);
					((LogaExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LST) | (1L << LSTEQL) | (1L << EQL) | (1L << NEQL) | (1L << GRTEQL) | (1L << GRT) | (1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
						((LogaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(180);
					((LogaExprContext)_localctx).right = logExpr(5);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<NormVariableDeclarationContext> normVariableDeclaration() {
			return getRuleContexts(NormVariableDeclarationContext.class);
		}
		public NormVariableDeclarationContext normVariableDeclaration(int i) {
			return getRuleContext(NormVariableDeclarationContext.class,i);
		}
		public List<ArrayDeclarationContext> arrayDeclaration() {
			return getRuleContexts(ArrayDeclarationContext.class);
		}
		public ArrayDeclarationContext arrayDeclaration(int i) {
			return getRuleContext(ArrayDeclarationContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(186);
					statement();
					}
					break;
				case 2:
					{
					setState(187);
					match(ID);
					setState(188);
					normVariableDeclaration();
					setState(189);
					match(T__2);
					}
					break;
				case 3:
					{
					setState(191);
					match(ID);
					setState(192);
					arrayDeclaration();
					setState(193);
					match(T__2);
					}
					break;
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			returnStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				whileStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				printStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContstatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<NormVariableDeclarationContext> normVariableDeclaration() {
			return getRuleContexts(NormVariableDeclarationContext.class);
		}
		public NormVariableDeclarationContext normVariableDeclaration(int i) {
			return getRuleContext(NormVariableDeclarationContext.class,i);
		}
		public List<ArrayDeclarationContext> arrayDeclaration() {
			return getRuleContexts(ArrayDeclarationContext.class);
		}
		public ArrayDeclarationContext arrayDeclaration(int i) {
			return getRuleContext(ArrayDeclarationContext.class,i);
		}
		public ContstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContstatementContext contstatement() throws RecognitionException {
		ContstatementContext _localctx = new ContstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(207);
					statement();
					}
					break;
				case 2:
					{
					setState(208);
					match(ID);
					setState(209);
					normVariableDeclaration();
					setState(210);
					match(T__2);
					}
					break;
				case 3:
					{
					setState(212);
					match(ID);
					setState(213);
					arrayDeclaration();
					setState(214);
					match(T__2);
					}
					break;
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ContstatementContext> contstatement() {
			return getRuleContexts(ContstatementContext.class);
		}
		public ContstatementContext contstatement(int i) {
			return getRuleContext(ContstatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(GrammarParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(GrammarParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IF);
			setState(222);
			match(T__12);
			setState(223);
			condition();
			setState(224);
			match(T__13);
			setState(225);
			match(T__0);
			setState(226);
			contstatement();
			setState(227);
			match(T__1);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(228);
				match(ELSEIF);
				setState(229);
				match(T__12);
				setState(230);
				condition();
				setState(231);
				match(T__13);
				setState(232);
				match(T__0);
				setState(233);
				contstatement();
				setState(234);
				match(T__1);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(241);
				match(ELSE);
				setState(242);
				match(T__0);
				setState(243);
				contstatement();
				setState(244);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ContstatementContext contstatement() {
			return getRuleContext(ContstatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(WHILE);
			setState(249);
			match(T__12);
			setState(250);
			condition();
			setState(251);
			match(T__13);
			setState(252);
			match(T__0);
			setState(253);
			contstatement();
			setState(254);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(PRINT);
			setState(257);
			expr();
			setState(258);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(RETURN);
			setState(261);
			expr();
			setState(262);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				logExpr(0);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return rekExpr_sempred((RekExprContext)_localctx, predIndex);
		case 16:
			return logExpr_sempred((LogExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rekExpr_sempred(RekExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logExpr_sempred(LogExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\3\2\3\2\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\5"+
		"\tt\n\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\f"+
		"\3\f\3\r\3\r\5\r\u0085\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0099\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a2\n\21\3\21\3\21\3\21\7\21"+
		"\u00a7\n\21\f\21\16\21\u00aa\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00b3\n\22\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22\u00bb\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c6\n\23\f\23\16"+
		"\23\u00c9\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u00d0\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u00ef\n\26\f\26\16\26\u00f2\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f9\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u010d\n\32\3\32\2\4 \"\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\f\r\3\2\21"+
		"\23\3\2!%\3\2&.\u0114\2\64\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bQ\3\2\2\2\n"+
		"V\3\2\2\2\fX\3\2\2\2\16`\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24x\3\2\2\2\26"+
		"\u0080\3\2\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2\2\34\u0092\3\2\2\2\36\u0098"+
		"\3\2\2\2 \u00a1\3\2\2\2\"\u00b2\3\2\2\2$\u00c7\3\2\2\2&\u00cf\3\2\2\2"+
		"(\u00dc\3\2\2\2*\u00df\3\2\2\2,\u00fa\3\2\2\2.\u0102\3\2\2\2\60\u0106"+
		"\3\2\2\2\62\u010c\3\2\2\2\64\65\7\33\2\2\65\66\7\34\2\2\66:\7\3\2\2\67"+
		"9\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2"+
		"\2=?\5\32\16\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2"+
		"\2\2CD\7\4\2\2DE\7\32\2\2E\3\3\2\2\2FI\5\6\4\2GI\5\f\7\2HF\3\2\2\2HG\3"+
		"\2\2\2I\5\3\2\2\2JK\5\34\17\2KM\7\35\2\2LN\5\b\5\2ML\3\2\2\2MN\3\2\2\2"+
		"NO\3\2\2\2OP\7\5\2\2P\7\3\2\2\2QR\7\6\2\2RS\5\n\6\2S\t\3\2\2\2TW\5\36"+
		"\20\2UW\7\37\2\2VT\3\2\2\2VU\3\2\2\2W\13\3\2\2\2XY\5\34\17\2YZ\7\7\2\2"+
		"Z\\\7\35\2\2[]\5\16\b\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\5\2\2_\r\3"+
		"\2\2\2`a\7\6\2\2ab\5\20\t\2b\17\3\2\2\2cd\7\b\2\2de\5\34\17\2ef\7\t\2"+
		"\2fg\7\36\2\2gh\7\n\2\2ht\3\2\2\2ij\7\3\2\2jo\7\36\2\2kl\7\13\2\2ln\7"+
		"\36\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rt"+
		"\7\4\2\2sc\3\2\2\2si\3\2\2\2t\21\3\2\2\2uv\5\34\17\2vw\7\35\2\2w\23\3"+
		"\2\2\2x}\5\22\n\2yz\7\13\2\2z|\5\22\n\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\25\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\2\2\2\u0081\27\3\2"+
		"\2\2\u0082\u0085\5\34\17\2\u0083\u0085\7\16\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\31\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\5\30"+
		"\r\2\u0088\u0089\7\35\2\2\u0089\u008b\7\17\2\2\u008a\u008c\5\24\13\2\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\20"+
		"\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5$\23\2\u0090\u0091\7\4\2\2\u0091"+
		"\33\3\2\2\2\u0092\u0093\t\3\2\2\u0093\35\3\2\2\2\u0094\u0099\5 \21\2\u0095"+
		"\u0099\7 \2\2\u0096\u0099\7\36\2\2\u0097\u0099\7\35\2\2\u0098\u0094\3"+
		"\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\37\3\2\2\2\u009a\u009b\b\21\1\2\u009b\u00a2\7\36\2\2\u009c\u00a2\7\35"+
		"\2\2\u009d\u009e\7\17\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\20\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2"+
		"\2\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\f\6\2\2\u00a4\u00a5\t\4\2\2\u00a5"+
		"\u00a7\5 \21\7\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9!\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\b\22\1\2\u00ac\u00b3\7\36\2\2\u00ad\u00b3\7\35\2\2\u00ae\u00af\7\17\2"+
		"\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\20\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b9\3\2"+
		"\2\2\u00b4\u00b5\f\6\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00b8\5\"\22\7\u00b7"+
		"\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c6\5&\24\2\u00bd\u00be"+
		"\7\35\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7\5\2\2\u00c0\u00c6\3\2\2\2"+
		"\u00c1\u00c2\7\35\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4\7\5\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\60\31\2\u00cb%\3\2\2\2\u00cc\u00d0"+
		"\5*\26\2\u00cd\u00d0\5,\27\2\u00ce\u00d0\5.\30\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00db\5&\24\2"+
		"\u00d2\u00d3\7\35\2\2\u00d3\u00d4\5\b\5\2\u00d4\u00d5\7\5\2\2\u00d5\u00db"+
		"\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\5\16\b\2\u00d8\u00d9\7\5\2\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d6"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		")\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1\7\17\2"+
		"\2\u00e1\u00e2\5\62\32\2\u00e2\u00e3\7\20\2\2\u00e3\u00e4\7\3\2\2\u00e4"+
		"\u00e5\5(\25\2\u00e5\u00f0\7\4\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7"+
		"\17\2\2\u00e8\u00e9\5\62\32\2\u00e9\u00ea\7\20\2\2\u00ea\u00eb\7\3\2\2"+
		"\u00eb\u00ec\5(\25\2\u00ec\u00ed\7\4\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f8\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f5\7"+
		"\3\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\7\4\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f3\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00fb\7\27\2\2"+
		"\u00fb\u00fc\7\17\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\7\20\2\2\u00fe"+
		"\u00ff\7\3\2\2\u00ff\u0100\5(\25\2\u0100\u0101\7\4\2\2\u0101-\3\2\2\2"+
		"\u0102\u0103\7\30\2\2\u0103\u0104\5\36\20\2\u0104\u0105\7\5\2\2\u0105"+
		"/\3\2\2\2\u0106\u0107\7\31\2\2\u0107\u0108\5\36\20\2\u0108\u0109\7\5\2"+
		"\2\u0109\61\3\2\2\2\u010a\u010d\5\"\22\2\u010b\u010d\7 \2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\63\3\2\2\2\32:@HMV\\os}\u0084\u008b"+
		"\u0098\u00a1\u00a8\u00b2\u00b9\u00c5\u00c7\u00cf\u00da\u00dc\u00f0\u00f8"+
		"\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}