// Generated from JavaLexer.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, WS=3, COMMENT=4, LINE_COMMENT=5, STUFF=6, CLASS=7, PUBLIC=8, 
		PRIVATE=9, PROTECTED=10, ABSTRACT=11, STATIC=12, VOID=13, IMPLEMENTS=14, 
		EXTENDS=15, INTERFACE=16, ENUM=17, THROWS=18, INTEGER=19, DOUBLE=20, FLOAT=21, 
		STRING=22, LONG=23, SHORT=24, BYTE=25, LBRACK=26, RBRACK=27, LCBRACK=28, 
		RCBRACK=29, LSQBRACK=30, RSQBRACK=31, SEMICOLON=32, IDENTIFIER=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "COMMENT", "LINE_COMMENT", "STUFF", "CLASS", "PUBLIC", 
		"PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", 
		"INTERFACE", "ENUM", "THROWS", "INTEGER", "DOUBLE", "FLOAT", "STRING", 
		"LONG", "SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", 
		"RSQBRACK", "SEMICOLON", "IDENTIFIER", "Digitss", "LetterOrDigit", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", null, null, null, null, "'class'", "'public'", "'private'", 
		"'protected'", "'abstract'", "'static'", "'void'", "'implements'", "'extends'", 
		"'interface'", "'enum'", "'throws'", "'int'", "'double'", "'float'", "'String'", 
		"'long'", "'short'", "'byte'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "COMMENT", "LINE_COMMENT", "STUFF", "CLASS", "PUBLIC", 
		"PRIVATE", "PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", 
		"INTERFACE", "ENUM", "THROWS", "INTEGER", "DOUBLE", "FLOAT", "STRING", 
		"LONG", "SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", 
		"RSQBRACK", "SEMICOLON", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\"\u0106\n\"\f\"\16\"\u0109"+
		"\13\"\3#\3#\7#\u010d\n#\f#\16#\u0110\13#\3#\5#\u0113\n#\3$\3$\5$\u0117"+
		"\n$\3%\3%\3Y\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E\2G\2I\2\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\6\2,-//\61\61??\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u011c\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2"+
		"\tS\3\2\2\2\13a\3\2\2\2\rl\3\2\2\2\17p\3\2\2\2\21v\3\2\2\2\23}\3\2\2\2"+
		"\25\u0085\3\2\2\2\27\u008f\3\2\2\2\31\u0098\3\2\2\2\33\u009f\3\2\2\2\35"+
		"\u00a4\3\2\2\2\37\u00af\3\2\2\2!\u00b7\3\2\2\2#\u00c1\3\2\2\2%\u00c6\3"+
		"\2\2\2\'\u00cd\3\2\2\2)\u00d1\3\2\2\2+\u00d8\3\2\2\2-\u00de\3\2\2\2/\u00e5"+
		"\3\2\2\2\61\u00ea\3\2\2\2\63\u00f0\3\2\2\2\65\u00f5\3\2\2\2\67\u00f7\3"+
		"\2\2\29\u00f9\3\2\2\2;\u00fb\3\2\2\2=\u00fd\3\2\2\2?\u00ff\3\2\2\2A\u0101"+
		"\3\2\2\2C\u0103\3\2\2\2E\u010a\3\2\2\2G\u0116\3\2\2\2I\u0118\3\2\2\2K"+
		"L\7.\2\2L\4\3\2\2\2MN\7\60\2\2N\6\3\2\2\2OP\t\2\2\2PQ\3\2\2\2QR\b\4\2"+
		"\2R\b\3\2\2\2ST\7\61\2\2TU\7,\2\2UY\3\2\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2"+
		"\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7,\2\2]^\7\61\2\2^_\3"+
		"\2\2\2_`\b\5\2\2`\n\3\2\2\2ab\7\61\2\2bc\7\61\2\2cg\3\2\2\2df\n\3\2\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\b\6\2\2"+
		"k\f\3\2\2\2lm\t\4\2\2mn\3\2\2\2no\b\7\2\2o\16\3\2\2\2pq\7e\2\2qr\7n\2"+
		"\2rs\7c\2\2st\7u\2\2tu\7u\2\2u\20\3\2\2\2vw\7r\2\2wx\7w\2\2xy\7d\2\2y"+
		"z\7n\2\2z{\7k\2\2{|\7e\2\2|\22\3\2\2\2}~\7r\2\2~\177\7t\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7g\2\2\u0084\24\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7e\2\2"+
		"\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\26\3\2"+
		"\2\2\u008f\u0090\7c\2\2\u0090\u0091\7d\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7c\2\2\u0095\u0096\7e\2\2\u0096"+
		"\u0097\7v\2\2\u0097\30\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d\u009e\7e\2\2"+
		"\u009e\32\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7"+
		"k\2\2\u00a2\u00a3\7f\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7o\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7o\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7u\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7"+
		"z\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7u\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\"\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w"+
		"\2\2\u00c4\u00c5\7o\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8"+
		"\7j\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7y\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7*\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2"+
		"\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7v\2\2\u00dd,\3\2\2\2\u00de\u00df\7"+
		"U\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3\u00e4\7i\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7i\2\2\u00e9\60\3\2\2\2\u00ea\u00eb"+
		"\7u\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7{\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6"+
		"\66\3\2\2\2\u00f7\u00f8\7+\2\2\u00f88\3\2\2\2\u00f9\u00fa\7}\2\2\u00fa"+
		":\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7]\2\2\u00fe"+
		">\3\2\2\2\u00ff\u0100\7_\2\2\u0100@\3\2\2\2\u0101\u0102\7=\2\2\u0102B"+
		"\3\2\2\2\u0103\u0107\5I%\2\u0104\u0106\5G$\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108D\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u010a\u0112\t\5\2\2\u010b\u010d\t\6\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\t\5\2\2\u0112\u010e\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113F\3\2\2\2\u0114\u0117\5I%\2\u0115\u0117"+
		"\t\5\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117H\3\2\2\2\u0118"+
		"\u0119\t\7\2\2\u0119J\3\2\2\2\t\2Yg\u0107\u010e\u0112\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}