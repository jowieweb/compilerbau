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
		THIS=29, RETURN=30, TRUE=31, FALSE=32, NEW=33, FINAL=34, FOR=35, WHILE=36, 
		INTEGER=37, DOUBLE=38, FLOAT=39, STRING=40, LONG=41, SHORT=42, BYTE=43, 
		LBRACK=44, RBRACK=45, LCBRACK=46, RCBRACK=47, LSQBRACK=48, RSQBRACK=49, 
		LPBRACK=50, RPBRACK=51, SEMICOLON=52, DOT=53, IDENTIFIER=54, STRING_CONST=55, 
		Digits=56, LetterOrDigit=57, Letter=58;
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
		"NEW", "FINAL", "FOR", "WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", 
		"LONG", "SHORT", "BYTE", "LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", 
		"RSQBRACK", "LPBRACK", "RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", 
		"Digits", "LetterOrDigit", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "'++'", "'--'", "'<='", 
		"'>='", "'=='", "'&'", "'|'", null, null, null, "'class'", "'public'", 
		"'private'", "'protected'", "'abstract'", "'static'", "'void'", "'implements'", 
		"'extends'", "'interface'", "'enum'", "'throws'", "'this'", "'return'", 
		"'true'", "'false'", "'new'", "'final'", "'for'", "'while'", "'int'", 
		"'double'", "'float'", "'String'", "'long'", "'short'", "'byte'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT", "LINE_COMMENT", "CLASS", "PUBLIC", "PRIVATE", 
		"PROTECTED", "ABSTRACT", "STATIC", "VOID", "IMPLEMENTS", "EXTENDS", "INTERFACE", 
		"ENUM", "THROWS", "THIS", "RETURN", "TRUE", "FALSE", "NEW", "FINAL", "FOR", 
		"WHILE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "LONG", "SHORT", "BYTE", 
		"LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "LSQBRACK", "RSQBRACK", "LPBRACK", 
		"RPBRACK", "SEMICOLON", "DOT", "IDENTIFIER", "STRING_CONST", "Digits", 
		"LetterOrDigit", "Letter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00ad\n\21\f\21\16\21\u00b0\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\7\67\u017a\n\67\f\67\16\67\u017d\13\67\38\38\7"+
		"8\u0181\n8\f8\168\u0184\138\38\38\39\39\79\u018a\n9\f9\169\u018d\139\3"+
		"9\59\u0190\n9\3:\3:\5:\u0194\n:\3;\3;\4\u00a0\u0182\2<\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\7\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u019d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{"+
		"\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21"+
		"\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008c\3\2\2\2\27\u008f\3\2\2\2\31\u0092"+
		"\3\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u009a\3\2\2\2!\u00a8\3\2"+
		"\2\2#\u00b3\3\2\2\2%\u00b9\3\2\2\2\'\u00c0\3\2\2\2)\u00c8\3\2\2\2+\u00d2"+
		"\3\2\2\2-\u00db\3\2\2\2/\u00e2\3\2\2\2\61\u00e7\3\2\2\2\63\u00f2\3\2\2"+
		"\2\65\u00fa\3\2\2\2\67\u0104\3\2\2\29\u0109\3\2\2\2;\u0110\3\2\2\2=\u0115"+
		"\3\2\2\2?\u011c\3\2\2\2A\u0121\3\2\2\2C\u0127\3\2\2\2E\u012b\3\2\2\2G"+
		"\u0131\3\2\2\2I\u0135\3\2\2\2K\u013b\3\2\2\2M\u013f\3\2\2\2O\u0146\3\2"+
		"\2\2Q\u014c\3\2\2\2S\u0153\3\2\2\2U\u0158\3\2\2\2W\u015e\3\2\2\2Y\u0163"+
		"\3\2\2\2[\u0165\3\2\2\2]\u0167\3\2\2\2_\u0169\3\2\2\2a\u016b\3\2\2\2c"+
		"\u016d\3\2\2\2e\u016f\3\2\2\2g\u0171\3\2\2\2i\u0173\3\2\2\2k\u0175\3\2"+
		"\2\2m\u0177\3\2\2\2o\u017e\3\2\2\2q\u0187\3\2\2\2s\u0193\3\2\2\2u\u0195"+
		"\3\2\2\2wx\7.\2\2x\4\3\2\2\2yz\7-\2\2z\6\3\2\2\2{|\7/\2\2|\b\3\2\2\2}"+
		"~\7,\2\2~\n\3\2\2\2\177\u0080\7\61\2\2\u0080\f\3\2\2\2\u0081\u0082\7?"+
		"\2\2\u0082\16\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085\7-\2\2\u0085\20\3"+
		"\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7/\2\2\u0088\22\3\2\2\2\u0089\u008a"+
		"\7>\2\2\u008a\u008b\7?\2\2\u008b\24\3\2\2\2\u008c\u008d\7@\2\2\u008d\u008e"+
		"\7?\2\2\u008e\26\3\2\2\2\u008f\u0090\7?\2\2\u0090\u0091\7?\2\2\u0091\30"+
		"\3\2\2\2\u0092\u0093\7(\2\2\u0093\32\3\2\2\2\u0094\u0095\7~\2\2\u0095"+
		"\34\3\2\2\2\u0096\u0097\t\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\17\2"+
		"\2\u0099\36\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2\u009c\u00a0"+
		"\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\20\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2"+
		"\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\n\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\b\21\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7e\2\2"+
		"\u00b4\u00b5\7n\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc"+
		"\7d\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7e\2\2\u00bf"+
		"&\3\2\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7x\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7(\3\2\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7q\2"+
		"\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7f\2\2\u00d1*\3\2\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7v\2\2"+
		"\u00da,\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7c\2"+
		"\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1.\3\2"+
		"\2\2\u00e2\u00e3\7x\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7f\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea"+
		"\7r\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7o\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\62\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7z\2\2\u00f4\u00f5\7"+
		"v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7h\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7e\2\2\u0102\u0103\7g\2\2\u0103\66\3\2\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107\7w\2\2\u0107\u0108\7o\2\2"+
		"\u01088\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b\7j\2\2\u010b\u010c\7t\2"+
		"\2\u010c\u010d\7q\2\2\u010d\u010e\7y\2\2\u010e\u010f\7u\2\2\u010f:\3\2"+
		"\2\2\u0110\u0111\7v\2\2\u0111\u0112\7j\2\2\u0112\u0113\7k\2\2\u0113\u0114"+
		"\7u\2\2\u0114<\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117\7g\2\2\u0117\u0118"+
		"\7v\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a\u011b\7p\2\2\u011b"+
		">\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7w\2\2\u011f"+
		"\u0120\7g\2\2\u0120@\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126B\3\2\2\2\u0127"+
		"\u0128\7p\2\2\u0128\u0129\7g\2\2\u0129\u012a\7y\2\2\u012aD\3\2\2\2\u012b"+
		"\u012c\7h\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7c\2\2"+
		"\u012f\u0130\7n\2\2\u0130F\3\2\2\2\u0131\u0132\7h\2\2\u0132\u0133\7q\2"+
		"\2\u0133\u0134\7t\2\2\u0134H\3\2\2\2\u0135\u0136\7y\2\2\u0136\u0137\7"+
		"j\2\2\u0137\u0138\7k\2\2\u0138\u0139\7n\2\2\u0139\u013a\7g\2\2\u013aJ"+
		"\3\2\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e"+
		"L\3\2\2\2\u013f\u0140\7f\2\2\u0140\u0141\7q\2\2\u0141\u0142\7w\2\2\u0142"+
		"\u0143\7d\2\2\u0143\u0144\7n\2\2\u0144\u0145\7g\2\2\u0145N\3\2\2\2\u0146"+
		"\u0147\7h\2\2\u0147\u0148\7n\2\2\u0148\u0149\7q\2\2\u0149\u014a\7c\2\2"+
		"\u014a\u014b\7v\2\2\u014bP\3\2\2\2\u014c\u014d\7U\2\2\u014d\u014e\7v\2"+
		"\2\u014e\u014f\7t\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151\u0152"+
		"\7i\2\2\u0152R\3\2\2\2\u0153\u0154\7n\2\2\u0154\u0155\7q\2\2\u0155\u0156"+
		"\7p\2\2\u0156\u0157\7i\2\2\u0157T\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a"+
		"\7j\2\2\u015a\u015b\7q\2\2\u015b\u015c\7t\2\2\u015c\u015d\7v\2\2\u015d"+
		"V\3\2\2\2\u015e\u015f\7d\2\2\u015f\u0160\7{\2\2\u0160\u0161\7v\2\2\u0161"+
		"\u0162\7g\2\2\u0162X\3\2\2\2\u0163\u0164\7*\2\2\u0164Z\3\2\2\2\u0165\u0166"+
		"\7+\2\2\u0166\\\3\2\2\2\u0167\u0168\7}\2\2\u0168^\3\2\2\2\u0169\u016a"+
		"\7\177\2\2\u016a`\3\2\2\2\u016b\u016c\7]\2\2\u016cb\3\2\2\2\u016d\u016e"+
		"\7_\2\2\u016ed\3\2\2\2\u016f\u0170\7>\2\2\u0170f\3\2\2\2\u0171\u0172\7"+
		"@\2\2\u0172h\3\2\2\2\u0173\u0174\7=\2\2\u0174j\3\2\2\2\u0175\u0176\7\60"+
		"\2\2\u0176l\3\2\2\2\u0177\u017b\5u;\2\u0178\u017a\5s:\2\u0179\u0178\3"+
		"\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"n\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0182\7$\2\2\u017f\u0181\13\2\2\2"+
		"\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0183\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7$\2\2\u0186"+
		"p\3\2\2\2\u0187\u018f\t\4\2\2\u0188\u018a\t\5\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\t\4\2\2\u018f\u018b\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190r\3\2\2\2\u0191\u0194\5u;\2\u0192\u0194\t\4\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194t\3\2\2\2\u0195\u0196\t\6\2\2"+
		"\u0196v\3\2\2\2\n\2\u00a0\u00ae\u017b\u0182\u018b\u018f\u0193\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}