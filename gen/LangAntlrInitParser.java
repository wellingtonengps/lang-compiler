// Generated from D:/03 - Repositorio Local/03 - UFJF/06 - Compiladores/LangAntlr/lang-antlr/src/main/antlr4/org/compiler/LangAntlr/LangAntlrInit.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangAntlrInitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, PRINT=2, IF=3, ELSE=4, ITERATE=5, TRUE=6, FALSE=7, NEW=8, READ=9, 
		RETURN=10, PLUS=11, MINUS=12, MULT=13, DIV=14, MOD=15, AND=16, OR=17, 
		NOT=18, LESS_THAN=19, MORE_THAN=20, EQUAL=21, NOT_EQUAL=22, BTYPE=23, 
		Int=24, Float=25, Char=26, Bool=27, OPEN_PARENTESIS=28, CLOSE_PARENTESIS=29, 
		OPEN_BRACKET=30, CLOSE_BRACKET=31, OPEN_CURLY_BRACER=32, CLOSE_CURLY_BRACER=33, 
		ACCESSOR=34, COLON=35, SEMICOLON=36, DOUBLE_COLON=37, COMMA=38, ATTRIBUTION=39, 
		COMMENT=40, MULTILINE_COMMENT=41, NEWLINE=42, WS=43, TYPE=44, BOOLEAN=45, 
		NULL=46, ID=47, FLOAT=48, INT=49, LITERAL=50, CHAR=51, NUMBER=52, UPPERCASE=53, 
		LOWERCASE=54, UNICODE=55;
	public static final int
		RULE_prog = 0, RULE_data = 1, RULE_decl = 2, RULE_func = 3, RULE_params = 4, 
		RULE_param = 5, RULE_type = 6, RULE_btype = 7, RULE_cmd = 8, RULE_lvalues = 9, 
		RULE_exp = 10, RULE_rexp = 11, RULE_aexp = 12, RULE_mexp = 13, RULE_sexp = 14, 
		RULE_pexp = 15, RULE_lvalue = 16, RULE_exps = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "func", "params", "param", "type", "btype", "cmd", 
			"lvalues", "exp", "rexp", "aexp", "mexp", "sexp", "pexp", "lvalue", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'data'", "'print'", "'if'", "'else'", "'iterate'", "'true'", "'false'", 
			"'new'", "'read'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", "'<'", "'>'", "'=='", "'!='", null, "'Int'", "'Float'", 
			"'Char'", "'Bool'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", 
			"':'", "';'", "'::'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "PRINT", "IF", "ELSE", "ITERATE", "TRUE", "FALSE", "NEW", 
			"READ", "RETURN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", 
			"NOT", "LESS_THAN", "MORE_THAN", "EQUAL", "NOT_EQUAL", "BTYPE", "Int", 
			"Float", "Char", "Bool", "OPEN_PARENTESIS", "CLOSE_PARENTESIS", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_CURLY_BRACER", "CLOSE_CURLY_BRACER", "ACCESSOR", 
			"COLON", "SEMICOLON", "DOUBLE_COLON", "COMMA", "ATTRIBUTION", "COMMENT", 
			"MULTILINE_COMMENT", "NEWLINE", "WS", "TYPE", "BOOLEAN", "NULL", "ID", 
			"FLOAT", "INT", "LITERAL", "CHAR", "NUMBER", "UPPERCASE", "LOWERCASE", 
			"UNICODE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "LangAntlrInit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangAntlrInitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitProg(this);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(36);
				data();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(42);
				func();
				}
				}
				setState(47);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(LangAntlrInitParser.DATA, 0); }
		public TerminalNode TYPE() { return getToken(LangAntlrInitParser.TYPE, 0); }
		public TerminalNode OPEN_CURLY_BRACER() { return getToken(LangAntlrInitParser.OPEN_CURLY_BRACER, 0); }
		public TerminalNode CLOSE_CURLY_BRACER() { return getToken(LangAntlrInitParser.CLOSE_CURLY_BRACER, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(DATA);
			setState(49);
			match(TYPE);
			setState(50);
			match(OPEN_CURLY_BRACER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(51);
				decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(CLOSE_CURLY_BRACER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangAntlrInitParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(DOUBLE_COLON);
			setState(61);
			type(0);
			setState(62);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode OPEN_CURLY_BRACER() { return getToken(LangAntlrInitParser.OPEN_CURLY_BRACER, 0); }
		public TerminalNode CLOSE_CURLY_BRACER() { return getToken(LangAntlrInitParser.CLOSE_CURLY_BRACER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangAntlrInitParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangAntlrInitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangAntlrInitParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(OPEN_PARENTESIS);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(66);
				params();
				}
			}

			setState(69);
			match(CLOSE_PARENTESIS);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(70);
				match(COLON);
				setState(71);
				type(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					type(0);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(OPEN_CURLY_BRACER);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140741783324204L) != 0)) {
				{
				{
				setState(82);
				cmd();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(CLOSE_CURLY_BRACER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangAntlrInitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangAntlrInitParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			param();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				param();
				}
				}
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangAntlrInitParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(DOUBLE_COLON);
			setState(100);
			type(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangAntlrInitParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LangAntlrInitParser.CLOSE_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(105);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(106);
					match(OPEN_BRACKET);
					setState(107);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BtypeContext extends ParserRuleContext {
		public TerminalNode BTYPE() { return getToken(LangAntlrInitParser.BTYPE, 0); }
		public TerminalNode TYPE() { return getToken(LangAntlrInitParser.TYPE, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterBtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitBtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==BTYPE || _la==TYPE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BrancesContext extends CmdContext {
		public TerminalNode OPEN_CURLY_BRACER() { return getToken(LangAntlrInitParser.OPEN_CURLY_BRACER, 0); }
		public TerminalNode CLOSE_CURLY_BRACER() { return getToken(LangAntlrInitParser.CLOSE_CURLY_BRACER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BrancesContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterBrances(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitBrances(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitBrances(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssingContext extends CmdContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ATTRIBUTION() { return getToken(LangAntlrInitParser.ATTRIBUTION, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public AssingContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitAssing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitAssing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends CmdContext {
		public TerminalNode PRINT() { return getToken(LangAntlrInitParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public PrintContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends CmdContext {
		public TerminalNode READ() { return getToken(LangAntlrInitParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public ReadContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends CmdContext {
		public ExpsContext acessParams;
		public LvaluesContext acessReturn;
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(LangAntlrInitParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN() { return getToken(LangAntlrInitParser.MORE_THAN, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public LvaluesContext lvalues() {
			return getRuleContext(LvaluesContext.class,0);
		}
		public LessThanContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends CmdContext {
		public TerminalNode IF() { return getToken(LangAntlrInitParser.IF, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IfContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends CmdContext {
		public CmdContext ifcmd;
		public CmdContext elsecmd;
		public TerminalNode IF() { return getToken(LangAntlrInitParser.IF, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode ELSE() { return getToken(LangAntlrInitParser.ELSE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public IfElseContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangAntlrInitParser.RETURN, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangAntlrInitParser.SEMICOLON, 0); }
		public ReturnContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterateContext extends CmdContext {
		public TerminalNode ITERATE() { return getToken(LangAntlrInitParser.ITERATE, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IterateContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterIterate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitIterate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitIterate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new BrancesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(OPEN_CURLY_BRACER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140741783324204L) != 0)) {
					{
					{
					setState(116);
					cmd();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(CLOSE_CURLY_BRACER);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IF);
				setState(124);
				match(OPEN_PARENTESIS);
				setState(125);
				exp(0);
				setState(126);
				match(CLOSE_PARENTESIS);
				setState(127);
				cmd();
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(IF);
				setState(130);
				match(OPEN_PARENTESIS);
				setState(131);
				exp(0);
				setState(132);
				match(CLOSE_PARENTESIS);
				setState(133);
				((IfElseContext)_localctx).ifcmd = cmd();
				setState(134);
				match(ELSE);
				setState(135);
				((IfElseContext)_localctx).elsecmd = cmd();
				}
				break;
			case 4:
				_localctx = new IterateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(ITERATE);
				setState(138);
				match(OPEN_PARENTESIS);
				setState(139);
				exp(0);
				setState(140);
				match(CLOSE_PARENTESIS);
				setState(141);
				cmd();
				}
				break;
			case 5:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(READ);
				setState(144);
				lvalue(0);
				setState(145);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(PRINT);
				setState(148);
				exp(0);
				setState(149);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(RETURN);
				setState(152);
				exps();
				setState(153);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				lvalue(0);
				setState(156);
				match(ATTRIBUTION);
				setState(157);
				exp(0);
				setState(158);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				match(ID);
				setState(161);
				match(OPEN_PARENTESIS);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433231151894976L) != 0)) {
					{
					setState(162);
					((LessThanContext)_localctx).acessParams = exps();
					}
				}

				setState(165);
				match(CLOSE_PARENTESIS);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(166);
					match(LESS_THAN);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(167);
						((LessThanContext)_localctx).acessReturn = lvalues();
						}
					}

					setState(170);
					match(MORE_THAN);
					}
				}

				setState(173);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvaluesContext extends ParserRuleContext {
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangAntlrInitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangAntlrInitParser.COMMA, i);
		}
		public LvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvaluesContext lvalues() throws RecognitionException {
		LvaluesContext _localctx = new LvaluesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			lvalue(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				lvalue(0);
				}
				}
				setState(183);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(LangAntlrInitParser.AND, 0); }
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicsExprsContext extends ExpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public LogicsExprsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLogicsExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLogicsExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLogicsExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicsExprsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(185);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(187);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(188);
					match(AND);
					setState(189);
					exp(3);
					}
					} 
				}
				setState(194);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RexpContext extends ParserRuleContext {
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	 
		public RexpContext() { }
		public void copyFrom(RexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends RexpContext {
		public RexpContext left;
		public Token op;
		public AexpContext right;
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(LangAntlrInitParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN() { return getToken(LangAntlrInitParser.MORE_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(LangAntlrInitParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LangAntlrInitParser.NOT_EQUAL, 0); }
		public LogicExpContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLogicExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicsExprsContext extends RexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public BasicsExprsContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterBasicsExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitBasicsExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitBasicsExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_rexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicsExprsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(196);
			aexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpContext(new RexpContext(_parentctx, _parentState));
					((LogicExpContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_rexp);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					((LogicExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
						((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(200);
					((LogicExpContext)_localctx).right = aexp(0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AexpContext extends ParserRuleContext {
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	 
		public AexpContext() { }
		public void copyFrom(AexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends AexpContext {
		public AexpContext left;
		public Token op;
		public MexpContext right;
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangAntlrInitParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LangAntlrInitParser.MINUS, 0); }
		public PlusMinusContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoreExprsContext extends AexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MoreExprsContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterMoreExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitMoreExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitMoreExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_aexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MoreExprsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(207);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusMinusContext(new AexpContext(_parentctx, _parentState));
					((PlusMinusContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_aexp);
					setState(209);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(210);
					((PlusMinusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(211);
					((PlusMinusContext)_localctx).right = mexp(0);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MexpContext extends ParserRuleContext {
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	 
		public MexpContext() { }
		public void copyFrom(MexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModContext extends MexpContext {
		public MexpContext left;
		public Token op;
		public SexpContext right;
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangAntlrInitParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LangAntlrInitParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LangAntlrInitParser.MOD, 0); }
		public MultDivModContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitMultDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprsContext extends MexpContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public LiteralExprsContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLiteralExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLiteralExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLiteralExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_mexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralExprsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(218);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultDivModContext(new MexpContext(_parentctx, _parentState));
					((MultDivModContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mexp);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					((MultDivModContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
						((MultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(222);
					((MultDivModContext)_localctx).right = sexp();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexpContext extends ParserRuleContext {
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	 
		public SexpContext() { }
		public void copyFrom(SexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends SexpContext {
		public TerminalNode MINUS() { return getToken(LangAntlrInitParser.MINUS, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MinusContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends SexpContext {
		public TerminalNode NOT() { return getToken(LangAntlrInitParser.NOT, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public NotContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends SexpContext {
		public TerminalNode NULL() { return getToken(LangAntlrInitParser.NULL, 0); }
		public NullContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends SexpContext {
		public TerminalNode TRUE() { return getToken(LangAntlrInitParser.TRUE, 0); }
		public TrueContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends SexpContext {
		public TerminalNode FALSE() { return getToken(LangAntlrInitParser.FALSE, 0); }
		public FalseContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends SexpContext {
		public TerminalNode CHAR() { return getToken(LangAntlrInitParser.CHAR, 0); }
		public CharContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends SexpContext {
		public TerminalNode FLOAT() { return getToken(LangAntlrInitParser.FLOAT, 0); }
		public FloatContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends SexpContext {
		public TerminalNode INT() { return getToken(LangAntlrInitParser.INT, 0); }
		public IntContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcessorValueContext extends SexpContext {
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public AcessorValueContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterAcessorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitAcessorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitAcessorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends SexpContext {
		public TerminalNode LITERAL() { return getToken(LangAntlrInitParser.LITERAL, 0); }
		public LiteralContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sexp);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(NOT);
				setState(229);
				sexp();
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(MINUS);
				setState(231);
				sexp();
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(FALSE);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(NULL);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(CHAR);
				}
				break;
			case LITERAL:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(238);
				match(LITERAL);
				}
				break;
			case NEW:
			case OPEN_PARENTESIS:
			case ID:
				_localctx = new AcessorValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(239);
				pexp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PexpContext extends ParserRuleContext {
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	 
		public PexpContext() { }
		public void copyFrom(PexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends PexpContext {
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public ParentesisContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends PexpContext {
		public TerminalNode NEW() { return getToken(LangAntlrInitParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangAntlrInitParser.OPEN_BRACKET, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangAntlrInitParser.CLOSE_BRACKET, 0); }
		public NewContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PexpContext {
		public ExpsContext acessParams;
		public ExpContext acessReturn;
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(LangAntlrInitParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(LangAntlrInitParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(LangAntlrInitParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LangAntlrInitParser.CLOSE_BRACKET, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctionCallContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends PexpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ValueContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pexp);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				lvalue(0);
				}
				break;
			case 2:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(OPEN_PARENTESIS);
				setState(244);
				exp(0);
				setState(245);
				match(CLOSE_PARENTESIS);
				}
				break;
			case 3:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(NEW);
				setState(248);
				type(0);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(249);
					match(OPEN_BRACKET);
					setState(250);
					exps();
					setState(251);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(ID);
				setState(256);
				match(OPEN_PARENTESIS);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433231151894976L) != 0)) {
					{
					setState(257);
					((FunctionCallContext)_localctx).acessParams = exps();
					}
				}

				setState(260);
				match(CLOSE_PARENTESIS);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(261);
					match(OPEN_BRACKET);
					setState(262);
					((FunctionCallContext)_localctx).acessReturn = exp(0);
					setState(263);
					match(CLOSE_BRACKET);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdVectorContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangAntlrInitParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangAntlrInitParser.CLOSE_BRACKET, 0); }
		public IdVectorContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterIdVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitIdVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitIdVector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends LvalueContext {
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public IdContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcessorIDContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ACCESSOR() { return getToken(LangAntlrInitParser.ACCESSOR, 0); }
		public TerminalNode ID() { return getToken(LangAntlrInitParser.ID, 0); }
		public AcessorIDContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterAcessorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitAcessorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitAcessorID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(270);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new IdVectorContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(OPEN_BRACKET);
						setState(274);
						exp(0);
						setState(275);
						match(CLOSE_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new AcessorIDContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(277);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(278);
						match(ACCESSOR);
						setState(279);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangAntlrInitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangAntlrInitParser.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangAntlrInitListener ) ((LangAntlrInitListener)listener).exitExps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangAntlrInitVisitor ) return ((LangAntlrInitVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			exp(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				exp(0);
				}
				}
				setState(292);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 11:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 12:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 13:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 16:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0005\u0000,\b\u0000\n"+
		"\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003K\b\u0003\n\u0003\f\u0003"+
		"N\t\u0003\u0003\u0003P\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003T\b"+
		"\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006"+
		"\f\u0006p\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bv\b\b"+
		"\n\b\f\by\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a4"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a9\b\b\u0001\b\u0003\b\u00ac\b"+
		"\b\u0001\b\u0003\b\u00af\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00b4\b\t"+
		"\n\t\f\t\u00b7\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ca\b\u000b\n\u000b\f\u000b"+
		"\u00cd\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u00d5\b\f\n\f\f\f\u00d8\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00e0\b\r\n\r\f\r\u00e3\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f1\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fe\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0103\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f"+
		"\u0003\u000f\u010c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0119\b\u0010\n\u0010\f\u0010\u011c\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0121\b\u0011\n\u0011\f\u0011"+
		"\u0124\t\u0011\u0001\u0011\u0000\u0006\f\u0014\u0016\u0018\u001a \u0012"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"\u0000\u0004\u0002\u0000\u0017\u0017,,\u0001\u0000\u0013"+
		"\u0016\u0001\u0000\u000b\f\u0001\u0000\r\u000f\u013f\u0000\'\u0001\u0000"+
		"\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006@\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\nb\u0001\u0000"+
		"\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000"+
		"\u0010\u00ae\u0001\u0000\u0000\u0000\u0012\u00b0\u0001\u0000\u0000\u0000"+
		"\u0014\u00b8\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000"+
		"\u0018\u00ce\u0001\u0000\u0000\u0000\u001a\u00d9\u0001\u0000\u0000\u0000"+
		"\u001c\u00f0\u0001\u0000\u0000\u0000\u001e\u010b\u0001\u0000\u0000\u0000"+
		" \u010d\u0001\u0000\u0000\u0000\"\u011d\u0001\u0000\u0000\u0000$&\u0003"+
		"\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(-\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*,\u0003\u0006\u0003\u0000+*\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000001\u0005\u0001\u0000\u000012\u0005,\u0000\u000026\u0005 \u0000\u0000"+
		"35\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0005!\u0000\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;<\u0005/\u0000\u0000<=\u0005%\u0000\u0000=>\u0003\f"+
		"\u0006\u0000>?\u0005$\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005"+
		"/\u0000\u0000AC\u0005\u001c\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EO\u0005\u001d\u0000\u0000FG\u0005#\u0000\u0000GL\u0003\f\u0006\u0000"+
		"HI\u0005&\u0000\u0000IK\u0003\f\u0006\u0000JH\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OF\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QU\u0005"+
		" \u0000\u0000RT\u0003\u0010\b\u0000SR\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005!\u0000\u0000"+
		"Y\u0007\u0001\u0000\u0000\u0000Z_\u0003\n\u0005\u0000[\\\u0005&\u0000"+
		"\u0000\\^\u0003\n\u0005\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\t\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005/\u0000\u0000cd\u0005"+
		"%\u0000\u0000de\u0003\f\u0006\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0006"+
		"\u0006\uffff\uffff\u0000gh\u0003\u000e\u0007\u0000hn\u0001\u0000\u0000"+
		"\u0000ij\n\u0002\u0000\u0000jk\u0005\u001e\u0000\u0000km\u0005\u001f\u0000"+
		"\u0000li\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0007\u0000\u0000\u0000r\u000f\u0001\u0000\u0000"+
		"\u0000sw\u0005 \u0000\u0000tv\u0003\u0010\b\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z\u00af"+
		"\u0005!\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\u001c\u0000\u0000"+
		"}~\u0003\u0014\n\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0080\u0003"+
		"\u0010\b\u0000\u0080\u00af\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0003"+
		"\u0000\u0000\u0082\u0083\u0005\u001c\u0000\u0000\u0083\u0084\u0003\u0014"+
		"\n\u0000\u0084\u0085\u0005\u001d\u0000\u0000\u0085\u0086\u0003\u0010\b"+
		"\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u0088\u0003\u0010\b\u0000"+
		"\u0088\u00af\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000"+
		"\u008a\u008b\u0005\u001c\u0000\u0000\u008b\u008c\u0003\u0014\n\u0000\u008c"+
		"\u008d\u0005\u001d\u0000\u0000\u008d\u008e\u0003\u0010\b\u0000\u008e\u00af"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\t\u0000\u0000\u0090\u0091\u0003"+
		" \u0010\u0000\u0091\u0092\u0005$\u0000\u0000\u0092\u00af\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u0095\u0003\u0014\n\u0000"+
		"\u0095\u0096\u0005$\u0000\u0000\u0096\u00af\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\n\u0000\u0000\u0098\u0099\u0003\"\u0011\u0000\u0099\u009a"+
		"\u0005$\u0000\u0000\u009a\u00af\u0001\u0000\u0000\u0000\u009b\u009c\u0003"+
		" \u0010\u0000\u009c\u009d\u0005\'\u0000\u0000\u009d\u009e\u0003\u0014"+
		"\n\u0000\u009e\u009f\u0005$\u0000\u0000\u009f\u00af\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005/\u0000\u0000\u00a1\u00a3\u0005\u001c\u0000\u0000"+
		"\u00a2\u00a4\u0003\"\u0011\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00ab\u0005\u001d\u0000\u0000\u00a6\u00a8\u0005\u0013\u0000\u0000\u00a7"+
		"\u00a9\u0003\u0012\t\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0005\u0014\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0005$\u0000\u0000\u00aes\u0001\u0000\u0000\u0000\u00ae{\u0001\u0000"+
		"\u0000\u0000\u00ae\u0081\u0001\u0000\u0000\u0000\u00ae\u0089\u0001\u0000"+
		"\u0000\u0000\u00ae\u008f\u0001\u0000\u0000\u0000\u00ae\u0093\u0001\u0000"+
		"\u0000\u0000\u00ae\u0097\u0001\u0000\u0000\u0000\u00ae\u009b\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a0\u0001\u0000\u0000\u0000\u00af\u0011\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b5\u0003 \u0010\u0000\u00b1\u00b2\u0005&\u0000\u0000"+
		"\u00b2\u00b4\u0003 \u0010\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\n\uffff\uffff\u0000\u00b9"+
		"\u00ba\u0003\u0016\u000b\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\n\u0002\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00bf"+
		"\u0003\u0014\n\u0003\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u0015\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0006\u000b\uffff\uffff\u0000\u00c4\u00c5"+
		"\u0003\u0018\f\u0000\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00c7\n"+
		"\u0002\u0000\u0000\u00c7\u00c8\u0007\u0001\u0000\u0000\u00c8\u00ca\u0003"+
		"\u0018\f\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u0017\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0006\f\uffff\uffff\u0000\u00cf\u00d0\u0003\u001a"+
		"\r\u0000\u00d0\u00d6\u0001\u0000\u0000\u0000\u00d1\u00d2\n\u0002\u0000"+
		"\u0000\u00d2\u00d3\u0007\u0002\u0000\u0000\u00d3\u00d5\u0003\u001a\r\u0000"+
		"\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0006\r\uffff\uffff\u0000\u00da\u00db\u0003\u001c\u000e\u0000"+
		"\u00db\u00e1\u0001\u0000\u0000\u0000\u00dc\u00dd\n\u0002\u0000\u0000\u00dd"+
		"\u00de\u0007\u0003\u0000\u0000\u00de\u00e0\u0003\u001c\u000e\u0000\u00df"+
		"\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u001b\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0012\u0000\u0000\u00e5\u00f1\u0003\u001c\u000e\u0000\u00e6"+
		"\u00e7\u0005\f\u0000\u0000\u00e7\u00f1\u0003\u001c\u000e\u0000\u00e8\u00f1"+
		"\u0005\u0006\u0000\u0000\u00e9\u00f1\u0005\u0007\u0000\u0000\u00ea\u00f1"+
		"\u0005.\u0000\u0000\u00eb\u00f1\u00051\u0000\u0000\u00ec\u00f1\u00050"+
		"\u0000\u0000\u00ed\u00f1\u00053\u0000\u0000\u00ee\u00f1\u00052\u0000\u0000"+
		"\u00ef\u00f1\u0003\u001e\u000f\u0000\u00f0\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e6\u0001\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001d\u0001\u0000\u0000\u0000"+
		"\u00f2\u010c\u0003 \u0010\u0000\u00f3\u00f4\u0005\u001c\u0000\u0000\u00f4"+
		"\u00f5\u0003\u0014\n\u0000\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u010c"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\b\u0000\u0000\u00f8\u00fd\u0003"+
		"\f\u0006\u0000\u00f9\u00fa\u0005\u001e\u0000\u0000\u00fa\u00fb\u0003\""+
		"\u0011\u0000\u00fb\u00fc\u0005\u001f\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u010c\u0001\u0000\u0000\u0000\u00ff\u0100\u0005/\u0000"+
		"\u0000\u0100\u0102\u0005\u001c\u0000\u0000\u0101\u0103\u0003\"\u0011\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0109\u0005\u001d\u0000\u0000"+
		"\u0105\u0106\u0005\u001e\u0000\u0000\u0106\u0107\u0003\u0014\n\u0000\u0107"+
		"\u0108\u0005\u001f\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0105\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u00f2\u0001\u0000\u0000\u0000\u010b"+
		"\u00f3\u0001\u0000\u0000\u0000\u010b\u00f7\u0001\u0000\u0000\u0000\u010b"+
		"\u00ff\u0001\u0000\u0000\u0000\u010c\u001f\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0006\u0010\uffff\uffff\u0000\u010e\u010f\u0005/\u0000\u0000\u010f"+
		"\u011a\u0001\u0000\u0000\u0000\u0110\u0111\n\u0002\u0000\u0000\u0111\u0112"+
		"\u0005\u001e\u0000\u0000\u0112\u0113\u0003\u0014\n\u0000\u0113\u0114\u0005"+
		"\u001f\u0000\u0000\u0114\u0119\u0001\u0000\u0000\u0000\u0115\u0116\n\u0001"+
		"\u0000\u0000\u0116\u0117\u0005\"\u0000\u0000\u0117\u0119\u0005/\u0000"+
		"\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b!\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0122\u0003\u0014\n\u0000\u011e"+
		"\u011f\u0005&\u0000\u0000\u011f\u0121\u0003\u0014\n\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123#\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u001b\'-6CLOU_"+
		"nw\u00a3\u00a8\u00ab\u00ae\u00b5\u00c0\u00cb\u00d6\u00e1\u00f0\u00fd\u0102"+
		"\u0109\u010b\u0118\u011a\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}