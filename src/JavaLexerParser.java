// Generated from /home/nils/Nextcloud/Master/2. Semester/Compilerbau/Projekt/JavaLexer.g4 by ANTLR 4.7
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
		ANNOTATION=17, IMPORTS=18, STUFF=19, CLASS=20, PUBLIC=21, PRIVATE=22, 
		PROTECTED=23, ABSTRACT=24, STATIC=25, VOID=26, IMPLEMENTS=27, EXTENDS=28, 
		INTERFACE=29, IMPORT=30, ENUM=31, THROWS=32, THIS=33, RETURN=34, TRUE=35, 
		FALSE=36, NEW=37, PACKAGE=38, FINAL=39, IF=40, ELSE=41, FOR=42, WHILE=43, 
		INTEGER=44, DOUBLE=45, FLOAT=46, STRING=47, LONG=48, SHORT=49, BYTE=50, 
		LBRACK=51, RBRACK=52, LCBRACK=53, RCBRACK=54, LSQBRACK=55, RSQBRACK=56, 
		LPBRACK=57, RPBRACK=58, SEMICOLON=59, DOT=60, IDENTIFIER=61, STRING_CONST=62, 
		Digits=63, LetterOrDigit=64, Letter=65;
	public static final int
		RULE_r = 0, RULE_accessmod = 1, RULE_parameter = 2, RULE_constructor = 3, 
		RULE_method_sig = 4, RULE_method_call = 5, RULE_method_call_param = 6, 
		RULE_method = 7, RULE_scope = 8, RULE_expression = 9, RULE_condition = 10, 
		RULE_if_cond = 11, RULE_variable = 12, RULE_attribute = 13, RULE_datatype = 14, 
		RULE_scope_body = 15, RULE_for_loop = 16, RULE_while_loop = 17, RULE_class_def = 18, 
		RULE_interface_def = 19, RULE_class_name = 20, RULE_interface_name = 21, 
		RULE_method_name = 22;
	public static final String[] ruleNames = {
		"r", "accessmod", "parameter", "constructor", "method_sig", "method_call", 
		"method_call_param", "method", "scope", "expression", "condition", "if_cond", 
		"variable", "attribute", "datatype", "scope_body", "for_loop", "while_loop", 
		"class_def", "interface_def", "class_name", "interface_name", "method_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "'++'", "'--'", "'<='", 
		"'>='", "'=='", "'&'", "'|'", null, null, null, null, null, null, "'class'", 
		"'public'", "'private'", "'protected'", "'abstract'", "'static'", "'void'", 
		"'implements'", "'extends'", "'interface'", "'import'", "'enum'", "'throws'", 
		"'this'", "'return'", "'true'", "'false'", "'new'", "'package'", "'final'", 
		"'if'", "'else'", "'for'", "'while'", "'int'", "'double'", "'float'", 
		"'String'", "'long'", "'short'", "'byte'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "'<'", "'>'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT", "LINE_COMMENT", "ANNOTATION", "IMPORTS", 
		"STUFF", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", 
		"VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", "IMPORT", "ENUM", "THROWS", 
		"THIS", "RETURN", "TRUE", "FALSE", "NEW", "PACKAGE", "FINAL", "IF", "ELSE", 
		"FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", 
		"BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", 
		"LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", 
		"Digits", "LetterOrDigit", "Letter"
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << INTERFACE) | (1L << FINAL))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					interface_def();
					}
					break;
				case 2:
					{
					setState(47);
					class_def();
					}
					break;
				}
				}
				setState(52);
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
			setState(53);
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
			setState(55);
			datatype();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(56);
				match(LSQBRACK);
				setState(57);
				match(RSQBRACK);
				}
			}

			setState(60);
			match(IDENTIFIER);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(61);
				match(LSQBRACK);
				setState(62);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(65);
				accessmod();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(68);
				match(STATIC);
				}
			}

			setState(71);
			class_name();
			setState(72);
			match(LBRACK);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(73);
				parameter();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(74);
					match(T__0);
					setState(75);
					parameter();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(RBRACK);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(84);
				match(THROWS);
				setState(85);
				match(IDENTIFIER);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(86);
					match(T__0);
					setState(87);
					match(IDENTIFIER);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
			match(LCBRACK);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(96);
				scope_body();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(104);
				accessmod();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(107);
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

			setState(112);
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
				setState(110);
				datatype();
				}
				break;
			case VOID:
				{
				setState(111);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			method_name();
			setState(115);
			match(LBRACK);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(116);
				parameter();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(117);
					match(T__0);
					setState(118);
					parameter();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(126);
			match(RBRACK);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(127);
				match(THROWS);
				setState(128);
				match(IDENTIFIER);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(129);
					match(T__0);
					setState(130);
					match(IDENTIFIER);
					}
					}
					setState(135);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(138);
				match(THIS);
				setState(139);
				match(DOT);
				}
			}

			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					class_name();
					setState(143);
					match(DOT);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
			setState(150);
			method_name();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(151);
				match(LPBRACK);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(152);
					datatype();
					}
				}

				setState(155);
				match(RPBRACK);
				}
			}

			setState(158);
			match(LBRACK);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << STRING_CONST) | (1L << Digits))) != 0)) {
				{
				setState(159);
				method_call_param();
				}
			}

			setState(162);
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
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
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
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(164);
				method_call();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(165);
					match(DOT);
					setState(166);
					method_call();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(172);
				match(STRING_CONST);
				}
				break;
			case 3:
				{
				setState(173);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(174);
				match(Digits);
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				method_call_param();
				}
			}

			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(T__0);
					setState(182);
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
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(188);
			method_sig();
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCBRACK:
				{
				setState(189);
				match(LCBRACK);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(190);
					scope_body();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RCBRACK);
				}
				break;
			case SEMICOLON:
				{
				setState(197);
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
			setState(200);
			match(LCBRACK);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(201);
					scope_body();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(207);
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
		public TerminalNode RETURN() { return getToken(JavaLexerParser.RETURN, 0); }
		public TerminalNode THIS() { return getToken(JavaLexerParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public TerminalNode STRING_CONST() { return getToken(JavaLexerParser.STRING_CONST, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
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
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(209);
				match(RETURN);
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_CONST:
					{
					setState(210);
					match(STRING_CONST);
					}
					break;
				case THIS:
				case IDENTIFIER:
					{
					{
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS) {
						{
						setState(211);
						match(THIS);
						setState(212);
						match(DOT);
						}
					}

					setState(215);
					match(IDENTIFIER);
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(216);
							match(DOT);
							setState(217);
							match(IDENTIFIER);
							}
							} 
						}
						setState(222);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case THIS:
				{
				setState(225);
				match(THIS);
				setState(226);
				match(DOT);
				}
				break;
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case IDENTIFIER:
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(227);
					datatype();
					}
					break;
				}
				setState(230);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(270);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(233);
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
							setState(235);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
								{
								setState(234);
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

							setState(238);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__5) {
								{
								setState(237);
								match(T__5);
								}
							}

							setState(243);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
							case 1:
								{
								setState(240);
								match(LBRACK);
								setState(241);
								match(IDENTIFIER);
								setState(242);
								match(RBRACK);
								}
								break;
							}
							}
							setState(248);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LBRACK) {
								{
								{
								setState(245);
								match(LBRACK);
								}
								}
								setState(250);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(252);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NEW) {
								{
								setState(251);
								match(NEW);
								}
							}

							setState(268);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
							case 1:
								{
								setState(254);
								method_call();
								setState(259);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(255);
										match(DOT);
										setState(256);
										method_call();
										}
										} 
									}
									setState(261);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
								}
								}
								break;
							case 2:
								{
								setState(262);
								match(IDENTIFIER);
								}
								break;
							case 3:
								{
								setState(264); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(263);
										match(Digits);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(266); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(274);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(275);
				match(T__7);
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(RBRACK);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(284);
				match(LBRACK);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case THIS:
			case LPBRACK:
			case RPBRACK:
			case IDENTIFIER:
			case Digits:
				{
				{
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(290);
					match(IDENTIFIER);
					}
					break;
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LPBRACK) | (1L << RPBRACK))) != 0)) {
					{
					setState(293);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LPBRACK) | (1L << RPBRACK))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(296);
					match(Digits);
					}
					break;
				case 2:
					{
					setState(297);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(298);
					method_call();
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(299);
						match(DOT);
						setState(302);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(300);
							method_call();
							}
							break;
						case 2:
							{
							setState(301);
							match(IDENTIFIER);
							}
							break;
						}
						}
						}
						setState(308);
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
				setState(311);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(312);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(315);
					match(RBRACK);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACK) | (1L << LPBRACK) | (1L << RPBRACK) | (1L << IDENTIFIER) | (1L << Digits))) != 0)) {
				{
				setState(321);
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

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaLexerParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaLexerParser.ELSE, 0); }
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitIf_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitIf_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IF);
			setState(325);
			condition();
			setState(326);
			scope();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(327);
				match(ELSE);
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(328);
					if_cond();
					}
					break;
				case LCBRACK:
					{
					setState(329);
					scope();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			datatype();
			setState(335);
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
		public TerminalNode STATIC() { return getToken(JavaLexerParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaLexerParser.FINAL, 0); }
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
		enterRule(_localctx, 26, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(337);
				accessmod();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(340);
				match(STATIC);
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(343);
				match(FINAL);
				}
			}

			setState(346);
			variable();
			setState(347);
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
		enterRule(_localctx, 28, RULE_datatype);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(STRING);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				match(IDENTIFIER);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(357);
					match(LPBRACK);
					setState(358);
					datatype();
					setState(359);
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
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_scope_body);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				expression();
				setState(367);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				method_call();
				setState(370);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
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
		enterRule(_localctx, 32, RULE_for_loop);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(FOR);
				setState(378);
				match(LBRACK);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(379);
					expression();
					}
				}

				setState(382);
				match(SEMICOLON);
				setState(383);
				condition();
				setState(384);
				match(SEMICOLON);
				setState(385);
				expression();
				setState(386);
				match(RBRACK);
				{
				setState(387);
				match(LCBRACK);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(388);
					scope_body();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
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
				setState(396);
				expression();
				setState(397);
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
		enterRule(_localctx, 34, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(WHILE);
			setState(402);
			match(LBRACK);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(403);
				expression();
				}
				break;
			}
			setState(406);
			condition();
			setState(407);
			match(RBRACK);
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(408);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(409);
				match(LCBRACK);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << LCBRACK) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(410);
					scope_body();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
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
				setState(417);
				expression();
				setState(418);
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
		public TerminalNode STATIC() { return getToken(JavaLexerParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaLexerParser.FINAL, 0); }
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
		enterRule(_localctx, 36, RULE_class_def);
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

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(425);
				match(ABSTRACT);
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(428);
				match(STATIC);
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(431);
				match(FINAL);
				}
			}

			setState(434);
			match(CLASS);
			setState(435);
			class_name();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(436);
				match(EXTENDS);
				setState(437);
				class_name();
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(440);
				match(IMPLEMENTS);
				setState(441);
				interface_name();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(442);
					match(T__0);
					setState(443);
					interface_name();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(451);
			match(LCBRACK);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << FINAL) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(452);
					constructor();
					}
					break;
				case 2:
					{
					setState(453);
					method();
					}
					break;
				case 3:
					{
					setState(454);
					attribute();
					}
					break;
				case 4:
					{
					setState(455);
					class_def();
					}
					break;
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
		enterRule(_localctx, 38, RULE_interface_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(463);
				accessmod();
				}
			}

			setState(466);
			match(INTERFACE);
			setState(467);
			interface_name();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(468);
				match(EXTENDS);
				setState(469);
				match(IDENTIFIER);
				}
			}

			setState(472);
			match(LCBRACK);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << VOID) | (1L << INTEGER) | (1L << DOUBLE) | (1L << FLOAT) | (1L << STRING) | (1L << LONG) | (1L << SHORT) | (1L << BYTE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(473);
				method_sig();
				setState(474);
				match(SEMICOLON);
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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
		enterRule(_localctx, 40, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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
		enterRule(_localctx, 42, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 44, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u01ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\5"+
		"\4B\n\4\3\5\5\5E\n\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\5\5`\n\5"+
		"\3\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\6\5\6l\n\6\3\6\5\6o\n\6\3\6"+
		"\3\6\5\6s\n\6\3\6\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\5\6\177\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\5\6\u008b\n\6\3"+
		"\7\3\7\5\7\u008f\n\7\3\7\3\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097\13\7\3\7"+
		"\3\7\3\7\5\7\u009c\n\7\3\7\5\7\u009f\n\7\3\7\3\7\5\7\u00a3\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\3\b\3\b\5\b\u00b2\n"+
		"\b\3\b\3\b\5\b\u00b6\n\b\3\b\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd\13\b\3\t"+
		"\3\t\3\t\7\t\u00c2\n\t\f\t\16\t\u00c5\13\t\3\t\3\t\5\t\u00c9\n\t\3\n\3"+
		"\n\7\n\u00cd\n\n\f\n\16\n\u00d0\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00d8\n\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0\13\13\5\13"+
		"\u00e2\n\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\13\5\13\u00ea\n\13\3\13\3"+
		"\13\5\13\u00ee\n\13\3\13\5\13\u00f1\n\13\3\13\3\13\3\13\5\13\u00f6\n\13"+
		"\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13\13\3\13\5\13\u00ff\n\13\3\13"+
		"\3\13\3\13\7\13\u0104\n\13\f\13\16\13\u0107\13\13\3\13\3\13\6\13\u010b"+
		"\n\13\r\13\16\13\u010c\5\13\u010f\n\13\6\13\u0111\n\13\r\13\16\13\u0112"+
		"\3\13\3\13\5\13\u0117\n\13\3\13\7\13\u011a\n\13\f\13\16\13\u011d\13\13"+
		"\3\f\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\f\5\f\u0126\n\f\3\f\5\f\u0129"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0131\n\f\7\f\u0133\n\f\f\f\16\f\u0136"+
		"\13\f\5\f\u0138\n\f\3\f\3\f\5\f\u013c\n\f\3\f\7\f\u013f\n\f\f\f\16\f\u0142"+
		"\13\f\3\f\5\f\u0145\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u014d\n\r\5\r\u014f"+
		"\n\r\3\16\3\16\3\16\3\17\5\17\u0155\n\17\3\17\5\17\u0158\n\17\3\17\5\17"+
		"\u015b\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u016c\n\20\5\20\u016e\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u017a\n\21\3\22\3\22\3\22\5\22\u017f"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0188\n\22\f\22\16\22\u018b"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u0192\n\22\3\23\3\23\3\23\5\23\u0197"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u019e\n\23\f\23\16\23\u01a1\13\23"+
		"\3\23\3\23\3\23\3\23\5\23\u01a7\n\23\3\24\5\24\u01aa\n\24\3\24\5\24\u01ad"+
		"\n\24\3\24\5\24\u01b0\n\24\3\24\5\24\u01b3\n\24\3\24\3\24\3\24\3\24\5"+
		"\24\u01b9\n\24\3\24\3\24\3\24\3\24\7\24\u01bf\n\24\f\24\16\24\u01c2\13"+
		"\24\5\24\u01c4\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u01cb\n\24\f\24\16\24"+
		"\u01ce\13\24\3\24\3\24\3\25\5\25\u01d3\n\25\3\25\3\25\3\25\3\25\5\25\u01d9"+
		"\n\25\3\25\3\25\3\25\3\25\7\25\u01df\n\25\f\25\16\25\u01e2\13\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\4\u00ce\u0140\2\31\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\27\31\3\2\32\33\3\2\4\7"+
		"\3\2?A\4\2\13\17;<\2\u023b\2\64\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bD\3\2"+
		"\2\2\nk\3\2\2\2\f\u008e\3\2\2\2\16\u00b1\3\2\2\2\20\u00be\3\2\2\2\22\u00ca"+
		"\3\2\2\2\24\u00e9\3\2\2\2\26\u0121\3\2\2\2\30\u0146\3\2\2\2\32\u0150\3"+
		"\2\2\2\34\u0154\3\2\2\2\36\u016d\3\2\2\2 \u0179\3\2\2\2\"\u0191\3\2\2"+
		"\2$\u0193\3\2\2\2&\u01a9\3\2\2\2(\u01d2\3\2\2\2*\u01e5\3\2\2\2,\u01e7"+
		"\3\2\2\2.\u01e9\3\2\2\2\60\63\5(\25\2\61\63\5&\24\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66\64"+
		"\3\2\2\2\678\t\2\2\28\5\3\2\2\29<\5\36\20\2:;\79\2\2;=\7:\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>A\7?\2\2?@\79\2\2@B\7:\2\2A?\3\2\2\2AB\3\2\2\2"+
		"B\7\3\2\2\2CE\5\4\3\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\33\2\2GF\3\2\2"+
		"\2GH\3\2\2\2HI\3\2\2\2IJ\5*\26\2JS\7\65\2\2KP\5\6\4\2LM\7\3\2\2MO\5\6"+
		"\4\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2"+
		"\2\2ST\3\2\2\2TU\3\2\2\2U_\7\66\2\2VW\7\"\2\2W\\\7?\2\2XY\7\3\2\2Y[\7"+
		"?\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_"+
		"V\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\7\67\2\2bd\5 \21\2cb\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\78\2\2i\t\3\2\2\2jl\5\4\3\2"+
		"kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\t\3\2\2nm\3\2\2\2no\3\2\2\2or\3\2\2\2"+
		"ps\5\36\20\2qs\7\34\2\2rp\3\2\2\2rq\3\2\2\2st\3\2\2\2tu\5.\30\2u~\7\65"+
		"\2\2v{\5\6\4\2wx\7\3\2\2xz\5\6\4\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\177\3\2\2\2}{\3\2\2\2~v\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u008a\7\66\2\2\u0081\u0082\7\"\2\2\u0082\u0087\7?\2\2\u0083\u0084\7\3"+
		"\2\2\u0084\u0086\7?\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u0081\3\2\2\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d"+
		"\7#\2\2\u008d\u008f\7>\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0095\3\2\2\2\u0090\u0091\5*\26\2\u0091\u0092\7>\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009e\5."+
		"\30\2\u0099\u009b\7;\2\2\u009a\u009c\5\36\20\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7<\2\2\u009e\u0099\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\65\2\2\u00a1"+
		"\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\7\66\2\2\u00a5\r\3\2\2\2\u00a6\u00ab\5\f\7\2\u00a7"+
		"\u00a8\7>\2\2\u00a8\u00aa\5\f\7\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b2\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b2\7@\2\2\u00af\u00b2\7?\2\2\u00b0\u00b2\7A\2"+
		"\2\u00b1\u00a6\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4\u00b6\5\16\b\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bb\3\2\2\2\u00b7\u00b8"+
		"\7\3\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00c8\5\n\6\2\u00bf\u00c3\7\67\2\2\u00c0\u00c2\5 \21\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\78\2\2\u00c7"+
		"\u00c9\7=\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\21\3\2\2\2"+
		"\u00ca\u00ce\7\67\2\2\u00cb\u00cd\5 \21\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\78\2\2\u00d2\23\3\2\2\2\u00d3\u00e1\7$\2\2"+
		"\u00d4\u00e2\7@\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d8\7>\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\7?\2\2\u00da"+
		"\u00db\7>\2\2\u00db\u00dd\7?\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e2\u00ea\3\2\2\2\u00e3"+
		"\u00e4\7#\2\2\u00e4\u00ea\7>\2\2\u00e5\u00e7\5\36\20\2\u00e6\u00e5\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7?\2\2\u00e9"+
		"\u00d3\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u0116\3\2"+
		"\2\2\u00eb\u0111\7>\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\7\b\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f3\7\65\2\2\u00f3"+
		"\u00f4\7?\2\2\u00f4\u00f6\7\66\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\7\65\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\'\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u010e\3\2\2\2\u0100\u0105\5\f\7\2\u0101\u0102\7>"+
		"\2\2\u0102\u0104\5\f\7\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010f\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010f\7?\2\2\u0109\u010b\7A\2\2\u010a\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0100\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u00eb\3\2\2\2\u0110\u00ed\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0117\7\t"+
		"\2\2\u0115\u0117\7\n\2\2\u0116\u0110\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a\7\66"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\25\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\65\2"+
		"\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u013b\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7?\2\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\t\6"+
		"\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0137\3\2\2\2\u012a"+
		"\u0138\7A\2\2\u012b\u0138\7?\2\2\u012c\u0134\5\f\7\2\u012d\u0130\7>\2"+
		"\2\u012e\u0131\5\f\7\2\u012f\u0131\7?\2\2\u0130\u012e\3\2\2\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u012d\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u012a\3\2\2\2\u0137\u012b\3\2\2\2\u0137\u012c\3\2\2\2\u0138"+
		"\u013c\3\2\2\2\u0139\u013c\7%\2\2\u013a\u013c\7&\2\2\u013b\u0125\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013f"+
		"\7\66\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145"+
		"\5\26\f\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\27\3\2\2\2\u0146"+
		"\u0147\7*\2\2\u0147\u0148\5\26\f\2\u0148\u014e\5\22\n\2\u0149\u014c\7"+
		"+\2\2\u014a\u014d\5\30\r\2\u014b\u014d\5\22\n\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\31\3\2\2\2\u0150\u0151\5\36\20\2\u0151\u0152\7?\2\2\u0152\33"+
		"\3\2\2\2\u0153\u0155\5\4\3\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0158\7\33\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\7)\2\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5\32\16\2\u015d\u015e\7"+
		"=\2\2\u015e\35\3\2\2\2\u015f\u016e\7.\2\2\u0160\u016e\7/\2\2\u0161\u016e"+
		"\7\60\2\2\u0162\u016e\7\61\2\2\u0163\u016e\7\62\2\2\u0164\u016e\7\63\2"+
		"\2\u0165\u016e\7\64\2\2\u0166\u016b\7?\2\2\u0167\u0168\7;\2\2\u0168\u0169"+
		"\5\36\20\2\u0169\u016a\7<\2\2\u016a\u016c\3\2\2\2\u016b\u0167\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u015f\3\2\2\2\u016d\u0160"+
		"\3\2\2\2\u016d\u0161\3\2\2\2\u016d\u0162\3\2\2\2\u016d\u0163\3\2\2\2\u016d"+
		"\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016e\37\3\2\2"+
		"\2\u016f\u017a\5\30\r\2\u0170\u0171\5\24\13\2\u0171\u0172\7=\2\2\u0172"+
		"\u017a\3\2\2\2\u0173\u0174\5\f\7\2\u0174\u0175\7=\2\2\u0175\u017a\3\2"+
		"\2\2\u0176\u017a\5\"\22\2\u0177\u017a\5$\23\2\u0178\u017a\5\22\n\2\u0179"+
		"\u016f\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0176\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a!\3\2\2\2\u017b\u017c"+
		"\7,\2\2\u017c\u017e\7\65\2\2\u017d\u017f\5\24\13\2\u017e\u017d\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7=\2\2\u0181\u0182"+
		"\5\26\f\2\u0182\u0183\7=\2\2\u0183\u0184\5\24\13\2\u0184\u0185\7\66\2"+
		"\2\u0185\u0189\7\67\2\2\u0186\u0188\5 \21\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\78\2\2\u018d\u0192\3\2\2\2\u018e"+
		"\u018f\5\24\13\2\u018f\u0190\7=\2\2\u0190\u0192\3\2\2\2\u0191\u017b\3"+
		"\2\2\2\u0191\u018e\3\2\2\2\u0192#\3\2\2\2\u0193\u0194\7-\2\2\u0194\u0196"+
		"\7\65\2\2\u0195\u0197\5\24\13\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u0199\5\26\f\2\u0199\u01a6\7\66\2\2\u019a"+
		"\u01a7\7=\2\2\u019b\u019f\7\67\2\2\u019c\u019e\5 \21\2\u019d\u019c\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a7\78\2\2\u01a3\u01a4\5\24"+
		"\13\2\u01a4\u01a5\7=\2\2\u01a5\u01a7\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6"+
		"\u019b\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7%\3\2\2\2\u01a8\u01aa\5\4\3\2"+
		"\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad"+
		"\7\32\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2"+
		"\u01ae\u01b0\7\33\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2"+
		"\3\2\2\2\u01b1\u01b3\7)\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\7\26\2\2\u01b5\u01b8\5*\26\2\u01b6\u01b7\7"+
		"\36\2\2\u01b7\u01b9\5*\26\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c3\3\2\2\2\u01ba\u01bb\7\35\2\2\u01bb\u01c0\5,\27\2\u01bc\u01bd\7"+
		"\3\2\2\u01bd\u01bf\5,\27\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01cc\7\67\2\2\u01c6\u01cb\5\b\5\2\u01c7\u01cb\5\20\t\2\u01c8\u01cb\5"+
		"\34\17\2\u01c9\u01cb\5&\24\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d0\78\2\2\u01d0\'\3\2\2\2\u01d1\u01d3\5\4\3\2\u01d2\u01d1\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\37\2\2\u01d5\u01d8"+
		"\5,\27\2\u01d6\u01d7\7\36\2\2\u01d7\u01d9\7?\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e0\7\67\2\2\u01db\u01dc\5"+
		"\n\6\2\u01dc\u01dd\7=\2\2\u01dd\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\78\2\2\u01e4)\3\2\2\2\u01e5\u01e6"+
		"\7?\2\2\u01e6+\3\2\2\2\u01e7\u01e8\7?\2\2\u01e8-\3\2\2\2\u01e9\u01ea\7"+
		"?\2\2\u01ea/\3\2\2\2T\62\64<ADGPS\\_eknr{~\u0087\u008a\u008e\u0095\u009b"+
		"\u009e\u00a2\u00ab\u00b1\u00b5\u00bb\u00c3\u00c8\u00ce\u00d7\u00de\u00e1"+
		"\u00e6\u00e9\u00ed\u00f0\u00f5\u00fa\u00fe\u0105\u010c\u010e\u0110\u0112"+
		"\u0116\u011b\u0121\u0125\u0128\u0130\u0134\u0137\u013b\u0140\u0144\u014c"+
		"\u014e\u0154\u0157\u015a\u016b\u016d\u0179\u017e\u0189\u0191\u0196\u019f"+
		"\u01a6\u01a9\u01ac\u01af\u01b2\u01b8\u01c0\u01c3\u01ca\u01cc\u01d2\u01d8"+
		"\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}