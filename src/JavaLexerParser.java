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
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (NULL - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
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
		public List<TerminalNode> NULL() { return getTokens(JavaLexerParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(JavaLexerParser.NULL, i);
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
			setState(474); 
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
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
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
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(336);
							cast();
							}
						}

						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THIS) {
							{
							setState(339);
							match(THIS);
							setState(340);
							match(DOT);
							}
						}

						setState(343);
						match(IDENTIFIER);
						setState(348);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(344);
								match(DOT);
								setState(345);
								match(IDENTIFIER);
								}
								} 
							}
							setState(350);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
						}
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2 || _la==T__3) {
							{
							setState(351);
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
						setState(354);
						match(TRUE);
						}
						break;
					case 4:
						{
						setState(355);
						match(FALSE);
						}
						break;
					case 5:
						{
						setState(356);
						match(NULL);
						}
						break;
					case 6:
						{
						setState(357);
						match(RETURN);
						}
						break;
					case 7:
						{
						setState(361);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(358);
								match(LBRACK);
								}
								} 
							}
							setState(363);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(365);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(364);
							cast();
							}
						}

						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THROW) {
							{
							setState(367);
							match(THROW);
							}
						}

						setState(378);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(370);
							match(IDENTIFIER);
							setState(375);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(371);
									match(DOT);
									setState(372);
									match(IDENTIFIER);
									}
									} 
								}
								setState(377);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							}
							}
							break;
						}
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RBRACK) {
							{
							{
							setState(380);
							match(RBRACK);
							}
							}
							setState(385);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOT) {
							{
							setState(386);
							match(DOT);
							}
						}

						setState(390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEW) {
							{
							setState(389);
							match(NEW);
							}
						}

						setState(392);
						method_call();
						setState(397);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(393);
								match(DOT);
								setState(394);
								method_call();
								}
								} 
							}
							setState(399);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						}
						}
						break;
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(402);
							match(RBRACK);
							}
							} 
						}
						setState(407);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(408);
							match(LBRACK);
							}
							} 
						}
						setState(413);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					}
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(465); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								setState(465);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
								case 1:
									{
									setState(414);
									match(DOT);
									}
									break;
								case 2:
									{
									setState(415);
									match(IDENTIFIER);
									}
									break;
								case 3:
									{
									setState(416);
									match(STRING_CONST);
									}
									break;
								case 4:
									{
									{
									setState(418);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
										{
										setState(417);
										math_op();
										}
									}

									setState(421);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==T__1) {
										{
										setState(420);
										match(T__1);
										}
									}

									setState(426);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
									case 1:
										{
										setState(423);
										match(LBRACK);
										setState(424);
										match(IDENTIFIER);
										setState(425);
										match(RBRACK);
										}
										break;
									}
									}
									setState(431);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la==LBRACK) {
										{
										{
										setState(428);
										match(LBRACK);
										}
										}
										setState(433);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									setState(435);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NEW) {
										{
										setState(434);
										match(NEW);
										}
									}

									setState(463);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case THIS:
									case STRING:
									case IDENTIFIER:
										{
										setState(437);
										method_call();
										setState(442);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
										while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
											if ( _alt==1 ) {
												{
												{
												setState(438);
												match(DOT);
												setState(439);
												method_call();
												}
												} 
											}
											setState(444);
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
										}
										setState(446);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
										case 1:
											{
											setState(445);
											math_op();
											}
											break;
										}
										setState(456);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
										case 1:
											{
											setState(448);
											method_call();
											setState(453);
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
											while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
												if ( _alt==1 ) {
													{
													{
													setState(449);
													match(DOT);
													setState(450);
													method_call();
													}
													} 
												}
												setState(455);
												_errHandler.sync(this);
												_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
											}
											}
											break;
										}
										}
										break;
									case Digits:
										{
										setState(459); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(458);
												match(Digits);
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(461); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
							setState(467); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
						{
						setState(471);
						math_op();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(476); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(RBRACK);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		public List<TerminalNode> HexDigits() { return getTokens(JavaLexerParser.HexDigits); }
		public TerminalNode HexDigits(int i) {
			return getToken(JavaLexerParser.HexDigits, i);
		}
		public List<TerminalNode> NULL() { return getTokens(JavaLexerParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(JavaLexerParser.NULL, i);
		}
		public List<TerminalNode> THIS() { return getTokens(JavaLexerParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(JavaLexerParser.THIS, i);
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
			setState(619); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(484);
							match(LBRACK);
							}
							} 
						}
						setState(489);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					}
					setState(608);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						{
						setState(491);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__4) {
							{
							setState(490);
							match(T__4);
							}
						}

						setState(496);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(493);
								match(LBRACK);
								}
								} 
							}
							setState(498);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
						}
						setState(525);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(499);
							method_call();
							setState(504);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(500);
									match(DOT);
									setState(501);
									method_call();
									}
									} 
								}
								setState(506);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
							}
							}
							break;
						case 2:
							{
							setState(509);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==THIS) {
								{
								setState(507);
								match(THIS);
								setState(508);
								match(DOT);
								}
							}

							setState(511);
							match(IDENTIFIER);
							setState(516);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(512);
									match(DOT);
									setState(513);
									match(IDENTIFIER);
									}
									} 
								}
								setState(518);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
							}
							}
							break;
						case 3:
							{
							setState(519);
							match(Digits);
							}
							break;
						case 4:
							{
							setState(520);
							match(HexDigits);
							}
							break;
						case 5:
							{
							setState(521);
							match(NULL);
							}
							break;
						case 6:
							{
							setState(522);
							match(TRUE);
							}
							break;
						case 7:
							{
							setState(523);
							match(FALSE);
							}
							break;
						case 8:
							{
							setState(524);
							match(THIS);
							}
							break;
						}
						setState(530);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(527);
								match(RBRACK);
								}
								} 
							}
							setState(532);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						}
						setState(534);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(533);
							comp_op();
							}
							break;
						}
						setState(539);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
							_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
						}
						setState(543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
						case 1:
							{
							setState(542);
							match(T__4);
							}
							break;
						}
						setState(548);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(545);
								match(LBRACK);
								}
								} 
							}
							setState(550);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
						}
						setState(552);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(551);
							math_op();
							}
							break;
						}
						setState(603);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(555);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
									{
									setState(554);
									math_op();
									}
								}

								setState(599);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
								case 1:
									{
									setState(557);
									match(NULL);
									}
									break;
								case 2:
									{
									setState(558);
									match(HexDigits);
									}
									break;
								case 3:
									{
									setState(559);
									match(Digits);
									}
									break;
								case 4:
									{
									setState(560);
									match(IDENTIFIER);
									setState(565);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(561);
											match(DOT);
											setState(562);
											match(IDENTIFIER);
											}
											} 
										}
										setState(567);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
									}
									}
									break;
								case 5:
									{
									setState(572);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(568);
											match(IDENTIFIER);
											setState(569);
											match(DOT);
											}
											} 
										}
										setState(574);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
									}
									setState(575);
									method_call();
									setState(590);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(576);
											match(DOT);
											setState(586);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
											case 1:
												{
												setState(577);
												method_call();
												}
												break;
											case 2:
												{
												setState(578);
												match(IDENTIFIER);
												setState(583);
												_errHandler.sync(this);
												_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
												while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
													if ( _alt==1 ) {
														{
														{
														setState(579);
														match(DOT);
														setState(580);
														match(IDENTIFIER);
														}
														} 
													}
													setState(585);
													_errHandler.sync(this);
													_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
												}
												}
												break;
											}
											}
											} 
										}
										setState(592);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
									}
									setState(596);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(593);
											match(RBRACK);
											}
											} 
										}
										setState(598);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
									}
									}
									break;
								}
								}
								} 
							}
							setState(605);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						}
						}
						}
						break;
					case 2:
						{
						setState(606);
						match(TRUE);
						}
						break;
					case 3:
						{
						setState(607);
						match(FALSE);
						}
						break;
					}
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(610);
							match(RBRACK);
							}
							} 
						}
						setState(615);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(616);
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
				setState(621); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					match(RBRACK);
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
			setState(629);
			match(IF);
			setState(630);
			condition();
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(631);
				scope();
				}
				break;
			case 2:
				{
				setState(632);
				scope_body();
				}
				break;
			}
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(635);
				match(ELSE);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(636);
					if_cond();
					}
					break;
				case 2:
					{
					setState(637);
					scope();
					}
					break;
				case 3:
					{
					setState(638);
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
			setState(643);
			datatype();
			setState(644);
			match(IDENTIFIER);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(645);
				var_assign();
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(648);
				match(T__0);
				setState(649);
				match(IDENTIFIER);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(650);
					var_assign();
					}
				}

				}
				}
				setState(657);
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
			setState(658);
			match(T__1);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCBRACK) {
				{
				setState(659);
				match(LCBRACK);
				}
			}

			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(662);
				expression();
				}
				break;
			case 2:
				{
				setState(663);
				match(STRING_CONST);
				}
				break;
			case 3:
				{
				setState(664);
				match(Digits);
				}
				break;
			case 4:
				{
				setState(665);
				match(NULL);
				}
				break;
			}
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					match(T__0);
					setState(674);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(669);
						expression();
						}
						break;
					case 2:
						{
						setState(670);
						match(STRING_CONST);
						}
						break;
					case 3:
						{
						setState(671);
						match(HexDigits);
						}
						break;
					case 4:
						{
						setState(672);
						match(Digits);
						}
						break;
					case 5:
						{
						setState(673);
						match(NULL);
						}
						break;
					}
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RCBRACK) {
				{
				setState(681);
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
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(684);
				accessmod();
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(687);
				match(STATIC);
				}
			}

			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(690);
				match(FINAL);
				}
			}

			setState(693);
			variable_def();
			setState(694);
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
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(696);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				{
				setState(697);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(698);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(699);
				match(STRING);
				}
				break;
			case LONG:
				{
				setState(700);
				match(LONG);
				}
				break;
			case SHORT:
				{
				setState(701);
				match(SHORT);
				}
				break;
			case BYTE:
				{
				setState(702);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				{
				setState(703);
				match(IDENTIFIER);
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(704);
						match(DOT);
						setState(705);
						match(IDENTIFIER);
						}
						} 
					}
					setState(710);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(711);
					generic_type_name();
					}
				}

				}
				break;
			case LPBRACK:
				{
				setState(714);
				generic_type_name();
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(715);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(720);
				match(LSQBRACK);
				setState(721);
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
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				try_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				switch_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				expression();
				setState(728);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(731);
				for_each_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(732);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(733);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(734);
				method_call();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(735);
					match(DOT);
					setState(736);
					method_call();
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(744);
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
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(FOR);
				setState(748);
				match(LBRACK);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (NULL - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					setState(749);
					expression();
					}
				}

				setState(752);
				match(SEMICOLON);
				setState(753);
				condition();
				setState(754);
				match(SEMICOLON);
				setState(755);
				expression();
				setState(756);
				match(RBRACK);
				{
				setState(757);
				match(LCBRACK);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (NULL - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(758);
					scope_body();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(764);
				match(RCBRACK);
				}
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case NULL:
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
				setState(766);
				expression();
				setState(767);
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
		public TerminalNode THIS() { return getToken(JavaLexerParser.THIS, 0); }
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
			setState(771);
			match(FOR);
			setState(772);
			match(LBRACK);
			setState(773);
			variable_def();
			setState(774);
			match(T__5);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(775);
				method_call();
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(776);
					match(DOT);
					setState(777);
					method_call();
					}
					}
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(783);
					match(THIS);
					setState(784);
					match(DOT);
					}
				}

				setState(787);
				match(IDENTIFIER);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(788);
					match(DOT);
					setState(789);
					match(IDENTIFIER);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(797);
			match(RBRACK);
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(798);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(799);
				match(LCBRACK);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (NULL - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(800);
					scope_body();
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(RCBRACK);
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case NULL:
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
				setState(807);
				expression();
				setState(808);
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
			setState(812);
			match(WHILE);
			setState(813);
			match(LBRACK);
			setState(814);
			condition();
			setState(815);
			match(RBRACK);
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(816);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(817);
				match(LCBRACK);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (THIS - 40)) | (1L << (RETURN - 40)) | (1L << (TRUE - 40)) | (1L << (FALSE - 40)) | (1L << (NEW - 40)) | (1L << (IF - 40)) | (1L << (NULL - 40)) | (1L << (TRY - 40)) | (1L << (FOR - 40)) | (1L << (WHILE - 40)) | (1L << (DO - 40)) | (1L << (INTEGER - 40)) | (1L << (DOUBLE - 40)) | (1L << (FLOAT - 40)) | (1L << (STRING - 40)) | (1L << (LONG - 40)) | (1L << (SHORT - 40)) | (1L << (BYTE - 40)) | (1L << (LBRACK - 40)) | (1L << (RBRACK - 40)) | (1L << (LCBRACK - 40)) | (1L << (LPBRACK - 40)) | (1L << (DOT - 40)) | (1L << (SWITCH - 40)) | (1L << (THROW - 40)) | (1L << (IDENTIFIER - 40)) | (1L << (STRING_CONST - 40)))) != 0)) {
					{
					{
					setState(818);
					scope_body();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(824);
				match(RCBRACK);
				}
				break;
			case THIS:
			case RETURN:
			case TRUE:
			case FALSE:
			case NEW:
			case NULL:
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
				setState(825);
				expression();
				setState(826);
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
			setState(830);
			match(DO);
			setState(831);
			scope();
			setState(832);
			match(WHILE);
			setState(833);
			match(LBRACK);
			setState(834);
			condition();
			setState(835);
			match(RBRACK);
			setState(836);
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
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(838);
				accessmod();
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(841);
				match(ABSTRACT);
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(844);
				match(STATIC);
				}
			}

			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(847);
				match(FINAL);
				}
			}

			setState(850);
			match(CLASS);
			setState(851);
			class_name();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(852);
				match(EXTENDS);
				setState(853);
				class_name();
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(856);
				match(IMPLEMENTS);
				setState(857);
				interface_name();
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(858);
					match(T__0);
					setState(859);
					interface_name();
					}
					}
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(867);
			match(LCBRACK);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (CLASS - 27)) | (1L << (PUBLIC - 27)) | (1L << (PRIVATE - 27)) | (1L << (PROTECTED - 27)) | (1L << (ABSTRACT - 27)) | (1L << (STATIC - 27)) | (1L << (VOID - 27)) | (1L << (FINAL - 27)) | (1L << (INTEGER - 27)) | (1L << (DOUBLE - 27)) | (1L << (FLOAT - 27)) | (1L << (STRING - 27)) | (1L << (LONG - 27)) | (1L << (SHORT - 27)) | (1L << (BYTE - 27)) | (1L << (LPBRACK - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(868);
					static_block();
					}
					break;
				case 2:
					{
					setState(869);
					constructor();
					}
					break;
				case 3:
					{
					setState(870);
					method();
					}
					break;
				case 4:
					{
					setState(871);
					attribute();
					}
					break;
				case 5:
					{
					setState(872);
					class_def();
					}
					break;
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
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
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(880);
				accessmod();
				}
			}

			setState(883);
			match(INTERFACE);
			setState(884);
			interface_name();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(885);
				match(EXTENDS);
				setState(886);
				class_name();
				}
			}

			setState(889);
			match(LCBRACK);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (PUBLIC - 28)) | (1L << (PRIVATE - 28)) | (1L << (PROTECTED - 28)) | (1L << (ABSTRACT - 28)) | (1L << (STATIC - 28)) | (1L << (VOID - 28)) | (1L << (FINAL - 28)) | (1L << (INTEGER - 28)) | (1L << (DOUBLE - 28)) | (1L << (FLOAT - 28)) | (1L << (STRING - 28)) | (1L << (LONG - 28)) | (1L << (SHORT - 28)) | (1L << (BYTE - 28)) | (1L << (LPBRACK - 28)) | (1L << (IDENTIFIER - 28)))) != 0)) {
				{
				{
				setState(890);
				method_sig();
				setState(891);
				match(SEMICOLON);
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
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
			setState(900);
			match(IDENTIFIER);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(901);
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
			setState(904);
			match(IDENTIFIER);
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(905);
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
			setState(908);
			match(STATIC);
			setState(909);
			match(LCBRACK);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (PUBLIC - 28)) | (1L << (PRIVATE - 28)) | (1L << (PROTECTED - 28)) | (1L << (STATIC - 28)) | (1L << (THIS - 28)) | (1L << (RETURN - 28)) | (1L << (TRUE - 28)) | (1L << (FALSE - 28)) | (1L << (NEW - 28)) | (1L << (FINAL - 28)) | (1L << (IF - 28)) | (1L << (NULL - 28)) | (1L << (TRY - 28)) | (1L << (FOR - 28)) | (1L << (WHILE - 28)) | (1L << (DO - 28)) | (1L << (INTEGER - 28)) | (1L << (DOUBLE - 28)) | (1L << (FLOAT - 28)) | (1L << (STRING - 28)) | (1L << (LONG - 28)) | (1L << (SHORT - 28)) | (1L << (BYTE - 28)) | (1L << (LBRACK - 28)) | (1L << (RBRACK - 28)) | (1L << (LCBRACK - 28)) | (1L << (LPBRACK - 28)) | (1L << (DOT - 28)) | (1L << (SWITCH - 28)) | (1L << (THROW - 28)) | (1L << (IDENTIFIER - 28)) | (1L << (STRING_CONST - 28)))) != 0)) {
				{
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(910);
					attribute();
					}
					break;
				case 2:
					{
					setState(911);
					scope_body();
					}
					break;
				}
				}
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(917);
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
			setState(919);
			match(TRY);
			setState(920);
			scope();
			setState(935); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(921);
				match(CATCH);
				setState(922);
				match(LBRACK);
				setState(923);
				datatype();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(924);
					match(T__6);
					setState(925);
					datatype();
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				match(IDENTIFIER);
				setState(932);
				match(RBRACK);
				setState(933);
				scope();
				}
				}
				setState(937); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(939);
				match(FINALLY);
				setState(940);
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
			setState(943);
			match(SWITCH);
			setState(944);
			match(LBRACK);
			setState(945);
			expression();
			setState(946);
			match(RBRACK);
			setState(947);
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
			setState(949);
			match(LCBRACK);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(950);
				case_block();
				}
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
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
			setState(973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(958);
				match(DEFAULT);
				}
				break;
			case CASE:
				{
				setState(959);
				match(CASE);
				setState(971);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(964);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(960);
							match(IDENTIFIER);
							setState(961);
							match(DOT);
							}
							} 
						}
						setState(966);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
					}
					setState(967);
					match(IDENTIFIER);
					}
					break;
				case STRING_CONST:
					{
					setState(968);
					match(STRING_CONST);
					}
					break;
				case Digits:
					{
					setState(969);
					match(Digits);
					}
					break;
				case HexDigits:
					{
					setState(970);
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
			setState(975);
			match(T__5);
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(976);
					scope_body();
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(982);
				match(BREAK);
				setState(983);
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
			setState(986);
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
			setState(988);
			match(LPBRACK);
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(989);
				match(T__7);
				setState(990);
				match(EXTENDS);
				}
			}

			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(993);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(994);
				datatype();
				}
				break;
			}
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(997);
				match(DOT);
				setState(998);
				match(IDENTIFIER);
				}
				}
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1004);
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
			setState(1006);
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
			setState(1008);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u03f5\4\2\t\2\4"+
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
		"\f\3\f\5\f\u014a\n\f\3\f\5\f\u014d\n\f\3\f\3\f\5\f\u0151\n\f\3\f\5\f\u0154"+
		"\n\f\3\f\3\f\5\f\u0158\n\f\3\f\3\f\3\f\7\f\u015d\n\f\f\f\16\f\u0160\13"+
		"\f\3\f\5\f\u0163\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u016a\n\f\f\f\16\f\u016d"+
		"\13\f\3\f\5\f\u0170\n\f\3\f\5\f\u0173\n\f\3\f\3\f\3\f\7\f\u0178\n\f\f"+
		"\f\16\f\u017b\13\f\5\f\u017d\n\f\3\f\7\f\u0180\n\f\f\f\16\f\u0183\13\f"+
		"\3\f\5\f\u0186\n\f\3\f\5\f\u0189\n\f\3\f\3\f\3\f\7\f\u018e\n\f\f\f\16"+
		"\f\u0191\13\f\5\f\u0193\n\f\3\f\7\f\u0196\n\f\f\f\16\f\u0199\13\f\3\f"+
		"\7\f\u019c\n\f\f\f\16\f\u019f\13\f\3\f\3\f\3\f\3\f\5\f\u01a5\n\f\3\f\5"+
		"\f\u01a8\n\f\3\f\3\f\3\f\5\f\u01ad\n\f\3\f\7\f\u01b0\n\f\f\f\16\f\u01b3"+
		"\13\f\3\f\5\f\u01b6\n\f\3\f\3\f\3\f\7\f\u01bb\n\f\f\f\16\f\u01be\13\f"+
		"\3\f\5\f\u01c1\n\f\3\f\3\f\3\f\7\f\u01c6\n\f\f\f\16\f\u01c9\13\f\5\f\u01cb"+
		"\n\f\3\f\6\f\u01ce\n\f\r\f\16\f\u01cf\5\f\u01d2\n\f\6\f\u01d4\n\f\r\f"+
		"\16\f\u01d5\5\f\u01d8\n\f\3\f\5\f\u01db\n\f\6\f\u01dd\n\f\r\f\16\f\u01de"+
		"\3\f\7\f\u01e2\n\f\f\f\16\f\u01e5\13\f\3\r\7\r\u01e8\n\r\f\r\16\r\u01eb"+
		"\13\r\3\r\5\r\u01ee\n\r\3\r\7\r\u01f1\n\r\f\r\16\r\u01f4\13\r\3\r\3\r"+
		"\3\r\7\r\u01f9\n\r\f\r\16\r\u01fc\13\r\3\r\3\r\5\r\u0200\n\r\3\r\3\r\3"+
		"\r\7\r\u0205\n\r\f\r\16\r\u0208\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0210"+
		"\n\r\3\r\7\r\u0213\n\r\f\r\16\r\u0216\13\r\3\r\5\r\u0219\n\r\3\r\7\r\u021c"+
		"\n\r\f\r\16\r\u021f\13\r\3\r\5\r\u0222\n\r\3\r\7\r\u0225\n\r\f\r\16\r"+
		"\u0228\13\r\3\r\5\r\u022b\n\r\3\r\5\r\u022e\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0236\n\r\f\r\16\r\u0239\13\r\3\r\3\r\7\r\u023d\n\r\f\r\16\r\u0240"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0248\n\r\f\r\16\r\u024b\13\r\5\r\u024d"+
		"\n\r\7\r\u024f\n\r\f\r\16\r\u0252\13\r\3\r\7\r\u0255\n\r\f\r\16\r\u0258"+
		"\13\r\5\r\u025a\n\r\7\r\u025c\n\r\f\r\16\r\u025f\13\r\3\r\3\r\5\r\u0263"+
		"\n\r\3\r\7\r\u0266\n\r\f\r\16\r\u0269\13\r\3\r\5\r\u026c\n\r\6\r\u026e"+
		"\n\r\r\r\16\r\u026f\3\r\7\r\u0273\n\r\f\r\16\r\u0276\13\r\3\16\3\16\3"+
		"\16\3\16\5\16\u027c\n\16\3\16\3\16\3\16\3\16\5\16\u0282\n\16\5\16\u0284"+
		"\n\16\3\17\3\17\3\17\5\17\u0289\n\17\3\17\3\17\3\17\5\17\u028e\n\17\7"+
		"\17\u0290\n\17\f\17\16\17\u0293\13\17\3\20\3\20\5\20\u0297\n\20\3\20\3"+
		"\20\3\20\3\20\5\20\u029d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u02a5"+
		"\n\20\7\20\u02a7\n\20\f\20\16\20\u02aa\13\20\3\20\5\20\u02ad\n\20\3\21"+
		"\5\21\u02b0\n\21\3\21\5\21\u02b3\n\21\3\21\5\21\u02b6\n\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02c5\n\22"+
		"\f\22\16\22\u02c8\13\22\3\22\5\22\u02cb\n\22\3\22\3\22\5\22\u02cf\n\22"+
		"\5\22\u02d1\n\22\3\22\3\22\5\22\u02d5\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u02e4\n\23\f\23\16\23\u02e7"+
		"\13\23\3\23\3\23\3\23\5\23\u02ec\n\23\3\24\3\24\3\24\5\24\u02f1\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u02fa\n\24\f\24\16\24\u02fd\13"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0304\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u030d\n\25\f\25\16\25\u0310\13\25\3\25\3\25\5\25\u0314"+
		"\n\25\3\25\3\25\3\25\7\25\u0319\n\25\f\25\16\25\u031c\13\25\5\25\u031e"+
		"\n\25\3\25\3\25\3\25\3\25\7\25\u0324\n\25\f\25\16\25\u0327\13\25\3\25"+
		"\3\25\3\25\3\25\5\25\u032d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0336\n\26\f\26\16\26\u0339\13\26\3\26\3\26\3\26\3\26\5\26\u033f\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u034a\n\30\3\30\5\30"+
		"\u034d\n\30\3\30\5\30\u0350\n\30\3\30\5\30\u0353\n\30\3\30\3\30\3\30\3"+
		"\30\5\30\u0359\n\30\3\30\3\30\3\30\3\30\7\30\u035f\n\30\f\30\16\30\u0362"+
		"\13\30\5\30\u0364\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u036c\n\30\f"+
		"\30\16\30\u036f\13\30\3\30\3\30\3\31\5\31\u0374\n\31\3\31\3\31\3\31\3"+
		"\31\5\31\u037a\n\31\3\31\3\31\3\31\3\31\7\31\u0380\n\31\f\31\16\31\u0383"+
		"\13\31\3\31\3\31\3\32\3\32\5\32\u0389\n\32\3\33\3\33\5\33\u038d\n\33\3"+
		"\34\3\34\3\34\3\34\7\34\u0393\n\34\f\34\16\34\u0396\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u03a1\n\35\f\35\16\35\u03a4\13"+
		"\35\3\35\3\35\3\35\3\35\6\35\u03aa\n\35\r\35\16\35\u03ab\3\35\3\35\5\35"+
		"\u03b0\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u03ba\n\37\f"+
		"\37\16\37\u03bd\13\37\3\37\3\37\3 \3 \3 \3 \7 \u03c5\n \f \16 \u03c8\13"+
		" \3 \3 \3 \3 \5 \u03ce\n \5 \u03d0\n \3 \3 \7 \u03d4\n \f \16 \u03d7\13"+
		" \3 \3 \5 \u03db\n \3!\3!\3\"\3\"\3\"\5\"\u03e2\n\"\3\"\3\"\5\"\u03e6"+
		"\n\"\3\"\3\"\7\"\u03ea\n\"\f\"\16\"\u03ed\13\"\3\"\3\"\3#\3#\3$\3$\3$"+
		"\t\u0129\u0134\u01e9\u01f2\u0214\u0267\u03d5\2%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\n\3\2\36 \3\2!\"\4\2BB"+
		"FF\4\2CCGG\3\2\5\6\4\2>>QQ\6\2\t\t\13\23\64\64HI\5\2\t\t\17\21\24\27\2"+
		"\u04b2\2L\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\be\3\2\2\2\n\u0085\3\2\2\2\f\u00af"+
		"\3\2\2\2\16\u00cf\3\2\2\2\20\u010b\3\2\2\2\22\u0119\3\2\2\2\24\u0125\3"+
		"\2\2\2\26\u01dc\3\2\2\2\30\u026d\3\2\2\2\32\u0277\3\2\2\2\34\u0285\3\2"+
		"\2\2\36\u0294\3\2\2\2 \u02af\3\2\2\2\"\u02d0\3\2\2\2$\u02eb\3\2\2\2&\u0303"+
		"\3\2\2\2(\u0305\3\2\2\2*\u032e\3\2\2\2,\u0340\3\2\2\2.\u0349\3\2\2\2\60"+
		"\u0373\3\2\2\2\62\u0386\3\2\2\2\64\u038a\3\2\2\2\66\u038e\3\2\2\28\u0399"+
		"\3\2\2\2:\u03b1\3\2\2\2<\u03b7\3\2\2\2>\u03cf\3\2\2\2@\u03dc\3\2\2\2B"+
		"\u03de\3\2\2\2D\u03f0\3\2\2\2F\u03f2\3\2\2\2HK\5\60\31\2IK\5.\30\2JH\3"+
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
		"\u014d\7\4\2\2\u014c\u013c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0192\3\2"+
		"\2\2\u014e\u0193\7R\2\2\u014f\u0151\5\"\22\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\5\20\t\2\u0153\u0152\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7*\2\2\u0156"+
		"\u0158\7K\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015e\7Q\2\2\u015a\u015b\7K\2\2\u015b\u015d\7Q\2\2\u015c\u015a"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\t\6\2\2\u0162\u0161\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0193\3\2\2\2\u0164\u0193\7,\2\2\u0165"+
		"\u0193\7-\2\2\u0166\u0193\7\63\2\2\u0167\u0193\7+\2\2\u0168\u016a\7B\2"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5\20\t\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173"+
		"\7P\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017c\3\2\2\2\u0174"+
		"\u0179\7Q\2\2\u0175\u0176\7K\2\2\u0176\u0178\7Q\2\2\u0177\u0175\3\2\2"+
		"\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u0181\3\2\2\2\u017e\u0180\7C\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0186\7K\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u0189\7.\2\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018f\5\f\7\2\u018b\u018c\7K"+
		"\2\2\u018c\u018e\5\f\7\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u014e\3\2\2\2\u0192\u0150\3\2\2\2\u0192\u0164\3\2\2\2\u0192"+
		"\u0165\3\2\2\2\u0192\u0166\3\2\2\2\u0192\u0167\3\2\2\2\u0192\u016b\3\2"+
		"\2\2\u0193\u0197\3\2\2\2\u0194\u0196\7C\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019d\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019c\7B\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01d7\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u01d4\7K\2\2\u01a1\u01d4\7Q\2\2\u01a2\u01d4"+
		"\7R\2\2\u01a3\u01a5\5F$\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a8\7\4\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\7Q\2\2\u01ab\u01ad"+
		"\7C\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae"+
		"\u01b0\7B\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b6\7.\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01d1\3\2"+
		"\2\2\u01b7\u01bc\5\f\7\2\u01b8\u01b9\7K\2\2\u01b9\u01bb\5\f\7\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\5F$\2\u01c0\u01bf"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01ca\3\2\2\2\u01c2\u01c7\5\f\7\2\u01c3"+
		"\u01c4\7K\2\2\u01c4\u01c6\5\f\7\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d2\3\2"+
		"\2\2\u01cc\u01ce\7U\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01b7\3\2"+
		"\2\2\u01d1\u01cd\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01a0\3\2\2\2\u01d3"+
		"\u01a1\3\2\2\2\u01d3\u01a2\3\2\2\2\u01d3\u01a4\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01db\5F"+
		"$\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u012f\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e2\7C\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\27\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\7B\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u0262\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ee\7\7\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\7B\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u020f\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01fa\5\f\7\2\u01f6\u01f7\7K\2\2\u01f7"+
		"\u01f9\5\f\7\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0210\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u01fe\7*\2\2\u01fe\u0200\7K\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0206\7Q\2\2\u0202\u0203\7K\2\2\u0203\u0205"+
		"\7Q\2\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0210\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u0210\7U"+
		"\2\2\u020a\u0210\7T\2\2\u020b\u0210\7\63\2\2\u020c\u0210\7,\2\2\u020d"+
		"\u0210\7-\2\2\u020e\u0210\7*\2\2\u020f\u01f5\3\2\2\2\u020f\u01ff\3\2\2"+
		"\2\u020f\u0209\3\2\2\2\u020f\u020a\3\2\2\2\u020f\u020b\3\2\2\2\u020f\u020c"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0214\3\2\2\2\u0211"+
		"\u0213\7C\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0219\5D#\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d\3\2\2"+
		"\2\u021a\u021c\7B\2\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u0222\7\7\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0226\3\2"+
		"\2\2\u0223\u0225\7B\2\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0229\u022b\5F$\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u025d"+
		"\3\2\2\2\u022c\u022e\5F$\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0259\3\2\2\2\u022f\u025a\7\63\2\2\u0230\u025a\7T\2\2\u0231\u025a\7U"+
		"\2\2\u0232\u0237\7Q\2\2\u0233\u0234\7K\2\2\u0234\u0236\7Q\2\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u025a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7Q\2\2\u023b\u023d\7K\2"+
		"\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f"+
		"\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0250\5\f\7\2\u0242"+
		"\u024c\7K\2\2\u0243\u024d\5\f\7\2\u0244\u0249\7Q\2\2\u0245\u0246\7K\2"+
		"\2\u0246\u0248\7Q\2\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u0243\3\2\2\2\u024c\u0244\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0242\3\2"+
		"\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0256\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\7C\2\2\u0254\u0253\3\2"+
		"\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u022f\3\2\2\2\u0259\u0230\3\2"+
		"\2\2\u0259\u0231\3\2\2\2\u0259\u0232\3\2\2\2\u0259\u023e\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u022d\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0263\3\2\2\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0263\7,\2\2\u0261\u0263\7-\2\2\u0262\u01ed\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0261\3\2\2\2\u0263\u0267\3\2\2\2\u0264\u0266\7C\2\2\u0265\u0264"+
		"\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026c\5D#\2\u026b\u026a\3\2\2"+
		"\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u01e9\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0274\3\2\2\2\u0271"+
		"\u0273\7C\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\31\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278"+
		"\7\61\2\2\u0278\u027b\5\30\r\2\u0279\u027c\5\24\13\2\u027a\u027c\5$\23"+
		"\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c\u0283\3\2\2\2\u027d\u0281"+
		"\7\62\2\2\u027e\u0282\5\32\16\2\u027f\u0282\5\24\13\2\u0280\u0282\5$\23"+
		"\2\u0281\u027e\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0284"+
		"\3\2\2\2\u0283\u027d\3\2\2\2\u0283\u0284\3\2\2\2\u0284\33\3\2\2\2\u0285"+
		"\u0286\5\"\22\2\u0286\u0288\7Q\2\2\u0287\u0289\5\36\20\2\u0288\u0287\3"+
		"\2\2\2\u0288\u0289\3\2\2\2\u0289\u0291\3\2\2\2\u028a\u028b\7\3\2\2\u028b"+
		"\u028d\7Q\2\2\u028c\u028e\5\36\20\2\u028d\u028c\3\2\2\2\u028d\u028e\3"+
		"\2\2\2\u028e\u0290\3\2\2\2\u028f\u028a\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\35\3\2\2\2\u0293\u0291\3\2\2"+
		"\2\u0294\u0296\7\4\2\2\u0295\u0297\7D\2\2\u0296\u0295\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u029c\3\2\2\2\u0298\u029d\5\26\f\2\u0299\u029d\7R\2\2\u029a"+
		"\u029d\7U\2\2\u029b\u029d\7\63\2\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029d\u02a8\3\2\2\2\u029e"+
		"\u02a4\7\3\2\2\u029f\u02a5\5\26\f\2\u02a0\u02a5\7R\2\2\u02a1\u02a5\7T"+
		"\2\2\u02a2\u02a5\7U\2\2\u02a3\u02a5\7\63\2\2\u02a4\u029f\3\2\2\2\u02a4"+
		"\u02a0\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2"+
		"\2\2\u02a5\u02a7\3\2\2\2\u02a6\u029e\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ad\7E\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\37\3\2\2\2\u02ae\u02b0\5\4\3\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2"+
		"\2\u02b0\u02b2\3\2\2\2\u02b1\u02b3\7\"\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b6\7\60\2\2\u02b5\u02b4\3\2\2\2"+
		"\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\5\34\17\2\u02b8\u02b9"+
		"\7J\2\2\u02b9!\3\2\2\2\u02ba\u02d1\7;\2\2\u02bb\u02d1\7<\2\2\u02bc\u02d1"+
		"\7=\2\2\u02bd\u02d1\7>\2\2\u02be\u02d1\7?\2\2\u02bf\u02d1\7@\2\2\u02c0"+
		"\u02d1\7A\2\2\u02c1\u02c6\7Q\2\2\u02c2\u02c3\7K\2\2\u02c3\u02c5\7Q\2\2"+
		"\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\5B\"\2\u02ca"+
		"\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02d1\3\2\2\2\u02cc\u02ce\5B"+
		"\"\2\u02cd\u02cf\7Q\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02ba\3\2\2\2\u02d0\u02bb\3\2\2\2\u02d0\u02bc\3\2"+
		"\2\2\u02d0\u02bd\3\2\2\2\u02d0\u02be\3\2\2\2\u02d0\u02bf\3\2\2\2\u02d0"+
		"\u02c0\3\2\2\2\u02d0\u02c1\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1\u02d4\3\2"+
		"\2\2\u02d2\u02d3\7F\2\2\u02d3\u02d5\7G\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5#\3\2\2\2\u02d6\u02ec\5\32\16\2\u02d7\u02ec\58\35\2\u02d8"+
		"\u02ec\5:\36\2\u02d9\u02da\5\26\f\2\u02da\u02db\7J\2\2\u02db\u02ec\3\2"+
		"\2\2\u02dc\u02ec\5&\24\2\u02dd\u02ec\5(\25\2\u02de\u02ec\5,\27\2\u02df"+
		"\u02ec\5*\26\2\u02e0\u02e5\5\f\7\2\u02e1\u02e2\7K\2\2\u02e2\u02e4\5\f"+
		"\7\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\7J"+
		"\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02ec\5\24\13\2\u02eb\u02d6\3\2\2\2\u02eb"+
		"\u02d7\3\2\2\2\u02eb\u02d8\3\2\2\2\u02eb\u02d9\3\2\2\2\u02eb\u02dc\3\2"+
		"\2\2\u02eb\u02dd\3\2\2\2\u02eb\u02de\3\2\2\2\u02eb\u02df\3\2\2\2\u02eb"+
		"\u02e0\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec%\3\2\2\2\u02ed\u02ee\78\2\2\u02ee"+
		"\u02f0\7B\2\2\u02ef\u02f1\5\26\f\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7J\2\2\u02f3\u02f4\5\30\r\2\u02f4"+
		"\u02f5\7J\2\2\u02f5\u02f6\5\26\f\2\u02f6\u02f7\7C\2\2\u02f7\u02fb\7D\2"+
		"\2\u02f8\u02fa\5$\23\2\u02f9\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe"+
		"\u02ff\7E\2\2\u02ff\u0304\3\2\2\2\u0300\u0301\5\26\f\2\u0301\u0302\7J"+
		"\2\2\u0302\u0304\3\2\2\2\u0303\u02ed\3\2\2\2\u0303\u0300\3\2\2\2\u0304"+
		"\'\3\2\2\2\u0305\u0306\78\2\2\u0306\u0307\7B\2\2\u0307\u0308\5\34\17\2"+
		"\u0308\u031d\7\b\2\2\u0309\u030e\5\f\7\2\u030a\u030b\7K\2\2\u030b\u030d"+
		"\5\f\7\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u031e\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\7*"+
		"\2\2\u0312\u0314\7K\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u031a\7Q\2\2\u0316\u0317\7K\2\2\u0317\u0319\7Q\2"+
		"\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b"+
		"\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0309\3\2\2\2\u031d"+
		"\u0313\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u032c\7C\2\2\u0320\u032d\7J\2"+
		"\2\u0321\u0325\7D\2\2\u0322\u0324\5$\23\2\u0323\u0322\3\2\2\2\u0324\u0327"+
		"\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0328\u032d\7E\2\2\u0329\u032a\5\26\f\2\u032a\u032b\7J"+
		"\2\2\u032b\u032d\3\2\2\2\u032c\u0320\3\2\2\2\u032c\u0321\3\2\2\2\u032c"+
		"\u0329\3\2\2\2\u032d)\3\2\2\2\u032e\u032f\79\2\2\u032f\u0330\7B\2\2\u0330"+
		"\u0331\5\30\r\2\u0331\u033e\7C\2\2\u0332\u033f\7J\2\2\u0333\u0337\7D\2"+
		"\2\u0334\u0336\5$\23\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033f\7E\2\2\u033b\u033c\5\26\f\2\u033c\u033d\7J\2\2\u033d\u033f\3\2"+
		"\2\2\u033e\u0332\3\2\2\2\u033e\u0333\3\2\2\2\u033e\u033b\3\2\2\2\u033f"+
		"+\3\2\2\2\u0340\u0341\7:\2\2\u0341\u0342\5\24\13\2\u0342\u0343\79\2\2"+
		"\u0343\u0344\7B\2\2\u0344\u0345\5\30\r\2\u0345\u0346\7C\2\2\u0346\u0347"+
		"\7J\2\2\u0347-\3\2\2\2\u0348\u034a\5\4\3\2\u0349\u0348\3\2\2\2\u0349\u034a"+
		"\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\7!\2\2\u034c\u034b\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\7\"\2\2\u034f\u034e\3\2"+
		"\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2\2\2\u0351\u0353\7\60\2\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\7\35"+
		"\2\2\u0355\u0358\5\62\32\2\u0356\u0357\7%\2\2\u0357\u0359\5\62\32\2\u0358"+
		"\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0363\3\2\2\2\u035a\u035b\7$"+
		"\2\2\u035b\u0360\5\64\33\2\u035c\u035d\7\3\2\2\u035d\u035f\5\64\33\2\u035e"+
		"\u035c\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u035a\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036d\7D\2\2\u0366\u036c\5\66"+
		"\34\2\u0367\u036c\5\b\5\2\u0368\u036c\5\22\n\2\u0369\u036c\5 \21\2\u036a"+
		"\u036c\5.\30\2\u036b\u0366\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0368\3\2"+
		"\2\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u036d\3\2"+
		"\2\2\u0370\u0371\7E\2\2\u0371/\3\2\2\2\u0372\u0374\5\4\3\2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\7&\2\2\u0376"+
		"\u0379\5\64\33\2\u0377\u0378\7%\2\2\u0378\u037a\5\62\32\2\u0379\u0377"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0381\7D\2\2\u037c"+
		"\u037d\5\n\6\2\u037d\u037e\7J\2\2\u037e\u0380\3\2\2\2\u037f\u037c\3\2"+
		"\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\7E\2\2\u0385\61\3\2\2\2"+
		"\u0386\u0388\7Q\2\2\u0387\u0389\5B\"\2\u0388\u0387\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\63\3\2\2\2\u038a\u038c\7Q\2\2\u038b\u038d\5B\"\2\u038c"+
		"\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\65\3\2\2\2\u038e\u038f\7\"\2"+
		"\2\u038f\u0394\7D\2\2\u0390\u0393\5 \21\2\u0391\u0393\5$\23\2\u0392\u0390"+
		"\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u0398\7E"+
		"\2\2\u0398\67\3\2\2\2\u0399\u039a\7\65\2\2\u039a\u03a9\5\24\13\2\u039b"+
		"\u039c\7\66\2\2\u039c\u039d\7B\2\2\u039d\u03a2\5\"\22\2\u039e\u039f\7"+
		"\t\2\2\u039f\u03a1\5\"\22\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a5\u03a6\7Q\2\2\u03a6\u03a7\7C\2\2\u03a7\u03a8\5\24\13\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u039b\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ae\7\67\2\2\u03ae"+
		"\u03b0\5\24\13\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b09\3\2\2"+
		"\2\u03b1\u03b2\7L\2\2\u03b2\u03b3\7B\2\2\u03b3\u03b4\5\26\f\2\u03b4\u03b5"+
		"\7C\2\2\u03b5\u03b6\5<\37\2\u03b6;\3\2\2\2\u03b7\u03bb\7D\2\2\u03b8\u03ba"+
		"\5> \2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf\7E"+
		"\2\2\u03bf=\3\2\2\2\u03c0\u03d0\7N\2\2\u03c1\u03cd\7M\2\2\u03c2\u03c3"+
		"\7Q\2\2\u03c3\u03c5\7K\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c9\u03ce\7Q\2\2\u03ca\u03ce\7R\2\2\u03cb\u03ce\7U\2\2\u03cc\u03ce"+
		"\7T\2\2\u03cd\u03c6\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03cc\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c0\3\2\2\2\u03cf\u03c1\3\2"+
		"\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d5\7\b\2\2\u03d2\u03d4\5$\23\2\u03d3"+
		"\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d6\u03da\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03d9\7O\2\2\u03d9"+
		"\u03db\7J\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db?\3\2\2\2\u03dc"+
		"\u03dd\t\7\2\2\u03ddA\3\2\2\2\u03de\u03e1\7H\2\2\u03df\u03e0\7\n\2\2\u03e0"+
		"\u03e2\7%\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e5\3\2"+
		"\2\2\u03e3\u03e6\7Q\2\2\u03e4\u03e6\5\"\22\2\u03e5\u03e3\3\2\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03eb\3\2\2\2\u03e7\u03e8\7K\2\2\u03e8\u03ea\7Q\2"+
		"\2\u03e9\u03e7\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\7I\2\2\u03ef"+
		"C\3\2\2\2\u03f0\u03f1\t\b\2\2\u03f1E\3\2\2\2\u03f2\u03f3\t\t\2\2\u03f3"+
		"G\3\2\2\2\u00acJLV]behqt}\u0080\u0085\u0088\u008b\u008f\u0094\u009c\u009f"+
		"\u00a8\u00ab\u00af\u00b6\u00bc\u00bf\u00c7\u00ca\u00cf\u00d2\u00d9\u00e2"+
		"\u00e6\u00eb\u00f0\u00f6\u0101\u0104\u0108\u0111\u0115\u011e\u0123\u0129"+
		"\u012f\u0134\u0139\u013c\u0143\u0149\u014c\u0150\u0153\u0157\u015e\u0162"+
		"\u016b\u016f\u0172\u0179\u017c\u0181\u0185\u0188\u018f\u0192\u0197\u019d"+
		"\u01a4\u01a7\u01ac\u01b1\u01b5\u01bc\u01c0\u01c7\u01ca\u01cf\u01d1\u01d3"+
		"\u01d5\u01d7\u01da\u01de\u01e3\u01e9\u01ed\u01f2\u01fa\u01ff\u0206\u020f"+
		"\u0214\u0218\u021d\u0221\u0226\u022a\u022d\u0237\u023e\u0249\u024c\u0250"+
		"\u0256\u0259\u025d\u0262\u0267\u026b\u026f\u0274\u027b\u0281\u0283\u0288"+
		"\u028d\u0291\u0296\u029c\u02a4\u02a8\u02ac\u02af\u02b2\u02b5\u02c6\u02ca"+
		"\u02ce\u02d0\u02d4\u02e5\u02eb\u02f0\u02fb\u0303\u030e\u0313\u031a\u031d"+
		"\u0325\u032c\u0337\u033e\u0349\u034c\u034f\u0352\u0358\u0360\u0363\u036b"+
		"\u036d\u0373\u0379\u0381\u0388\u038c\u0392\u0394\u03a2\u03ab\u03af\u03bb"+
		"\u03c6\u03cd\u03cf\u03d5\u03da\u03e1\u03e5\u03eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}