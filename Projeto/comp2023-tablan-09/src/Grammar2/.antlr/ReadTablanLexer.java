// Generated from /Users/robertocastro/Downloads/comp2023-tablan-09/src/2Grammar/ReadTablan.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReadTablanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEP=3, STRING=4, NUMBER=5, TEXT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "SEP", "STRING", "NUMBER", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SEP", "STRING", "NUMBER", "TEXT"
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


	public ReadTablanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReadTablan.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bW\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\7\4\25\n\4"+
		"\f\4\16\4\30\13\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\4\3\4\5\4#\n\4"+
		"\3\5\7\5&\n\5\f\5\16\5)\13\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5"+
		"\7\5\64\n\5\f\5\16\5\67\13\5\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\5\6@\n\6"+
		"\3\6\6\6C\n\6\r\6\16\6D\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\6\7N\n\7\r\7\16"+
		"\7O\3\7\7\7S\n\7\f\7\16\7V\13\7\3.\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\6"+
		"\4\2\13\13\"\"\3\2\62;\6\2\f\f\17\17$$..\5\2\f\f\17\17..\2b\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3"+
		"\2\2\2\5\21\3\2\2\2\7\"\3\2\2\2\t\'\3\2\2\2\13;\3\2\2\2\rM\3\2\2\2\17"+
		"\20\7\17\2\2\20\4\3\2\2\2\21\22\7\f\2\2\22\6\3\2\2\2\23\25\t\2\2\2\24"+
		"\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30"+
		"\26\3\2\2\2\31\35\7.\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 !\7=\2\2!#\7=\2\2"+
		"\"\26\3\2\2\2\" \3\2\2\2#\b\3\2\2\2$&\t\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\7$\2\2+-\13\2\2\2,+\3\2\2\2-"+
		"\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\7$\2\2\62"+
		"\64\t\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\n\3\2\2\2\67\65\3\2\2\28:\t\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2>@\7/\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\t\3"+
		"\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EI\3\2\2\2FH\t\2\2\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\f\3\2\2\2KI\3\2\2\2LN\n\4\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\n\5\2\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2U\16\3\2\2\2VT\3\2\2\2\17\2\26\35\"\'.\65;?"+
		"DIOT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}