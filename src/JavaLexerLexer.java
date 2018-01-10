// Generated from /home/nils/Nextcloud/Master/2. Semester/Compilerbau/compilerbau/JavaLexer.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, COMMENT=15, LINE_COMMENT=16, 
		CLASS=17, PUBLIC=18, PRIVATE=19, PROTECTED=20, ABSTRACT=21, STATIC=22, 
		VOID=23, IMPLEMENTS=24, EXTENDS=25, INTERFACE=26, ENUM=27, THROWS=28, 
		THIS=29, RETURN=30, TRUE=31, FALSE=32, NEW=33, FOR=34, WHILE=35, INTEGER=36, 
		DOUBLE=37, FLOAT=38, STRING=39, LONG=40, SHORT=41, BYTE=42, LBRACK=43, 
		RBRACK=44, LCBRACK=45, RCBRACK=46, LSQBRACK=47, RSQBRACK=48, LPBRACK=49, 
		RPBRACK=50, SEMICOLON=51, DOT=52, IDENTIFIER=53, STRING_CONST=54, Digits=55, 
		LetterOrDigit=56, Letter=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "WS", "COMMENT", "LINE_COMMENT", "CLASS", 
		"PUBLIC", "PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", 
		"EXTENDS", "INTERFACE", "ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", 
		"NEW", "FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", 
		"SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", 
		"RSQBRACK", "LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", 
		"Digits", "LetterOrDigit", "Letter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u0172"+
		"\n\66\f\66\16\66\u0175\13\66\3\67\3\67\7\67\u0179\n\67\f\67\16\67\u017c"+
		"\13\67\3\67\3\67\38\38\78\u0182\n8\f8\168\u0185\138\38\58\u0188\n8\39"+
		"\39\59\u018c\n9\3:\3:\4\u009e\u017a\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\7\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u0195\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2"+
		"\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0084\3\2\2\2\23\u0087\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u008d\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u0094\3"+
		"\2\2\2\37\u0098\3\2\2\2!\u00a6\3\2\2\2#\u00b1\3\2\2\2%\u00b7\3\2\2\2\'"+
		"\u00be\3\2\2\2)\u00c6\3\2\2\2+\u00d0\3\2\2\2-\u00d9\3\2\2\2/\u00e0\3\2"+
		"\2\2\61\u00e5\3\2\2\2\63\u00f0\3\2\2\2\65\u00f8\3\2\2\2\67\u0102\3\2\2"+
		"\29\u0107\3\2\2\2;\u010e\3\2\2\2=\u0113\3\2\2\2?\u011a\3\2\2\2A\u011f"+
		"\3\2\2\2C\u0125\3\2\2\2E\u0129\3\2\2\2G\u012d\3\2\2\2I\u0133\3\2\2\2K"+
		"\u0137\3\2\2\2M\u013e\3\2\2\2O\u0144\3\2\2\2Q\u014b\3\2\2\2S\u0150\3\2"+
		"\2\2U\u0156\3\2\2\2W\u015b\3\2\2\2Y\u015d\3\2\2\2[\u015f\3\2\2\2]\u0161"+
		"\3\2\2\2_\u0163\3\2\2\2a\u0165\3\2\2\2c\u0167\3\2\2\2e\u0169\3\2\2\2g"+
		"\u016b\3\2\2\2i\u016d\3\2\2\2k\u016f\3\2\2\2m\u0176\3\2\2\2o\u017f\3\2"+
		"\2\2q\u018b\3\2\2\2s\u018d\3\2\2\2uv\7.\2\2v\4\3\2\2\2wx\7-\2\2x\6\3\2"+
		"\2\2yz\7/\2\2z\b\3\2\2\2{|\7,\2\2|\n\3\2\2\2}~\7\61\2\2~\f\3\2\2\2\177"+
		"\u0080\7?\2\2\u0080\16\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7-\2\2\u0083"+
		"\20\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086\7/\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0088\7>\2\2\u0088\u0089\7?\2\2\u0089\24\3\2\2\2\u008a\u008b\7@\2\2\u008b"+
		"\u008c\7?\2\2\u008c\26\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f"+
		"\30\3\2\2\2\u0090\u0091\7(\2\2\u0091\32\3\2\2\2\u0092\u0093\7~\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\t\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\17\2"+
		"\2\u0097\36\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7,\2\2\u009a\u009e"+
		"\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\b\20\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7\61\2"+
		"\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\n\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\b\21\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7e\2\2"+
		"\u00b2\u00b3\7n\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba"+
		"\7d\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7e\2\2\u00bd"+
		"&\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7x\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2"+
		"\u00c5(\3\2\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2"+
		"\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf*\3\2\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8,\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7c\2"+
		"\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7e\2\2\u00df.\3\2"+
		"\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7f\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8"+
		"\7r\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7u\2\2"+
		"\u00ef\62\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7z\2\2\u00f2\u00f3\7"+
		"v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7h\2\2\u00fe"+
		"\u00ff\7c\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7g\2\2\u0101\66\3\2\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105\7w\2\2\u0105\u0106\7o\2\2"+
		"\u01068\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7j\2\2\u0109\u010a\7t\2"+
		"\2\u010a\u010b\7q\2\2\u010b\u010c\7y\2\2\u010c\u010d\7u\2\2\u010d:\3\2"+
		"\2\2\u010e\u010f\7v\2\2\u010f\u0110\7j\2\2\u0110\u0111\7k\2\2\u0111\u0112"+
		"\7u\2\2\u0112<\3\2\2\2\u0113\u0114\7t\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7v\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2\2\u0118\u0119\7p\2\2\u0119"+
		">\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7w\2\2\u011d"+
		"\u011e\7g\2\2\u011e@\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7c\2\2\u0121"+
		"\u0122\7n\2\2\u0122\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124B\3\2\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7g\2\2\u0127\u0128\7y\2\2\u0128D\3\2\2\2\u0129"+
		"\u012a\7h\2\2\u012a\u012b\7q\2\2\u012b\u012c\7t\2\2\u012cF\3\2\2\2\u012d"+
		"\u012e\7y\2\2\u012e\u012f\7j\2\2\u012f\u0130\7k\2\2\u0130\u0131\7n\2\2"+
		"\u0131\u0132\7g\2\2\u0132H\3\2\2\2\u0133\u0134\7k\2\2\u0134\u0135\7p\2"+
		"\2\u0135\u0136\7v\2\2\u0136J\3\2\2\2\u0137\u0138\7f\2\2\u0138\u0139\7"+
		"q\2\2\u0139\u013a\7w\2\2\u013a\u013b\7d\2\2\u013b\u013c\7n\2\2\u013c\u013d"+
		"\7g\2\2\u013dL\3\2\2\2\u013e\u013f\7h\2\2\u013f\u0140\7n\2\2\u0140\u0141"+
		"\7q\2\2\u0141\u0142\7c\2\2\u0142\u0143\7v\2\2\u0143N\3\2\2\2\u0144\u0145"+
		"\7U\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7p\2\2\u0149\u014a\7i\2\2\u014aP\3\2\2\2\u014b\u014c\7n\2\2\u014c"+
		"\u014d\7q\2\2\u014d\u014e\7p\2\2\u014e\u014f\7i\2\2\u014fR\3\2\2\2\u0150"+
		"\u0151\7u\2\2\u0151\u0152\7j\2\2\u0152\u0153\7q\2\2\u0153\u0154\7t\2\2"+
		"\u0154\u0155\7v\2\2\u0155T\3\2\2\2\u0156\u0157\7d\2\2\u0157\u0158\7{\2"+
		"\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015aV\3\2\2\2\u015b\u015c\7"+
		"*\2\2\u015cX\3\2\2\2\u015d\u015e\7+\2\2\u015eZ\3\2\2\2\u015f\u0160\7}"+
		"\2\2\u0160\\\3\2\2\2\u0161\u0162\7\177\2\2\u0162^\3\2\2\2\u0163\u0164"+
		"\7]\2\2\u0164`\3\2\2\2\u0165\u0166\7_\2\2\u0166b\3\2\2\2\u0167\u0168\7"+
		">\2\2\u0168d\3\2\2\2\u0169\u016a\7@\2\2\u016af\3\2\2\2\u016b\u016c\7="+
		"\2\2\u016ch\3\2\2\2\u016d\u016e\7\60\2\2\u016ej\3\2\2\2\u016f\u0173\5"+
		"s:\2\u0170\u0172\5q9\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174l\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u017a\7$\2\2\u0177\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\7$\2\2\u017en\3\2\2\2\u017f\u0187\t\4\2\2\u0180"+
		"\u0182\t\5\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0188\t\4\2\2\u0187\u0183\3\2\2\2\u0187\u0188\3\2\2\2\u0188p\3\2\2\2"+
		"\u0189\u018c\5s:\2\u018a\u018c\t\4\2\2\u018b\u0189\3\2\2\2\u018b\u018a"+
		"\3\2\2\2\u018cr\3\2\2\2\u018d\u018e\t\6\2\2\u018et\3\2\2\2\n\2\u009e\u00ac"+
		"\u0173\u017a\u0183\u0187\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}