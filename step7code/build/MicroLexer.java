// Generated from Micro.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM_KEYWORD=1, BEGIN_KEYWORD=2, END_KEYWORD=3, FUNCTION_KEYWORD=4, 
		READ_KEYWORD=5, WRITE_KEYWORD=6, IF_KEYWORD=7, ELSIF_KEYWORD=8, ENDIF_KEYWORD=9, 
		DO_KEYWORD=10, WHILE_KEYWORD=11, CONTINUE_KEYWORD=12, BREAK_KEYWORD=13, 
		RETURN_KEYWORD=14, INT_KEYWORD=15, VOID_KEYWORD=16, STRING_KEYWORD=17, 
		FLOAT_KEYWORD=18, TRUE_KEYWORD=19, FALSE_KEYWORD=20, ASSIGN_OP=21, ADD_OP=22, 
		SUB_OP=23, DIV_OP=24, EQ_OP=25, MUL_OP=26, NEQ_OP=27, LT_OP=28, GT_OP=29, 
		PAREN_OP=30, CPAREN_OP=31, SEMI_OP=32, COM_OP=33, LTE_OP=34, GTE_OP=35, 
		WHITESPACE=36, IDENTIFIER=37, INTLITERAL=38, FLOATLITERAL=39, STRINGLITERAL=40, 
		COMMENT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM_KEYWORD", "BEGIN_KEYWORD", "END_KEYWORD", "FUNCTION_KEYWORD", 
		"READ_KEYWORD", "WRITE_KEYWORD", "IF_KEYWORD", "ELSIF_KEYWORD", "ENDIF_KEYWORD", 
		"DO_KEYWORD", "WHILE_KEYWORD", "CONTINUE_KEYWORD", "BREAK_KEYWORD", "RETURN_KEYWORD", 
		"INT_KEYWORD", "VOID_KEYWORD", "STRING_KEYWORD", "FLOAT_KEYWORD", "TRUE_KEYWORD", 
		"FALSE_KEYWORD", "ASSIGN_OP", "ADD_OP", "SUB_OP", "DIV_OP", "EQ_OP", "MUL_OP", 
		"NEQ_OP", "LT_OP", "GT_OP", "PAREN_OP", "CPAREN_OP", "SEMI_OP", "COM_OP", 
		"LTE_OP", "GTE_OP", "WHITESPACE", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", "'WRITE'", 
		"'IF'", "'ELSIF'", "'ENDIF'", "'DO'", "'WHILE'", "'CONTINUE'", "'BREAK'", 
		"'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'", "'TRUE'", "'FALSE'", 
		"':='", "'+'", "'-'", "'/'", "'='", "'*'", "'!='", "'<'", "'>'", "'('", 
		"')'", "';'", "','", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM_KEYWORD", "BEGIN_KEYWORD", "END_KEYWORD", "FUNCTION_KEYWORD", 
		"READ_KEYWORD", "WRITE_KEYWORD", "IF_KEYWORD", "ELSIF_KEYWORD", "ENDIF_KEYWORD", 
		"DO_KEYWORD", "WHILE_KEYWORD", "CONTINUE_KEYWORD", "BREAK_KEYWORD", "RETURN_KEYWORD", 
		"INT_KEYWORD", "VOID_KEYWORD", "STRING_KEYWORD", "FLOAT_KEYWORD", "TRUE_KEYWORD", 
		"FALSE_KEYWORD", "ASSIGN_OP", "ADD_OP", "SUB_OP", "DIV_OP", "EQ_OP", "MUL_OP", 
		"NEQ_OP", "LT_OP", "GT_OP", "PAREN_OP", "CPAREN_OP", "SEMI_OP", "COM_OP", 
		"LTE_OP", "GTE_OP", "WHITESPACE", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\6%\u00ee\n%\r%\16%\u00ef\3%\3%\3&\3&"+
		"\3&\7&\u00f7\n&\f&\16&\u00fa\13&\5&\u00fc\n&\3\'\6\'\u00ff\n\'\r\'\16"+
		"\'\u0100\3(\7(\u0104\n(\f(\16(\u0107\13(\3(\3(\7(\u010b\n(\f(\16(\u010e"+
		"\13(\3)\3)\7)\u0112\n)\f)\16)\u0115\13)\3)\3)\3*\3*\3*\3*\7*\u011d\n*"+
		"\f*\16*\u0120\13*\3*\3*\4\u0105\u0113\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2"+
		"\b\5\2\13\f\16\17\"\"\3\2C|\4\2\62;C|\3\2\62;\4\2))\60\60\4\2\f\f\17\17"+
		"\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\3U\3\2\2\2\5]\3\2\2\2\7c\3\2\2\2\tg\3\2\2\2\13p\3\2\2\2\ru\3\2"+
		"\2\2\17{\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u008a\3\2\2\2\27\u008d"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u009c\3\2\2\2\35\u00a2\3\2\2\2\37\u00a9\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00b2\3\2\2\2%\u00b9\3\2\2\2\'\u00bf\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00ca\3\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2"+
		"\63\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00dc"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00e9\3\2\2\2I\u00ed\3\2\2\2K\u00fb\3\2\2\2M\u00fe\3\2"+
		"\2\2O\u0105\3\2\2\2Q\u010f\3\2\2\2S\u0118\3\2\2\2UV\7R\2\2VW\7T\2\2WX"+
		"\7Q\2\2XY\7I\2\2YZ\7T\2\2Z[\7C\2\2[\\\7O\2\2\\\4\3\2\2\2]^\7D\2\2^_\7"+
		"G\2\2_`\7I\2\2`a\7K\2\2ab\7P\2\2b\6\3\2\2\2cd\7G\2\2de\7P\2\2ef\7F\2\2"+
		"f\b\3\2\2\2gh\7H\2\2hi\7W\2\2ij\7P\2\2jk\7E\2\2kl\7V\2\2lm\7K\2\2mn\7"+
		"Q\2\2no\7P\2\2o\n\3\2\2\2pq\7T\2\2qr\7G\2\2rs\7C\2\2st\7F\2\2t\f\3\2\2"+
		"\2uv\7Y\2\2vw\7T\2\2wx\7K\2\2xy\7V\2\2yz\7G\2\2z\16\3\2\2\2{|\7K\2\2|"+
		"}\7H\2\2}\20\3\2\2\2~\177\7G\2\2\177\u0080\7N\2\2\u0080\u0081\7U\2\2\u0081"+
		"\u0082\7K\2\2\u0082\u0083\7H\2\2\u0083\22\3\2\2\2\u0084\u0085\7G\2\2\u0085"+
		"\u0086\7P\2\2\u0086\u0087\7F\2\2\u0087\u0088\7K\2\2\u0088\u0089\7H\2\2"+
		"\u0089\24\3\2\2\2\u008a\u008b\7F\2\2\u008b\u008c\7Q\2\2\u008c\26\3\2\2"+
		"\2\u008d\u008e\7Y\2\2\u008e\u008f\7J\2\2\u008f\u0090\7K\2\2\u0090\u0091"+
		"\7N\2\2\u0091\u0092\7G\2\2\u0092\30\3\2\2\2\u0093\u0094\7E\2\2\u0094\u0095"+
		"\7Q\2\2\u0095\u0096\7P\2\2\u0096\u0097\7V\2\2\u0097\u0098\7K\2\2\u0098"+
		"\u0099\7P\2\2\u0099\u009a\7W\2\2\u009a\u009b\7G\2\2\u009b\32\3\2\2\2\u009c"+
		"\u009d\7D\2\2\u009d\u009e\7T\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7C\2\2"+
		"\u00a0\u00a1\7M\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7"+
		"G\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7W\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8"+
		"\7P\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac"+
		"\7V\2\2\u00ac \3\2\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7Q\2\2\u00af\u00b0"+
		"\7K\2\2\u00b0\u00b1\7F\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4"+
		"\7V\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7\7P\2\2\u00b7"+
		"\u00b8\7I\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7H\2\2\u00ba\u00bb\7N\2\2\u00bb"+
		"\u00bc\7Q\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7V\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7V\2\2\u00c0\u00c1\7T\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3\7G\2\2"+
		"\u00c3(\3\2\2\2\u00c4\u00c5\7H\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c7\7N\2"+
		"\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7G\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7"+
		"<\2\2\u00cb\u00cc\7?\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce.\3\2"+
		"\2\2\u00cf\u00d0\7/\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\62"+
		"\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6"+
		"\66\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d98\3\2\2\2\u00da"+
		"\u00db\7>\2\2\u00db:\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd<\3\2\2\2\u00de\u00df"+
		"\7*\2\2\u00df>\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7"+
		"=\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7>"+
		"\2\2\u00e7\u00e8\7?\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb"+
		"\7?\2\2\u00ebH\3\2\2\2\u00ec\u00ee\t\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b%\2\2\u00f2J\3\2\2\2\u00f3\u00fc\7-\2\2\u00f4\u00f8\t\3\2\2\u00f5"+
		"\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fcL\3\2\2\2\u00fd\u00ff\t\5\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101N\3\2\2\2\u0102\u0104\t\5\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010c\t\6\2\2\u0109\u010b\t\5\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010dP\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0113\7$\2\2\u0110\u0112"+
		"\n\7\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7$"+
		"\2\2\u0117R\3\2\2\2\u0118\u0119\7/\2\2\u0119\u011a\7/\2\2\u011a\u011e"+
		"\3\2\2\2\u011b\u011d\n\7\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\b*\2\2\u0122T\3\2\2\2\13\2\u00ef\u00f8\u00fb\u0100\u0105"+
		"\u010c\u0113\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}