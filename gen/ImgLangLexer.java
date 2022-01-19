// Generated from C:/Users/jbtok/Desktop/studia_szkola/studia/semestr5/MiAK/imgLang\ImgLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImgLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMBER=27, NUMBER_WS=28, DOUBLE=29, WS=30, ID=31, 
		LETTER=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "NUMBER", "NUMBER_WS", "DOUBLE", "WS", "ID", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'image'", "':'", "'\n'", "'background'", "'width'", "'height'", 
			"'layer'", "'transformations'", "'rotate'", "'scale'", "'color'", "'opacity'", 
			"'rgb'", "'('", "','", "')'", "'shapes'", "'position'", "'priority'", 
			"'rectangle'", "'circle'", "'polygon'", "'radius'", "'vertexes'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMBER", "NUMBER_WS", "DOUBLE", "WS", "ID", "LETTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ImgLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ImgLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00e8\n\34\r\34\16"+
		"\34\u00e9\3\35\7\35\u00ed\n\35\f\35\16\35\u00f0\13\35\3\35\3\35\3\36\6"+
		"\36\u00f5\n\36\r\36\16\36\u00f6\3\36\3\36\7\36\u00fb\n\36\f\36\16\36\u00fe"+
		"\13\36\3\37\6\37\u0101\n\37\r\37\16\37\u0102\3\37\3\37\3 \3 \3 \3 \7 "+
		"\u010b\n \f \16 \u010e\13 \3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\5\3\2\62;\5\2\13\13\17"+
		"\17\"\"\4\2C\\c|\2\u0118\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2"+
		"\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17e\3\2\2\2"+
		"\21k\3\2\2\2\23{\3\2\2\2\25\u0082\3\2\2\2\27\u0088\3\2\2\2\31\u008e\3"+
		"\2\2\2\33\u0096\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2"+
		"\2#\u00a0\3\2\2\2%\u00a7\3\2\2\2\'\u00b0\3\2\2\2)\u00b9\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00ca\3\2\2\2/\u00d2\3\2\2\2\61\u00d9\3\2\2\2\63\u00e2\3\2\2"+
		"\2\65\u00e4\3\2\2\2\67\u00e7\3\2\2\29\u00ee\3\2\2\2;\u00f4\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0106\3\2\2\2A\u010f\3\2\2\2CD\7k\2\2DE\7o\2\2EF\7c\2\2FG\7"+
		"i\2\2GH\7g\2\2H\4\3\2\2\2IJ\7<\2\2J\6\3\2\2\2KL\7\f\2\2L\b\3\2\2\2MN\7"+
		"d\2\2NO\7c\2\2OP\7e\2\2PQ\7m\2\2QR\7i\2\2RS\7t\2\2ST\7q\2\2TU\7w\2\2U"+
		"V\7p\2\2VW\7f\2\2W\n\3\2\2\2XY\7y\2\2YZ\7k\2\2Z[\7f\2\2[\\\7v\2\2\\]\7"+
		"j\2\2]\f\3\2\2\2^_\7j\2\2_`\7g\2\2`a\7k\2\2ab\7i\2\2bc\7j\2\2cd\7v\2\2"+
		"d\16\3\2\2\2ef\7n\2\2fg\7c\2\2gh\7{\2\2hi\7g\2\2ij\7t\2\2j\20\3\2\2\2"+
		"kl\7v\2\2lm\7t\2\2mn\7c\2\2no\7p\2\2op\7u\2\2pq\7h\2\2qr\7q\2\2rs\7t\2"+
		"\2st\7o\2\2tu\7c\2\2uv\7v\2\2vw\7k\2\2wx\7q\2\2xy\7p\2\2yz\7u\2\2z\22"+
		"\3\2\2\2{|\7t\2\2|}\7q\2\2}~\7v\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7g\2\2\u0081\24\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\26\3\2\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7t\2\2\u008d\30\3\2\2\2\u008e\u008f\7q\2\2\u008f\u0090\7"+
		"r\2\2\u0090\u0091\7c\2\2\u0091\u0092\7e\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7{\2\2\u0095\32\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7i\2\2\u0098\u0099\7d\2\2\u0099\34\3\2\2\2\u009a\u009b\7*\2\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\7.\2\2\u009d \3\2\2\2\u009e\u009f\7+\2\2\u009f\""+
		"\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7r\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7p\2\2\u00af&\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7{\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7c\2\2"+
		"\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7{\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1.\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7f\2"+
		"\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7u\2\2\u00d8\60\3"+
		"\2\2\2\u00d9\u00da\7x\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7t\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7z\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7u\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7]\2\2\u00e3\64\3\2\2"+
		"\2\u00e4\u00e5\7_\2\2\u00e5\66\3\2\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"8\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\5\67\34\2\u00f2:\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fc\7\60\2\2\u00f9\u00fb\t\2\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"<\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\3\2\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\37\2\2\u0105>\3\2\2\2\u0106\u010c\5A!\2\u0107\u010b"+
		"\5A!\2\u0108\u010b\5\67\34\2\u0109\u010b\7a\2\2\u010a\u0107\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d@\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110"+
		"\t\4\2\2\u0110B\3\2\2\2\n\2\u00e9\u00ee\u00f6\u00fc\u0102\u010a\u010c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}