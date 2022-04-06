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
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, INT=6, DOUBLE=7, ADD=8, MINUS=9, 
		MUL=10, DIV=11, FACT=12, POW=13, RAND=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NUMBER", "INT", "DOUBLE", "ADD", "MINUS", 
			"MUL", "DIV", "FACT", "POW", "RAND", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pocitej'", "'('", "')'", "';'", null, null, null, "'+'", "'-'", 
			"'*'", "'/'", null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMBER", "INT", "DOUBLE", "ADD", "MINUS", 
			"MUL", "DIV", "FACT", "POW", "RAND", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\64\n\6"+
		"\3\7\6\7\67\n\7\r\7\16\78\3\7\3\7\6\7=\n\7\r\7\16\7>\7\7A\n\7\f\7\16\7"+
		"D\13\7\3\7\3\7\3\7\6\7I\n\7\r\7\16\7J\5\7M\n\7\3\b\6\bP\n\b\r\b\16\bQ"+
		"\3\b\3\b\6\bV\n\b\r\b\16\bW\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\6\ba\n\b\r"+
		"\b\16\bb\3\b\3\b\6\bg\n\b\r\b\16\bh\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\6\3\2\62;\4\2ZZzz\5\2\62;CHch\4\2\13\f\17\17\2\u00a6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5+\3\2\2"+
		"\2\7-\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\rL\3\2\2\2\17O\3\2\2\2\21o\3\2"+
		"\2\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33\u0080\3\2\2\2"+
		"\35\u0088\3\2\2\2\37\u0093\3\2\2\2!\u0097\3\2\2\2#$\7r\2\2$%\7q\2\2%&"+
		"\7e\2\2&\'\7k\2\2\'(\7v\2\2()\7g\2\2)*\7l\2\2*\4\3\2\2\2+,\7*\2\2,\6\3"+
		"\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7=\2\2\60\n\3\2\2\2\61\64\5\r\7\2\62\64"+
		"\5\17\b\2\63\61\3\2\2\2\63\62\3\2\2\2\64\f\3\2\2\2\65\67\t\2\2\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29B\3\2\2\2:<\7a\2\2;=\t\2\2"+
		"\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@:\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CM\3\2\2\2DB\3\2\2\2EF\7\62\2\2FH\t\3\2\2GI\t\4"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2L\66\3\2\2\2LE\3"+
		"\2\2\2M\16\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R"+
		"[\3\2\2\2SU\7a\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X"+
		"Z\3\2\2\2YS\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2"+
		"\2^`\7\60\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cl\3\2"+
		"\2\2df\7a\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2"+
		"\2\2jd\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\20\3\2\2\2nl\3\2\2\2op\7"+
		"-\2\2p\22\3\2\2\2qr\7/\2\2r\24\3\2\2\2st\7,\2\2t\26\3\2\2\2uv\7\61\2\2"+
		"v\30\3\2\2\2wx\7h\2\2xy\7c\2\2yz\7e\2\2z{\7v\2\2{|\3\2\2\2|}\7*\2\2}~"+
		"\5\r\7\2~\177\7+\2\2\177\32\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7q"+
		"\2\2\u0082\u0083\7y\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7*\2\2\u0085\u0086"+
		"\5\13\6\2\u0086\u0087\7+\2\2\u0087\34\3\2\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c\u008d\3\2\2"+
		"\2\u008d\u008e\7*\2\2\u008e\u008f\5\r\7\2\u008f\u0090\7.\2\2\u0090\u0091"+
		"\5\r\7\2\u0091\u0092\7+\2\2\u0092\36\3\2\2\2\u0093\u0094\t\5\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\b\20\2\2\u0096 \3\2\2\2\u0097\u0098\7\"\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009a\b\21\2\2\u009a\"\3\2\2\2\17\2\638>BJ"+
		"LQW[bhl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}