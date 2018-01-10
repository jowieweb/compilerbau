// Generated from /home/nils/Nextcloud/Master/2. Semester/Compilerbau/compilerbau/JavaLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, COMMENT=15, LINE_COMMENT=16, 
		CLASS=17, PUBLIC=18, PRIVATE=19, PROTECTED=20, ABSTRACT=21, STATIC=22, 
		VOID=23, IMPLEMENTS=24, EXTENDS=25, INTERFACE=26, ENUM=27, THROWS=28, 
		THIS=29, RETURN=30, TRUE=31, FALSE=32, NEW=33, FOR=34, WHILE=35, INTEGER=36, 
		DOUBLE=37, FLOAT=38, STRING=39, LONG=40, SHORT=41, BYTE=42, LBRACK=43, 
		RBRACK=44, LCBRACK=45, RCBRACK=46, LSQBRACK=47, RSQBRACK=48, LPBRACK=49, 
		RPBRACK=50, SEMICOLON=51, DOT=52, IDENTIFIER=53, STRING_CONST=54, Digits=55, 
		LetterOrDigit=56, Letter=57;
	public static final int
		RULE_r = 0, RULE_accessmod = 1, RULE_parameter = 2, RULE_constructor = 3, 
		RULE_method_sig = 4, RULE_method_call = 5, RULE_method_call_param = 6, 
		RULE_method = 7, RULE_scope = 8, RULE_expression = 9, RULE_condition = 10, 
		RULE_variable = 11, RULE_attribute = 12, RULE_datatype = 13, RULE_scope_body = 14, 
		RULE_for_loop = 15, RULE_while_loop = 16, RULE_class_def = 17, RULE_interface_def = 18, 
		RULE_class_name = 19, RULE_interface_name = 20, RULE_method_name = 21;
	public static final String[] ruleNames = {
		"r", "accessmod", "parameter", "constructor", "method_sig", "method_call", 
		"method_call_param", "method", "scope", "expression", "condition", "variable", 
		"attribute", "datatype", "scope_body", "for_loop", "while_loop", "class_def", 
		"interface_def", "class_name", "interface_name", "method_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "'++'", "'--'", "'<='", 
		"'>='", "'=='", "'&'", "'|'", null, null, null, "'class'", "'public'", 
		"'private'", "'protected'", "'abstract'", "'static'", "'void'", "'implements'", 
		"'extends'", "'interface'", "'enum'", "'throws'", "'this'", "'return'", 
		"'true'", "'false'", "'new'", "'for'", "'while'", "'int'", "'double'", 
		"'float'", "'String'", "'long'", "'short'", "'byte'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'<'", "'>'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT", "LINE_COMMENT", "CLASS", "PUBLIC", "PRIVATE", 
		"PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", 
		"ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", "NEW", "FOR", "WHILE", 
		"INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", "LBRACK", 
		"RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", "LPBRACK", "RPBRACK", 
		"SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", "Digits", "LetterOrDigit", 
		"Letter"
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
	public String getGrammarFileName() { return "JavaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public List<Interface_defContext> interface_def() {
			return getRuleContexts(Interface_defContext.class);
		}
		public Interface_defContext interface_def(int i) {
			return getRuleContext(Interface_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << INTERFACE))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					interface_def();
					}
					break;
				case 2:
					{
					setState(45);
					class_def();
					}
					break;
				}
				}
				setState(50);
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

	public static class AccessmodContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaLexerParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaLexerParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaLexerParser.PROTECTED, 0); }
		public AccessmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterAccessmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitAccessmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitAccessmod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessmodContext accessmod() throws RecognitionException {
		AccessmodContext _localctx = new AccessmodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_accessmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
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

	public static class ParameterContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public List<TerminalNode> LSQBRACK() { return getTokens(JavaLexerParser.LSQBRACK); }
		public TerminalNode LSQBRACK(int i) {
			return getToken(JavaLexerParser.LSQBRACK, i);
		}
		public List<TerminalNode> RSQBRACK() { return getTokens(JavaLexerParser.RSQBRACK); }
		public TerminalNode RSQBRACK(int i) {
			return getToken(JavaLexerParser.RSQBRACK, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			datatype();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(54);
				match(LSQBRACK);
				setState(55);
				match(RSQBRACK);
				}
			}

			setState(58);
			match(IDENTIFIER);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(59);
				match(LSQBRACK);
				setState(60);
				match(RSQBRACK);
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

	public static class ConstructorContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaLexerParser.STATIC, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(JavaLexerParser.THROWS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(63);
				accessmod();
				}
			}

			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(66);
				match(STATIC);
				}
			}

			setState(69);
			class_name();
			setState(70);
			match(LBRACK);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(71);
				parameter();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(72);
					match(T__0);
					setState(73);
					parameter();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(RBRACK);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(82);
				match(THROWS);
				setState(83);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(84);
					match(T__0);
					setState(85);
					match(IDENTIFIER);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(LCBRACK);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(94);
				scope_body();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RCBRACK);
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

	public static class Method_sigContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaLexerParser.VOID, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(JavaLexerParser.THROWS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode STATIC() { return getToken(JavaLexerParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaLexerParser.ABSTRACT, 0); }
		public Method_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_sig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMethod_sig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMethod_sig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMethod_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_sigContext method_sig() throws RecognitionException {
		Method_sigContext _localctx = new Method_sigContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_sig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(102);
				accessmod();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==ABSTRACT || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case IDENTIFIER:
				{
				setState(108);
				datatype();
				}
				break;
			case VOID:
				{
				setState(109);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			method_name();
			setState(113);
			match(LBRACK);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(114);
				parameter();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(115);
					match(T__0);
					setState(116);
					parameter();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(124);
			match(RBRACK);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(125);
				match(THROWS);
				setState(126);
				match(IDENTIFIER);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(127);
					match(T__0);
					setState(128);
					match(IDENTIFIER);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode LPBRACK() { return getToken(JavaLexerParser.LPBRACK, 0); }
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
		public Method_call_paramContext method_call_param() {
			return getRuleContext(Method_call_paramContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaLexerParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(136);
				match(THIS);
				setState(137);
				match(DOT);
				}
			}

			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					class_name();
					setState(141);
					match(DOT);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
			setState(148);
			method_name();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(149);
				match(LPBRACK);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(150);
					datatype();
					}
				}

				setState(153);
				match(RPBRACK);
				}
			}

			setState(156);
			match(LBRACK);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << STRING_CONST) | (1L << Digits))) != 0)) {
				{
				setState(157);
				method_call_param();
				}
			}

			setState(160);
			match(RBRACK);
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

	public static class Method_call_paramContext extends ParserRuleContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(JavaLexerParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(JavaLexerParser.STRING_CONST, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Digits() { return getTokens(JavaLexerParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(JavaLexerParser.Digits, i);
		}
		public Method_call_paramContext method_call_param() {
			return getRuleContext(Method_call_paramContext.class,0);
		}
		public Method_call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMethod_call_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMethod_call_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMethod_call_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_paramContext method_call_param() throws RecognitionException {
		Method_call_paramContext _localctx = new Method_call_paramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_call_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(162);
				method_call();
				}
				break;
			case 2:
				{
				setState(163);
				match(STRING_CONST);
				}
				break;
			case 3:
				{
				setState(164);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(165);
				match(Digits);
				}
				break;
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(168);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				method_call_param();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					match(T__0);
					setState(173);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_CONST) | (1L << Digits))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(178);
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
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Method_sigContext method_sig() {
			return getRuleContext(Method_sigContext.class,0);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			method_sig();
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCBRACK:
				{
				setState(180);
				match(LCBRACK);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(181);
					scope_body();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(RCBRACK);
				}
				break;
			case SEMICOLON:
				{
				setState(188);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LCBRACK);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(192);
					scope_body();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(198);
			match(RCBRACK);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode RETURN() { return getToken(JavaLexerParser.RETURN, 0); }
		public TerminalNode THIS() { return getToken(JavaLexerParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaLexerParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaLexerParser.LBRACK, i);
		}
		public List<TerminalNode> NEW() { return getTokens(JavaLexerParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(JavaLexerParser.NEW, i);
		}
		public List<TerminalNode> Digits() { return getTokens(JavaLexerParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(JavaLexerParser.Digits, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(200);
				match(RETURN);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(201);
					match(THIS);
					setState(202);
					match(DOT);
					}
				}

				}
				break;
			case 2:
				{
				setState(205);
				match(THIS);
				setState(206);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(207);
				datatype();
				}
				break;
			}
			setState(210);
			match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(248);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(211);
							match(DOT);
							}
							break;
						case T__1:
						case T__2:
						case T__3:
						case T__4:
						case T__5:
						case THIS:
						case NEW:
						case LBRACK:
						case IDENTIFIER:
						case Digits:
							{
							{
							setState(213);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
								{
								setState(212);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(216);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__5) {
								{
								setState(215);
								match(T__5);
								}
							}

							setState(221);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
							case 1:
								{
								setState(218);
								match(LBRACK);
								setState(219);
								match(IDENTIFIER);
								setState(220);
								match(RBRACK);
								}
								break;
							}
							}
							setState(226);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LBRACK) {
								{
								{
								setState(223);
								match(LBRACK);
								}
								}
								setState(228);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(230);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NEW) {
								{
								setState(229);
								match(NEW);
								}
							}

							setState(246);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(232);
								method_call();
								setState(237);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(233);
										match(DOT);
										setState(234);
										method_call();
										}
										} 
									}
									setState(239);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
								}
								}
								break;
							case 2:
								{
								setState(240);
								match(IDENTIFIER);
								}
								break;
							case 3:
								{
								setState(242); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(241);
										match(Digits);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(244); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(252);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(253);
				match(T__7);
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					match(RBRACK);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaLexerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaLexerParser.FALSE, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaLexerParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaLexerParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Digits() { return getToken(JavaLexerParser.Digits, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(262);
				match(LBRACK);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case LPBRACK:
			case RPBRACK:
			case IDENTIFIER:
				{
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(268);
					match(IDENTIFIER);
					}
				}

				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LPBRACK) | (1L << RPBRACK))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(272);
					match(Digits);
					}
					break;
				case 2:
					{
					setState(273);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(274);
					method_call();
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(275);
						match(DOT);
						setState(278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(276);
							method_call();
							}
							break;
						case 2:
							{
							setState(277);
							match(IDENTIFIER);
							}
							break;
						}
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				}
				break;
			case TRUE:
				{
				setState(287);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(288);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(291);
					match(RBRACK);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACK) | (1L << LPBRACK) | (1L << RPBRACK) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(297);
				condition();
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

	public static class VariableContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			datatype();
			setState(301);
			match(IDENTIFIER);
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

	public static class AttributeContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(303);
				accessmod();
				}
			}

			setState(306);
			variable();
			setState(307);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JavaLexerParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaLexerParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(JavaLexerParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(JavaLexerParser.STRING, 0); }
		public TerminalNode LONG() { return getToken(JavaLexerParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(JavaLexerParser.SHORT, 0); }
		public TerminalNode BYTE() { return getToken(JavaLexerParser.BYTE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public TerminalNode LPBRACK() { return getToken(JavaLexerParser.LPBRACK, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datatype);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(STRING);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				match(IDENTIFIER);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(317);
					match(LPBRACK);
					setState(318);
					datatype();
					setState(319);
					match(RPBRACK);
					}
				}

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

	public static class Scope_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Scope_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterScope_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitScope_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitScope_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_bodyContext scope_body() throws RecognitionException {
		Scope_bodyContext _localctx = new Scope_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scope_body);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				expression();
				setState(326);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				method_call();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THIS || _la==IDENTIFIER) {
					{
					{
					setState(329);
					method_call();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				scope();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaLexerParser.FOR, 0); }
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaLexerParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(FOR);
				setState(343);
				match(LBRACK);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(344);
					expression();
					}
				}

				setState(347);
				match(SEMICOLON);
				setState(348);
				condition();
				setState(349);
				match(SEMICOLON);
				setState(350);
				expression();
				setState(351);
				match(RBRACK);
				{
				setState(352);
				match(LCBRACK);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(353);
					scope_body();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				match(RCBRACK);
				}
				}
				break;
			case THIS:
			case RETURN:
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				expression();
				setState(362);
				match(SEMICOLON);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaLexerParser.WHILE, 0); }
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(WHILE);
			setState(367);
			match(LBRACK);
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(368);
				expression();
				}
				break;
			}
			setState(371);
			condition();
			setState(372);
			match(RBRACK);
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(373);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(374);
				match(LCBRACK);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(375);
					scope_body();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(RCBRACK);
				}
				break;
			case THIS:
			case RETURN:
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case IDENTIFIER:
				{
				setState(382);
				expression();
				setState(383);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaLexerParser.CLASS, 0); }
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(JavaLexerParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaLexerParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaLexerParser.IMPLEMENTS, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(387);
				accessmod();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(390);
				match(ABSTRACT);
				}
			}

			setState(393);
			match(CLASS);
			setState(394);
			class_name();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(395);
				match(EXTENDS);
				setState(396);
				class_name();
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(399);
				match(IMPLEMENTS);
				setState(400);
				interface_name();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(401);
					match(T__0);
					setState(402);
					interface_name();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(410);
			match(LCBRACK);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(411);
					constructor();
					}
					break;
				case 2:
					{
					setState(412);
					method();
					}
					break;
				case 3:
					{
					setState(413);
					attribute();
					}
					break;
				case 4:
					{
					setState(414);
					class_def();
					}
					break;
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(RCBRACK);
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

	public static class Interface_defContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaLexerParser.INTERFACE, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaLexerParser.EXTENDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public List<Method_sigContext> method_sig() {
			return getRuleContexts(Method_sigContext.class);
		}
		public Method_sigContext method_sig(int i) {
			return getRuleContext(Method_sigContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaLexerParser.SEMICOLON, i);
		}
		public Interface_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterInterface_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitInterface_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitInterface_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_defContext interface_def() throws RecognitionException {
		Interface_defContext _localctx = new Interface_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interface_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(422);
				accessmod();
				}
			}

			setState(425);
			match(INTERFACE);
			setState(426);
			interface_name();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(427);
				match(EXTENDS);
				setState(428);
				match(IDENTIFIER);
				}
			}

			setState(431);
			match(LCBRACK);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(432);
				method_sig();
				setState(433);
				match(SEMICOLON);
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(RCBRACK);
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(IDENTIFIER);
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

	public static class Interface_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitInterface_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitInterface_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IDENTIFIER);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\5\4@\n\4\3"+
		"\5\5\5C\n\5\3\5\5\5F\n\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5"+
		"\5R\n\5\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\5\5^\n\5\3\5\3\5"+
		"\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\6\5\6j\n\6\3\6\5\6m\n\6\3\6\3\6\5\6"+
		"q\n\6\3\6\3\6\3\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\5\6}\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\5\6\u0089\n\6\3\7\3\7\5\7\u008d"+
		"\n\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16\7\u0095\13\7\3\7\3\7\3\7\5\7\u009a"+
		"\n\7\3\7\5\7\u009d\n\7\3\7\3\7\5\7\u00a1\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\b\u00a9\n\b\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4"+
		"\13\b\3\t\3\t\3\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3\t\3\t\5\t\u00c0"+
		"\n\t\3\n\3\n\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u00ce\n\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\3\13\5\13\u00d8"+
		"\n\13\3\13\5\13\u00db\n\13\3\13\3\13\3\13\5\13\u00e0\n\13\3\13\7\13\u00e3"+
		"\n\13\f\13\16\13\u00e6\13\13\3\13\5\13\u00e9\n\13\3\13\3\13\3\13\7\13"+
		"\u00ee\n\13\f\13\16\13\u00f1\13\13\3\13\3\13\6\13\u00f5\n\13\r\13\16\13"+
		"\u00f6\5\13\u00f9\n\13\6\13\u00fb\n\13\r\13\16\13\u00fc\3\13\3\13\5\13"+
		"\u0101\n\13\3\13\7\13\u0104\n\13\f\13\16\13\u0107\13\13\3\f\7\f\u010a"+
		"\n\f\f\f\16\f\u010d\13\f\3\f\5\f\u0110\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0119\n\f\7\f\u011b\n\f\f\f\16\f\u011e\13\f\5\f\u0120\n\f\3\f\3\f"+
		"\5\f\u0124\n\f\3\f\7\f\u0127\n\f\f\f\16\f\u012a\13\f\3\f\5\f\u012d\n\f"+
		"\3\r\3\r\3\r\3\16\5\16\u0133\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0144\n\17\5\17\u0146\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u014d\n\20\f\20\16\20\u0150\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0157\n\20\3\21\3\21\3\21\5\21\u015c\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0165\n\21\f\21\16\21\u0168\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u016f\n\21\3\22\3\22\3\22\5\22\u0174"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u017b\n\22\f\22\16\22\u017e\13\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0184\n\22\3\23\5\23\u0187\n\23\3\23\5\23\u018a"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0190\n\23\3\23\3\23\3\23\3\23\7\23\u0196"+
		"\n\23\f\23\16\23\u0199\13\23\5\23\u019b\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u01a2\n\23\f\23\16\23\u01a5\13\23\3\23\3\23\3\24\5\24\u01aa\n\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01b0\n\24\3\24\3\24\3\24\3\24\7\24\u01b6\n"+
		"\24\f\24\16\24\u01b9\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\4\u00c5\u0128\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7"+
		"\3\2\24\26\3\2\27\30\3\2\4\7\3\2\679\4\2\13\17\63\64\2\u0209\2\62\3\2"+
		"\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bB\3\2\2\2\ni\3\2\2\2\f\u008c\3\2\2\2\16"+
		"\u00a8\3\2\2\2\20\u00b5\3\2\2\2\22\u00c1\3\2\2\2\24\u00d2\3\2\2\2\26\u010b"+
		"\3\2\2\2\30\u012e\3\2\2\2\32\u0132\3\2\2\2\34\u0145\3\2\2\2\36\u0156\3"+
		"\2\2\2 \u016e\3\2\2\2\"\u0170\3\2\2\2$\u0186\3\2\2\2&\u01a9\3\2\2\2(\u01bc"+
		"\3\2\2\2*\u01be\3\2\2\2,\u01c0\3\2\2\2.\61\5&\24\2/\61\5$\23\2\60.\3\2"+
		"\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2"+
		"\2\64\62\3\2\2\2\65\66\t\2\2\2\66\5\3\2\2\2\67:\5\34\17\289\7\61\2\29"+
		";\7\62\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<?\7\67\2\2=>\7\61\2\2>@\7\62"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2AC\5\4\3\2BA\3\2\2\2BC\3\2\2\2CE\3"+
		"\2\2\2DF\7\30\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5(\25\2HQ\7-\2\2IN\5"+
		"\6\4\2JK\7\3\2\2KM\5\6\4\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2S]\7.\2\2TU\7\36\2\2UZ\7"+
		"\67\2\2VW\7\3\2\2WY\7\67\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2]T\3\2\2\2]^\3\2\2\2^_\3\2\2\2_c\7/\2\2`b\5\36\20"+
		"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\60"+
		"\2\2g\t\3\2\2\2hj\5\4\3\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\t\3\2\2lk\3"+
		"\2\2\2lm\3\2\2\2mp\3\2\2\2nq\5\34\17\2oq\7\31\2\2pn\3\2\2\2po\3\2\2\2"+
		"qr\3\2\2\2rs\5,\27\2s|\7-\2\2ty\5\6\4\2uv\7\3\2\2vx\5\6\4\2wu\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|t\3\2\2\2|}\3\2\2\2"+
		"}~\3\2\2\2~\u0088\7.\2\2\177\u0080\7\36\2\2\u0080\u0085\7\67\2\2\u0081"+
		"\u0082\7\3\2\2\u0082\u0084\7\67\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\177\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2\2"+
		"\u008a\u008b\7\37\2\2\u008b\u008d\7\66\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u0093\3\2\2\2\u008e\u008f\5(\25\2\u008f\u0090\7\66\2\2"+
		"\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u009c\5,\27\2\u0097\u0099\7\63\2\2\u0098\u009a\5\34\17\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\64\2\2"+
		"\u009c\u0097\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\7-\2\2\u009f\u00a1\5\16\b\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\r\3\2\2\2\u00a4\u00a9\5\f\7\2"+
		"\u00a5\u00a9\78\2\2\u00a6\u00a9\7\67\2\2\u00a7\u00a9\79\2\2\u00a8\u00a4"+
		"\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ad\5\16\b\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00af\7\3\2\2\u00af"+
		"\u00b1\t\5\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00bf"+
		"\5\n\6\2\u00b6\u00ba\7/\2\2\u00b7\u00b9\5\36\20\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\7\60\2\2\u00be\u00c0\7\65\2\2"+
		"\u00bf\u00b6\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00c5"+
		"\7/\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c9\23\3\2\2\2\u00ca\u00cd\7 \2\2\u00cb"+
		"\u00cc\7\37\2\2\u00cc\u00ce\7\66\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00d0\7\37\2\2\u00d0\u00d3\7\66\2\2\u00d1"+
		"\u00d3\5\34\17\2\u00d2\u00ca\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u0100\7\67\2\2\u00d5"+
		"\u00fb\7\66\2\2\u00d6\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\7\b\2\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de\7\67"+
		"\2\2\u00de\u00e0\7.\2\2\u00df\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e4\3\2\2\2\u00e1\u00e3\7-\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\7#\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f8\3\2\2\2\u00ea\u00ef\5\f\7\2\u00eb\u00ec\7\66\2\2\u00ec"+
		"\u00ee\5\f\7\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f9\7\67\2\2\u00f3\u00f5\79\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00ea\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00d5\3\2\2\2\u00fa\u00d7\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u0101\7\t"+
		"\2\2\u00ff\u0101\7\n\2\2\u0100\u00fa\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0104\7."+
		"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\25\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7-\2\2"+
		"\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u0123\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\67\2\2"+
		"\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u011f"+
		"\t\6\2\2\u0112\u0120\79\2\2\u0113\u0120\7\67\2\2\u0114\u011c\5\f\7\2\u0115"+
		"\u0118\7\66\2\2\u0116\u0119\5\f\7\2\u0117\u0119\7\67\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0115\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0112\3\2\2\2\u011f\u0113\3\2\2\2\u011f"+
		"\u0114\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u0124\7!\2\2\u0122\u0124\7\""+
		"\2\2\u0123\u010f\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0128\3\2\2\2\u0125\u0127\7.\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\5\26\f\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\27\3\2\2\2\u012e\u012f\5\34\17\2\u012f\u0130\7\67\2\2\u0130"+
		"\31\3\2\2\2\u0131\u0133\5\4\3\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134\u0135\5\30\r\2\u0135\u0136\7\65\2\2\u0136"+
		"\33\3\2\2\2\u0137\u0146\7&\2\2\u0138\u0146\7\'\2\2\u0139\u0146\7(\2\2"+
		"\u013a\u0146\7)\2\2\u013b\u0146\7*\2\2\u013c\u0146\7+\2\2\u013d\u0146"+
		"\7,\2\2\u013e\u0143\7\67\2\2\u013f\u0140\7\63\2\2\u0140\u0141\5\34\17"+
		"\2\u0141\u0142\7\64\2\2\u0142\u0144\3\2\2\2\u0143\u013f\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0137\3\2\2\2\u0145\u0138\3\2"+
		"\2\2\u0145\u0139\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u013b\3\2\2\2\u0145"+
		"\u013c\3\2\2\2\u0145\u013d\3\2\2\2\u0145\u013e\3\2\2\2\u0146\35\3\2\2"+
		"\2\u0147\u0148\5\24\13\2\u0148\u0149\7\65\2\2\u0149\u0157\3\2\2\2\u014a"+
		"\u014e\5\f\7\2\u014b\u014d\5\f\7\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\7\65\2\2\u0152\u0157\3\2\2\2\u0153\u0157\5"+
		" \21\2\u0154\u0157\5\"\22\2\u0155\u0157\5\22\n\2\u0156\u0147\3\2\2\2\u0156"+
		"\u014a\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\37\3\2\2\2\u0158\u0159\7$\2\2\u0159\u015b\7-\2\2\u015a\u015c"+
		"\5\24\13\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u015e\7\65\2\2\u015e\u015f\5\26\f\2\u015f\u0160\7\65\2\2\u0160"+
		"\u0161\5\24\13\2\u0161\u0162\7.\2\2\u0162\u0166\7/\2\2\u0163\u0165\5\36"+
		"\20\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\60"+
		"\2\2\u016a\u016f\3\2\2\2\u016b\u016c\5\24\13\2\u016c\u016d\7\65\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0158\3\2\2\2\u016e\u016b\3\2\2\2\u016f!\3\2\2\2"+
		"\u0170\u0171\7%\2\2\u0171\u0173\7-\2\2\u0172\u0174\5\24\13\2\u0173\u0172"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\5\26\f\2"+
		"\u0176\u0183\7.\2\2\u0177\u0184\7\65\2\2\u0178\u017c\7/\2\2\u0179\u017b"+
		"\5\36\20\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0184"+
		"\7\60\2\2\u0180\u0181\5\24\13\2\u0181\u0182\7\65\2\2\u0182\u0184\3\2\2"+
		"\2\u0183\u0177\3\2\2\2\u0183\u0178\3\2\2\2\u0183\u0180\3\2\2\2\u0184#"+
		"\3\2\2\2\u0185\u0187\5\4\3\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u018a\7\27\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\23\2\2\u018c\u018f\5(\25\2\u018d"+
		"\u018e\7\33\2\2\u018e\u0190\5(\25\2\u018f\u018d\3\2\2\2\u018f\u0190\3"+
		"\2\2\2\u0190\u019a\3\2\2\2\u0191\u0192\7\32\2\2\u0192\u0197\5*\26\2\u0193"+
		"\u0194\7\3\2\2\u0194\u0196\5*\26\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u01a3\7/\2\2\u019d\u01a2\5\b\5\2\u019e\u01a2\5\20\t\2\u019f"+
		"\u01a2\5\32\16\2\u01a0\u01a2\5$\23\2\u01a1\u019d\3\2\2\2\u01a1\u019e\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a7\7\60\2\2\u01a7%\3\2\2\2\u01a8\u01aa\5\4\3\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\34\2\2"+
		"\u01ac\u01af\5*\26\2\u01ad\u01ae\7\33\2\2\u01ae\u01b0\7\67\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b7\7/\2\2\u01b2"+
		"\u01b3\5\n\6\2\u01b3\u01b4\7\65\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3"+
		"\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7\60\2\2\u01bb\'\3\2\2"+
		"\2\u01bc\u01bd\7\67\2\2\u01bd)\3\2\2\2\u01be\u01bf\7\67\2\2\u01bf+\3\2"+
		"\2\2\u01c0\u01c1\7\67\2\2\u01c1-\3\2\2\2J\60\62:?BENQZ]cilpy|\u0085\u0088"+
		"\u008c\u0093\u0099\u009c\u00a0\u00a8\u00ac\u00b2\u00ba\u00bf\u00c5\u00cd"+
		"\u00d2\u00d7\u00da\u00df\u00e4\u00e8\u00ef\u00f6\u00f8\u00fa\u00fc\u0100"+
		"\u0105\u010b\u010f\u0118\u011c\u011f\u0123\u0128\u012c\u0132\u0143\u0145"+
		"\u014e\u0156\u015b\u0166\u016e\u0173\u017c\u0183\u0186\u0189\u018f\u0197"+
		"\u019a\u01a1\u01a3\u01a9\u01af\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}