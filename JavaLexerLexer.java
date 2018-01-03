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
		WS=1, COMMENT=2, LINE_COMMENT=3, STUFF=4, CLASS=5, PUBLIC=6, PRIVATE=7, 
		PROTECTED=8, ABSTRACT=9, STATIC=10, VOID=11, IMPLEMENTS=12, EXTENDS=13, 
		INTERFACE=14, ENUM=15, INTEGER=16, DOUBLE=17, FLOAT=18, STRING=19, LONG=20, 
		SHORT=21, BYTE=22, LBRACK=23, RBRACK=24, LCBRACK=25, RCBRACK=26, LSQBRACK=27, 
		RSQBRACK=28, IDENTIFIER=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LINE_COMMENT", "STUFF", "CLASS", "PUBLIC", "PRIVATE", 
		"PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", 
		"ENUM", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", 
		"LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", "IDENTIFIER", 
		"Digits", "LetterOrDigit", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'class'", "'public'", "'private'", "'protected'", 
		"'abstract'", "'static'", "'void'", "'implements'", "'extends'", "'interface'", 
		"'enum'", "'int'", "'double'", "'float'", "'String'", "'long'", "'short'", 
		"'byte'", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "STUFF", "CLASS", "PUBLIC", "PRIVATE", 
		"PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", 
		"ENUM", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", 
		"LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0105\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\7\36\u00f1\n\36\f\36\16\36\u00f4\13\36\3\37\3"+
		"\37\7\37\u00f8\n\37\f\37\16\37\u00fb\13\37\3\37\5\37\u00fe\n\37\3 \3 "+
		"\5 \u0102\n \3!\3!\3M\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37=\2?\2A\2\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\5\2,\61==??\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u0107\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3C\3\2\2\2"+
		"\5G\3\2\2\2\7U\3\2\2\2\t`\3\2\2\2\13d\3\2\2\2\rj\3\2\2\2\17q\3\2\2\2\21"+
		"y\3\2\2\2\23\u0083\3\2\2\2\25\u008c\3\2\2\2\27\u0093\3\2\2\2\31\u0098"+
		"\3\2\2\2\33\u00a3\3\2\2\2\35\u00ab\3\2\2\2\37\u00b5\3\2\2\2!\u00ba\3\2"+
		"\2\2#\u00be\3\2\2\2%\u00c5\3\2\2\2\'\u00cb\3\2\2\2)\u00d2\3\2\2\2+\u00d7"+
		"\3\2\2\2-\u00dd\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2"+
		"\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f5"+
		"\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2CD\t\2\2\2DE\3\2\2\2EF\b\2\2\2F"+
		"\4\3\2\2\2GH\7\61\2\2HI\7,\2\2IM\3\2\2\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2"+
		"\2MN\3\2\2\2MK\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7,\2\2QR\7\61\2\2RS\3\2\2"+
		"\2ST\b\3\2\2T\6\3\2\2\2UV\7\61\2\2VW\7\61\2\2W[\3\2\2\2XZ\n\3\2\2YX\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\b\4\2\2_"+
		"\b\3\2\2\2`a\t\4\2\2ab\3\2\2\2bc\b\5\2\2c\n\3\2\2\2de\7e\2\2ef\7n\2\2"+
		"fg\7c\2\2gh\7u\2\2hi\7u\2\2i\f\3\2\2\2jk\7r\2\2kl\7w\2\2lm\7d\2\2mn\7"+
		"n\2\2no\7k\2\2op\7e\2\2p\16\3\2\2\2qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7x\2"+
		"\2uv\7c\2\2vw\7v\2\2wx\7g\2\2x\20\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7q\2\2|"+
		"}\7v\2\2}~\7g\2\2~\177\7e\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7f\2\2\u0082\22\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7d\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\24\3\2\2\2\u008c\u008d\7"+
		"u\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\u0091"+
		"\7k\2\2\u0091\u0092\7e\2\2\u0092\26\3\2\2\2\u0093\u0094\7x\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7k\2\2\u0096\u0097\7f\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7o\2\2\u009a\u009b\7r\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7o\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1\u00a2\7u\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7"+
		"g\2\2\u00a4\u00a5\7z\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7u\2\2\u00aa\34\3\2\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7e\2\2"+
		"\u00b3\u00b4\7g\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
		"p\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7o\2\2\u00b9 \3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\"\3\2\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6"+
		"\u00c7\7n\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca&\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2"+
		"\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7i\2\2\u00d1(\3\2"+
		"\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7i\2\2\u00d6*\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7v\2\2\u00dc,\3\2\2\2\u00dd\u00de"+
		"\7d\2\2\u00de\u00df\7{\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		".\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5"+
		"\62\3\2\2\2\u00e6\u00e7\7}\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7\177\2\2"+
		"\u00e9\66\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7_\2\2"+
		"\u00ed:\3\2\2\2\u00ee\u00f2\5A!\2\u00ef\u00f1\5? \2\u00f0\u00ef\3\2\2"+
		"\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3<"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fd\t\5\2\2\u00f6\u00f8\t\6\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe>\3\2\2\2\u00ff\u0102\5A!\2\u0100"+
		"\u0102\t\5\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102@\3\2\2\2"+
		"\u0103\u0104\t\7\2\2\u0104B\3\2\2\2\t\2M[\u00f2\u00f9\u00fd\u0101\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}