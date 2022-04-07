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
		T__0=1, T__1=2, T__2=3, T__3=4, FACT=5, RAND=6, MAX=7, MIN=8, INV=9, NUMBER=10, 
		INT=11, DOUBLE=12, ADD=13, MINUS=14, MUL=15, POW=16, DIV=17, NEWLINE=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "FACT", "RAND", "MAX", "MIN", "INV", 
			"NUMBER", "INT", "DOUBLE", "ADD", "MINUS", "MUL", "POW", "DIV", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", null, null, null, null, null, null, 
			null, null, "'+'", "'-'", "'*'", "'^'", "'/'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FACT", "RAND", "MAX", "MIN", "INV", "NUMBER", 
			"INT", "DOUBLE", "ADD", "MINUS", "MUL", "POW", "DIV", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\5\13s\n\13\3\f\6\fv\n"+
		"\f\r\f\16\fw\3\f\3\f\6\f|\n\f\r\f\16\f}\7\f\u0080\n\f\f\f\16\f\u0083\13"+
		"\f\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\r\3\r\6\r\u008c\n\r\r\r\16\r\u008d"+
		"\7\r\u0090\n\r\f\r\16\r\u0093\13\r\3\r\3\r\6\r\u0097\n\r\r\r\16\r\u0098"+
		"\3\r\3\r\6\r\u009d\n\r\r\r\16\r\u009e\7\r\u00a1\n\r\f\r\16\r\u00a4\13"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\3\2\62;\4\2"+
		"\13\f\17\17\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2"+
		"\7-\3\2\2\2\t/\3\2\2\2\13>\3\2\2\2\rJ\3\2\2\2\17V\3\2\2\2\21b\3\2\2\2"+
		"\23n\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31\u0085\3\2\2\2\33\u00a5\3\2\2\2"+
		"\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af"+
		"\3\2\2\2\'\u00b3\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7*\2\2,\6\3\2\2\2-.\7+"+
		"\2\2.\b\3\2\2\2/\60\7.\2\2\60\n\3\2\2\2\61\62\7h\2\2\62\63\7c\2\2\63\64"+
		"\7e\2\2\64?\7v\2\2\65\66\7h\2\2\66\67\7c\2\2\678\7e\2\289\7v\2\29:\7q"+
		"\2\2:;\7t\2\2;<\7k\2\2<=\7c\2\2=?\7n\2\2>\61\3\2\2\2>\65\3\2\2\2?\f\3"+
		"\2\2\2@A\7t\2\2AB\7c\2\2BC\7p\2\2CK\7f\2\2DE\7t\2\2EF\7c\2\2FG\7p\2\2"+
		"GH\7f\2\2HI\7q\2\2IK\7o\2\2J@\3\2\2\2JD\3\2\2\2K\16\3\2\2\2LM\7o\2\2M"+
		"N\7c\2\2NW\7z\2\2OP\7o\2\2PQ\7c\2\2QR\7z\2\2RS\7k\2\2ST\7o\2\2TU\7w\2"+
		"\2UW\7o\2\2VL\3\2\2\2VO\3\2\2\2W\20\3\2\2\2XY\7o\2\2YZ\7k\2\2Zc\7p\2\2"+
		"[\\\7o\2\2\\]\7k\2\2]^\7p\2\2^_\7k\2\2_`\7o\2\2`a\7w\2\2ac\7o\2\2bX\3"+
		"\2\2\2b[\3\2\2\2c\22\3\2\2\2de\7k\2\2ef\7p\2\2fo\7x\2\2gh\7k\2\2hi\7p"+
		"\2\2ij\7x\2\2jk\7g\2\2kl\7t\2\2lm\7u\2\2mo\7g\2\2nd\3\2\2\2ng\3\2\2\2"+
		"o\24\3\2\2\2ps\5\27\f\2qs\5\31\r\2rp\3\2\2\2rq\3\2\2\2s\26\3\2\2\2tv\t"+
		"\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0081\3\2\2\2y{\7a\2\2"+
		"z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"y\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\30\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0091"+
		"\3\2\2\2\u0089\u008b\7a\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0089\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\60"+
		"\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a2\3\2\2\2\u009a\u009c\7a"+
		"\2\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\32\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6\34\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa \3\2\2\2\u00ab"+
		"\u00ac\7`\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae$\3\2\2\2\u00af"+
		"\u00b0\t\3\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\23\2\2\u00b2&\3\2\2\2"+
		"\u00b3\u00b4\7\"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\24\2\2\u00b6(\3"+
		"\2\2\2\22\2>JVbnrw}\u0081\u0087\u008d\u0091\u0098\u009e\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}