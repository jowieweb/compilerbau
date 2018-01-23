// Generated from C:/Users/Jonas/IdeaProjects/compilerbau\JavaLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "WS", "COMMENT", "LINE_COMMENT", "ANNOTATION", "IMPORTS", "STUFF", 
		"CLASS", "PUBLIC", "PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", "VOID", 
		"IMPLEMENTS", "EXTENDS", "INTERFACE", "IMPORT", "ENUM", "THROWS", "THIS", 
		"RETURN", "TRUE", "FALSE", "NEW", "PACKAGE", "FINAL", "IF", "ELSE", "NULL", 
		"FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", 
		"BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", 
		"LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", 
		"Digits", "LetterOrDigit", "Letter"
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


	public JavaLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u0206\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00c6\n\25\f\25\16\25\u00c9\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d4\n\26\f\26\16\26\u00d7\13"+
		"\26\3\26\3\26\3\27\3\27\7\27\u00dd\n\27\f\27\16\27\u00e0\13\27\3\27\3"+
		"\27\3\30\3\30\7\30\u00e6\n\30\f\30\16\30\u00e9\13\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\7\31\u00f1\n\31\f\31\16\31\u00f4\13\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\7D\u01db\nD\fD\16D\u01de\13D\3D"+
		"\3D\3D\7D\u01e3\nD\fD\16D\u01e6\13D\3E\3E\7E\u01ea\nE\fE\16E\u01ed\13"+
		"E\3E\7E\u01f0\nE\fE\16E\u01f3\13E\3E\3E\3F\3F\7F\u01f9\nF\fF\16F\u01fc"+
		"\13F\3F\5F\u01ff\nF\3G\3G\5G\u0203\nG\3H\3H\6\u00c7\u00e7\u00f2\u01eb"+
		"\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\4\2\62;aa\6\2"+
		"&&C\\aac|\2\u0213\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2"+
		"\2\7\u0095\3\2\2\2\t\u0098\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17"+
		"\u009f\3\2\2\2\21\u00a2\3\2\2\2\23\u00a5\3\2\2\2\25\u00a8\3\2\2\2\27\u00ab"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b2\3\2\2\2\37\u00b5\3"+
		"\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00c1"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00da\3\2\2\2/\u00e3\3\2\2\2\61\u00ee\3\2\2\2"+
		"\63\u00f9\3\2\2\2\65\u00ff\3\2\2\2\67\u0106\3\2\2\29\u010e\3\2\2\2;\u0118"+
		"\3\2\2\2=\u0121\3\2\2\2?\u0128\3\2\2\2A\u012d\3\2\2\2C\u0138\3\2\2\2E"+
		"\u0140\3\2\2\2G\u014a\3\2\2\2I\u0151\3\2\2\2K\u0156\3\2\2\2M\u015d\3\2"+
		"\2\2O\u0162\3\2\2\2Q\u0169\3\2\2\2S\u016e\3\2\2\2U\u0174\3\2\2\2W\u0178"+
		"\3\2\2\2Y\u0180\3\2\2\2[\u0186\3\2\2\2]\u0189\3\2\2\2_\u018e\3\2\2\2a"+
		"\u0193\3\2\2\2c\u0197\3\2\2\2e\u019d\3\2\2\2g\u01a1\3\2\2\2i\u01a8\3\2"+
		"\2\2k\u01ae\3\2\2\2m\u01b5\3\2\2\2o\u01ba\3\2\2\2q\u01c0\3\2\2\2s\u01c5"+
		"\3\2\2\2u\u01c7\3\2\2\2w\u01c9\3\2\2\2y\u01cb\3\2\2\2{\u01cd\3\2\2\2}"+
		"\u01cf\3\2\2\2\177\u01d1\3\2\2\2\u0081\u01d3\3\2\2\2\u0083\u01d5\3\2\2"+
		"\2\u0085\u01d7\3\2\2\2\u0087\u01dc\3\2\2\2\u0089\u01e7\3\2\2\2\u008b\u01f6"+
		"\3\2\2\2\u008d\u0202\3\2\2\2\u008f\u0204\3\2\2\2\u0091\u0092\7.\2\2\u0092"+
		"\4\3\2\2\2\u0093\u0094\7?\2\2\u0094\6\3\2\2\2\u0095\u0096\7-\2\2\u0096"+
		"\u0097\7-\2\2\u0097\b\3\2\2\2\u0098\u0099\7/\2\2\u0099\u009a\7/\2\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\7#\2\2\u009c\f\3\2\2\2\u009d\u009e\7<\2\2\u009e"+
		"\16\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7?\2\2\u00a1\20\3\2\2\2\u00a2"+
		"\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\u00a7\7?\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"\26\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7~\2\2\u00ae"+
		"\32\3\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7(\2\2\u00b1\34\3\2\2\2\u00b2"+
		"\u00b3\7~\2\2\u00b3\u00b4\7~\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6"+
		" \3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		"$\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc&\3\2\2\2\u00bd\u00be\t\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\b\24\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7\61\2"+
		"\2\u00c2\u00c3\7,\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\13\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7\61"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\25\2\2\u00ce*\3\2\2\2\u00cf\u00d0"+
		"\7\61\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d4\n\3\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\b\26\2\2"+
		"\u00d9,\3\2\2\2\u00da\u00de\7B\2\2\u00db\u00dd\n\3\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\27\2\2\u00e2.\3\2\2\2"+
		"\u00e3\u00e7\5G$\2\u00e4\u00e6\13\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\5\u0083B\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\b\30\2\2\u00ed\60\3\2\2\2\u00ee\u00f2\5W,\2\u00ef\u00f1\13\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5\u0083B\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b\31\2\2\u00f8\62\3\2\2\2\u00f9\u00fa\7e\2"+
		"\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe"+
		"\7u\2\2\u00fe\64\3\2\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7w\2\2\u0101\u0102"+
		"\7d\2\2\u0102\u0103\7n\2\2\u0103\u0104\7k\2\2\u0104\u0105\7e\2\2\u0105"+
		"\66\3\2\2\2\u0106\u0107\7r\2\2\u0107\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u010a\7x\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2"+
		"\u010d8\3\2\2\2\u010e\u010f\7r\2\2\u010f\u0110\7t\2\2\u0110\u0111\7q\2"+
		"\2\u0111\u0112\7v\2\2\u0112\u0113\7g\2\2\u0113\u0114\7e\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7g\2\2\u0116\u0117\7f\2\2\u0117:\3\2\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7d\2\2\u011a\u011b\7u\2\2\u011b\u011c\7v\2\2\u011c"+
		"\u011d\7t\2\2\u011d\u011e\7c\2\2\u011e\u011f\7e\2\2\u011f\u0120\7v\2\2"+
		"\u0120<\3\2\2\2\u0121\u0122\7u\2\2\u0122\u0123\7v\2\2\u0123\u0124\7c\2"+
		"\2\u0124\u0125\7v\2\2\u0125\u0126\7k\2\2\u0126\u0127\7e\2\2\u0127>\3\2"+
		"\2\2\u0128\u0129\7x\2\2\u0129\u012a\7q\2\2\u012a\u012b\7k\2\2\u012b\u012c"+
		"\7f\2\2\u012c@\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7o\2\2\u012f\u0130"+
		"\7r\2\2\u0130\u0131\7n\2\2\u0131\u0132\7g\2\2\u0132\u0133\7o\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2\u0136\u0137\7u\2\2"+
		"\u0137B\3\2\2\2\u0138\u0139\7g\2\2\u0139\u013a\7z\2\2\u013a\u013b\7v\2"+
		"\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e\7f\2\2\u013e\u013f"+
		"\7u\2\2\u013fD\3\2\2\2\u0140\u0141\7k\2\2\u0141\u0142\7p\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7g\2\2\u0144\u0145\7t\2\2\u0145\u0146\7h\2\2\u0146"+
		"\u0147\7c\2\2\u0147\u0148\7e\2\2\u0148\u0149\7g\2\2\u0149F\3\2\2\2\u014a"+
		"\u014b\7k\2\2\u014b\u014c\7o\2\2\u014c\u014d\7r\2\2\u014d\u014e\7q\2\2"+
		"\u014e\u014f\7t\2\2\u014f\u0150\7v\2\2\u0150H\3\2\2\2\u0151\u0152\7g\2"+
		"\2\u0152\u0153\7p\2\2\u0153\u0154\7w\2\2\u0154\u0155\7o\2\2\u0155J\3\2"+
		"\2\2\u0156\u0157\7v\2\2\u0157\u0158\7j\2\2\u0158\u0159\7t\2\2\u0159\u015a"+
		"\7q\2\2\u015a\u015b\7y\2\2\u015b\u015c\7u\2\2\u015cL\3\2\2\2\u015d\u015e"+
		"\7v\2\2\u015e\u015f\7j\2\2\u015f\u0160\7k\2\2\u0160\u0161\7u\2\2\u0161"+
		"N\3\2\2\2\u0162\u0163\7t\2\2\u0163\u0164\7g\2\2\u0164\u0165\7v\2\2\u0165"+
		"\u0166\7w\2\2\u0166\u0167\7t\2\2\u0167\u0168\7p\2\2\u0168P\3\2\2\2\u0169"+
		"\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b\u016c\7w\2\2\u016c\u016d\7g\2\2"+
		"\u016dR\3\2\2\2\u016e\u016f\7h\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2"+
		"\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173T\3\2\2\2\u0174\u0175\7"+
		"p\2\2\u0175\u0176\7g\2\2\u0176\u0177\7y\2\2\u0177V\3\2\2\2\u0178\u0179"+
		"\7r\2\2\u0179\u017a\7c\2\2\u017a\u017b\7e\2\2\u017b\u017c\7m\2\2\u017c"+
		"\u017d\7c\2\2\u017d\u017e\7i\2\2\u017e\u017f\7g\2\2\u017fX\3\2\2\2\u0180"+
		"\u0181\7h\2\2\u0181\u0182\7k\2\2\u0182\u0183\7p\2\2\u0183\u0184\7c\2\2"+
		"\u0184\u0185\7n\2\2\u0185Z\3\2\2\2\u0186\u0187\7k\2\2\u0187\u0188\7h\2"+
		"\2\u0188\\\3\2\2\2\u0189\u018a\7g\2\2\u018a\u018b\7n\2\2\u018b\u018c\7"+
		"u\2\2\u018c\u018d\7g\2\2\u018d^\3\2\2\2\u018e\u018f\7p\2\2\u018f\u0190"+
		"\7w\2\2\u0190\u0191\7n\2\2\u0191\u0192\7n\2\2\u0192`\3\2\2\2\u0193\u0194"+
		"\7h\2\2\u0194\u0195\7q\2\2\u0195\u0196\7t\2\2\u0196b\3\2\2\2\u0197\u0198"+
		"\7y\2\2\u0198\u0199\7j\2\2\u0199\u019a\7k\2\2\u019a\u019b\7n\2\2\u019b"+
		"\u019c\7g\2\2\u019cd\3\2\2\2\u019d\u019e\7k\2\2\u019e\u019f\7p\2\2\u019f"+
		"\u01a0\7v\2\2\u01a0f\3\2\2\2\u01a1\u01a2\7f\2\2\u01a2\u01a3\7q\2\2\u01a3"+
		"\u01a4\7w\2\2\u01a4\u01a5\7d\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7g\2\2"+
		"\u01a7h\3\2\2\2\u01a8\u01a9\7h\2\2\u01a9\u01aa\7n\2\2\u01aa\u01ab\7q\2"+
		"\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7v\2\2\u01adj\3\2\2\2\u01ae\u01af\7"+
		"U\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3"+
		"\7p\2\2\u01b3\u01b4\7i\2\2\u01b4l\3\2\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7"+
		"\7q\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7i\2\2\u01b9n\3\2\2\2\u01ba\u01bb"+
		"\7u\2\2\u01bb\u01bc\7j\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7t\2\2\u01be"+
		"\u01bf\7v\2\2\u01bfp\3\2\2\2\u01c0\u01c1\7d\2\2\u01c1\u01c2\7{\2\2\u01c2"+
		"\u01c3\7v\2\2\u01c3\u01c4\7g\2\2\u01c4r\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6"+
		"t\3\2\2\2\u01c7\u01c8\7+\2\2\u01c8v\3\2\2\2\u01c9\u01ca\7}\2\2\u01cax"+
		"\3\2\2\2\u01cb\u01cc\7\177\2\2\u01ccz\3\2\2\2\u01cd\u01ce\7]\2\2\u01ce"+
		"|\3\2\2\2\u01cf\u01d0\7_\2\2\u01d0~\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\u0080"+
		"\3\2\2\2\u01d3\u01d4\7@\2\2\u01d4\u0082\3\2\2\2\u01d5\u01d6\7=\2\2\u01d6"+
		"\u0084\3\2\2\2\u01d7\u01d8\7\60\2\2\u01d8\u0086\3\2\2\2\u01d9\u01db\7"+
		"a\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e4\5\u008f"+
		"H\2\u01e0\u01e3\7a\2\2\u01e1\u01e3\5\u008dG\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u0088\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01f1\7$\2\2\u01e8"+
		"\u01ea\13\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ec\3"+
		"\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f5\7$\2\2\u01f5\u008a\3\2\2\2\u01f6\u01fe\t\4"+
		"\2\2\u01f7\u01f9\t\5\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01ff\t\4\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u008c\3\2\2\2\u0200\u0203\5\u008fH\2\u0201\u0203\t\4\2\2\u0202\u0200"+
		"\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u008e\3\2\2\2\u0204\u0205\t\6\2\2\u0205"+
		"\u0090\3\2\2\2\21\2\u00c7\u00d5\u00de\u00e7\u00f2\u01dc\u01e2\u01e4\u01eb"+
		"\u01ef\u01f1\u01fa\u01fe\u0202\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}