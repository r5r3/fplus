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
		Identifier=32, IntegerConstant=33, StringLiteral=34, AssignPointer=35, 
		Newline=36, WS=37, Noise=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "'<'", "'>'", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Type", "Extends", "Private", 
		"Public", "Sequence", "Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", 
		"StringLiteral", "AssignPointer", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "Colon", "LeftBrace", "RightBrace", "Dollar", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "Smaller", "Larger", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Type", "Extends", "Private", "Public", "Sequence", 
		"Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", "Nondigit", 
		"NonzeroDigit", "Digit", "StringLiteral", "AssignPointer", "Newline", 
		"WS", "Noise"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\7"+
		"!\u00fa\n!\f!\16!\u00fd\13!\3\"\6\"\u0100\n\"\r\"\16\"\u0101\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\7&\u010c\n&\f&\16&\u010f\13&\3&\3&\3\'\3\'\3\'\3(\3(\5"+
		"(\u0118\n(\3(\5(\u011b\n(\3)\6)\u011e\n)\r)\16)\u011f\3*\6*\u0123\n*\r"+
		"*\16*\u0124\4\u010d\u0124+\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E\2\1G\2\1I\2\1K$\1M%\1O&\1Q\'\1S(\1\3"+
		"\2\34\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2KKkk"+
		"\4\2PPpp\4\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2IIii\4\2WWww\4\2UUuu\4\2D"+
		"Ddd\4\2[[{{\4\2ZZzz\4\2XXxx\4\2SSss\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2"+
		"\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2"+
		"\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2"+
		"\2\2\35o\3\2\2\2\37u\3\2\2\2!~\3\2\2\2#\u0088\3\2\2\2%\u008c\3\2\2\2\'"+
		"\u008f\3\2\2\2)\u0097\3\2\2\2+\u009e\3\2\2\2-\u00a7\3\2\2\2/\u00b0\3\2"+
		"\2\2\61\u00bb\3\2\2\2\63\u00c0\3\2\2\2\65\u00c8\3\2\2\2\67\u00d0\3\2\2"+
		"\29\u00d7\3\2\2\2;\u00e0\3\2\2\2=\u00e9\3\2\2\2?\u00ee\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00ff\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K"+
		"\u0109\3\2\2\2M\u0112\3\2\2\2O\u011a\3\2\2\2Q\u011d\3\2\2\2S\u0122\3\2"+
		"\2\2UV\7?\2\2V\4\3\2\2\2WX\7.\2\2X\6\3\2\2\2YZ\7=\2\2Z\b\3\2\2\2[\\\7"+
		"<\2\2\\\n\3\2\2\2]^\7}\2\2^\f\3\2\2\2_`\7\177\2\2`\16\3\2\2\2ab\7&\2\2"+
		"b\20\3\2\2\2cd\7*\2\2d\22\3\2\2\2ef\7+\2\2f\24\3\2\2\2gh\7]\2\2h\26\3"+
		"\2\2\2ij\7_\2\2j\30\3\2\2\2kl\7>\2\2l\32\3\2\2\2mn\7@\2\2n\34\3\2\2\2"+
		"op\7#\2\2pq\7&\2\2qr\3\2\2\2rs\t\2\2\2st\t\3\2\2t\36\3\2\2\2uv\t\4\2\2"+
		"vw\t\5\2\2wx\t\6\2\2xy\t\3\2\2yz\t\7\2\2z{\t\b\2\2{|\t\4\2\2|}\t\5\2\2"+
		"} \3\2\2\2~\177\t\t\2\2\177\u0080\t\n\2\2\u0080\u0081\t\4\2\2\u0081\u0082"+
		"\t\5\2\2\u0082\u0083\t\13\2\2\u0083\u0084\t\2\2\2\u0084\u0085\t\b\2\2"+
		"\u0085\u0086\t\f\2\2\u0086\u0087\t\5\2\2\u0087\"\3\2\2\2\u0088\u0089\t"+
		"\5\2\2\u0089\u008a\t\n\2\2\u008a\u008b\t\r\2\2\u008b$\3\2\2\2\u008c\u008d"+
		"\t\r\2\2\u008d\u008e\t\16\2\2\u008e&\3\2\2\2\u008f\u0090\t\3\2\2\u0090"+
		"\u0091\t\13\2\2\u0091\u0092\t\16\2\2\u0092\u0093\t\17\2\2\u0093\u0094"+
		"\t\13\2\2\u0094\u0095\t\b\2\2\u0095\u0096\t\6\2\2\u0096(\3\2\2\2\u0097"+
		"\u0098\t\6\2\2\u0098\u0099\t\16\2\2\u0099\u009a\t\r\2\2\u009a\u009b\t"+
		"\20\2\2\u009b\u009c\t\7\2\2\u009c\u009d\t\5\2\2\u009d*\3\2\2\2\u009e\u009f"+
		"\t\f\2\2\u009f\u00a0\t\16\2\2\u00a0\u00a1\t\n\2\2\u00a1\u00a2\t\4\2\2"+
		"\u00a2\u00a3\t\b\2\2\u00a3\u00a4\t\t\2\2\u00a4\u00a5\t\n\2\2\u00a5\u00a6"+
		"\t\21\2\2\u00a6,\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\u00a9\t\20\2\2\u00a9"+
		"\u00aa\t\n\2\2\u00aa\u00ab\t\f\2\2\u00ab\u00ac\t\4\2\2\u00ac\u00ad\t\t"+
		"\2\2\u00ad\u00ae\t\16\2\2\u00ae\u00af\t\n\2\2\u00af.\3\2\2\2\u00b0\u00b1"+
		"\t\21\2\2\u00b1\u00b2\t\20\2\2\u00b2\u00b3\t\22\2\2\u00b3\u00b4\t\13\2"+
		"\2\u00b4\u00b5\t\16\2\2\u00b5\u00b6\t\20\2\2\u00b6\u00b7\t\4\2\2\u00b7"+
		"\u00b8\t\t\2\2\u00b8\u00b9\t\n\2\2\u00b9\u00ba\t\5\2\2\u00ba\60\3\2\2"+
		"\2\u00bb\u00bc\t\4\2\2\u00bc\u00bd\t\23\2\2\u00bd\u00be\t\3\2\2\u00be"+
		"\u00bf\t\5\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\t\5\2\2\u00c1\u00c2\t\24\2"+
		"\2\u00c2\u00c3\t\4\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00c5\t\n\2\2\u00c5\u00c6"+
		"\t\r\2\2\u00c6\u00c7\t\21\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9"+
		"\u00ca\t\13\2\2\u00ca\u00cb\t\t\2\2\u00cb\u00cc\t\25\2\2\u00cc\u00cd\t"+
		"\b\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00cf\t\5\2\2\u00cf\66\3\2\2\2\u00d0"+
		"\u00d1\t\3\2\2\u00d1\u00d2\t\20\2\2\u00d2\u00d3\t\22\2\2\u00d3\u00d4\t"+
		"\7\2\2\u00d4\u00d5\t\t\2\2\u00d5\u00d6\t\f\2\2\u00d68\3\2\2\2\u00d7\u00d8"+
		"\t\21\2\2\u00d8\u00d9\t\5\2\2\u00d9\u00da\t\26\2\2\u00da\u00db\t\20\2"+
		"\2\u00db\u00dc\t\5\2\2\u00dc\u00dd\t\n\2\2\u00dd\u00de\t\f\2\2\u00de\u00df"+
		"\t\5\2\2\u00df:\3\2\2\2\u00e0\u00e1\t\b\2\2\u00e1\u00e2\t\22\2\2\u00e2"+
		"\u00e3\t\21\2\2\u00e3\u00e4\t\4\2\2\u00e4\u00e5\t\13\2\2\u00e5\u00e6\t"+
		"\b\2\2\u00e6\u00e7\t\f\2\2\u00e7\u00e8\t\4\2\2\u00e8<\3\2\2\2\u00e9\u00ea"+
		"\t\22\2\2\u00ea\u00eb\t\t\2\2\u00eb\u00ec\t\n\2\2\u00ec\u00ed\t\r\2\2"+
		"\u00ed>\3\2\2\2\u00ee\u00ef\t\17\2\2\u00ef\u00f0\t\5\2\2\u00f0\u00f1\t"+
		"\n\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\t\13\2\2\u00f3\u00f4\t\t\2\2\u00f4"+
		"\u00f5\t\f\2\2\u00f5@\3\2\2\2\u00f6\u00fb\5E#\2\u00f7\u00fa\5E#\2\u00f8"+
		"\u00fa\5I%\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcB\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0100\5I%\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102D\3\2\2\2\u0103\u0104\t\27\2\2"+
		"\u0104F\3\2\2\2\u0105\u0106\t\30\2\2\u0106H\3\2\2\2\u0107\u0108\t\31\2"+
		"\2\u0108J\3\2\2\2\u0109\u010d\7$\2\2\u010a\u010c\13\2\2\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7$\2\2\u0111L\3\2\2\2\u0112"+
		"\u0113\7?\2\2\u0113\u0114\7@\2\2\u0114N\3\2\2\2\u0115\u0117\7\17\2\2\u0116"+
		"\u0118\7\f\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u011b\7\f\2\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"P\3\2\2\2\u011c\u011e\t\32\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120R\3\2\2\2\u0121\u0123\n"+
		"\33\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125T\3\2\2\2\13\2\u00f9\u00fb\u0101\u010d\u0117\u011a"+
		"\u011f\u0124";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}