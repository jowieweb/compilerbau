// Generated from C:/Users/Jonas/IdeaProjects/compilerbau\JavaLexer.g4 by ANTLR 4.7
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
		T__17=18, WS=19, COMMENT=20, LINE_COMMENT=21, ANNOTATION=22, IMPORTS=23, 
		STUFF=24, CLASS=25, PUBLIC=26, PRIVATE=27, PROTECTED=28, ABSTRACT=29, 
		STATIC=30, VOID=31, IMPLEMENTS=32, EXTENDS=33, INTERFACE=34, IMPORT=35, 
		ENUM=36, THROWS=37, THIS=38, RETURN=39, TRUE=40, FALSE=41, NEW=42, PACKAGE=43, 
		FINAL=44, IF=45, ELSE=46, NULL=47, FOR=48, WHILE=49, INTEGER=50, DOUBLE=51, 
		FLOAT=52, STRING=53, LONG=54, SHORT=55, BYTE=56, LBRACK=57, RBRACK=58, 
		LCBRACK=59, RCBRACK=60, LSQBRACK=61, RSQBRACK=62, LPBRACK=63, RPBRACK=64, 
		SEMICOLON=65, DOT=66, IDENTIFIER=67, STRING_CONST=68, Digits=69, LetterOrDigit=70, 
		Letter=71;
	public static final int
		RULE_r = 0, RULE_accessmod = 1, RULE_parameter = 2, RULE_constructor = 3, 
		RULE_method_sig = 4, RULE_method_call = 5, RULE_method_call_param = 6, 
		RULE_cast = 7, RULE_method = 8, RULE_scope = 9, RULE_expression = 10, 
		RULE_condition = 11, RULE_if_cond = 12, RULE_variable_def = 13, RULE_var_assign = 14, 
		RULE_attribute = 15, RULE_datatype = 16, RULE_scope_body = 17, RULE_for_loop = 18, 
		RULE_for_each_loop = 19, RULE_while_loop = 20, RULE_class_def = 21, RULE_interface_def = 22, 
		RULE_class_name = 23, RULE_interface_name = 24, RULE_static_block = 25, 
		RULE_method_name = 26, RULE_generic_type_name = 27, RULE_comp_op = 28, 
		RULE_math_op = 29;
	public static final String[] ruleNames = {
		"r", "accessmod", "parameter", "constructor", "method_sig", "method_call", 
		"method_call_param", "cast", "method", "scope", "expression", "condition", 
		"if_cond", "variable_def", "var_assign", "attribute", "datatype", "scope_body", 
		"for_loop", "for_each_loop", "while_loop", "class_def", "interface_def", 
		"class_name", "interface_name", "static_block", "method_name", "generic_type_name", 
		"comp_op", "math_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'++'", "'--'", "'!'", "':'", "'<='", "'>='", "'=='", 
		"'!='", "'&'", "'|'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", null, 
		null, null, null, null, null, "'class'", "'public'", "'private'", "'protected'", 
		"'abstract'", "'static'", "'void'", "'implements'", "'extends'", "'interface'", 
		"'import'", "'enum'", "'throws'", "'this'", "'return'", "'true'", "'false'", 
		"'new'", "'package'", "'final'", "'if'", "'else'", "'null'", "'for'", 
		"'while'", "'int'", "'double'", "'float'", "'String'", "'long'", "'short'", 
		"'byte'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "';'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
		"ANNOTATION", "IMPORTS", "STUFF", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", 
		"ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", "IMPORT", 
		"ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", "NEW", "PACKAGE", 
		"FINAL", "IF", "ELSE", "NULL", "FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", 
		"STRING", "LONG", "SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", 
		"LSQBRACK", "RSQBRACK", "LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", 
		"STRING_CONST", "Digits", "LetterOrDigit", "Letter"
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << STATIC) | (1L << INTERFACE) | (1L << FINAL))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					interface_def();
					}
					break;
				case 2:
					{
					setState(61);
					class_def();
					}
					break;
				}
				}
				setState(66);
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
			setState(67);
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
			setState(69);
			datatype();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(70);
				match(LSQBRACK);
				setState(71);
				match(RSQBRACK);
				}
			}

			setState(74);
			match(IDENTIFIER);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(75);
				match(LSQBRACK);
				setState(76);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(79);
				accessmod();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(82);
				match(STATIC);
				}
			}

			setState(85);
			class_name();
			setState(86);
			match(LBRACK);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INTEGER - 50)) | (1L << (DOUBLE - 50)) | (1L << (FLOAT - 50)) | (1L << (STRING - 50)) | (1L << (LONG - 50)) | (1L << (SHORT - 50)) | (1L << (BYTE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) {
				{
				setState(87);
				parameter();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					parameter();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(RBRACK);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(98);
				match(THROWS);
				setState(99);
				match(IDENTIFIER);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(100);
					match(T__0);
					setState(101);
					match(IDENTIFIER);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			match(LCBRACK);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (IF - 38)) | (1L << (FOR - 38)) | (1L << (WHILE - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (LCBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
				{
				{
				setState(110);
				scope_body();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public TerminalNode FINAL() { return getToken(JavaLexerParser.FINAL, 0); }
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(118);
				accessmod();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==STATIC) {
				{
				setState(121);
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

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(124);
				match(FINAL);
				}
			}

			setState(129);
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
				setState(127);
				datatype();
				}
				break;
			case VOID:
				{
				setState(128);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			method_name();
			setState(132);
			match(LBRACK);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INTEGER - 50)) | (1L << (DOUBLE - 50)) | (1L << (FLOAT - 50)) | (1L << (STRING - 50)) | (1L << (LONG - 50)) | (1L << (SHORT - 50)) | (1L << (BYTE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) {
				{
				setState(133);
				parameter();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(134);
					match(T__0);
					setState(135);
					parameter();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(RBRACK);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(144);
				match(THROWS);
				setState(145);
				match(IDENTIFIER);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(146);
					match(T__0);
					setState(147);
					match(IDENTIFIER);
					}
					}
					setState(152);
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(155);
				match(THIS);
				setState(156);
				match(DOT);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					class_name();
					setState(160);
					match(DOT);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(167);
			method_name();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(168);
				match(LPBRACK);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INTEGER - 50)) | (1L << (DOUBLE - 50)) | (1L << (FLOAT - 50)) | (1L << (STRING - 50)) | (1L << (LONG - 50)) | (1L << (SHORT - 50)) | (1L << (BYTE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) {
					{
					setState(169);
					datatype();
					}
				}

				setState(172);
				match(RPBRACK);
				}
			}

			setState(175);
			_la = _input.LA(1);
			if ( !(_la==LBRACK || _la==LSQBRACK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (TRUE - 38)) | (1L << (FALSE - 38)) | (1L << (NEW - 38)) | (1L << (STRING - 38)) | (1L << (LBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)) | (1L << (Digits - 38)))) != 0)) {
				{
				setState(176);
				method_call_param();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(177);
					match(T__0);
					setState(178);
					method_call_param();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(186);
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
		public TerminalNode THIS() { return getToken(JavaLexerParser.THIS, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public TerminalNode NEW() { return getToken(JavaLexerParser.NEW, 0); }
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(188);
				cast();
				}
			}

			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(191);
					match(NEW);
					}
				}

				setState(194);
				method_call();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(195);
					match(DOT);
					setState(196);
					method_call();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(202);
				match(THIS);
				}
				break;
			case 3:
				{
				setState(203);
				match(STRING_CONST);
				}
				break;
			case 4:
				{
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(204);
							match(IDENTIFIER);
							setState(205);
							match(DOT);
							}
							} 
						}
						setState(210);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
					break;
				case THIS:
					{
					setState(211);
					match(THIS);
					setState(212);
					match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(216);
				match(Digits);
				}
				break;
			case 6:
				{
				setState(217);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(218);
				match(FALSE);
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(221);
				math_op();
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(222);
					match(STRING_CONST);
					}
					break;
				case 2:
					{
					setState(223);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(224);
					match(Digits);
					}
					break;
				case 4:
					{
					setState(225);
					match(TRUE);
					}
					break;
				case 5:
					{
					setState(226);
					match(FALSE);
					}
					break;
				case 6:
					{
					{
					setState(227);
					method_call();
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(228);
						match(DOT);
						setState(229);
						method_call();
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				}
				}
				setState(241);
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
			setState(242);
			match(LBRACK);
			setState(243);
			match(IDENTIFIER);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(244);
				match(DOT);
				setState(245);
				match(IDENTIFIER);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
			setState(253);
			method_sig();
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCBRACK:
				{
				setState(254);
				match(LCBRACK);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (IF - 38)) | (1L << (FOR - 38)) | (1L << (WHILE - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (LCBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
					{
					{
					setState(255);
					scope_body();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(RCBRACK);
				}
				break;
			case SEMICOLON:
				{
				setState(262);
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
			setState(265);
			match(LCBRACK);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(266);
					scope_body();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(272);
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
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(JavaLexerParser.RETURN, 0); }
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> NEW() { return getTokens(JavaLexerParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(JavaLexerParser.NEW, i);
		}
		public List<Math_opContext> math_op() {
			return getRuleContexts(Math_opContext.class);
		}
		public Math_opContext math_op(int i) {
			return getRuleContext(Math_opContext.class,i);
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
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(274);
				match(RETURN);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(277);
					match(LBRACK);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(283);
				match(THIS);
				setState(284);
				match(DOT);
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(T__1);
				}
				break;
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(291);
				match(STRING_CONST);
				}
				break;
			case 2:
				{
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(292);
					datatype();
					}
					break;
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(295);
					match(THIS);
					setState(296);
					match(DOT);
					}
				}

				setState(299);
				match(IDENTIFIER);
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(DOT);
						setState(301);
						match(IDENTIFIER);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==T__3) {
					{
					setState(307);
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
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(310);
					match(IDENTIFIER);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(311);
						match(DOT);
						setState(312);
						match(IDENTIFIER);
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(320);
				method_call();
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(DOT);
						setState(322);
						method_call();
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					match(RBRACK);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					match(LBRACK);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(393); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(393);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							setState(342);
							match(DOT);
							}
							break;
						case T__1:
						case T__14:
						case T__15:
						case T__16:
						case T__17:
						case THIS:
						case NEW:
						case STRING:
						case LBRACK:
						case IDENTIFIER:
						case STRING_CONST:
						case Digits:
							{
							{
							setState(344);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
								{
								setState(343);
								math_op();
								}
							}

							setState(347);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__1) {
								{
								setState(346);
								match(T__1);
								}
							}

							setState(352);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
							case 1:
								{
								setState(349);
								match(LBRACK);
								setState(350);
								match(IDENTIFIER);
								setState(351);
								match(RBRACK);
								}
								break;
							}
							}
							setState(357);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LBRACK) {
								{
								{
								setState(354);
								match(LBRACK);
								}
								}
								setState(359);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(361);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NEW) {
								{
								setState(360);
								match(NEW);
								}
							}

							setState(391);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
							case 1:
								{
								setState(363);
								method_call();
								setState(368);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(364);
										match(DOT);
										setState(365);
										method_call();
										}
										} 
									}
									setState(370);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
								}
								setState(372);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
								case 1:
									{
									setState(371);
									math_op();
									}
									break;
								}
								setState(382);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
								case 1:
									{
									setState(374);
									method_call();
									setState(379);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
									while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
										if ( _alt==1 ) {
											{
											{
											setState(375);
											match(DOT);
											setState(376);
											method_call();
											}
											} 
										}
										setState(381);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
									}
									}
									break;
								}
								}
								break;
							case 2:
								{
								setState(384);
								match(IDENTIFIER);
								}
								break;
							case 3:
								{
								setState(385);
								match(STRING_CONST);
								}
								break;
							case 4:
								{
								setState(387); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(386);
										match(Digits);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(389); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
					setState(395); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					match(RBRACK);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		public TerminalNode RBRACK() { return getToken(JavaLexerParser.RBRACK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(JavaLexerParser.NULL, 0); }
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
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
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
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(405);
				match(LBRACK);
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case THIS:
			case NULL:
			case STRING:
			case LPBRACK:
			case RPBRACK:
			case IDENTIFIER:
			case Digits:
				{
				{
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(411);
					match(T__4);
					}
					break;
				}
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(414);
					method_call();
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(415);
						match(DOT);
						setState(416);
						method_call();
						}
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(422);
					match(IDENTIFIER);
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (T__10 - 7)) | (1L << (T__11 - 7)) | (1L << (T__12 - 7)) | (1L << (T__13 - 7)) | (1L << (LPBRACK - 7)) | (1L << (RPBRACK - 7)))) != 0)) {
					{
					setState(425);
					comp_op();
					}
				}

				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(428);
					match(T__4);
					}
				}

				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(431);
					match(NULL);
					}
					break;
				case 2:
					{
					setState(432);
					match(Digits);
					}
					break;
				case 3:
					{
					setState(433);
					match(IDENTIFIER);
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(434);
						match(DOT);
						setState(435);
						match(IDENTIFIER);
						}
						}
						setState(440);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 4:
					{
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(441);
							match(IDENTIFIER);
							setState(442);
							match(DOT);
							}
							} 
						}
						setState(447);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					setState(448);
					method_call();
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(449);
						match(DOT);
						setState(452);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(450);
							method_call();
							}
							break;
						case 2:
							{
							setState(451);
							match(IDENTIFIER);
							}
							break;
						}
						}
						}
						setState(458);
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
				setState(461);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(462);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(465);
				match(RBRACK);
				}
				break;
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << STRING) | (1L << LBRACK) | (1L << LPBRACK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RPBRACK - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (Digits - 64)))) != 0)) {
				{
				setState(468);
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
		enterRule(_localctx, 24, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(IF);
			setState(472);
			condition();
			setState(473);
			scope();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(474);
				match(ELSE);
				setState(477);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(475);
					if_cond();
					}
					break;
				case LCBRACK:
					{
					setState(476);
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
			setState(481);
			datatype();
			setState(482);
			match(IDENTIFIER);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(483);
				var_assign();
				}
			}

			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(486);
				match(T__0);
				setState(487);
				match(IDENTIFIER);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(488);
					var_assign();
					}
				}

				}
				}
				setState(495);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCBRACK() { return getToken(JavaLexerParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(JavaLexerParser.RCBRACK, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__1);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCBRACK) {
				{
				setState(497);
				match(LCBRACK);
				}
			}

			setState(500);
			expression();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RCBRACK) {
				{
				setState(501);
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
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(504);
				accessmod();
				}
			}

			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(507);
				match(STATIC);
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(510);
				match(FINAL);
				}
			}

			setState(513);
			variable_def();
			setState(514);
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
		public TerminalNode LSQBRACK() { return getToken(JavaLexerParser.LSQBRACK, 0); }
		public TerminalNode RSQBRACK() { return getToken(JavaLexerParser.RSQBRACK, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
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
		enterRule(_localctx, 32, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(516);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				{
				setState(517);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(518);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(519);
				match(STRING);
				}
				break;
			case LONG:
				{
				setState(520);
				match(LONG);
				}
				break;
			case SHORT:
				{
				setState(521);
				match(SHORT);
				}
				break;
			case BYTE:
				{
				setState(522);
				match(BYTE);
				}
				break;
			case IDENTIFIER:
				{
				setState(523);
				match(IDENTIFIER);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(524);
					match(DOT);
					setState(525);
					match(IDENTIFIER);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPBRACK) {
					{
					setState(531);
					match(LPBRACK);
					setState(532);
					datatype();
					setState(533);
					match(RPBRACK);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(539);
				match(LSQBRACK);
				setState(540);
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
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLexerParser.SEMICOLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(JavaLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaLexerParser.DOT, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public For_each_loopContext for_each_loop() {
			return getRuleContext(For_each_loopContext.class,0);
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
		enterRule(_localctx, 34, RULE_scope_body);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				method_call();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(545);
					match(DOT);
					setState(546);
					method_call();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				expression();
				setState(555);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				for_each_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(FOR);
				setState(564);
				match(LBRACK);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
					{
					setState(565);
					expression();
					}
				}

				setState(568);
				match(SEMICOLON);
				setState(569);
				condition();
				setState(570);
				match(SEMICOLON);
				setState(571);
				expression();
				setState(572);
				match(RBRACK);
				{
				setState(573);
				match(LCBRACK);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (IF - 38)) | (1L << (FOR - 38)) | (1L << (WHILE - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (LCBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
					{
					{
					setState(574);
					scope_body();
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
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
			case LBRACK:
			case IDENTIFIER:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				expression();
				setState(583);
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
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
			setState(587);
			match(FOR);
			setState(588);
			match(LBRACK);
			setState(589);
			variable_def();
			setState(590);
			match(T__5);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(591);
				method_call();
				}
				break;
			case 2:
				{
				setState(592);
				match(IDENTIFIER);
				}
				break;
			}
			setState(595);
			match(RBRACK);
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(596);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(597);
				match(LCBRACK);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (IF - 38)) | (1L << (FOR - 38)) | (1L << (WHILE - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (LCBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
					{
					{
					setState(598);
					scope_body();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
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
			case LBRACK:
			case IDENTIFIER:
			case STRING_CONST:
				{
				setState(605);
				expression();
				setState(606);
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
		enterRule(_localctx, 40, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(WHILE);
			setState(611);
			match(LBRACK);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(612);
				expression();
				}
				break;
			}
			setState(615);
			condition();
			setState(616);
			match(RBRACK);
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(617);
				match(SEMICOLON);
				}
				break;
			case LCBRACK:
				{
				setState(618);
				match(LCBRACK);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (THIS - 38)) | (1L << (RETURN - 38)) | (1L << (IF - 38)) | (1L << (FOR - 38)) | (1L << (WHILE - 38)) | (1L << (INTEGER - 38)) | (1L << (DOUBLE - 38)) | (1L << (FLOAT - 38)) | (1L << (STRING - 38)) | (1L << (LONG - 38)) | (1L << (SHORT - 38)) | (1L << (BYTE - 38)) | (1L << (LBRACK - 38)) | (1L << (LCBRACK - 38)) | (1L << (IDENTIFIER - 38)) | (1L << (STRING_CONST - 38)))) != 0)) {
					{
					{
					setState(619);
					scope_body();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
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
			case LBRACK:
			case IDENTIFIER:
			case STRING_CONST:
				{
				setState(626);
				expression();
				setState(627);
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
		enterRule(_localctx, 42, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(631);
				accessmod();
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(634);
				match(ABSTRACT);
				}
			}

			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(637);
				match(STATIC);
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(640);
				match(FINAL);
				}
			}

			setState(643);
			match(CLASS);
			setState(644);
			class_name();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(645);
				match(EXTENDS);
				setState(646);
				class_name();
				}
			}

			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(649);
				match(IMPLEMENTS);
				setState(650);
				interface_name();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(651);
					match(T__0);
					setState(652);
					interface_name();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(660);
			match(LCBRACK);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (CLASS - 25)) | (1L << (PUBLIC - 25)) | (1L << (PRIVATE - 25)) | (1L << (PROTECTED - 25)) | (1L << (ABSTRACT - 25)) | (1L << (STATIC - 25)) | (1L << (VOID - 25)) | (1L << (FINAL - 25)) | (1L << (INTEGER - 25)) | (1L << (DOUBLE - 25)) | (1L << (FLOAT - 25)) | (1L << (STRING - 25)) | (1L << (LONG - 25)) | (1L << (SHORT - 25)) | (1L << (BYTE - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(661);
					static_block();
					}
					break;
				case 2:
					{
					setState(662);
					constructor();
					}
					break;
				case 3:
					{
					setState(663);
					method();
					}
					break;
				case 4:
					{
					setState(664);
					attribute();
					}
					break;
				case 5:
					{
					setState(665);
					class_def();
					}
					break;
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
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
		enterRule(_localctx, 44, RULE_interface_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(673);
				accessmod();
				}
			}

			setState(676);
			match(INTERFACE);
			setState(677);
			interface_name();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(678);
				match(EXTENDS);
				setState(679);
				class_name();
				}
			}

			setState(682);
			match(LCBRACK);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (PUBLIC - 26)) | (1L << (PRIVATE - 26)) | (1L << (PROTECTED - 26)) | (1L << (ABSTRACT - 26)) | (1L << (STATIC - 26)) | (1L << (VOID - 26)) | (1L << (FINAL - 26)) | (1L << (INTEGER - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (STRING - 26)) | (1L << (LONG - 26)) | (1L << (SHORT - 26)) | (1L << (BYTE - 26)) | (1L << (IDENTIFIER - 26)))) != 0)) {
				{
				{
				setState(683);
				method_sig();
				setState(684);
				match(SEMICOLON);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
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
		enterRule(_localctx, 46, RULE_class_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(IDENTIFIER);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(694);
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
		enterRule(_localctx, 48, RULE_interface_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(IDENTIFIER);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPBRACK) {
				{
				setState(698);
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
		enterRule(_localctx, 50, RULE_static_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(STATIC);
			setState(702);
			match(LCBRACK);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (PUBLIC - 26)) | (1L << (PRIVATE - 26)) | (1L << (PROTECTED - 26)) | (1L << (STATIC - 26)) | (1L << (THIS - 26)) | (1L << (RETURN - 26)) | (1L << (FINAL - 26)) | (1L << (IF - 26)) | (1L << (FOR - 26)) | (1L << (WHILE - 26)) | (1L << (INTEGER - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (STRING - 26)) | (1L << (LONG - 26)) | (1L << (SHORT - 26)) | (1L << (BYTE - 26)) | (1L << (LBRACK - 26)) | (1L << (LCBRACK - 26)) | (1L << (IDENTIFIER - 26)) | (1L << (STRING_CONST - 26)))) != 0)) {
				{
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(703);
					attribute();
					}
					break;
				case 2:
					{
					setState(704);
					scope_body();
					}
					break;
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
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
		enterRule(_localctx, 52, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		public TerminalNode IDENTIFIER() { return getToken(JavaLexerParser.IDENTIFIER, 0); }
		public TerminalNode RPBRACK() { return getToken(JavaLexerParser.RPBRACK, 0); }
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
		enterRule(_localctx, 54, RULE_generic_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LPBRACK);
			setState(715);
			match(IDENTIFIER);
			setState(716);
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
		enterRule(_localctx, 56, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (T__10 - 7)) | (1L << (T__11 - 7)) | (1L << (T__12 - 7)) | (1L << (T__13 - 7)) | (1L << (LPBRACK - 7)) | (1L << (RPBRACK - 7)))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_math_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u02d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\5\4P\n"+
		"\4\3\5\5\5S\n\5\3\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13"+
		"\5\5\5b\n\5\3\5\3\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\5\5n\n\5\3\5\3"+
		"\5\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5\3\6\5\6z\n\6\3\6\5\6}\n\6\3\6\5\6\u0080"+
		"\n\6\3\6\3\6\5\6\u0084\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6"+
		"\u008e\13\6\5\6\u0090\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a"+
		"\13\6\5\6\u009c\n\6\3\7\3\7\5\7\u00a0\n\7\3\7\3\7\3\7\7\7\u00a5\n\7\f"+
		"\7\16\7\u00a8\13\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\7\5\7\u00b0\n\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\5\7\u00bb\n\7\3\7\3\7\3\b\5"+
		"\b\u00c0\n\b\3\b\5\b\u00c3\n\b\3\b\3\b\3\b\7\b\u00c8\n\b\f\b\16\b\u00cb"+
		"\13\b\3\b\3\b\3\b\3\b\7\b\u00d1\n\b\f\b\16\b\u00d4\13\b\3\b\3\b\5\b\u00d8"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u00de\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00e9\n\b\f\b\16\b\u00ec\13\b\5\b\u00ee\n\b\7\b\u00f0\n\b\f\b\16"+
		"\b\u00f3\13\b\3\t\3\t\3\t\3\t\7\t\u00f9\n\t\f\t\16\t\u00fc\13\t\3\t\3"+
		"\t\3\n\3\n\3\n\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\3\n\5\n\u010a\n\n"+
		"\3\13\3\13\7\13\u010e\n\13\f\13\16\13\u0111\13\13\3\13\3\13\3\f\5\f\u0116"+
		"\n\f\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f\3\f\3\f\5\f\u0120\n\f\3\f\3"+
		"\f\5\f\u0124\n\f\3\f\3\f\5\f\u0128\n\f\3\f\3\f\5\f\u012c\n\f\3\f\3\f\3"+
		"\f\7\f\u0131\n\f\f\f\16\f\u0134\13\f\3\f\5\f\u0137\n\f\3\f\3\f\3\f\7\f"+
		"\u013c\n\f\f\f\16\f\u013f\13\f\5\f\u0141\n\f\3\f\3\f\3\f\7\f\u0146\n\f"+
		"\f\f\16\f\u0149\13\f\5\f\u014b\n\f\3\f\7\f\u014e\n\f\f\f\16\f\u0151\13"+
		"\f\3\f\7\f\u0154\n\f\f\f\16\f\u0157\13\f\3\f\3\f\5\f\u015b\n\f\3\f\5\f"+
		"\u015e\n\f\3\f\3\f\3\f\5\f\u0163\n\f\3\f\7\f\u0166\n\f\f\f\16\f\u0169"+
		"\13\f\3\f\5\f\u016c\n\f\3\f\3\f\3\f\7\f\u0171\n\f\f\f\16\f\u0174\13\f"+
		"\3\f\5\f\u0177\n\f\3\f\3\f\3\f\7\f\u017c\n\f\f\f\16\f\u017f\13\f\5\f\u0181"+
		"\n\f\3\f\3\f\3\f\6\f\u0186\n\f\r\f\16\f\u0187\5\f\u018a\n\f\6\f\u018c"+
		"\n\f\r\f\16\f\u018d\5\f\u0190\n\f\3\f\7\f\u0193\n\f\f\f\16\f\u0196\13"+
		"\f\3\r\7\r\u0199\n\r\f\r\16\r\u019c\13\r\3\r\5\r\u019f\n\r\3\r\3\r\3\r"+
		"\7\r\u01a4\n\r\f\r\16\r\u01a7\13\r\3\r\5\r\u01aa\n\r\3\r\5\r\u01ad\n\r"+
		"\3\r\5\r\u01b0\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u01b7\n\r\f\r\16\r\u01ba\13"+
		"\r\3\r\3\r\7\r\u01be\n\r\f\r\16\r\u01c1\13\r\3\r\3\r\3\r\3\r\5\r\u01c7"+
		"\n\r\7\r\u01c9\n\r\f\r\16\r\u01cc\13\r\5\r\u01ce\n\r\3\r\3\r\5\r\u01d2"+
		"\n\r\3\r\5\r\u01d5\n\r\3\r\5\r\u01d8\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u01e0\n\16\5\16\u01e2\n\16\3\17\3\17\3\17\5\17\u01e7\n\17\3\17\3"+
		"\17\3\17\5\17\u01ec\n\17\7\17\u01ee\n\17\f\17\16\17\u01f1\13\17\3\20\3"+
		"\20\5\20\u01f5\n\20\3\20\3\20\5\20\u01f9\n\20\3\21\5\21\u01fc\n\21\3\21"+
		"\5\21\u01ff\n\21\3\21\5\21\u0202\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0211\n\22\f\22\16\22\u0214\13"+
		"\22\3\22\3\22\3\22\3\22\5\22\u021a\n\22\5\22\u021c\n\22\3\22\3\22\5\22"+
		"\u0220\n\22\3\23\3\23\3\23\3\23\7\23\u0226\n\23\f\23\16\23\u0229\13\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0234\n\23\3\24\3\24"+
		"\3\24\5\24\u0239\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0242\n"+
		"\24\f\24\16\24\u0245\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u024c\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0254\n\25\3\25\3\25\3\25\3\25\7\25"+
		"\u025a\n\25\f\25\16\25\u025d\13\25\3\25\3\25\3\25\3\25\5\25\u0263\n\25"+
		"\3\26\3\26\3\26\5\26\u0268\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u026f\n"+
		"\26\f\26\16\26\u0272\13\26\3\26\3\26\3\26\3\26\5\26\u0278\n\26\3\27\5"+
		"\27\u027b\n\27\3\27\5\27\u027e\n\27\3\27\5\27\u0281\n\27\3\27\5\27\u0284"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u028a\n\27\3\27\3\27\3\27\3\27\7\27\u0290"+
		"\n\27\f\27\16\27\u0293\13\27\5\27\u0295\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u029d\n\27\f\27\16\27\u02a0\13\27\3\27\3\27\3\30\5\30\u02a5"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u02ab\n\30\3\30\3\30\3\30\3\30\7\30\u02b1"+
		"\n\30\f\30\16\30\u02b4\13\30\3\30\3\30\3\31\3\31\5\31\u02ba\n\31\3\32"+
		"\3\32\5\32\u02be\n\32\3\33\3\33\3\33\3\33\7\33\u02c4\n\33\f\33\16\33\u02c7"+
		"\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\4\u010f\u011a\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<\2\n\3\2\34\36\3\2\37 \4\2;;??\4\2<<@@\3\2\5\6\4\2\67\67EE\4"+
		"\2\t\20AB\3\2\21\24\2\u0350\2B\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bR\3\2\2"+
		"\2\ny\3\2\2\2\f\u009f\3\2\2\2\16\u00bf\3\2\2\2\20\u00f4\3\2\2\2\22\u00ff"+
		"\3\2\2\2\24\u010b\3\2\2\2\26\u0115\3\2\2\2\30\u019a\3\2\2\2\32\u01d9\3"+
		"\2\2\2\34\u01e3\3\2\2\2\36\u01f2\3\2\2\2 \u01fb\3\2\2\2\"\u021b\3\2\2"+
		"\2$\u0233\3\2\2\2&\u024b\3\2\2\2(\u024d\3\2\2\2*\u0264\3\2\2\2,\u027a"+
		"\3\2\2\2.\u02a4\3\2\2\2\60\u02b7\3\2\2\2\62\u02bb\3\2\2\2\64\u02bf\3\2"+
		"\2\2\66\u02ca\3\2\2\28\u02cc\3\2\2\2:\u02d0\3\2\2\2<\u02d2\3\2\2\2>A\5"+
		".\30\2?A\5,\27\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3"+
		"\3\2\2\2DB\3\2\2\2EF\t\2\2\2F\5\3\2\2\2GJ\5\"\22\2HI\7?\2\2IK\7@\2\2J"+
		"H\3\2\2\2JK\3\2\2\2KL\3\2\2\2LO\7E\2\2MN\7?\2\2NP\7@\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P\7\3\2\2\2QS\5\4\3\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\7 \2\2UT\3"+
		"\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\60\31\2Xa\7;\2\2Y^\5\6\4\2Z[\7\3\2\2[]"+
		"\5\6\4\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2"+
		"aY\3\2\2\2ab\3\2\2\2bc\3\2\2\2cm\7<\2\2de\7\'\2\2ej\7E\2\2fg\7\3\2\2g"+
		"i\7E\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2m"+
		"d\3\2\2\2mn\3\2\2\2no\3\2\2\2os\7=\2\2pr\5$\23\2qp\3\2\2\2ru\3\2\2\2s"+
		"q\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7>\2\2w\t\3\2\2\2xz\5\4\3\2"+
		"yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\t\3\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2"+
		"\2\2~\u0080\7.\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\u0084\5\"\22\2\u0082\u0084\7!\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\66\34\2\u0086\u008f\7;\2\2"+
		"\u0087\u008c\5\6\4\2\u0088\u0089\7\3\2\2\u0089\u008b\5\6\4\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u009b\7<\2\2\u0092\u0093\7\'\2\2\u0093"+
		"\u0098\7E\2\2\u0094\u0095\7\3\2\2\u0095\u0097\7E\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\13\3\2\2\2\u009d\u009e\7(\2\2\u009e\u00a0\7D\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a6\3\2\2\2\u00a1\u00a2\5\60\31\2\u00a2\u00a3"+
		"\7D\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00af\5\66\34\2\u00aa\u00ac\7A\2\2\u00ab\u00ad\5\"\22\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\7B"+
		"\2\2\u00af\u00aa\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00ba\t\4\2\2\u00b2\u00b7\5\16\b\2\u00b3\u00b4\7\3\2\2\u00b4\u00b6\5"+
		"\16\b\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b2\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd"+
		"\r\3\2\2\2\u00be\u00c0\5\20\t\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2"+
		"\2\u00c0\u00dd\3\2\2\2\u00c1\u00c3\7,\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\5\f\7\2\u00c5\u00c6\7D\2\2\u00c6"+
		"\u00c8\5\f\7\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00de\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00de\7(\2\2\u00cd\u00de\7F\2\2\u00ce\u00cf\7E\2\2\u00cf\u00d1\7D\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6"+
		"\u00d8\7D\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00de\7E\2\2\u00da\u00de\7G\2\2\u00db\u00de\7*\2\2\u00dc\u00de"+
		"\7+\2\2\u00dd\u00c2\3\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00cd\3\2\2\2\u00dd"+
		"\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00f1\3\2\2\2\u00df\u00ed\5<\37\2\u00e0\u00ee\7F\2\2\u00e1"+
		"\u00ee\7E\2\2\u00e2\u00ee\7G\2\2\u00e3\u00ee\7*\2\2\u00e4\u00ee\7+\2\2"+
		"\u00e5\u00ea\5\f\7\2\u00e6\u00e7\7D\2\2\u00e7\u00e9\5\f\7\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ed\u00e1\3\2"+
		"\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed"+
		"\u00e5\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00df\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\7;\2\2\u00f5\u00fa\7E\2\2\u00f6\u00f7\7D\2\2\u00f7"+
		"\u00f9\7E\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7<\2\2\u00fe\21\3\2\2\2\u00ff\u0109\5\n\6\2\u0100\u0104\7=\2\2"+
		"\u0101\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\7>\2\2\u0108\u010a\7C\2\2\u0109\u0100\3\2\2\2\u0109\u0108\3\2\2"+
		"\2\u010a\23\3\2\2\2\u010b\u010f\7=\2\2\u010c\u010e\5$\23\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7>\2\2\u0113\25\3\2\2\2"+
		"\u0114\u0116\7)\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a"+
		"\3\2\2\2\u0117\u0119\7;\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u011e\7(\2\2\u011e\u0120\7D\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\7E\2\2\u0122\u0124\7\4\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u014a\3\2\2\2\u0125\u014b\7F"+
		"\2\2\u0126\u0128\5\"\22\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u012a\7(\2\2\u012a\u012c\7D\2\2\u012b\u0129\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\7E\2\2\u012e\u012f"+
		"\7D\2\2\u012f\u0131\7E\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0137\t\6\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u014b\3\2\2\2\u0138\u013d\7E\2\2\u0139\u013a\7D\2\2\u013a\u013c\7E\2"+
		"\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0147\5\f\7\2\u0143\u0144\7D"+
		"\2\2\u0144\u0146\5\f\7\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u0125\3\2\2\2\u014a\u0127\3\2\2\2\u014a\u0140\3\2\2\2\u014b"+
		"\u014f\3\2\2\2\u014c\u014e\7<\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0155\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\7;\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u018f\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u018c\7D\2\2\u0159\u015b\5<\37\2\u015a\u0159\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\7\4\2\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u0160\7;"+
		"\2\2\u0160\u0161\7E\2\2\u0161\u0163\7<\2\2\u0162\u015f\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0167\3\2\2\2\u0164\u0166\7;\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u016a\u016c\7,\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0189\3\2\2\2\u016d\u0172\5\f\7\2\u016e\u016f\7D"+
		"\2\2\u016f\u0171\5\f\7\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0177\5<\37\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0180\3\2\2\2\u0178\u017d\5\f\7\2\u0179\u017a\7D\2\2\u017a\u017c\5\f"+
		"\7\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0178\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u018a\3\2\2\2\u0182\u018a\7E\2\2\u0183"+
		"\u018a\7F\2\2\u0184\u0186\7G\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2"+
		"\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u016d"+
		"\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0185\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0158\3\2\2\2\u018b\u015a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u018b\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0193\7<"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\27\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7;\2\2"+
		"\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u01d1\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7\7\2\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a9\3\2\2\2\u01a0\u01a5\5\f"+
		"\7\2\u01a1\u01a2\7D\2\2\u01a2\u01a4\5\f\7\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\7E\2\2\u01a9\u01a0\3\2\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5:"+
		"\36\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01b0\7\7\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01cd\3\2"+
		"\2\2\u01b1\u01ce\7\61\2\2\u01b2\u01ce\7G\2\2\u01b3\u01b8\7E\2\2\u01b4"+
		"\u01b5\7D\2\2\u01b5\u01b7\7E\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2"+
		"\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ce\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01bb\u01bc\7E\2\2\u01bc\u01be\7D\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01ca\5\f\7\2\u01c3\u01c6\7D\2\2\u01c4"+
		"\u01c7\5\f\7\2\u01c5\u01c7\7E\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01b1\3\2\2\2\u01cd\u01b2\3\2\2\2\u01cd\u01b3\3\2\2\2\u01cd"+
		"\u01bf\3\2\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d2\7*\2\2\u01d0\u01d2\7+\2"+
		"\2\u01d1\u019e\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d4"+
		"\3\2\2\2\u01d3\u01d5\7<\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d8\5\30\r\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3"+
		"\2\2\2\u01d8\31\3\2\2\2\u01d9\u01da\7/\2\2\u01da\u01db\5\30\r\2\u01db"+
		"\u01e1\5\24\13\2\u01dc\u01df\7\60\2\2\u01dd\u01e0\5\32\16\2\u01de\u01e0"+
		"\5\24\13\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e2\3\2\2\2"+
		"\u01e1\u01dc\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\33\3\2\2\2\u01e3\u01e4"+
		"\5\"\22\2\u01e4\u01e6\7E\2\2\u01e5\u01e7\5\36\20\2\u01e6\u01e5\3\2\2\2"+
		"\u01e6\u01e7\3\2\2\2\u01e7\u01ef\3\2\2\2\u01e8\u01e9\7\3\2\2\u01e9\u01eb"+
		"\7E\2\2\u01ea\u01ec\5\36\20\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2"+
		"\u01ec\u01ee\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\35\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f4\7\4\2\2\u01f3\u01f5\7=\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\5\26\f\2\u01f7\u01f9\7>\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\37\3\2\2\2\u01fa\u01fc\5\4\3"+
		"\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff"+
		"\7 \2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u0202\7.\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\5\34\17\2\u0204\u0205\7C\2\2\u0205!\3\2\2\2\u0206\u021c"+
		"\7\64\2\2\u0207\u021c\7\65\2\2\u0208\u021c\7\66\2\2\u0209\u021c\7\67\2"+
		"\2\u020a\u021c\78\2\2\u020b\u021c\79\2\2\u020c\u021c\7:\2\2\u020d\u0212"+
		"\7E\2\2\u020e\u020f\7D\2\2\u020f\u0211\7E\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0219\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7A\2\2\u0216\u0217\5\"\22\2\u0217"+
		"\u0218\7B\2\2\u0218\u021a\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u0206\3\2\2\2\u021b\u0207\3\2\2\2\u021b"+
		"\u0208\3\2\2\2\u021b\u0209\3\2\2\2\u021b\u020a\3\2\2\2\u021b\u020b\3\2"+
		"\2\2\u021b\u020c\3\2\2\2\u021b\u020d\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021e\7?\2\2\u021e\u0220\7@\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2"+
		"\2\u0220#\3\2\2\2\u0221\u0234\5\32\16\2\u0222\u0227\5\f\7\2\u0223\u0224"+
		"\7D\2\2\u0224\u0226\5\f\7\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022b\7C\2\2\u022b\u0234\3\2\2\2\u022c\u022d\5\26\f\2\u022d"+
		"\u022e\7C\2\2\u022e\u0234\3\2\2\2\u022f\u0234\5&\24\2\u0230\u0234\5(\25"+
		"\2\u0231\u0234\5*\26\2\u0232\u0234\5\24\13\2\u0233\u0221\3\2\2\2\u0233"+
		"\u0222\3\2\2\2\u0233\u022c\3\2\2\2\u0233\u022f\3\2\2\2\u0233\u0230\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234%\3\2\2\2\u0235\u0236"+
		"\7\62\2\2\u0236\u0238\7;\2\2\u0237\u0239\5\26\f\2\u0238\u0237\3\2\2\2"+
		"\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7C\2\2\u023b\u023c"+
		"\5\30\r\2\u023c\u023d\7C\2\2\u023d\u023e\5\26\f\2\u023e\u023f\7<\2\2\u023f"+
		"\u0243\7=\2\2\u0240\u0242\5$\23\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0247\7>\2\2\u0247\u024c\3\2\2\2\u0248\u0249\5\26"+
		"\f\2\u0249\u024a\7C\2\2\u024a\u024c\3\2\2\2\u024b\u0235\3\2\2\2\u024b"+
		"\u0248\3\2\2\2\u024c\'\3\2\2\2\u024d\u024e\7\62\2\2\u024e\u024f\7;\2\2"+
		"\u024f\u0250\5\34\17\2\u0250\u0253\7\b\2\2\u0251\u0254\5\f\7\2\u0252\u0254"+
		"\7E\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0262\7<\2\2\u0256\u0263\7C\2\2\u0257\u025b\7=\2\2\u0258\u025a\5$\23"+
		"\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0263\7>\2\2\u025f"+
		"\u0260\5\26\f\2\u0260\u0261\7C\2\2\u0261\u0263\3\2\2\2\u0262\u0256\3\2"+
		"\2\2\u0262\u0257\3\2\2\2\u0262\u025f\3\2\2\2\u0263)\3\2\2\2\u0264\u0265"+
		"\7\63\2\2\u0265\u0267\7;\2\2\u0266\u0268\5\26\f\2\u0267\u0266\3\2\2\2"+
		"\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5\30\r\2\u026a\u0277"+
		"\7<\2\2\u026b\u0278\7C\2\2\u026c\u0270\7=\2\2\u026d\u026f\5$\23\2\u026e"+
		"\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0278\7>\2\2\u0274"+
		"\u0275\5\26\f\2\u0275\u0276\7C\2\2\u0276\u0278\3\2\2\2\u0277\u026b\3\2"+
		"\2\2\u0277\u026c\3\2\2\2\u0277\u0274\3\2\2\2\u0278+\3\2\2\2\u0279\u027b"+
		"\5\4\3\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027e\7\37\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3"+
		"\2\2\2\u027f\u0281\7 \2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0284\7.\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\33\2\2\u0286\u0289\5\60\31\2\u0287"+
		"\u0288\7#\2\2\u0288\u028a\5\60\31\2\u0289\u0287\3\2\2\2\u0289\u028a\3"+
		"\2\2\2\u028a\u0294\3\2\2\2\u028b\u028c\7\"\2\2\u028c\u0291\5\62\32\2\u028d"+
		"\u028e\7\3\2\2\u028e\u0290\5\62\32\2\u028f\u028d\3\2\2\2\u0290\u0293\3"+
		"\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293"+
		"\u0291\3\2\2\2\u0294\u028b\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u029e\7=\2\2\u0297\u029d\5\64\33\2\u0298\u029d\5\b\5\2\u0299"+
		"\u029d\5\22\n\2\u029a\u029d\5 \21\2\u029b\u029d\5,\27\2\u029c\u0297\3"+
		"\2\2\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7>\2\2\u02a2"+
		"-\3\2\2\2\u02a3\u02a5\5\4\3\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2"+
		"\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7$\2\2\u02a7\u02aa\5\62\32\2\u02a8\u02a9"+
		"\7#\2\2\u02a9\u02ab\5\60\31\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02ac\3\2\2\2\u02ac\u02b2\7=\2\2\u02ad\u02ae\5\n\6\2\u02ae\u02af"+
		"\7C\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02b6\7>\2\2\u02b6/\3\2\2\2\u02b7\u02b9\7E\2\2\u02b8\u02ba"+
		"\58\35\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\61\3\2\2\2\u02bb"+
		"\u02bd\7E\2\2\u02bc\u02be\58\35\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\63\3\2\2\2\u02bf\u02c0\7 \2\2\u02c0\u02c5\7=\2\2\u02c1\u02c4"+
		"\5 \21\2\u02c2\u02c4\5$\23\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4"+
		"\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2"+
		"\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7>\2\2\u02c9\65\3\2\2\2\u02ca\u02cb"+
		"\t\7\2\2\u02cb\67\3\2\2\2\u02cc\u02cd\7A\2\2\u02cd\u02ce\7E\2\2\u02ce"+
		"\u02cf\7B\2\2\u02cf9\3\2\2\2\u02d0\u02d1\t\b\2\2\u02d1;\3\2\2\2\u02d2"+
		"\u02d3\t\t\2\2\u02d3=\3\2\2\2|@BJORU^ajmsy|\177\u0083\u008c\u008f\u0098"+
		"\u009b\u009f\u00a6\u00ac\u00af\u00b7\u00ba\u00bf\u00c2\u00c9\u00d2\u00d7"+
		"\u00dd\u00ea\u00ed\u00f1\u00fa\u0104\u0109\u010f\u0115\u011a\u011f\u0123"+
		"\u0127\u012b\u0132\u0136\u013d\u0140\u0147\u014a\u014f\u0155\u015a\u015d"+
		"\u0162\u0167\u016b\u0172\u0176\u017d\u0180\u0187\u0189\u018b\u018d\u018f"+
		"\u0194\u019a\u019e\u01a5\u01a9\u01ac\u01af\u01b8\u01bf\u01c6\u01ca\u01cd"+
		"\u01d1\u01d4\u01d7\u01df\u01e1\u01e6\u01eb\u01ef\u01f4\u01f8\u01fb\u01fe"+
		"\u0201\u0212\u0219\u021b\u021f\u0227\u0233\u0238\u0243\u024b\u0253\u025b"+
		"\u0262\u0267\u0270\u0277\u027a\u027d\u0280\u0283\u0289\u0291\u0294\u029c"+
		"\u029e\u02a4\u02aa\u02b2\u02b9\u02bd\u02c3\u02c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}