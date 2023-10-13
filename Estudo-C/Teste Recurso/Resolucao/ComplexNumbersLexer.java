// Generated from ComplexNumbers.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ComplexNumbersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COMPLEX=10, ID=11, REAL=12, NUMBER=13, WS=14, COMMENT=15, ERROR=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"COMPLEX", "ID", "REAL", "NUMBER", "WS", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'<='", "'('", "')'", "'+'", "'-'", "'*'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "COMPLEX", 
			"ID", "REAL", "NUMBER", "WS", "COMMENT", "ERROR"
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


	public ComplexNumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ComplexNumbers.g4"; }

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
		"\u0004\u0000\u0010m\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0003\t<\b\t\u0001\t\u0003\t?\b\t\u0001"+
		"\t\u0003\tB\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\nH\b\n\u000b\n\f"+
		"\nI\u0003\nL\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bQ\b\u000b"+
		"\u0001\f\u0004\fT\b\f\u000b\f\f\fU\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000ec\b\u000e\n\u000e\f\u000ef\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001d\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0002\u0000++--\u0003\u0000"+
		"09AZaz\u0001\u000009\u0003\u0000\t\n\r\r  t\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000"+
		"\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001"+
		"\u0000\u0000\u0000\u000f6\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017"+
		"M\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bW\u0001"+
		"\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000"+
		"\u0000!\"\u0005;\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005d"+
		"\u0000\u0000$%\u0005i\u0000\u0000%&\u0005s\u0000\u0000&\'\u0005p\u0000"+
		"\u0000\'(\u0005l\u0000\u0000()\u0005a\u0000\u0000)*\u0005y\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000,-\u0005=\u0000\u0000"+
		"-\u0006\u0001\u0000\u0000\u0000./\u0005(\u0000\u0000/\b\u0001\u0000\u0000"+
		"\u000001\u0005)\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005+\u0000"+
		"\u00003\f\u0001\u0000\u0000\u000045\u0005-\u0000\u00005\u000e\u0001\u0000"+
		"\u0000\u000067\u0005*\u0000\u00007\u0010\u0001\u0000\u0000\u000089\u0005"+
		":\u0000\u00009\u0012\u0001\u0000\u0000\u0000:<\u0003\u0017\u000b\u0000"+
		";:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=?\u0007\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0003\u0017\u000b\u0000A@\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0005i\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EK\u0007\u0001\u0000"+
		"\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"L\u0016\u0001\u0000\u0000\u0000MP\u0003\u0019\f\u0000NO\u0005.\u0000\u0000"+
		"OQ\u0003\u0019\f\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\u0018\u0001\u0000\u0000\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0007\u0003\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\r\u0000\u0000Z\u001c\u0001\u0000"+
		"\u0000\u0000[\\\u0005*\u0000\u0000\\]\u0005C\u0000\u0000]^\u0005O\u0000"+
		"\u0000^_\u0005M\u0000\u0000_`\u0005*\u0000\u0000`d\u0001\u0000\u0000\u0000"+
		"ac\t\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0005\n\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0006\u000e\u0000\u0000j\u001e\u0001\u0000\u0000\u0000kl\t\u0000"+
		"\u0000\u0000l \u0001\u0000\u0000\u0000\t\u0000;>AIKPUd\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}