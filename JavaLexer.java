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
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, CLASS=4, PUBLIC=5, PRIVATE=6, PROTECTED=7, 
		ABSTRACT=8, STATIC=9, VOID=10, IMPLEMENTS=11, EXTENDS=12, INTERFACE=13, 
		ENUM=14, INTEGER=15, DOUBLE=16, FLOAT=17, STRING=18, LONG=19, SHORT=20, 
		BYTE=21, IDENTIFIER=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LINE_COMMENT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", 
		"ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", "ENUM", 
		"INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", "IDENTIFIER", 
		"Digits", "LetterOrDigit", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'class'", "'public'", "'private'", "'protected'", 
		"'abstract'", "'static'", "'void'", "'implements'", "'extends'", "'interface'", 
		"'enum'", "'int'", "'double'", "'float'", "'String'", "'long'", "'short'", 
		"'byte'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", 
		"ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", "ENUM", 
		"INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", "IDENTIFIER"
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


	public JavaLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6\13\27\3\30\3\30\7\30"+
		"\u00da\n\30\f\30\16\30\u00dd\13\30\3\30\5\30\u00e0\n\30\3\31\3\31\5\31"+
		"\u00e4\n\31\3\32\3\32\3?\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61"+
		"\2\63\2\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\4\2\62;aa\6\2&"+
		"&C\\aac|\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7G\3\2\2\2\tR\3\2\2\2\13X\3\2\2\2\r_\3"+
		"\2\2\2\17g\3\2\2\2\21q\3\2\2\2\23z\3\2\2\2\25\u0081\3\2\2\2\27\u0086\3"+
		"\2\2\2\31\u0091\3\2\2\2\33\u0099\3\2\2\2\35\u00a3\3\2\2\2\37\u00a8\3\2"+
		"\2\2!\u00ac\3\2\2\2#\u00b3\3\2\2\2%\u00b9\3\2\2\2\'\u00c0\3\2\2\2)\u00c5"+
		"\3\2\2\2+\u00cb\3\2\2\2-\u00d0\3\2\2\2/\u00d7\3\2\2\2\61\u00e3\3\2\2\2"+
		"\63\u00e5\3\2\2\2\65\66\t\2\2\2\66\67\3\2\2\2\678\b\2\2\28\4\3\2\2\29"+
		":\7\61\2\2:;\7,\2\2;?\3\2\2\2<>\13\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2"+
		"?=\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7,\2\2CD\7\61\2\2DE\3\2\2\2EF\b\3\2\2"+
		"F\6\3\2\2\2GH\7\61\2\2HI\7\61\2\2IM\3\2\2\2JL\n\3\2\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\4\2\2Q\b\3\2\2\2RS\7"+
		"e\2\2ST\7n\2\2TU\7c\2\2UV\7u\2\2VW\7u\2\2W\n\3\2\2\2XY\7r\2\2YZ\7w\2\2"+
		"Z[\7d\2\2[\\\7n\2\2\\]\7k\2\2]^\7e\2\2^\f\3\2\2\2_`\7r\2\2`a\7t\2\2ab"+
		"\7k\2\2bc\7x\2\2cd\7c\2\2de\7v\2\2ef\7g\2\2f\16\3\2\2\2gh\7r\2\2hi\7t"+
		"\2\2ij\7q\2\2jk\7v\2\2kl\7g\2\2lm\7e\2\2mn\7v\2\2no\7g\2\2op\7f\2\2p\20"+
		"\3\2\2\2qr\7c\2\2rs\7d\2\2st\7u\2\2tu\7v\2\2uv\7t\2\2vw\7c\2\2wx\7e\2"+
		"\2xy\7v\2\2y\22\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7c\2\2}~\7v\2\2~\177\7k\2"+
		"\2\177\u0080\7e\2\2\u0080\24\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7"+
		"q\2\2\u0083\u0084\7k\2\2\u0084\u0085\7f\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7o\2\2\u0088\u0089\7r\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7o\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\7u\2\2\u0090\30\3\2\2\2\u0091\u0092\7"+
		"g\2\2\u0092\u0093\7z\2\2\u0093\u0094\7v\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7f\2\2\u0097\u0098\7u\2\2\u0098\32\3\2\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7e\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7"+
		"p\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7o\2\2\u00a7\36\3\2\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\7f\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7d\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\u00b2\7g\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2"+
		"\u00b8$\3\2\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2"+
		"\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7i\2\2\u00bf&\3\2"+
		"\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7i\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7v\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\7d\2\2\u00cc\u00cd\7{\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		",\3\2\2\2\u00d0\u00d4\5\63\32\2\u00d1\u00d3\5\61\31\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		".\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00df\t\4\2\2\u00d8\u00da\t\5\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\t\4\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\60\3\2\2\2\u00e1\u00e4\5\63\32"+
		"\2\u00e2\u00e4\t\4\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\62"+
		"\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\64\3\2\2\2\t\2?M\u00d4\u00db\u00df"+
		"\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}