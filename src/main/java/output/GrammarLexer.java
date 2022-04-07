// Generated from C:/Users/Karlos/IdeaProjects/Gramatika/src/main/java\Grammar.g4 by ANTLR 4.9.2
package output;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, POW=5, MUL=6, MOD=7, DIV=8, ADD=9, MINUS=10, 
		INV=11, FACT=12, RAND=13, MAX=14, MIN=15, NUMBER=16, INT=17, DOUBLE=18, 
		NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "POW", "MUL", "MOD", "DIV", "ADD", "MINUS", 
			"INV", "FACT", "RAND", "MAX", "MIN", "NUMBER", "INT", "DOUBLE", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'^'", "'*'", "'%'", "'/'", "'+'", 
			"'-'", null, null, null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "POW", "MUL", "MOD", "DIV", "ADD", "MINUS", 
			"INV", "FACT", "RAND", "MAX", "MIN", "NUMBER", "INT", "DOUBLE", "NEWLINE", 
			"WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\fJ\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\rY\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17q\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20}\n\20\3\21"+
		"\3\21\5\21\u0081\n\21\3\22\6\22\u0084\n\22\r\22\16\22\u0085\3\22\6\22"+
		"\u0089\n\22\r\22\16\22\u008a\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3"+
		"\23\6\23\u0093\n\23\r\23\16\23\u0094\3\23\6\23\u0098\n\23\r\23\16\23\u0099"+
		"\7\23\u009c\n\23\f\23\16\23\u009f\13\23\3\23\3\23\6\23\u00a3\n\23\r\23"+
		"\16\23\u00a4\3\23\6\23\u00a8\n\23\r\23\16\23\u00a9\7\23\u00ac\n\23\f\23"+
		"\16\23\u00af\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\2\26\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\4\3\2\62;\4\2\13\f\17\17\2\u00c6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2"+
		"\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25"+
		"=\3\2\2\2\27I\3\2\2\2\31X\3\2\2\2\33d\3\2\2\2\35p\3\2\2\2\37|\3\2\2\2"+
		"!\u0080\3\2\2\2#\u0083\3\2\2\2%\u0092\3\2\2\2\'\u00b0\3\2\2\2)\u00b4\3"+
		"\2\2\2+,\7=\2\2,\4\3\2\2\2-.\7*\2\2.\6\3\2\2\2/\60\7+\2\2\60\b\3\2\2\2"+
		"\61\62\7.\2\2\62\n\3\2\2\2\63\64\7`\2\2\64\f\3\2\2\2\65\66\7,\2\2\66\16"+
		"\3\2\2\2\678\7\'\2\28\20\3\2\2\29:\7\61\2\2:\22\3\2\2\2;<\7-\2\2<\24\3"+
		"\2\2\2=>\7/\2\2>\26\3\2\2\2?@\7k\2\2@A\7p\2\2AJ\7x\2\2BC\7k\2\2CD\7p\2"+
		"\2DE\7x\2\2EF\7g\2\2FG\7t\2\2GH\7u\2\2HJ\7g\2\2I?\3\2\2\2IB\3\2\2\2J\30"+
		"\3\2\2\2KL\7h\2\2LM\7c\2\2MN\7e\2\2NY\7v\2\2OP\7h\2\2PQ\7c\2\2QR\7e\2"+
		"\2RS\7v\2\2ST\7q\2\2TU\7t\2\2UV\7k\2\2VW\7c\2\2WY\7n\2\2XK\3\2\2\2XO\3"+
		"\2\2\2Y\32\3\2\2\2Z[\7t\2\2[\\\7c\2\2\\]\7p\2\2]e\7f\2\2^_\7t\2\2_`\7"+
		"c\2\2`a\7p\2\2ab\7f\2\2bc\7q\2\2ce\7o\2\2dZ\3\2\2\2d^\3\2\2\2e\34\3\2"+
		"\2\2fg\7o\2\2gh\7c\2\2hq\7z\2\2ij\7o\2\2jk\7c\2\2kl\7z\2\2lm\7k\2\2mn"+
		"\7o\2\2no\7w\2\2oq\7o\2\2pf\3\2\2\2pi\3\2\2\2q\36\3\2\2\2rs\7o\2\2st\7"+
		"k\2\2t}\7p\2\2uv\7o\2\2vw\7k\2\2wx\7p\2\2xy\7k\2\2yz\7o\2\2z{\7w\2\2{"+
		"}\7o\2\2|r\3\2\2\2|u\3\2\2\2} \3\2\2\2~\u0081\5#\22\2\177\u0081\5%\23"+
		"\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\"\3\2\2\2\u0082\u0084\t\2\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u008e\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f$\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u009d\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0097\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\60"+
		"\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ad\3\2\2\2\u00a6\u00a8\t\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae&\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\24\2\2"+
		"\u00b3(\3\2\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b"+
		"\25\2\2\u00b7*\3\2\2\2\22\2IXdp|\u0080\u0085\u008a\u008e\u0094\u0099\u009d"+
		"\u00a4\u00a9\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}