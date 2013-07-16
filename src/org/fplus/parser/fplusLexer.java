// Generated from fplus.g4 by ANTLR 4.1
package org.fplus.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fplusLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Assign=1, Comma=2, Semicolon=3, Colon=4, LeftBrace=5, RightBrace=6, Dollar=7, 
		LeftParen=8, RightParen=9, LeftBracket=10, RightBracket=11, Smaller=12, 
		Larger=13, Prefix=14, Template=15, Interface=16, End=17, Do=18, Program=19, 
		Module=20, Contains=21, Function=22, Subroutine=23, Type=24, Extends=25, 
		Private=26, Public=27, Sequence=28, Abstract=29, Bind=30, Generic=31, 
		Identifier=32, IntegerConstant=33, StringLiteral=34, Newline=35, WS=36, 
		Noise=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "'<'", "'>'", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Type", "Extends", "Private", 
		"Public", "Sequence", "Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", 
		"StringLiteral", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "Colon", "LeftBrace", "RightBrace", "Dollar", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "Smaller", "Larger", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Type", "Extends", "Private", "Public", "Sequence", 
		"Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", "Nondigit", 
		"NonzeroDigit", "Digit", "StringLiteral", "Newline", "WS", "Noise"
	};


	public fplusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\7!\u00f8"+
		"\n!\f!\16!\u00fb\13!\3\"\6\"\u00fe\n\"\r\"\16\"\u00ff\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\7&\u010a\n&\f&\16&\u010d\13&\3&\3&\3\'\3\'\5\'\u0113\n\'\3\'\5"+
		"\'\u0116\n\'\3(\6(\u0119\n(\r(\16(\u011a\3)\6)\u011e\n)\r)\16)\u011f\4"+
		"\u010b\u011f*\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1"+
		"= \1?!\1A\"\1C#\1E\2\1G\2\1I\2\1K$\1M%\1O&\1Q\'\1\3\2\34\4\2HHhh\4\2R"+
		"Rrr\4\2VVvv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2KKkk\4\2PPpp\4\2TTtt\4"+
		"\2EEee\4\2FFff\4\2QQqq\4\2IIii\4\2WWww\4\2UUuu\4\2DDdd\4\2[[{{\4\2ZZz"+
		"z\4\2XXxx\4\2SSss\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY"+
		"\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25"+
		"e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37s\3\2\2\2"+
		"!|\3\2\2\2#\u0086\3\2\2\2%\u008a\3\2\2\2\'\u008d\3\2\2\2)\u0095\3\2\2"+
		"\2+\u009c\3\2\2\2-\u00a5\3\2\2\2/\u00ae\3\2\2\2\61\u00b9\3\2\2\2\63\u00be"+
		"\3\2\2\2\65\u00c6\3\2\2\2\67\u00ce\3\2\2\29\u00d5\3\2\2\2;\u00de\3\2\2"+
		"\2=\u00e7\3\2\2\2?\u00ec\3\2\2\2A\u00f4\3\2\2\2C\u00fd\3\2\2\2E\u0101"+
		"\3\2\2\2G\u0103\3\2\2\2I\u0105\3\2\2\2K\u0107\3\2\2\2M\u0115\3\2\2\2O"+
		"\u0118\3\2\2\2Q\u011d\3\2\2\2ST\7?\2\2T\4\3\2\2\2UV\7.\2\2V\6\3\2\2\2"+
		"WX\7=\2\2X\b\3\2\2\2YZ\7<\2\2Z\n\3\2\2\2[\\\7}\2\2\\\f\3\2\2\2]^\7\177"+
		"\2\2^\16\3\2\2\2_`\7&\2\2`\20\3\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7+\2\2d\24"+
		"\3\2\2\2ef\7]\2\2f\26\3\2\2\2gh\7_\2\2h\30\3\2\2\2ij\7>\2\2j\32\3\2\2"+
		"\2kl\7@\2\2l\34\3\2\2\2mn\7#\2\2no\7&\2\2op\3\2\2\2pq\t\2\2\2qr\t\3\2"+
		"\2r\36\3\2\2\2st\t\4\2\2tu\t\5\2\2uv\t\6\2\2vw\t\3\2\2wx\t\7\2\2xy\t\b"+
		"\2\2yz\t\4\2\2z{\t\5\2\2{ \3\2\2\2|}\t\t\2\2}~\t\n\2\2~\177\t\4\2\2\177"+
		"\u0080\t\5\2\2\u0080\u0081\t\13\2\2\u0081\u0082\t\2\2\2\u0082\u0083\t"+
		"\b\2\2\u0083\u0084\t\f\2\2\u0084\u0085\t\5\2\2\u0085\"\3\2\2\2\u0086\u0087"+
		"\t\5\2\2\u0087\u0088\t\n\2\2\u0088\u0089\t\r\2\2\u0089$\3\2\2\2\u008a"+
		"\u008b\t\r\2\2\u008b\u008c\t\16\2\2\u008c&\3\2\2\2\u008d\u008e\t\3\2\2"+
		"\u008e\u008f\t\13\2\2\u008f\u0090\t\16\2\2\u0090\u0091\t\17\2\2\u0091"+
		"\u0092\t\13\2\2\u0092\u0093\t\b\2\2\u0093\u0094\t\6\2\2\u0094(\3\2\2\2"+
		"\u0095\u0096\t\6\2\2\u0096\u0097\t\16\2\2\u0097\u0098\t\r\2\2\u0098\u0099"+
		"\t\20\2\2\u0099\u009a\t\7\2\2\u009a\u009b\t\5\2\2\u009b*\3\2\2\2\u009c"+
		"\u009d\t\f\2\2\u009d\u009e\t\16\2\2\u009e\u009f\t\n\2\2\u009f\u00a0\t"+
		"\4\2\2\u00a0\u00a1\t\b\2\2\u00a1\u00a2\t\t\2\2\u00a2\u00a3\t\n\2\2\u00a3"+
		"\u00a4\t\21\2\2\u00a4,\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\t\20\2"+
		"\2\u00a7\u00a8\t\n\2\2\u00a8\u00a9\t\f\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ab"+
		"\t\t\2\2\u00ab\u00ac\t\16\2\2\u00ac\u00ad\t\n\2\2\u00ad.\3\2\2\2\u00ae"+
		"\u00af\t\21\2\2\u00af\u00b0\t\20\2\2\u00b0\u00b1\t\22\2\2\u00b1\u00b2"+
		"\t\13\2\2\u00b2\u00b3\t\16\2\2\u00b3\u00b4\t\20\2\2\u00b4\u00b5\t\4\2"+
		"\2\u00b5\u00b6\t\t\2\2\u00b6\u00b7\t\n\2\2\u00b7\u00b8\t\5\2\2\u00b8\60"+
		"\3\2\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bb\t\23\2\2\u00bb\u00bc\t\3\2\2"+
		"\u00bc\u00bd\t\5\2\2\u00bd\62\3\2\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c0"+
		"\t\24\2\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00c3\t\n\2\2"+
		"\u00c3\u00c4\t\r\2\2\u00c4\u00c5\t\21\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\t\3\2\2\u00c7\u00c8\t\13\2\2\u00c8\u00c9\t\t\2\2\u00c9\u00ca\t\25\2\2"+
		"\u00ca\u00cb\t\b\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\t\5\2\2\u00cd\66"+
		"\3\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\u00d0\t\20\2\2\u00d0\u00d1\t\22\2\2"+
		"\u00d1\u00d2\t\7\2\2\u00d2\u00d3\t\t\2\2\u00d3\u00d4\t\f\2\2\u00d48\3"+
		"\2\2\2\u00d5\u00d6\t\21\2\2\u00d6\u00d7\t\5\2\2\u00d7\u00d8\t\26\2\2\u00d8"+
		"\u00d9\t\20\2\2\u00d9\u00da\t\5\2\2\u00da\u00db\t\n\2\2\u00db\u00dc\t"+
		"\f\2\2\u00dc\u00dd\t\5\2\2\u00dd:\3\2\2\2\u00de\u00df\t\b\2\2\u00df\u00e0"+
		"\t\22\2\2\u00e0\u00e1\t\21\2\2\u00e1\u00e2\t\4\2\2\u00e2\u00e3\t\13\2"+
		"\2\u00e3\u00e4\t\b\2\2\u00e4\u00e5\t\f\2\2\u00e5\u00e6\t\4\2\2\u00e6<"+
		"\3\2\2\2\u00e7\u00e8\t\22\2\2\u00e8\u00e9\t\t\2\2\u00e9\u00ea\t\n\2\2"+
		"\u00ea\u00eb\t\r\2\2\u00eb>\3\2\2\2\u00ec\u00ed\t\17\2\2\u00ed\u00ee\t"+
		"\5\2\2\u00ee\u00ef\t\n\2\2\u00ef\u00f0\t\5\2\2\u00f0\u00f1\t\13\2\2\u00f1"+
		"\u00f2\t\t\2\2\u00f2\u00f3\t\f\2\2\u00f3@\3\2\2\2\u00f4\u00f9\5E#\2\u00f5"+
		"\u00f8\5E#\2\u00f6\u00f8\5I%\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faB\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5I%\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100D\3\2\2\2"+
		"\u0101\u0102\t\27\2\2\u0102F\3\2\2\2\u0103\u0104\t\30\2\2\u0104H\3\2\2"+
		"\2\u0105\u0106\t\31\2\2\u0106J\3\2\2\2\u0107\u010b\7$\2\2\u0108\u010a"+
		"\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f"+
		"\7$\2\2\u010fL\3\2\2\2\u0110\u0112\7\17\2\2\u0111\u0113\7\f\2\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0116\7\f"+
		"\2\2\u0115\u0110\3\2\2\2\u0115\u0114\3\2\2\2\u0116N\3\2\2\2\u0117\u0119"+
		"\t\32\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011bP\3\2\2\2\u011c\u011e\n\33\2\2\u011d\u011c\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"R\3\2\2\2\13\2\u00f7\u00f9\u00ff\u010b\u0112\u0115\u011a\u011f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}