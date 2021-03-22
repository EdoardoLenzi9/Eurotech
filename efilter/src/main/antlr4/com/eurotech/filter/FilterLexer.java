// Generated from ../efilter/src/main/antlr4/com/eurotech/filter/Filter.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STR=13, REGEX=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STR", "RGX", "REGEX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$filter='", "' and '", "' or '", "'contains('", "','", "')'", 
			"'regex('", "' eq '", "' gt '", "' lt '", "'not'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STR", "REGEX", "WS"
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


	public FilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Filter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\6\16c\n\16\r\16\16\16d\3\17\6"+
		"\17h\n\17\r\17\16\17i\3\20\3\20\3\20\3\20\3\21\6\21q\n\21\r\21\16\21r"+
		"\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\20!\21\3\2\4\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2w\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5,\3\2\2\2\7"+
		"\62\3\2\2\2\t\67\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21L\3\2\2"+
		"\2\23Q\3\2\2\2\25V\3\2\2\2\27[\3\2\2\2\31_\3\2\2\2\33b\3\2\2\2\35g\3\2"+
		"\2\2\37k\3\2\2\2!p\3\2\2\2#$\7&\2\2$%\7h\2\2%&\7k\2\2&\'\7n\2\2\'(\7v"+
		"\2\2()\7g\2\2)*\7t\2\2*+\7?\2\2+\4\3\2\2\2,-\7\"\2\2-.\7c\2\2./\7p\2\2"+
		"/\60\7f\2\2\60\61\7\"\2\2\61\6\3\2\2\2\62\63\7\"\2\2\63\64\7q\2\2\64\65"+
		"\7t\2\2\65\66\7\"\2\2\66\b\3\2\2\2\678\7e\2\289\7q\2\29:\7p\2\2:;\7v\2"+
		"\2;<\7c\2\2<=\7k\2\2=>\7p\2\2>?\7u\2\2?@\7*\2\2@\n\3\2\2\2AB\7.\2\2B\f"+
		"\3\2\2\2CD\7+\2\2D\16\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7i\2\2HI\7g\2\2IJ\7"+
		"z\2\2JK\7*\2\2K\20\3\2\2\2LM\7\"\2\2MN\7g\2\2NO\7s\2\2OP\7\"\2\2P\22\3"+
		"\2\2\2QR\7\"\2\2RS\7i\2\2ST\7v\2\2TU\7\"\2\2U\24\3\2\2\2VW\7\"\2\2WX\7"+
		"n\2\2XY\7v\2\2YZ\7\"\2\2Z\26\3\2\2\2[\\\7p\2\2\\]\7q\2\2]^\7v\2\2^\30"+
		"\3\2\2\2_`\7*\2\2`\32\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\34\3\2\2\2fh\13\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2j\36\3\2\2\2kl\7)\2\2lm\5\35\17\2mn\7)\2\2n \3\2\2\2oq\t\3\2\2po\3"+
		"\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\21\2\2u\"\3\2\2\2\6"+
		"\2dir\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}