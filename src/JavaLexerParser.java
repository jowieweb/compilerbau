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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, COMMENT=22, LINE_COMMENT=23, ANNOTATION=24, 
		IMPORTS=25, STUFF=26, CLASS=27, PUBLIC=28, PRIVATE=29, PROTECTED=30, ABSTRACT=31, 
		STATIC=32, VOID=33, IMPLEMENTS=34, EXTENDS=35, INTERFACE=36, IMPORT=37, 
		ENUM=38, THROWS=39, THIS=40, RETURN=41, TRUE=42, FALSE=43, NEW=44, PACKAGE=45, 
		FINAL=46, IF=47, ELSE=48, NULL=49, INSTANCEOF=50, TRY=51, CATCH=52, FINALLY=53, 
		FOR=54, WHILE=55, DO=56, INTEGER=57, DOUBLE=58, FLOAT=59, STRING=60, LONG=61, 
		SHORT=62, BYTE=63, LBRACK=64, RBRACK=65, LCBRACK=66, RCBRACK=67, LSQBRACK=68, 
		RSQBRACK=69, LPBRACK=70, RPBRACK=71, SEMICOLON=72, DOT=73, SWITCH=74, 
		CASE=75, DEFAULT=76, BREAK=77, THROW=78, IDENTIFIER=79, STRING_CONST=80, 
		WS=81, HexDigits=82, Digits=83, LetterOrDigit=84, Letter=85;
	public static final int
		RULE_r = 0, RULE_accessmod = 1, RULE_parameter = 2, RULE_constructor = 3, 
		RULE_method_sig = 4, RULE_method_call = 5, RULE_method_call_param = 6, 
		RULE_cast = 7, RULE_method = 8, RULE_scope = 9, RULE_expression = 10, 
		RULE_condition = 11, RULE_if_cond = 12, RULE_variable_def = 13, RULE_var_assign = 14, 
		RULE_attribute = 15, RULE_datatype = 16, RULE_scope_body = 17, RULE_for_loop = 18, 
		RULE_for_each_loop = 19, RULE_while_loop = 20, RULE_do_while_loop = 21, 
		RULE_class_def = 22, RULE_interface_def = 23, RULE_class_name = 24, RULE_interface_name = 25, 
		RULE_static_block = 26, RULE_try_block = 27, RULE_switch_block = 28, RULE_switch_scope = 29, 
		RULE_case_block = 30, RULE_method_name = 31, RULE_generic_type_name = 32, 
		RULE_comp_op = 33, RULE_math_op = 34;
	public static final String[] ruleNames = {
		"r", "accessmod", "parameter", "constructor", "method_sig", "method_call", 
		"method_call_param", "cast", "method", "scope", "expression", "condition", 
		"if_cond", "variable_def", "var_assign", "attribute", "datatype", "scope_body", 
		"for_loop", "for_each_loop", "while_loop", "do_while_loop", "class_def", 
		"interface_def", "class_name", "interface_name", "static_block", "try_block", 
		"switch_block", "switch_scope", "case_block", "method_name", "generic_type_name", 
		"comp_op", "math_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'++'", "'--'", "'!'", "':'", "'|'", "'?'", "'<='", 
		"'>='", "'=='", "'!='", "'&'", "'~'", "'^'", "'&&'", "'||'", "'+'", "'-'", 
		"'*'", "'/'", null, null, null, null, null, "'class'", "'public'", "'private'", 
		"'protected'", "'abstract'", "'static'", "'void'", "'implements'", "'extends'", 
		"'interface'", "'import'", "'enum'", "'throws'", "'this'", "'return'", 
		"'true'", "'false'", "'new'", "'package'", "'final'", "'if'", "'else'", 
		"'null'", "'instanceof'", "'try'", "'catch'", "'finally'", "'for'", "'while'", 
		"'do'", "'int'", "'double'", "'float'", "'String'", "'long'", "'short'", 
		"'byte'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "';'", 
		"'.'", "'switch'", "'case'", "'default'", "'break'", "'throw'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"LINE_COMMENT", "ANNOTATION", "IMPORTS", "STUFF", "CLASS", "PUBLIC", "PRIVATE", 
		"PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", 
		"IMPORT", "ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", "NEW", 
		"PACKAGE", "FINAL", "IF", "ELSE", "NULL", "INSTANCEOF", "TRY", "CATCH", 
		"FINALLY", "FOR", "WHILE", "DO", "INTEGER", "DOUBLE", "FLOAT", "STRING", 
		"LONG", "SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", 
		"RSQBRACK", "LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "SWITCH", "CASE", 
		"DEFAULT", "BREAK", "THROW", "IDENTIFIER", "STRING_CONST", "WS", "HexDigits", 
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
		public TerminalNode EOF() { return getToken(JavaLexerParser.EOF, 0); }
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << INTERFACE) | (1L << FINAL))) != 0)) {
				{
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(70);
					interface_def();
					}
					break;
				case 2:
					{
					setState(71);
					class_def();
					}
					break;
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(EOF);
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
			setState(79);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LSQBRACK() { return getTokens(JavaLexerParser.LSQBRACK); }
		public TerminalNode LSQBRACK(int i) {
			return getToken(JavaLexerParser.LSQBRACK, i);
		}
		public List<TerminalNode> RSQBRACK() { return getTokens(JavaLexerParser.RSQBRACK); }
		public TerminalNode RSQBRACK(int i) {
			return getToken(JavaLexerParser.RSQBRACK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
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
			setState(81);
			datatype();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(82);
				match(LSQBRACK);
				setState(83);
				match(RSQBRACK);
				}
			}

			setState(86);
			match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(87);
				match(DOT);
				setState(88);
				match(IDENTIFIER);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(94);
				match(LSQBRACK);
				setState(95);
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
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
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
			if (_la==STATIC) {
				{
				setState(101);
				match(STATIC);
				}
			}

			setState(104);
			class_name();
			setState(105);
			match(LBRACK);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTEGER - 57)) | (1L << (DOUBLE - 57)) | (1L << (FLOAT - 57)) | (1L << (STRING - 57)) | (1L << (LONG - 57)) | (1L << (SHORT - 57)) | (1L << (BYTE - 57)) | (1L << (LPBRACK - 57)) | (1L << (IDENTIFIER - 57)))) != 0)) {
				{
				setState(106);
				parameter();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(107);
					match(T__0);
					setState(108);
					parameter();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(116);
			match(RBRACK);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(117);
				match(THROWS);
				setState(118);
				match(IDENTIFIER);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(119);
					match(T__0);
					setState(120);
					match(IDENTIFIER);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
			scope();
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
		public TerminalNode FINAL() { return getToken(JavaLexerParser.FINAL, 0); }
		public List<TerminalNode> THROWS() { return getTokens(JavaLexerParser.THROWS); }
		public TerminalNode THROWS(int i) {
			return getToken(JavaLexerParser.THROWS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(130);
				accessmod();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(133);
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

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(136);
				match(FINAL);
				}
			}

			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case LPBRACK:
			case IDENTIFIER:
				{
				setState(139);
				datatype();
				}
				break;
			case VOID:
				{
				setState(140);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			method_name();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(144);
				match(THROWS);
				setState(145);
				match(IDENTIFIER);
				}
			}

			setState(148);
			match(LBRACK);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTEGER - 57)) | (1L << (DOUBLE - 57)) | (1L << (FLOAT - 57)) | (1L << (STRING - 57)) | (1L << (LONG - 57)) | (1L << (SHORT - 57)) | (1L << (BYTE - 57)) | (1L << (LPBRACK - 57)) | (1L << (IDENTIFIER - 57)))) != 0)) {
				{
				setState(149);
				parameter();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(150);
					match(T__0);
					setState(151);
					parameter();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(159);
			match(RBRACK);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(160);
				match(THROWS);
				setState(161);
				match(IDENTIFIER);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(162);
					match(T__0);
					setState(163);
					match(IDENTIFIER);
					}
					}
					setState(168);
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
		public TerminalNode LSQBRACK() { return getToken(JavaLexerParser.LSQBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode RSQBRACK() { return getToken(JavaLexerParser.RSQBRACK, 0); }
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
		public TerminalNode LPBRACK() { return getToken(JavaLexerParser.LPBRACK, 0); }
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
		public List<Method_call_paramContext> method_call_param() {
			return getRuleContexts(Method_call_paramContext.class);
		}
		public Method_call_paramContext method_call_param(int i) {
			return getRuleContext(Method_call_paramContext.class,i);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(171);
				match(THIS);
				setState(172);
				match(DOT);
				}
			}

			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					class_name();
					setState(176);
					match(DOT);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(183);
			method_name();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(184);
				match(LPBRACK);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTEGER - 57)) | (1L << (DOUBLE - 57)) | (1L << (FLOAT - 57)) | (1L << (STRING - 57)) | (1L << (LONG - 57)) | (1L << (SHORT - 57)) | (1L << (BYTE - 57)) | (1L << (LPBRACK - 57)) | (1L << (IDENTIFIER - 57)))) != 0)) {
					{
					setState(185);
					datatype();
					}
				}

				setState(188);
				match(RPBRACK);
				}
			}

			setState(191);
			_la = _input.LA(1);
			if ( !(_la==LBRACK || _la==LSQBRACK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (STRING - 40)) | (1L << (LBRACK - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)) | (1L << (Digits - 40)))) != 0)) {
				{
				setState(192);
				method_call_param();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(193);
					match(T__0);
					setState(194);
					method_call_param();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(202);
			_la = _input.LA(1);
			if ( !(_la==RBRACK || _la==RSQBRACK) ) {
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

	public static class Method_call_paramContext extends ParserRuleContext {
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> THIS() { return getTokens(JavaLexerParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(JavaLexerParser.THIS, i);
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
		public List<TerminalNode> TRUE() { return getTokens(JavaLexerParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(JavaLexerParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(JavaLexerParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(JavaLexerParser.FALSE, i);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public List<Math_opContext> math_op() {
			return getRuleContexts(Math_opContext.class);
		}
		public Math_opContext math_op(int i) {
			return getRuleContext(Math_opContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JavaLexerParser.NEW, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public TerminalNode CLASS() { return getToken(JavaLexerParser.CLASS, 0); }
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
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(204);
				cast();
				}
			}

			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(207);
					match(NEW);
					}
				}

				setState(210);
				method_call();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(211);
					match(DOT);
					setState(212);
					method_call();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(218);
				match(THIS);
				}
				break;
			case 3:
				{
				setState(219);
				match(STRING_CONST);
				}
				break;
			case 4:
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(222); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(220);
							match(IDENTIFIER);
							setState(221);
							match(DOT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(224); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(226);
					match(THIS);
					setState(227);
					match(DOT);
					}
					break;
				}
				setState(230);
				match(IDENTIFIER);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(231);
					match(DOT);
					setState(232);
					match(CLASS);
					}
				}

				}
				break;
			case 5:
				{
				setState(235);
				match(Digits);
				}
				break;
			case 6:
				{
				setState(236);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(237);
				match(FALSE);
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(240);
				math_op();
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(241);
					match(STRING_CONST);
					}
					break;
				case 2:
					{
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS) {
						{
						setState(242);
						match(THIS);
						setState(243);
						match(DOT);
						}
					}

					setState(246);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(247);
					match(Digits);
					}
					break;
				case 4:
					{
					setState(248);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(249);
					match(FALSE);
					}
					break;
				case 6:
					{
					setState(250);
					method_call();
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(251);
						match(DOT);
						setState(252);
						method_call();
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				}
				setState(264);
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public Generic_type_nameContext generic_type_name() {
			return getRuleContext(Generic_type_nameContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LBRACK);
			setState(266);
			match(IDENTIFIER);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(267);
				match(DOT);
				setState(268);
				match(IDENTIFIER);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(274);
				generic_type_name();
				}
			}

			setState(277);
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
		enterRule(_localctx, 16, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			method_sig();
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCBRACK:
				{
				setState(280);
				match(LCBRACK);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(281);
					scope_body();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(RCBRACK);
				}
				break;
			case SEMICOLON:
				{
				setState(288);
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
		enterRule(_localctx, 18, RULE_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LCBRACK);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(292);
					scope_body();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(298);
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
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(JavaLexerParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(JavaLexerParser.STRING_CONST, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(JavaLexerParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(JavaLexerParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(JavaLexerParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(JavaLexerParser.FALSE, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(JavaLexerParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(JavaLexerParser.RETURN, i);
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
		public List<TerminalNode> THIS() { return getTokens(JavaLexerParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(JavaLexerParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public List<Math_opContext> math_op() {
			return getRuleContexts(Math_opContext.class);
		}
		public Math_opContext math_op(int i) {
			return getRuleContext(Math_opContext.class,i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<CastContext> cast() {
			return getRuleContexts(CastContext.class);
		}
		public CastContext cast(int i) {
			return getRuleContext(CastContext.class,i);
		}
		public List<TerminalNode> THROW() { return getTokens(JavaLexerParser.THROW); }
		public TerminalNode THROW(int i) {
			return getToken(JavaLexerParser.THROW, i);
		}
		public List<TerminalNode> NEW() { return getTokens(JavaLexerParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(JavaLexerParser.NEW, i);
		}
		public List<TerminalNode> LSQBRACK() { return getTokens(JavaLexerParser.LSQBRACK); }
		public TerminalNode LSQBRACK(int i) {
			return getToken(JavaLexerParser.LSQBRACK, i);
		}
		public List<TerminalNode> RSQBRACK() { return getTokens(JavaLexerParser.RSQBRACK); }
		public TerminalNode RSQBRACK(int i) {
			return getToken(JavaLexerParser.RSQBRACK, i);
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
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(300);
						match(RETURN);
						}
						break;
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(303);
							match(LBRACK);
							}
							} 
						}
						setState(308);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					}
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(309);
						match(THIS);
						setState(310);
						match(DOT);
						}
						break;
					}
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(314);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(313);
							datatype();
							}
							break;
						}
						setState(316);
						match(IDENTIFIER);
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT) {
							{
							{
							setState(317);
							match(DOT);
							setState(318);
							match(IDENTIFIER);
							}
							}
							setState(323);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LSQBRACK) {
							{
							setState(324);
							match(LSQBRACK);
							setState(325);
							match(IDENTIFIER);
							setState(326);
							match(RSQBRACK);
							}
						}

						setState(329);
						match(T__1);
						}
						break;
					}
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(332);
						match(STRING_CONST);
						}
						break;
					case 2:
						{
						setState(334);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(333);
							datatype();
							}
							break;
						}
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THIS) {
							{
							setState(336);
							match(THIS);
							setState(337);
							match(DOT);
							}
						}

						setState(340);
						match(IDENTIFIER);
						setState(345);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(341);
								match(DOT);
								setState(342);
								match(IDENTIFIER);
								}
								} 
							}
							setState(347);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						}
						setState(349);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2 || _la==T__3) {
							{
							setState(348);
							_la = _input.LA(1);
							if ( !(_la==T__2 || _la==T__3) ) {
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
						break;
					case 3:
						{
						setState(351);
						match(TRUE);
						}
						break;
					case 4:
						{
						setState(352);
						match(FALSE);
						}
						break;
					case 5:
						{
						setState(353);
						match(RETURN);
						}
						break;
					case 6:
						{
						setState(357);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(354);
								match(LBRACK);
								}
								} 
							}
							setState(359);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
						}
						setState(361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(360);
							cast();
							}
						}

						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THROW) {
							{
							setState(363);
							match(THROW);
							}
						}

						setState(374);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(366);
							match(IDENTIFIER);
							setState(371);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(367);
									match(DOT);
									setState(368);
									match(IDENTIFIER);
									}
									} 
								}
								setState(373);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
							}
							}
							break;
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RBRACK) {
							{
							{
							setState(376);
							match(RBRACK);
							}
							}
							setState(381);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOT) {
							{
							setState(382);
							match(DOT);
							}
						}

						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEW) {
							{
							setState(385);
							match(NEW);
							}
						}

						setState(388);
						method_call();
						setState(393);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(389);
								match(DOT);
								setState(390);
								method_call();
								}
								} 
							}
							setState(395);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						}
						}
						break;
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(398);
							match(RBRACK);
							}
							} 
						}
						setState(403);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(404);
							match(LBRACK);
							}
							} 
						}
						setState(409);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(461); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								setState(461);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
								case 1:
									{
									setState(410);
									match(DOT);
									}
									break;
								case 2:
									{
									setState(411);
									match(IDENTIFIER);
									}
									break;
								case 3:
									{
									setState(412);
									match(STRING_CONST);
									}
									break;
								case 4:
									{
									{
									setState(414);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
										{
										setState(413);
										math_op();
										}
									}

									setState(417);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==T__1) {
										{
										setState(416);
										match(T__1);
										}
									}

									setState(422);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
									case 1:
										{
										setState(419);
										match(LBRACK);
										setState(420);
										match(IDENTIFIER);
										setState(421);
										match(RBRACK);
										}
										break;
									}
									}
									setState(427);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la==LBRACK) {
										{
										{
										setState(424);
										match(LBRACK);
										}
										}
										setState(429);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									setState(431);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NEW) {
										{
										setState(430);
										match(NEW);
										}
									}

									setState(459);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case THIS:
									case STRING:
									case IDENTIFIER:
										{
										setState(433);
										method_call();
										setState(438);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
										while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
											if ( _alt==1 ) {
												{
												{
												setState(434);
												match(DOT);
												setState(435);
												method_call();
												}
												} 
											}
											setState(440);
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
										}
										setState(442);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
										case 1:
											{
											setState(441);
											math_op();
											}
											break;
										}
										setState(452);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
										case 1:
											{
											setState(444);
											method_call();
											setState(449);
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
											while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
												if ( _alt==1 ) {
													{
													{
													setState(445);
													match(DOT);
													setState(446);
													method_call();
													}
													} 
												}
												setState(451);
												_errHandler.sync(this);
												_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
											}
											}
											break;
										}
										}
										break;
									case Digits:
										{
										setState(455); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(454);
												match(Digits);
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(457); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
										} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									}
									break;
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(463); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
						{
						setState(467);
						math_op();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(474);
					match(RBRACK);
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(JavaLexerParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(JavaLexerParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(JavaLexerParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(JavaLexerParser.FALSE, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaLexerParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaLexerParser.LBRACK, i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Digits() { return getTokens(JavaLexerParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(JavaLexerParser.Digits, i);
		}
		public List<Math_opContext> math_op() {
			return getRuleContexts(Math_opContext.class);
		}
		public Math_opContext math_op(int i) {
			return getRuleContext(Math_opContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public List<TerminalNode> THIS() { return getTokens(JavaLexerParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(JavaLexerParser.THIS, i);
		}
		public List<TerminalNode> NULL() { return getTokens(JavaLexerParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(JavaLexerParser.NULL, i);
		}
		public List<TerminalNode> HexDigits() { return getTokens(JavaLexerParser.HexDigits); }
		public TerminalNode HexDigits(int i) {
			return getToken(JavaLexerParser.HexDigits, i);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(483);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(480);
							match(LBRACK);
							}
							} 
						}
						setState(485);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					}
					setState(599);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case THIS:
					case STRING:
					case LBRACK:
					case IDENTIFIER:
					case Digits:
						{
						{
						setState(487);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__4) {
							{
							setState(486);
							match(T__4);
							}
						}

						setState(492);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(489);
								match(LBRACK);
								}
								} 
							}
							setState(494);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
						}
						setState(516);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(495);
							method_call();
							setState(500);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(496);
									match(DOT);
									setState(497);
									method_call();
									}
									} 
								}
								setState(502);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
							}
							}
							break;
						case 2:
							{
							setState(505);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==THIS) {
								{
								setState(503);
								match(THIS);
								setState(504);
								match(DOT);
								}
							}

							setState(507);
							match(IDENTIFIER);
							setState(512);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(508);
									match(DOT);
									setState(509);
									match(IDENTIFIER);
									}
									} 
								}
								setState(514);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
							}
							}
							break;
						case 3:
							{
							setState(515);
							match(Digits);
							}
							break;
						}
						setState(521);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(518);
								match(RBRACK);
								}
								} 
							}
							setState(523);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						}
						setState(525);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
						case 1:
							{
							setState(524);
							comp_op();
							}
							break;
						}
						setState(530);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(527);
								match(LBRACK);
								}
								} 
							}
							setState(532);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
						}
						setState(534);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(533);
							match(T__4);
							}
							break;
						}
						setState(539);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(536);
								match(LBRACK);
								}
								} 
							}
							setState(541);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						}
						setState(543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
						case 1:
							{
							setState(542);
							math_op();
							}
							break;
						}
						setState(594);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(546);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
									{
									setState(545);
									math_op();
									}
								}

								setState(590);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
								case 1:
									{
									setState(548);
									match(NULL);
									}
									break;
								case 2:
									{
									setState(549);
									match(HexDigits);
									}
									break;
								case 3:
									{
									setState(550);
									match(Digits);
									}
									break;
								case 4:
									{
									setState(551);
									match(IDENTIFIER);
									setState(556);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(552);
											match(DOT);
											setState(553);
											match(IDENTIFIER);
											}
											} 
										}
										setState(558);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
									}
									}
									break;
								case 5:
									{
									setState(563);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(559);
											match(IDENTIFIER);
											setState(560);
											match(DOT);
											}
											} 
										}
										setState(565);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
									}
									setState(566);
									method_call();
									setState(581);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(567);
											match(DOT);
											setState(577);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
											case 1:
												{
												setState(568);
												method_call();
												}
												break;
											case 2:
												{
												setState(569);
												match(IDENTIFIER);
												setState(574);
												_errHandler.sync(this);
												_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
												while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
													if ( _alt==1 ) {
														{
														{
														setState(570);
														match(DOT);
														setState(571);
														match(IDENTIFIER);
														}
														} 
													}
													setState(576);
													_errHandler.sync(this);
													_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
												}
												}
												break;
											}
											}
											} 
										}
										setState(583);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
									}
									setState(587);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(584);
											match(RBRACK);
											}
											} 
										}
										setState(589);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
									}
									}
									break;
								}
								}
								} 
							}
							setState(596);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
						}
						}
						}
						break;
					case TRUE:
						{
						setState(597);
						match(TRUE);
						}
						break;
					case FALSE:
						{
						setState(598);
						match(FALSE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(601);
							match(RBRACK);
							}
							} 
						}
						setState(606);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					setState(608);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(607);
						comp_op();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(612); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614);
					match(RBRACK);
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
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
		enterRule(_localctx, 24, RULE_if_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(IF);
			setState(621);
			condition();
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(622);
				scope();
				}
				break;
			case 2:
				{
				setState(623);
				scope_body();
				}
				break;
			}
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(626);
				match(ELSE);
				setState(630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(627);
					if_cond();
					}
					break;
				case 2:
					{
					setState(628);
					scope();
					}
					break;
				case 3:
					{
					setState(629);
					scope_body();
					}
					break;
				}
				}
				break;
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

	public static class Variable_defContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<Var_assignContext> var_assign() {
			return getRuleContexts(Var_assignContext.class);
		}
		public Var_assignContext var_assign(int i) {
			return getRuleContext(Var_assignContext.class,i);
		}
		public Variable_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterVariable_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitVariable_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitVariable_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_defContext variable_def() throws RecognitionException {
		Variable_defContext _localctx = new Variable_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			datatype();
			setState(635);
			match(IDENTIFIER);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(636);
				var_assign();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(639);
				match(T__0);
				setState(640);
				match(IDENTIFIER);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(641);
					var_assign();
					}
				}

				}
				}
				setState(648);
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

	public static class Var_assignContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(JavaLexerParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(JavaLexerParser.STRING_CONST, i);
		}
		public List<TerminalNode> Digits() { return getTokens(JavaLexerParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(JavaLexerParser.Digits, i);
		}
		public List<TerminalNode> NULL() { return getTokens(JavaLexerParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(JavaLexerParser.NULL, i);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<TerminalNode> HexDigits() { return getTokens(JavaLexerParser.HexDigits); }
		public TerminalNode HexDigits(int i) {
			return getToken(JavaLexerParser.HexDigits, i);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__1);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCBRACK) {
				{
				setState(650);
				match(LCBRACK);
				}
			}

			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(653);
				expression();
				}
				break;
			case 2:
				{
				setState(654);
				match(STRING_CONST);
				}
				break;
			case 3:
				{
				setState(655);
				match(Digits);
				}
				break;
			case 4:
				{
				setState(656);
				match(NULL);
				}
				break;
			}
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					match(T__0);
					setState(665);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(660);
						expression();
						}
						break;
					case 2:
						{
						setState(661);
						match(STRING_CONST);
						}
						break;
					case 3:
						{
						setState(662);
						match(HexDigits);
						}
						break;
					case 4:
						{
						setState(663);
						match(Digits);
						}
						break;
					case 5:
						{
						setState(664);
						match(NULL);
						}
						break;
					}
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RCBRACK) {
				{
				setState(672);
				match(RCBRACK);
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

	public static class AttributeContext extends ParserRuleContext {
		public Variable_defContext variable_def() {
			return getRuleContext(Variable_defContext.class,0);
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
		enterRule(_localctx, 30, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(675);
				accessmod();
				}
			}

			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(678);
				match(STATIC);
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(681);
				match(FINAL);
				}
			}

			setState(684);
			variable_def();
			setState(685);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public Generic_type_nameContext generic_type_name() {
			return getRuleContext(Generic_type_nameContext.class,0);
		}
		public TerminalNode LSQBRACK() { return getToken(JavaLexerParser.LSQBRACK, 0); }
		public TerminalNode RSQBRACK() { return getToken(JavaLexerParser.RSQBRACK, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
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
		enterRule(_localctx, 32, RULE_datatype);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(687);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				{
				setState(688);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(689);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(690);
				match(STRING);
				}
				break;
			case LONG:
				{
				setState(691);
				match(LONG);
				}
				break;
			case SHORT:
				{
				setState(692);
				match(SHORT);
				}
				break;
			case BYTE:
				{
				setState(693);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				{
				setState(694);
				match(IDENTIFIER);
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(695);
						match(DOT);
						setState(696);
						match(IDENTIFIER);
						}
						} 
					}
					setState(701);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(702);
					generic_type_name();
					}
				}

				}
				break;
			case LPBRACK:
				{
				setState(705);
				generic_type_name();
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(706);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(711);
				match(LSQBRACK);
				setState(712);
				match(RSQBRACK);
				}
				break;
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

	public static class Scope_bodyContext extends ParserRuleContext {
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public For_each_loopContext for_each_loop() {
			return getRuleContext(For_each_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
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
		enterRule(_localctx, 34, RULE_scope_body);
		int _la;
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				try_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				switch_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				expression();
				setState(719);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(722);
				for_each_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(723);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(724);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(725);
				method_call();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(726);
					match(DOT);
					setState(727);
					method_call();
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(733);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(735);
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
		enterRule(_localctx, 36, RULE_for_loop);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(FOR);
				setState(739);
				match(LBRACK);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					setState(740);
					expression();
					}
				}

				setState(743);
				match(SEMICOLON);
				setState(744);
				condition();
				setState(745);
				match(SEMICOLON);
				setState(746);
				expression();
				setState(747);
				match(RBRACK);
				{
				setState(748);
				match(LCBRACK);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(749);
					scope_body();
					}
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(755);
				match(RCBRACK);
				}
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case LBRACK:
			case RBRACK:
			case LPBRACK:
			case DOT:
			case THROW:
			case IDENTIFIER:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				expression();
				setState(758);
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

	public static class For_each_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaLexerParser.FOR, 0); }
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public Variable_defContext variable_def() {
			return getRuleContext(Variable_defContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterFor_each_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitFor_each_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitFor_each_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(FOR);
			setState(763);
			match(LBRACK);
			setState(764);
			variable_def();
			setState(765);
			match(T__5);
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(766);
				method_call();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(767);
					match(DOT);
					setState(768);
					method_call();
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(774);
				match(IDENTIFIER);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(775);
					match(DOT);
					setState(776);
					match(IDENTIFIER);
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(784);
			match(RBRACK);
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(785);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(786);
				match(LCBRACK);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(787);
					scope_body();
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				match(RCBRACK);
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case LBRACK:
			case RBRACK:
			case LPBRACK:
			case DOT:
			case THROW:
			case IDENTIFIER:
			case STRING_CONST:
				{
				setState(794);
				expression();
				setState(795);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 40, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(WHILE);
			setState(800);
			match(LBRACK);
			setState(801);
			condition();
			setState(802);
			match(RBRACK);
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(803);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(804);
				match(LCBRACK);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(805);
					scope_body();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				match(RCBRACK);
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case INTEGER:
			case DOUBLE:
			case FLOAT:
			case STRING:
			case LONG:
			case SHORT:
			case BYTE:
			case LBRACK:
			case RBRACK:
			case LPBRACK:
			case DOT:
			case THROW:
			case IDENTIFIER:
			case STRING_CONST:
				{
				setState(812);
				expression();
				setState(813);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaLexerParser.DO, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaLexerParser.WHILE, 0); }
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(DO);
			setState(818);
			scope();
			setState(819);
			match(WHILE);
			setState(820);
			match(LBRACK);
			setState(821);
			condition();
			setState(822);
			match(RBRACK);
			setState(823);
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
		public List<Static_blockContext> static_block() {
			return getRuleContexts(Static_blockContext.class);
		}
		public Static_blockContext static_block(int i) {
			return getRuleContext(Static_blockContext.class,i);
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
		enterRule(_localctx, 44, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(825);
				accessmod();
				}
			}

			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(828);
				match(ABSTRACT);
				}
			}

			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(831);
				match(STATIC);
				}
			}

			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(834);
				match(FINAL);
				}
			}

			setState(837);
			match(CLASS);
			setState(838);
			class_name();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(839);
				match(EXTENDS);
				setState(840);
				class_name();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(843);
				match(IMPLEMENTS);
				setState(844);
				interface_name();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(845);
					match(T__0);
					setState(846);
					interface_name();
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(854);
			match(LCBRACK);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (CLASS - 27)) | (1L << (PUBLIC - 27)) | (1L << (PRIVATE - 27)) | (1L << (PROTECTED - 27)) | (1L << (ABSTRACT - 27)) | (1L << (STATIC - 27)) | (1L << (VOID - 27)) | (1L << (FINAL - 27)) | (1L << (INTEGER - 27)) | (1L << (DOUBLE - 27)) | (1L << (FLOAT - 27)) | (1L << (STRING - 27)) | (1L << (LONG - 27)) | (1L << (SHORT - 27)) | (1L << (BYTE - 27)) | (1L << (LPBRACK - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(855);
					static_block();
					}
					break;
				case 2:
					{
					setState(856);
					constructor();
					}
					break;
				case 3:
					{
					setState(857);
					method();
					}
					break;
				case 4:
					{
					setState(858);
					attribute();
					}
					break;
				case 5:
					{
					setState(859);
					class_def();
					}
					break;
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
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
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_interface_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(867);
				accessmod();
				}
			}

			setState(870);
			match(INTERFACE);
			setState(871);
			interface_name();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(872);
				match(EXTENDS);
				setState(873);
				class_name();
				}
			}

			setState(876);
			match(LCBRACK);
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (PUBLIC - 28)) | (1L << (PRIVATE - 28)) | (1L << (PROTECTED - 28)) | (1L << (ABSTRACT - 28)) | (1L << (STATIC - 28)) | (1L << (VOID - 28)) | (1L << (FINAL - 28)) | (1L << (INTEGER - 28)) | (1L << (DOUBLE - 28)) | (1L << (FLOAT - 28)) | (1L << (STRING - 28)) | (1L << (LONG - 28)) | (1L << (SHORT - 28)) | (1L << (BYTE - 28)) | (1L << (LPBRACK - 28)) | (1L << (IDENTIFIER - 28)))) != 0)) {
				{
				{
				setState(877);
				method_sig();
				setState(878);
				match(SEMICOLON);
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
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
		public Generic_type_nameContext generic_type_name() {
			return getRuleContext(Generic_type_nameContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_class_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(IDENTIFIER);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(888);
				generic_type_name();
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

	public static class Interface_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public Generic_type_nameContext generic_type_name() {
			return getRuleContext(Generic_type_nameContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_interface_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(IDENTIFIER);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(892);
				generic_type_name();
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

	public static class Static_blockContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaLexerParser.STATIC, 0); }
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public Static_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterStatic_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitStatic_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitStatic_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_blockContext static_block() throws RecognitionException {
		Static_blockContext _localctx = new Static_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_static_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(STATIC);
			setState(896);
			match(LCBRACK);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (PUBLIC - 28)) | (1L << (PRIVATE - 28)) | (1L << (PROTECTED - 28)) | (1L << (STATIC - 28)) | (1L << (THIS - 28)) | (1L << (RETURN - 28)) | (1L << (TRUE - 28)) | (1L << (FALSE - 28)) | (1L << (NEW - 28)) | (1L << (FINAL - 28)) | (1L << (IF - 28)) | (1L << (TRY - 28)) | (1L << (FOR - 28)) | (1L << (WHILE - 28)) | (1L << (DO - 28)) | (1L << (INTEGER - 28)) | (1L << (DOUBLE - 28)) | (1L << (FLOAT - 28)) | (1L << (STRING - 28)) | (1L << (LONG - 28)) | (1L << (SHORT - 28)) | (1L << (BYTE - 28)) | (1L << (LBRACK - 28)) | (1L << (RBRACK - 28)) | (1L << (LCBRACK - 28)) | (1L << (LPBRACK - 28)) | (1L << (DOT - 28)) | (1L << (SWITCH - 28)) | (1L << (THROW - 28)) | (1L << (IDENTIFIER - 28)) | (1L << (STRING_CONST - 28)))) != 0)) {
				{
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(897);
					attribute();
					}
					break;
				case 2:
					{
					setState(898);
					scope_body();
					}
					break;
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
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

	public static class Try_blockContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaLexerParser.TRY, 0); }
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TerminalNode> CATCH() { return getTokens(JavaLexerParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(JavaLexerParser.CATCH, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaLexerParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaLexerParser.LBRACK, i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaLexerParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaLexerParser.RBRACK, i);
		}
		public TerminalNode FINALLY() { return getToken(JavaLexerParser.FINALLY, 0); }
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitTry_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitTry_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(TRY);
			setState(907);
			scope();
			setState(922); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(908);
				match(CATCH);
				setState(909);
				match(LBRACK);
				setState(910);
				datatype();
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(911);
					match(T__6);
					setState(912);
					datatype();
					}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				match(IDENTIFIER);
				setState(919);
				match(RBRACK);
				setState(920);
				scope();
				}
				}
				setState(924); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(926);
				match(FINALLY);
				setState(927);
				scope();
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

	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaLexerParser.SWITCH, 0); }
		public TerminalNode LBRACK() { return getToken(JavaLexerParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public Switch_scopeContext switch_scope() {
			return getRuleContext(Switch_scopeContext.class,0);
		}
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitSwitch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(SWITCH);
			setState(931);
			match(LBRACK);
			setState(932);
			expression();
			setState(933);
			match(RBRACK);
			setState(934);
			switch_scope();
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

	public static class Switch_scopeContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Switch_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterSwitch_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitSwitch_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitSwitch_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_scopeContext switch_scope() throws RecognitionException {
		Switch_scopeContext _localctx = new Switch_scopeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switch_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(LCBRACK);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(937);
				case_block();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(943);
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

	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaLexerParser.DEFAULT, 0); }
		public TerminalNode CASE() { return getToken(JavaLexerParser.CASE, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(JavaLexerParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_CONST() { return getToken(JavaLexerParser.STRING_CONST, 0); }
		public TerminalNode Digits() { return getToken(JavaLexerParser.Digits, 0); }
		public TerminalNode HexDigits() { return getToken(JavaLexerParser.HexDigits, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitCase_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitCase_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_case_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(945);
				match(DEFAULT);
				}
				break;
			case CASE:
				{
				setState(946);
				match(CASE);
				setState(958);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(951);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(947);
							match(IDENTIFIER);
							setState(948);
							match(DOT);
							}
							} 
						}
						setState(953);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					}
					setState(954);
					match(IDENTIFIER);
					}
					break;
				case STRING_CONST:
					{
					setState(955);
					match(STRING_CONST);
					}
					break;
				case Digits:
					{
					setState(956);
					match(Digits);
					}
					break;
				case HexDigits:
					{
					setState(957);
					match(HexDigits);
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
			setState(962);
			match(T__5);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(963);
					scope_body();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(969);
				match(BREAK);
				setState(970);
				match(SEMICOLON);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(JavaLexerParser.STRING, 0); }
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
		enterRule(_localctx, 62, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
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

	public static class Generic_type_nameContext extends ParserRuleContext {
		public TerminalNode LPBRACK() { return getToken(JavaLexerParser.LPBRACK, 0); }
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaLexerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaLexerParser.IDENTIFIER, i);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaLexerParser.EXTENDS, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public Generic_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterGeneric_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitGeneric_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitGeneric_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_type_nameContext generic_type_name() throws RecognitionException {
		Generic_type_nameContext _localctx = new Generic_type_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(LPBRACK);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(976);
				match(T__7);
				setState(977);
				match(EXTENDS);
				}
			}

			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(980);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(981);
				datatype();
				}
				break;
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(984);
				match(DOT);
				setState(985);
				match(IDENTIFIER);
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			match(RPBRACK);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode INSTANCEOF() { return getToken(JavaLexerParser.INSTANCEOF, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << INSTANCEOF))) != 0) || _la==LPBRACK || _la==RPBRACK) ) {
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

	public static class Math_opContext extends ParserRuleContext {
		public Math_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).enterMath_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLexerListener ) ((JavaLexerListener)listener).exitMath_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLexerVisitor ) return ((JavaLexerVisitor<? extends T>)visitor).visitMath_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_opContext math_op() throws RecognitionException {
		Math_opContext _localctx = new Math_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_math_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u03e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4\5"+
		"\4c\n\4\3\5\5\5f\n\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16"+
		"\5s\13\5\5\5u\n\5\3\5\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\5\5\u0081"+
		"\n\5\3\5\3\5\3\6\5\6\u0086\n\6\3\6\5\6\u0089\n\6\3\6\5\6\u008c\n\6\3\6"+
		"\3\6\5\6\u0090\n\6\3\6\3\6\3\6\5\6\u0095\n\6\3\6\3\6\3\6\3\6\7\6\u009b"+
		"\n\6\f\6\16\6\u009e\13\6\5\6\u00a0\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a7\n"+
		"\6\f\6\16\6\u00aa\13\6\5\6\u00ac\n\6\3\7\3\7\5\7\u00b0\n\7\3\7\3\7\3\7"+
		"\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\5\7\u00c0"+
		"\n\7\3\7\3\7\3\7\3\7\7\7\u00c6\n\7\f\7\16\7\u00c9\13\7\5\7\u00cb\n\7\3"+
		"\7\3\7\3\b\5\b\u00d0\n\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\7\b\u00d8\n\b\f"+
		"\b\16\b\u00db\13\b\3\b\3\b\3\b\3\b\6\b\u00e1\n\b\r\b\16\b\u00e2\3\b\3"+
		"\b\5\b\u00e7\n\b\3\b\3\b\3\b\5\b\u00ec\n\b\3\b\3\b\3\b\5\b\u00f1\n\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00f7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0100\n\b"+
		"\f\b\16\b\u0103\13\b\5\b\u0105\n\b\7\b\u0107\n\b\f\b\16\b\u010a\13\b\3"+
		"\t\3\t\3\t\3\t\7\t\u0110\n\t\f\t\16\t\u0113\13\t\3\t\5\t\u0116\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\n\u011d\n\n\f\n\16\n\u0120\13\n\3\n\3\n\5\n\u0124\n"+
		"\n\3\13\3\13\7\13\u0128\n\13\f\13\16\13\u012b\13\13\3\13\3\13\3\f\5\f"+
		"\u0130\n\f\3\f\7\f\u0133\n\f\f\f\16\f\u0136\13\f\3\f\3\f\5\f\u013a\n\f"+
		"\3\f\5\f\u013d\n\f\3\f\3\f\3\f\7\f\u0142\n\f\f\f\16\f\u0145\13\f\3\f\3"+
		"\f\3\f\5\f\u014a\n\f\3\f\5\f\u014d\n\f\3\f\3\f\5\f\u0151\n\f\3\f\3\f\5"+
		"\f\u0155\n\f\3\f\3\f\3\f\7\f\u015a\n\f\f\f\16\f\u015d\13\f\3\f\5\f\u0160"+
		"\n\f\3\f\3\f\3\f\3\f\7\f\u0166\n\f\f\f\16\f\u0169\13\f\3\f\5\f\u016c\n"+
		"\f\3\f\5\f\u016f\n\f\3\f\3\f\3\f\7\f\u0174\n\f\f\f\16\f\u0177\13\f\5\f"+
		"\u0179\n\f\3\f\7\f\u017c\n\f\f\f\16\f\u017f\13\f\3\f\5\f\u0182\n\f\3\f"+
		"\5\f\u0185\n\f\3\f\3\f\3\f\7\f\u018a\n\f\f\f\16\f\u018d\13\f\5\f\u018f"+
		"\n\f\3\f\7\f\u0192\n\f\f\f\16\f\u0195\13\f\3\f\7\f\u0198\n\f\f\f\16\f"+
		"\u019b\13\f\3\f\3\f\3\f\3\f\5\f\u01a1\n\f\3\f\5\f\u01a4\n\f\3\f\3\f\3"+
		"\f\5\f\u01a9\n\f\3\f\7\f\u01ac\n\f\f\f\16\f\u01af\13\f\3\f\5\f\u01b2\n"+
		"\f\3\f\3\f\3\f\7\f\u01b7\n\f\f\f\16\f\u01ba\13\f\3\f\5\f\u01bd\n\f\3\f"+
		"\3\f\3\f\7\f\u01c2\n\f\f\f\16\f\u01c5\13\f\5\f\u01c7\n\f\3\f\6\f\u01ca"+
		"\n\f\r\f\16\f\u01cb\5\f\u01ce\n\f\6\f\u01d0\n\f\r\f\16\f\u01d1\5\f\u01d4"+
		"\n\f\3\f\5\f\u01d7\n\f\6\f\u01d9\n\f\r\f\16\f\u01da\3\f\7\f\u01de\n\f"+
		"\f\f\16\f\u01e1\13\f\3\r\7\r\u01e4\n\r\f\r\16\r\u01e7\13\r\3\r\5\r\u01ea"+
		"\n\r\3\r\7\r\u01ed\n\r\f\r\16\r\u01f0\13\r\3\r\3\r\3\r\7\r\u01f5\n\r\f"+
		"\r\16\r\u01f8\13\r\3\r\3\r\5\r\u01fc\n\r\3\r\3\r\3\r\7\r\u0201\n\r\f\r"+
		"\16\r\u0204\13\r\3\r\5\r\u0207\n\r\3\r\7\r\u020a\n\r\f\r\16\r\u020d\13"+
		"\r\3\r\5\r\u0210\n\r\3\r\7\r\u0213\n\r\f\r\16\r\u0216\13\r\3\r\5\r\u0219"+
		"\n\r\3\r\7\r\u021c\n\r\f\r\16\r\u021f\13\r\3\r\5\r\u0222\n\r\3\r\5\r\u0225"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u022d\n\r\f\r\16\r\u0230\13\r\3\r\3\r"+
		"\7\r\u0234\n\r\f\r\16\r\u0237\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u023f\n"+
		"\r\f\r\16\r\u0242\13\r\5\r\u0244\n\r\7\r\u0246\n\r\f\r\16\r\u0249\13\r"+
		"\3\r\7\r\u024c\n\r\f\r\16\r\u024f\13\r\5\r\u0251\n\r\7\r\u0253\n\r\f\r"+
		"\16\r\u0256\13\r\3\r\3\r\5\r\u025a\n\r\3\r\7\r\u025d\n\r\f\r\16\r\u0260"+
		"\13\r\3\r\5\r\u0263\n\r\6\r\u0265\n\r\r\r\16\r\u0266\3\r\7\r\u026a\n\r"+
		"\f\r\16\r\u026d\13\r\3\16\3\16\3\16\3\16\5\16\u0273\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0279\n\16\5\16\u027b\n\16\3\17\3\17\3\17\5\17\u0280\n\17\3"+
		"\17\3\17\3\17\5\17\u0285\n\17\7\17\u0287\n\17\f\17\16\17\u028a\13\17\3"+
		"\20\3\20\5\20\u028e\n\20\3\20\3\20\3\20\3\20\5\20\u0294\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u029c\n\20\7\20\u029e\n\20\f\20\16\20\u02a1"+
		"\13\20\3\20\5\20\u02a4\n\20\3\21\5\21\u02a7\n\21\3\21\5\21\u02aa\n\21"+
		"\3\21\5\21\u02ad\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u02bc\n\22\f\22\16\22\u02bf\13\22\3\22\5\22\u02c2"+
		"\n\22\3\22\3\22\5\22\u02c6\n\22\5\22\u02c8\n\22\3\22\3\22\5\22\u02cc\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u02db\n\23\f\23\16\23\u02de\13\23\3\23\3\23\3\23\5\23\u02e3\n\23\3"+
		"\24\3\24\3\24\5\24\u02e8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u02f1\n\24\f\24\16\24\u02f4\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u02fb"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0304\n\25\f\25\16\25\u0307"+
		"\13\25\3\25\3\25\3\25\7\25\u030c\n\25\f\25\16\25\u030f\13\25\5\25\u0311"+
		"\n\25\3\25\3\25\3\25\3\25\7\25\u0317\n\25\f\25\16\25\u031a\13\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0320\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0329\n\26\f\26\16\26\u032c\13\26\3\26\3\26\3\26\3\26\5\26\u0332\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u033d\n\30\3\30\5\30"+
		"\u0340\n\30\3\30\5\30\u0343\n\30\3\30\5\30\u0346\n\30\3\30\3\30\3\30\3"+
		"\30\5\30\u034c\n\30\3\30\3\30\3\30\3\30\7\30\u0352\n\30\f\30\16\30\u0355"+
		"\13\30\5\30\u0357\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u035f\n\30\f"+
		"\30\16\30\u0362\13\30\3\30\3\30\3\31\5\31\u0367\n\31\3\31\3\31\3\31\3"+
		"\31\5\31\u036d\n\31\3\31\3\31\3\31\3\31\7\31\u0373\n\31\f\31\16\31\u0376"+
		"\13\31\3\31\3\31\3\32\3\32\5\32\u037c\n\32\3\33\3\33\5\33\u0380\n\33\3"+
		"\34\3\34\3\34\3\34\7\34\u0386\n\34\f\34\16\34\u0389\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0394\n\35\f\35\16\35\u0397\13"+
		"\35\3\35\3\35\3\35\3\35\6\35\u039d\n\35\r\35\16\35\u039e\3\35\3\35\5\35"+
		"\u03a3\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u03ad\n\37\f"+
		"\37\16\37\u03b0\13\37\3\37\3\37\3 \3 \3 \3 \7 \u03b8\n \f \16 \u03bb\13"+
		" \3 \3 \3 \3 \5 \u03c1\n \5 \u03c3\n \3 \3 \7 \u03c7\n \f \16 \u03ca\13"+
		" \3 \3 \5 \u03ce\n \3!\3!\3\"\3\"\3\"\5\"\u03d5\n\"\3\"\3\"\5\"\u03d9"+
		"\n\"\3\"\3\"\7\"\u03dd\n\"\f\"\16\"\u03e0\13\"\3\"\3\"\3#\3#\3$\3$\3$"+
		"\t\u0129\u0134\u01e5\u01ee\u020b\u025e\u03c8\2%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\n\3\2\36 \3\2!\"\4\2BB"+
		"FF\4\2CCGG\3\2\5\6\4\2>>QQ\6\2\t\t\13\23\64\64HI\5\2\t\t\17\21\24\27\2"+
		"\u049d\2L\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\be\3\2\2\2\n\u0085\3\2\2\2\f\u00af"+
		"\3\2\2\2\16\u00cf\3\2\2\2\20\u010b\3\2\2\2\22\u0119\3\2\2\2\24\u0125\3"+
		"\2\2\2\26\u01d8\3\2\2\2\30\u0264\3\2\2\2\32\u026e\3\2\2\2\34\u027c\3\2"+
		"\2\2\36\u028b\3\2\2\2 \u02a6\3\2\2\2\"\u02c7\3\2\2\2$\u02e2\3\2\2\2&\u02fa"+
		"\3\2\2\2(\u02fc\3\2\2\2*\u0321\3\2\2\2,\u0333\3\2\2\2.\u033c\3\2\2\2\60"+
		"\u0366\3\2\2\2\62\u0379\3\2\2\2\64\u037d\3\2\2\2\66\u0381\3\2\2\28\u038c"+
		"\3\2\2\2:\u03a4\3\2\2\2<\u03aa\3\2\2\2>\u03c2\3\2\2\2@\u03cf\3\2\2\2B"+
		"\u03d1\3\2\2\2D\u03e3\3\2\2\2F\u03e5\3\2\2\2HK\5\60\31\2IK\5.\30\2JH\3"+
		"\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7"+
		"\2\2\3P\3\3\2\2\2QR\t\2\2\2R\5\3\2\2\2SV\5\"\22\2TU\7F\2\2UW\7G\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WX\3\2\2\2X]\7Q\2\2YZ\7K\2\2Z\\\7Q\2\2[Y\3\2\2\2\\_"+
		"\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2`a\7F\2\2ac\7G\2\2b`\3"+
		"\2\2\2bc\3\2\2\2c\7\3\2\2\2df\5\4\3\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi"+
		"\7\"\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\62\32\2kt\7B\2\2lq\5\6\4\2"+
		"mn\7\3\2\2np\5\6\4\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uv\3\2\2\2v\u0080\7C\2\2wx\7)\2\2x}\7Q\2"+
		"\2yz\7\3\2\2z|\7Q\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\u0080w\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\5\24\13\2\u0083\t\3\2\2\2\u0084\u0086\5\4\3\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\t\3"+
		"\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u008c\7\60\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u0090\5\"\22\2\u008e\u0090\7#\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\5@!\2\u0092\u0093\7)\2"+
		"\2\u0093\u0095\7Q\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u009f\7B\2\2\u0097\u009c\5\6\4\2\u0098\u0099\7\3\2\2\u0099"+
		"\u009b\5\6\4\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\7C"+
		"\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a8\7Q\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a7"+
		"\7Q\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a2\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\u00b0"+
		"\7K\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b6\3\2\2\2\u00b1"+
		"\u00b2\5\62\32\2\u00b2\u00b3\7K\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bf\5@!\2\u00ba\u00bc\7H\2"+
		"\2\u00bb\u00bd\5\"\22\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\7I\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00ca\t\4\2\2\u00c2\u00c7\5\16\b\2\u00c3"+
		"\u00c4\7\3\2\2\u00c4\u00c6\5\16\b\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\t\5\2\2\u00cd\r\3\2\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00f0\3\2\2\2\u00d1\u00d3\7.\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\5\f"+
		"\7\2\u00d5\u00d6\7K\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00f1\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00f1\7*\2\2\u00dd\u00f1\7R\2\2\u00de\u00df"+
		"\7Q\2\2\u00df\u00e1\7K\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\7*"+
		"\2\2\u00e5\u00e7\7K\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\7Q\2\2\u00e9\u00ea\7K\2"+
		"\2\u00ea\u00ec\7\35\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f1\3\2\2\2\u00ed\u00f1\7U\2\2\u00ee\u00f1\7,\2\2\u00ef\u00f1\7-\2"+
		"\2\u00f0\u00d2\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00e6"+
		"\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u0108\3\2\2\2\u00f2\u0104\5F$\2\u00f3\u0105\7R\2\2\u00f4\u00f5\7*\2\2"+
		"\u00f5\u00f7\7K\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u0105\7Q\2\2\u00f9\u0105\7U\2\2\u00fa\u0105\7,\2\2\u00fb"+
		"\u0105\7-\2\2\u00fc\u0101\5\f\7\2\u00fd\u00fe\7K\2\2\u00fe\u0100\5\f\7"+
		"\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00f3\3\2\2\2\u0104"+
		"\u00f6\3\2\2\2\u0104\u00f9\3\2\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2"+
		"\2\2\u0104\u00fc\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00f2\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\17\3\2\2"+
		"\2\u010a\u0108\3\2\2\2\u010b\u010c\7B\2\2\u010c\u0111\7Q\2\2\u010d\u010e"+
		"\7K\2\2\u010e\u0110\7Q\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\5B\"\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\7C\2\2\u0118\21\3\2\2\2\u0119\u0123\5\n\6\2"+
		"\u011a\u011e\7D\2\2\u011b\u011d\5$\23\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0124\7E\2\2\u0122\u0124\7J\2\2\u0123\u011a\3\2\2"+
		"\2\u0123\u0122\3\2\2\2\u0124\23\3\2\2\2\u0125\u0129\7D\2\2\u0126\u0128"+
		"\5$\23\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7E"+
		"\2\2\u012d\25\3\2\2\2\u012e\u0130\7+\2\2\u012f\u012e\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0134\3\2\2\2\u0131\u0133\7B\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7*\2\2\u0138\u013a\7K\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u014c\3\2\2\2\u013b\u013d\5\"\22\2"+
		"\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143"+
		"\7Q\2\2\u013f\u0140\7K\2\2\u0140\u0142\7Q\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7F\2\2\u0147\u0148\7Q\2\2\u0148\u014a"+
		"\7G\2\2\u0149\u0146\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\7\4\2\2\u014c\u013c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u018e\3\2"+
		"\2\2\u014e\u018f\7R\2\2\u014f\u0151\5\"\22\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0155\7K\2"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015b"+
		"\7Q\2\2\u0157\u0158\7K\2\2\u0158\u015a\7Q\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u0160\t\6\2\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u018f\3\2\2\2\u0161\u018f\7,\2\2\u0162\u018f\7-\2"+
		"\2\u0163\u018f\7+\2\2\u0164\u0166\7B\2\2\u0165\u0164\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016c\5\20\t\2\u016b\u016a\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7P\2\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0178\3\2\2\2\u0170\u0175\7Q\2\2\u0171\u0172\7K\2"+
		"\2\u0172\u0174\7Q\2\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0170\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\3\2\2\2\u017a\u017c\7C"+
		"\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7K"+
		"\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0185\7.\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u018b\5\f\7\2\u0187\u0188\7K\2\2\u0188\u018a\5\f\7\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u014e\3\2\2\2\u018e"+
		"\u0150\3\2\2\2\u018e\u0161\3\2\2\2\u018e\u0162\3\2\2\2\u018e\u0163\3\2"+
		"\2\2\u018e\u0167\3\2\2\2\u018f\u0193\3\2\2\2\u0190\u0192\7C\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0199\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\7B\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u01d3\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01d0\7K\2\2\u019d"+
		"\u01d0\7Q\2\2\u019e\u01d0\7R\2\2\u019f\u01a1\5F$\2\u01a0\u019f\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\7\4\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a6\7B\2\2\u01a6"+
		"\u01a7\7Q\2\2\u01a7\u01a9\7C\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a9\3\2\2"+
		"\2\u01a9\u01ad\3\2\2\2\u01aa\u01ac\7B\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b2\7.\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01cd\3\2\2\2\u01b3\u01b8\5\f\7\2\u01b4\u01b5\7K\2\2\u01b5"+
		"\u01b7\5\f\7\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bd\5F$\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c6\3\2\2"+
		"\2\u01be\u01c3\5\f\7\2\u01bf\u01c0\7K\2\2\u01c0\u01c2\5\f\7\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01ce\3\2\2\2\u01c8\u01ca\7U\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01b3\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u019c\3\2\2\2\u01cf\u019d\3\2\2\2\u01cf\u019e\3\2\2\2\u01cf\u01a0\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2"+
		"\2\2\u01d5\u01d7\5F$\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u012f\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01df\3\2\2\2\u01dc\u01de\7C\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\27\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\7B\2\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u01e7\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u0259"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\7\7\2\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\7B\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u0206\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f6\5\f\7\2\u01f2\u01f3\7K"+
		"\2\2\u01f3\u01f5\5\f\7\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0207\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fa\7*\2\2\u01fa\u01fc\7K\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0202\7Q\2\2\u01fe\u01ff\7K\2\2\u01ff"+
		"\u0201\7Q\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0207\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0207\7U\2\2\u0206\u01f1\3\2\2\2\u0206\u01fb\3\2\2\2\u0206\u0205\3\2"+
		"\2\2\u0207\u020b\3\2\2\2\u0208\u020a\7C\2\2\u0209\u0208\3\2\2\2\u020a"+
		"\u020d\3\2\2\2\u020b\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020e\u0210\5D#\2\u020f\u020e\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0214\3\2\2\2\u0211\u0213\7B\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0218\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u0219\7\7\2\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021d\3\2\2\2\u021a\u021c\7B\2\2\u021b\u021a\3\2"+
		"\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5F$\2\u0221\u0220\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0254\3\2\2\2\u0223\u0225\5F$\2\u0224\u0223"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0250\3\2\2\2\u0226\u0251\7\63\2\2"+
		"\u0227\u0251\7T\2\2\u0228\u0251\7U\2\2\u0229\u022e\7Q\2\2\u022a\u022b"+
		"\7K\2\2\u022b\u022d\7Q\2\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0251\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\7Q\2\2\u0232\u0234\7K\2\2\u0233\u0231\3\2\2\2\u0234\u0237"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0238\u0247\5\f\7\2\u0239\u0243\7K\2\2\u023a\u0244\5\f"+
		"\7\2\u023b\u0240\7Q\2\2\u023c\u023d\7K\2\2\u023d\u023f\7Q\2\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u023a\3\2\2\2\u0243\u023b\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0239\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024d\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024c\7C\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2"+
		"\2\2\u0250\u0226\3\2\2\2\u0250\u0227\3\2\2\2\u0250\u0228\3\2\2\2\u0250"+
		"\u0229\3\2\2\2\u0250\u0235\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0224\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u025a\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025a\7,\2\2\u0258\u025a\7-\2"+
		"\2\u0259\u01e9\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a\u025e"+
		"\3\2\2\2\u025b\u025d\7C\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0261\u0263\5D#\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265"+
		"\3\2\2\2\u0264\u01e5\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u026b\3\2\2\2\u0268\u026a\7C\2\2\u0269\u0268\3\2"+
		"\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\31\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\61\2\2\u026f\u0272\5\30"+
		"\r\2\u0270\u0273\5\24\13\2\u0271\u0273\5$\23\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u027a\3\2\2\2\u0274\u0278\7\62\2\2\u0275\u0279\5"+
		"\32\16\2\u0276\u0279\5\24\13\2\u0277\u0279\5$\23\2\u0278\u0275\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0274"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\33\3\2\2\2\u027c\u027d\5\"\22\2\u027d"+
		"\u027f\7Q\2\2\u027e\u0280\5\36\20\2\u027f\u027e\3\2\2\2\u027f\u0280\3"+
		"\2\2\2\u0280\u0288\3\2\2\2\u0281\u0282\7\3\2\2\u0282\u0284\7Q\2\2\u0283"+
		"\u0285\5\36\20\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3"+
		"\2\2\2\u0286\u0281\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\35\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028d\7\4\2"+
		"\2\u028c\u028e\7D\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0293"+
		"\3\2\2\2\u028f\u0294\5\26\f\2\u0290\u0294\7R\2\2\u0291\u0294\7U\2\2\u0292"+
		"\u0294\7\63\2\2\u0293\u028f\3\2\2\2\u0293\u0290\3\2\2\2\u0293\u0291\3"+
		"\2\2\2\u0293\u0292\3\2\2\2\u0294\u029f\3\2\2\2\u0295\u029b\7\3\2\2\u0296"+
		"\u029c\5\26\f\2\u0297\u029c\7R\2\2\u0298\u029c\7T\2\2\u0299\u029c\7U\2"+
		"\2\u029a\u029c\7\63\2\2\u029b\u0296\3\2\2\2\u029b\u0297\3\2\2\2\u029b"+
		"\u0298\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u029e\3\2"+
		"\2\2\u029d\u0295\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a4\7E"+
		"\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\37\3\2\2\2\u02a5\u02a7"+
		"\5\4\3\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02aa\7\"\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2"+
		"\2\2\u02ab\u02ad\7\60\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02af\5\34\17\2\u02af\u02b0\7J\2\2\u02b0!\3\2\2\2"+
		"\u02b1\u02c8\7;\2\2\u02b2\u02c8\7<\2\2\u02b3\u02c8\7=\2\2\u02b4\u02c8"+
		"\7>\2\2\u02b5\u02c8\7?\2\2\u02b6\u02c8\7@\2\2\u02b7\u02c8\7A\2\2\u02b8"+
		"\u02bd\7Q\2\2\u02b9\u02ba\7K\2\2\u02ba\u02bc\7Q\2\2\u02bb\u02b9\3\2\2"+
		"\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c1"+
		"\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c2\5B\"\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c8\3\2\2\2\u02c3\u02c5\5B\"\2\u02c4\u02c6\7Q\2"+
		"\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02b1"+
		"\3\2\2\2\u02c7\u02b2\3\2\2\2\u02c7\u02b3\3\2\2\2\u02c7\u02b4\3\2\2\2\u02c7"+
		"\u02b5\3\2\2\2\u02c7\u02b6\3\2\2\2\u02c7\u02b7\3\2\2\2\u02c7\u02b8\3\2"+
		"\2\2\u02c7\u02c3\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02ca\7F\2\2\u02ca"+
		"\u02cc\7G\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc#\3\2\2\2\u02cd"+
		"\u02e3\5\32\16\2\u02ce\u02e3\58\35\2\u02cf\u02e3\5:\36\2\u02d0\u02d1\5"+
		"\26\f\2\u02d1\u02d2\7J\2\2\u02d2\u02e3\3\2\2\2\u02d3\u02e3\5&\24\2\u02d4"+
		"\u02e3\5(\25\2\u02d5\u02e3\5,\27\2\u02d6\u02e3\5*\26\2\u02d7\u02dc\5\f"+
		"\7\2\u02d8\u02d9\7K\2\2\u02d9\u02db\5\f\7\2\u02da\u02d8\3\2\2\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7J\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02e3\5\24\13\2\u02e2\u02cd\3\2\2\2\u02e2\u02ce\3\2\2\2\u02e2\u02cf\3"+
		"\2\2\2\u02e2\u02d0\3\2\2\2\u02e2\u02d3\3\2\2\2\u02e2\u02d4\3\2\2\2\u02e2"+
		"\u02d5\3\2\2\2\u02e2\u02d6\3\2\2\2\u02e2\u02d7\3\2\2\2\u02e2\u02e1\3\2"+
		"\2\2\u02e3%\3\2\2\2\u02e4\u02e5\78\2\2\u02e5\u02e7\7B\2\2\u02e6\u02e8"+
		"\5\26\f\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2"+
		"\u02e9\u02ea\7J\2\2\u02ea\u02eb\5\30\r\2\u02eb\u02ec\7J\2\2\u02ec\u02ed"+
		"\5\26\f\2\u02ed\u02ee\7C\2\2\u02ee\u02f2\7D\2\2\u02ef\u02f1\5$\23\2\u02f0"+
		"\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f6\7E\2\2\u02f6"+
		"\u02fb\3\2\2\2\u02f7\u02f8\5\26\f\2\u02f8\u02f9\7J\2\2\u02f9\u02fb\3\2"+
		"\2\2\u02fa\u02e4\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fb\'\3\2\2\2\u02fc\u02fd"+
		"\78\2\2\u02fd\u02fe\7B\2\2\u02fe\u02ff\5\34\17\2\u02ff\u0310\7\b\2\2\u0300"+
		"\u0305\5\f\7\2\u0301\u0302\7K\2\2\u0302\u0304\5\f\7\2\u0303\u0301\3\2"+
		"\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0311\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u030d\7Q\2\2\u0309\u030a\7K\2"+
		"\2\u030a\u030c\7Q\2\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0300\3\2\2\2\u0310\u0308\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u031f\7C"+
		"\2\2\u0313\u0320\7J\2\2\u0314\u0318\7D\2\2\u0315\u0317\5$\23\2\u0316\u0315"+
		"\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u0320\7E\2\2\u031c\u031d\5\26"+
		"\f\2\u031d\u031e\7J\2\2\u031e\u0320\3\2\2\2\u031f\u0313\3\2\2\2\u031f"+
		"\u0314\3\2\2\2\u031f\u031c\3\2\2\2\u0320)\3\2\2\2\u0321\u0322\79\2\2\u0322"+
		"\u0323\7B\2\2\u0323\u0324\5\30\r\2\u0324\u0331\7C\2\2\u0325\u0332\7J\2"+
		"\2\u0326\u032a\7D\2\2\u0327\u0329\5$\23\2\u0328\u0327\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u0332\7E\2\2\u032e\u032f\5\26\f\2\u032f\u0330\7J"+
		"\2\2\u0330\u0332\3\2\2\2\u0331\u0325\3\2\2\2\u0331\u0326\3\2\2\2\u0331"+
		"\u032e\3\2\2\2\u0332+\3\2\2\2\u0333\u0334\7:\2\2\u0334\u0335\5\24\13\2"+
		"\u0335\u0336\79\2\2\u0336\u0337\7B\2\2\u0337\u0338\5\30\r\2\u0338\u0339"+
		"\7C\2\2\u0339\u033a\7J\2\2\u033a-\3\2\2\2\u033b\u033d\5\4\3\2\u033c\u033b"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\7!\2\2\u033f"+
		"\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u0343\7\""+
		"\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344"+
		"\u0346\7\60\2\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3"+
		"\2\2\2\u0347\u0348\7\35\2\2\u0348\u034b\5\62\32\2\u0349\u034a\7%\2\2\u034a"+
		"\u034c\5\62\32\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0356\3"+
		"\2\2\2\u034d\u034e\7$\2\2\u034e\u0353\5\64\33\2\u034f\u0350\7\3\2\2\u0350"+
		"\u0352\5\64\33\2\u0351\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3"+
		"\2\2\2\u0353\u0354\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0356"+
		"\u034d\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0360\7D"+
		"\2\2\u0359\u035f\5\66\34\2\u035a\u035f\5\b\5\2\u035b\u035f\5\22\n\2\u035c"+
		"\u035f\5 \21\2\u035d\u035f\5.\30\2\u035e\u0359\3\2\2\2\u035e\u035a\3\2"+
		"\2\2\u035e\u035b\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f"+
		"\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0363\u0364\7E\2\2\u0364/\3\2\2\2\u0365\u0367"+
		"\5\4\3\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\7&\2\2\u0369\u036c\5\64\33\2\u036a\u036b\7%\2\2\u036b\u036d\5\62"+
		"\32\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u0374\7D\2\2\u036f\u0370\5\n\6\2\u0370\u0371\7J\2\2\u0371\u0373\3\2\2"+
		"\2\u0372\u036f\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7E\2\2\u0378"+
		"\61\3\2\2\2\u0379\u037b\7Q\2\2\u037a\u037c\5B\"\2\u037b\u037a\3\2\2\2"+
		"\u037b\u037c\3\2\2\2\u037c\63\3\2\2\2\u037d\u037f\7Q\2\2\u037e\u0380\5"+
		"B\"\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\65\3\2\2\2\u0381\u0382"+
		"\7\"\2\2\u0382\u0387\7D\2\2\u0383\u0386\5 \21\2\u0384\u0386\5$\23\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a"+
		"\u038b\7E\2\2\u038b\67\3\2\2\2\u038c\u038d\7\65\2\2\u038d\u039c\5\24\13"+
		"\2\u038e\u038f\7\66\2\2\u038f\u0390\7B\2\2\u0390\u0395\5\"\22\2\u0391"+
		"\u0392\7\t\2\2\u0392\u0394\5\"\22\2\u0393\u0391\3\2\2\2\u0394\u0397\3"+
		"\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0398\u0399\7Q\2\2\u0399\u039a\7C\2\2\u039a\u039b\5\24"+
		"\13\2\u039b\u039d\3\2\2\2\u039c\u038e\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a1\7\67"+
		"\2\2\u03a1\u03a3\5\24\13\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"9\3\2\2\2\u03a4\u03a5\7L\2\2\u03a5\u03a6\7B\2\2\u03a6\u03a7\5\26\f\2\u03a7"+
		"\u03a8\7C\2\2\u03a8\u03a9\5<\37\2\u03a9;\3\2\2\2\u03aa\u03ae\7D\2\2\u03ab"+
		"\u03ad\5> \2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2"+
		"\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2"+
		"\7E\2\2\u03b2=\3\2\2\2\u03b3\u03c3\7N\2\2\u03b4\u03c0\7M\2\2\u03b5\u03b6"+
		"\7Q\2\2\u03b6\u03b8\7K\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bc\u03c1\7Q\2\2\u03bd\u03c1\7R\2\2\u03be\u03c1\7U\2\2\u03bf\u03c1"+
		"\7T\2\2\u03c0\u03b9\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03b3\3\2\2\2\u03c2\u03b4\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c8\7\b\2\2\u03c5\u03c7\5$\23\2\u03c6"+
		"\u03c5\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c9\u03cd\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc\7O\2\2\u03cc"+
		"\u03ce\7J\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce?\3\2\2\2\u03cf"+
		"\u03d0\t\7\2\2\u03d0A\3\2\2\2\u03d1\u03d4\7H\2\2\u03d2\u03d3\7\n\2\2\u03d3"+
		"\u03d5\7%\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d8\3\2"+
		"\2\2\u03d6\u03d9\7Q\2\2\u03d7\u03d9\5\"\22\2\u03d8\u03d6\3\2\2\2\u03d8"+
		"\u03d7\3\2\2\2\u03d9\u03de\3\2\2\2\u03da\u03db\7K\2\2\u03db\u03dd\7Q\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7I\2\2\u03e2"+
		"C\3\2\2\2\u03e3\u03e4\t\b\2\2\u03e4E\3\2\2\2\u03e5\u03e6\t\t\2\2\u03e6"+
		"G\3\2\2\2\u00aaJLV]behqt}\u0080\u0085\u0088\u008b\u008f\u0094\u009c\u009f"+
		"\u00a8\u00ab\u00af\u00b6\u00bc\u00bf\u00c7\u00ca\u00cf\u00d2\u00d9\u00e2"+
		"\u00e6\u00eb\u00f0\u00f6\u0101\u0104\u0108\u0111\u0115\u011e\u0123\u0129"+
		"\u012f\u0134\u0139\u013c\u0143\u0149\u014c\u0150\u0154\u015b\u015f\u0167"+
		"\u016b\u016e\u0175\u0178\u017d\u0181\u0184\u018b\u018e\u0193\u0199\u01a0"+
		"\u01a3\u01a8\u01ad\u01b1\u01b8\u01bc\u01c3\u01c6\u01cb\u01cd\u01cf\u01d1"+
		"\u01d3\u01d6\u01da\u01df\u01e5\u01e9\u01ee\u01f6\u01fb\u0202\u0206\u020b"+
		"\u020f\u0214\u0218\u021d\u0221\u0224\u022e\u0235\u0240\u0243\u0247\u024d"+
		"\u0250\u0254\u0259\u025e\u0262\u0266\u026b\u0272\u0278\u027a\u027f\u0284"+
		"\u0288\u028d\u0293\u029b\u029f\u02a3\u02a6\u02a9\u02ac\u02bd\u02c1\u02c5"+
		"\u02c7\u02cb\u02dc\u02e2\u02e7\u02f2\u02fa\u0305\u030d\u0310\u0318\u031f"+
		"\u032a\u0331\u033c\u033f\u0342\u0345\u034b\u0353\u0356\u035e\u0360\u0366"+
		"\u036c\u0374\u037b\u037f\u0385\u0387\u0395\u039e\u03a2\u03ae\u03b9\u03c0"+
		"\u03c2\u03c8\u03cd\u03d4\u03d8\u03de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}