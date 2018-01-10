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
		STUFF=17, CLASS=18, PUBLIC=19, PRIVATE=20, PROTECTED=21, ABSTRACT=22, 
		STATIC=23, VOID=24, IMPLEMENTS=25, EXTENDS=26, INTERFACE=27, ENUM=28, 
		THROWS=29, THIS=30, RETURN=31, TRUE=32, FALSE=33, NEW=34, FOR=35, WHILE=36, 
		INTEGER=37, DOUBLE=38, FLOAT=39, STRING=40, LONG=41, SHORT=42, BYTE=43, 
		LBRACK=44, RBRACK=45, LCBRACK=46, RCBRACK=47, LSQBRACK=48, RSQBRACK=49, 
		LPBRACK=50, RPBRACK=51, SEMICOLON=52, DOT=53, IDENTIFIER=54, STRING_CONST=55, 
		Digitss=56, LetterOrDigit=57, Letter=58;
	public static final int
		RULE_r = 0, RULE_accessmod = 1, RULE_parameter = 2, RULE_constructor = 3, 
		RULE_method_sig = 4, RULE_method_call = 5, RULE_method_call_param = 6, 
		RULE_method = 7, RULE_scope = 8, RULE_expression = 9, RULE_condition = 10, 
		RULE_variable = 11, RULE_attribute = 12, RULE_datatype = 13, RULE_scope_body = 14, 
		RULE_for_loop = 15, RULE_while_loop = 16, RULE_class_def = 17, RULE_interface_def = 18, 
		RULE_class_name = 19;
	public static final String[] ruleNames = {
		"r", "accessmod", "parameter", "constructor", "method_sig", "method_call", 
		"method_call_param", "method", "scope", "expression", "condition", "variable", 
		"attribute", "datatype", "scope_body", "for_loop", "while_loop", "class_def", 
		"interface_def", "class_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "'++'", "'--'", "'<='", 
		"'>='", "'=='", "'&'", "'|'", null, null, null, null, "'class'", "'public'", 
		"'private'", "'protected'", "'abstract'", "'static'", "'void'", "'implements'", 
		"'extends'", "'interface'", "'enum'", "'throws'", "'this'", "'return'", 
		"'true'", "'false'", "'new'", "'for'", "'while'", "'int'", "'double'", 
		"'float'", "'String'", "'long'", "'short'", "'byte'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'<'", "'>'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT", "LINE_COMMENT", "STUFF", "CLASS", "PUBLIC", 
		"PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", 
		"INTERFACE", "ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", "NEW", 
		"FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", 
		"BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", 
		"LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", 
		"Digitss", "LetterOrDigit", "Letter"
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << INTERFACE))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					interface_def();
					}
					break;
				case 2:
					{
					setState(41);
					class_def();
					}
					break;
				}
				}
				setState(46);
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
			setState(47);
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
			setState(49);
			datatype();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(50);
				match(LSQBRACK);
				setState(51);
				match(RSQBRACK);
				}
			}

			setState(54);
			match(IDENTIFIER);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(55);
				match(LSQBRACK);
				setState(56);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(59);
				accessmod();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(62);
				match(STATIC);
				}
			}

			setState(65);
			class_name();
			setState(66);
			match(LBRACK);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(67);
				parameter();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(68);
					match(T__0);
					setState(69);
					parameter();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(77);
			match(RBRACK);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(78);
				match(THROWS);
				setState(79);
				match(IDENTIFIER);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(80);
					match(T__0);
					setState(81);
					match(IDENTIFIER);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(LCBRACK);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(90);
				scope_body();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(98);
				accessmod();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(101);
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

			setState(106);
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
				setState(104);
				datatype();
				}
				break;
			case VOID:
				{
				setState(105);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(LBRACK);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(110);
				parameter();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(111);
					match(T__0);
					setState(112);
					parameter();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(RBRACK);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(121);
				match(THROWS);
				setState(122);
				match(IDENTIFIER);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(123);
					match(T__0);
					setState(124);
					match(IDENTIFIER);
					}
					}
					setState(129);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(JavaLexerParser.DOT, 0); }
		public TerminalNode LPBRACK() { return getToken(JavaLexerParser.LPBRACK, 0); }
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
		public Method_call_paramContext method_call_param() {
			return getRuleContext(Method_call_paramContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(132);
				match(IDENTIFIER);
				setState(133);
				match(DOT);
				}
				break;
			}
			setState(136);
			match(IDENTIFIER);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(137);
				match(LPBRACK);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(138);
					datatype();
					}
				}

				setState(141);
				match(RPBRACK);
				}
			}

			setState(144);
			match(LBRACK);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_CONST) | (1L << Digitss))) != 0)) {
				{
				setState(145);
				method_call_param();
				}
			}

			setState(148);
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
		public List<TerminalNode> Digitss() { return getTokens(JavaLexerParser.Digitss); }
		public TerminalNode Digitss(int i) {
			return getToken(JavaLexerParser.Digitss, i);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(150);
				method_call();
				}
				break;
			case 2:
				{
				setState(151);
				match(STRING_CONST);
				}
				break;
			case 3:
				{
				setState(152);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(153);
				match(Digitss);
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(156);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				method_call_param();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					match(T__0);
					setState(161);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_CONST) | (1L << Digitss))) != 0)) ) {
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
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(167);
			method_sig();
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCBRACK:
				{
				setState(168);
				match(LCBRACK);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(169);
					scope_body();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(RCBRACK);
				}
				break;
			case SEMICOLON:
				{
				setState(176);
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
			setState(179);
			match(LCBRACK);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(180);
					scope_body();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(186);
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
		public List<TerminalNode> Digitss() { return getTokens(JavaLexerParser.Digitss); }
		public TerminalNode Digitss(int i) {
			return getToken(JavaLexerParser.Digitss, i);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(188);
				match(RETURN);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(189);
					match(THIS);
					setState(190);
					match(DOT);
					}
				}

				}
				break;
			case 2:
				{
				setState(193);
				match(THIS);
				setState(194);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(195);
				datatype();
				}
				break;
			}
			setState(198);
			match(IDENTIFIER);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(229);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(199);
							match(DOT);
							}
							break;
						case T__1:
						case T__2:
						case T__3:
						case T__4:
						case T__5:
						case NEW:
						case LBRACK:
						case IDENTIFIER:
						case Digitss:
							{
							{
							setState(201);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
								{
								setState(200);
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

							setState(204);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__5) {
								{
								setState(203);
								match(T__5);
								}
							}

							setState(209);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
							case 1:
								{
								setState(206);
								match(LBRACK);
								setState(207);
								match(IDENTIFIER);
								setState(208);
								match(RBRACK);
								}
								break;
							}
							}
							setState(214);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LBRACK) {
								{
								{
								setState(211);
								match(LBRACK);
								}
								}
								setState(216);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(218);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NEW) {
								{
								setState(217);
								match(NEW);
								}
							}

							setState(227);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
							case 1:
								{
								setState(220);
								method_call();
								}
								break;
							case 2:
								{
								setState(221);
								match(IDENTIFIER);
								}
								break;
							case 3:
								{
								setState(223); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(222);
										match(Digitss);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(225); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(233);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(234);
				match(T__7);
				}
				break;
			}
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(RBRACK);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public TerminalNode Digitss() { return getToken(JavaLexerParser.Digitss, 0); }
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
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(243);
				match(LBRACK);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(249);
					match(IDENTIFIER);
					}
				}

				setState(252);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LPBRACK) | (1L << RPBRACK))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(253);
					match(Digitss);
					}
					break;
				case 2:
					{
					setState(254);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(255);
					method_call();
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(256);
						match(DOT);
						setState(259);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(257);
							method_call();
							}
							break;
						case 2:
							{
							setState(258);
							match(IDENTIFIER);
							}
							break;
						}
						}
						}
						setState(265);
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
				setState(268);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(269);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(272);
					match(RBRACK);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACK) | (1L << LPBRACK) | (1L << RPBRACK) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(278);
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
			setState(281);
			datatype();
			setState(282);
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
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(284);
				accessmod();
				}
			}

			setState(287);
			variable();
			setState(288);
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
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(STRING);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(IDENTIFIER);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(298);
					match(LPBRACK);
					setState(299);
					datatype();
					setState(300);
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
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
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				expression();
				setState(307);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				method_call();
				setState(310);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
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
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(FOR);
				setState(318);
				match(LBRACK);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(319);
					expression();
					}
				}

				setState(322);
				match(SEMICOLON);
				setState(323);
				condition();
				setState(324);
				match(SEMICOLON);
				setState(325);
				expression();
				setState(326);
				match(RBRACK);
				{
				setState(327);
				match(LCBRACK);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(328);
					scope_body();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
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
				setState(336);
				expression();
				setState(337);
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
			setState(341);
			match(WHILE);
			setState(342);
			match(LBRACK);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(343);
				expression();
				}
				break;
			}
			setState(346);
			condition();
			setState(347);
			match(RBRACK);
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(348);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(349);
				match(LCBRACK);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(350);
					scope_body();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
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
				setState(357);
				expression();
				setState(358);
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
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(JavaLexerParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaLexerParser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaLexerParser.IMPLEMENTS, 0); }
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
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(362);
				accessmod();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(365);
				match(ABSTRACT);
				}
			}

			setState(368);
			match(CLASS);
			setState(369);
			class_name();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(370);
				match(EXTENDS);
				setState(371);
				match(IDENTIFIER);
				}
			}

			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(374);
				match(IMPLEMENTS);
				setState(375);
				match(IDENTIFIER);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(376);
					match(T__0);
					setState(377);
					match(IDENTIFIER);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(385);
			match(LCBRACK);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(386);
					constructor();
					}
					break;
				case 2:
					{
					setState(387);
					method();
					}
					break;
				case 3:
					{
					setState(388);
					attribute();
					}
					break;
				case 4:
					{
					setState(389);
					class_def();
					}
					break;
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public AccessmodContext accessmod() {
			return getRuleContext(AccessmodContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaLexerParser.EXTENDS, 0); }
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(397);
				accessmod();
				}
			}

			setState(400);
			match(INTERFACE);
			setState(401);
			match(IDENTIFIER);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(402);
				match(EXTENDS);
				setState(403);
				match(IDENTIFIER);
				}
			}

			setState(406);
			match(LCBRACK);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(407);
				method_sig();
				setState(408);
				match(SEMICOLON);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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
			setState(417);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3"+
		"\3\3\4\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\5\4<\n\4\3\5\5\5?\n\5\3\5\5\5B\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13"+
		"\5\3\5\3\5\3\6\5\6f\n\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6t\n\6\f\6\16\6w\13\6\5\6y\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n"+
		"\6\f\6\16\6\u0083\13\6\5\6\u0085\n\6\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7"+
		"\5\7\u008e\n\7\3\7\5\7\u0091\n\7\3\7\3\7\5\7\u0095\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\b\u009d\n\b\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\7\b\u00a5\n\b\f\b"+
		"\16\b\u00a8\13\b\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\3\t"+
		"\5\t\u00b4\n\t\3\n\3\n\7\n\u00b8\n\n\f\n\16\n\u00bb\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\5\13\u00c2\n\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\13\3\13\3"+
		"\13\5\13\u00cc\n\13\3\13\5\13\u00cf\n\13\3\13\3\13\3\13\5\13\u00d4\n\13"+
		"\3\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\13\5\13\u00dd\n\13\3\13"+
		"\3\13\3\13\6\13\u00e2\n\13\r\13\16\13\u00e3\5\13\u00e6\n\13\6\13\u00e8"+
		"\n\13\r\13\16\13\u00e9\3\13\3\13\5\13\u00ee\n\13\3\13\7\13\u00f1\n\13"+
		"\f\13\16\13\u00f4\13\13\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa\13\f\3\f\5\f"+
		"\u00fd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0106\n\f\7\f\u0108\n\f\f\f"+
		"\16\f\u010b\13\f\5\f\u010d\n\f\3\f\3\f\5\f\u0111\n\f\3\f\7\f\u0114\n\f"+
		"\f\f\16\f\u0117\13\f\3\f\5\f\u011a\n\f\3\r\3\r\3\r\3\16\5\16\u0120\n\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0131\n\17\5\17\u0133\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u013e\n\20\3\21\3\21\3\21\5\21\u0143\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u014c\n\21\f\21\16\21\u014f\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0156\n\21\3\22\3\22\3\22\5\22\u015b\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0162\n\22\f\22\16\22\u0165\13\22\3\22\3"+
		"\22\3\22\3\22\5\22\u016b\n\22\3\23\5\23\u016e\n\23\3\23\5\23\u0171\n\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0177\n\23\3\23\3\23\3\23\3\23\7\23\u017d\n"+
		"\23\f\23\16\23\u0180\13\23\5\23\u0182\n\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u0189\n\23\f\23\16\23\u018c\13\23\3\23\3\23\3\24\5\24\u0191\n\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0197\n\24\3\24\3\24\3\24\3\24\7\24\u019d\n\24"+
		"\f\24\16\24\u01a0\13\24\3\24\3\24\3\25\3\25\3\25\4\u00b9\u0115\2\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\25\27\3\2\30\31\3"+
		"\2\4\7\3\28:\4\2\13\17\64\65\2\u01eb\2.\3\2\2\2\4\61\3\2\2\2\6\63\3\2"+
		"\2\2\b>\3\2\2\2\ne\3\2\2\2\f\u0088\3\2\2\2\16\u009c\3\2\2\2\20\u00a9\3"+
		"\2\2\2\22\u00b5\3\2\2\2\24\u00c6\3\2\2\2\26\u00f8\3\2\2\2\30\u011b\3\2"+
		"\2\2\32\u011f\3\2\2\2\34\u0132\3\2\2\2\36\u013d\3\2\2\2 \u0155\3\2\2\2"+
		"\"\u0157\3\2\2\2$\u016d\3\2\2\2&\u0190\3\2\2\2(\u01a3\3\2\2\2*-\5&\24"+
		"\2+-\5$\23\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3"+
		"\2\2\2\60.\3\2\2\2\61\62\t\2\2\2\62\5\3\2\2\2\63\66\5\34\17\2\64\65\7"+
		"\62\2\2\65\67\7\63\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28;\78\2"+
		"\29:\7\62\2\2:<\7\63\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=?\5\4\3\2>=\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@B\7\31\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD"+
		"\5(\25\2DM\7.\2\2EJ\5\6\4\2FG\7\3\2\2GI\5\6\4\2HF\3\2\2\2IL\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2ME\3\2\2\2MN\3\2\2\2NO\3\2\2\2O"+
		"Y\7/\2\2PQ\7\37\2\2QV\78\2\2RS\7\3\2\2SU\78\2\2TR\3\2\2\2UX\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YP\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2["+
		"_\7\60\2\2\\^\5\36\20\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2"+
		"\2\2a_\3\2\2\2bc\7\61\2\2c\t\3\2\2\2df\5\4\3\2ed\3\2\2\2ef\3\2\2\2fh\3"+
		"\2\2\2gi\t\3\2\2hg\3\2\2\2hi\3\2\2\2il\3\2\2\2jm\5\34\17\2km\7\32\2\2"+
		"lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\78\2\2ox\7.\2\2pu\5\6\4\2qr\7\3\2\2r"+
		"t\5\6\4\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"xp\3\2\2\2xy\3\2\2\2yz\3\2\2\2z\u0084\7/\2\2{|\7\37\2\2|\u0081\78\2\2"+
		"}~\7\3\2\2~\u0080\78\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"{\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2\2\u0086\u0087\78\2\2\u0087"+
		"\u0089\7\67\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0090\78\2\2\u008b\u008d\7\64\2\2\u008c\u008e\5\34\17\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\65"+
		"\2\2\u0090\u008b\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\7.\2\2\u0093\u0095\5\16\b\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7/\2\2\u0097\r\3\2\2\2\u0098\u009d"+
		"\5\f\7\2\u0099\u009d\79\2\2\u009a\u009d\78\2\2\u009b\u009d\7:\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\t\4\2\2\u009f\u00a1\5\16\b\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3\7\3"+
		"\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a9\u00b3\5\n\6\2\u00aa\u00ae\7\60\2\2\u00ab\u00ad\5\36\20\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\7\61\2\2\u00b2"+
		"\u00b4\7\66\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\21\3\2\2"+
		"\2\u00b5\u00b9\7\60\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\23\3\2\2\2\u00be\u00c1"+
		"\7!\2\2\u00bf\u00c0\7 \2\2\u00c0\u00c2\7\67\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c7\7\67"+
		"\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00be\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ed\78"+
		"\2\2\u00c9\u00e8\7\67\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\7\b\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1"+
		"\u00d2\78\2\2\u00d2\u00d4\7/\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\7.\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\7$\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e5\3\2\2\2\u00de\u00e6\5\f\7\2\u00df\u00e6\78\2\2\u00e0"+
		"\u00e2\7:\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5"+
		"\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00c9\3\2"+
		"\2\2\u00e7\u00cb\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ee\7\t\2\2\u00ec\u00ee\7\n"+
		"\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\7/\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\25\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7.\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0110"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\78\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u010c\t\6\2\2\u00ff\u010d\7:"+
		"\2\2\u0100\u010d\78\2\2\u0101\u0109\5\f\7\2\u0102\u0105\7\67\2\2\u0103"+
		"\u0106\5\f\7\2\u0104\u0106\78\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u00ff\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0101\3\2\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u0111\7\"\2\2\u010f\u0111\7#\2\2\u0110\u00fc\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0115\3\2\2\2\u0112"+
		"\u0114\7/\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011a\5\26\f\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\27\3\2\2"+
		"\2\u011b\u011c\5\34\17\2\u011c\u011d\78\2\2\u011d\31\3\2\2\2\u011e\u0120"+
		"\5\4\3\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\5\30\r\2\u0122\u0123\7\66\2\2\u0123\33\3\2\2\2\u0124\u0133\7\'"+
		"\2\2\u0125\u0133\7(\2\2\u0126\u0133\7)\2\2\u0127\u0133\7*\2\2\u0128\u0133"+
		"\7+\2\2\u0129\u0133\7,\2\2\u012a\u0133\7-\2\2\u012b\u0130\78\2\2\u012c"+
		"\u012d\7\64\2\2\u012d\u012e\5\34\17\2\u012e\u012f\7\65\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0124\3\2\2\2\u0132\u0125\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u0127\3\2"+
		"\2\2\u0132\u0128\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012a\3\2\2\2\u0132"+
		"\u012b\3\2\2\2\u0133\35\3\2\2\2\u0134\u0135\5\24\13\2\u0135\u0136\7\66"+
		"\2\2\u0136\u013e\3\2\2\2\u0137\u0138\5\f\7\2\u0138\u0139\7\66\2\2\u0139"+
		"\u013e\3\2\2\2\u013a\u013e\5 \21\2\u013b\u013e\5\"\22\2\u013c\u013e\5"+
		"\22\n\2\u013d\u0134\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\37\3\2\2\2\u013f\u0140\7%\2\2"+
		"\u0140\u0142\7.\2\2\u0141\u0143\5\24\13\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\66\2\2\u0145\u0146\5\26\f\2"+
		"\u0146\u0147\7\66\2\2\u0147\u0148\5\24\13\2\u0148\u0149\7/\2\2\u0149\u014d"+
		"\7\60\2\2\u014a\u014c\5\36\20\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2"+
		"\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0156\3\2\2\2\u0152\u0153\5\24\13"+
		"\2\u0153\u0154\7\66\2\2\u0154\u0156\3\2\2\2\u0155\u013f\3\2\2\2\u0155"+
		"\u0152\3\2\2\2\u0156!\3\2\2\2\u0157\u0158\7&\2\2\u0158\u015a\7.\2\2\u0159"+
		"\u015b\5\24\13\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015d\5\26\f\2\u015d\u016a\7/\2\2\u015e\u016b\7\66\2\2\u015f"+
		"\u0163\7\60\2\2\u0160\u0162\5\36\20\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u016b\7\61\2\2\u0167\u0168\5\24\13\2\u0168\u0169"+
		"\7\66\2\2\u0169\u016b\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u015f\3\2\2\2"+
		"\u016a\u0167\3\2\2\2\u016b#\3\2\2\2\u016c\u016e\5\4\3\2\u016d\u016c\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\30\2\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\24"+
		"\2\2\u0173\u0176\5(\25\2\u0174\u0175\7\34\2\2\u0175\u0177\78\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0181\3\2\2\2\u0178\u0179\7\33"+
		"\2\2\u0179\u017e\78\2\2\u017a\u017b\7\3\2\2\u017b\u017d\78\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u018a\7\60\2\2\u0184\u0189\5\b\5\2\u0185"+
		"\u0189\5\20\t\2\u0186\u0189\5\32\16\2\u0187\u0189\5$\23\2\u0188\u0184"+
		"\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\61\2\2\u018e%\3\2\2\2\u018f\u0191"+
		"\5\4\3\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7\35\2\2\u0193\u0196\78\2\2\u0194\u0195\7\34\2\2\u0195\u0197\7"+
		"8\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019e\7\60\2\2\u0199\u019a\5\n\6\2\u019a\u019b\7\66\2\2\u019b\u019d\3"+
		"\2\2\2\u019c\u0199\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7\61"+
		"\2\2\u01a2\'\3\2\2\2\u01a3\u01a4\78\2\2\u01a4)\3\2\2\2G,.\66;>AJMVY_e"+
		"hlux\u0081\u0084\u0088\u008d\u0090\u0094\u009c\u00a0\u00a6\u00ae\u00b3"+
		"\u00b9\u00c1\u00c6\u00cb\u00ce\u00d3\u00d8\u00dc\u00e3\u00e5\u00e7\u00e9"+
		"\u00ed\u00f2\u00f8\u00fc\u0105\u0109\u010c\u0110\u0115\u0119\u011f\u0130"+
		"\u0132\u013d\u0142\u014d\u0155\u015a\u0163\u016a\u016d\u0170\u0176\u017e"+
		"\u0181\u0188\u018a\u0190\u0196\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}