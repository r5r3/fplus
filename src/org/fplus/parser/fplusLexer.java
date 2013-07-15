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
		Assign=1, Comma=2, Semicolon=3, LeftBrace=4, RightBrace=5, Dollar=6, LeftParen=7, 
		RightParen=8, LeftBracket=9, RightBracket=10, Prefix=11, Template=12, 
		Interface=13, End=14, Do=15, Program=16, Module=17, Contains=18, Function=19, 
		Subroutine=20, Identifier=21, IntegerConstant=22, StringLiteral=23, Newline=24, 
		WS=25, Noise=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", "']'", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Identifier", "IntegerConstant", "StringLiteral", 
		"Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "Prefix", "Template", "Interface", 
		"End", "Do", "Program", "Module", "Contains", "Function", "Subroutine", 
		"Identifier", "IntegerConstant", "Nondigit", "NonzeroDigit", "Digit", 
		"StringLiteral", "Newline", "WS", "Noise"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\34\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\7\26\u00a1\n\26\f\26\16\26\u00a4\13\26\3"+
		"\27\6\27\u00a7\n\27\r\27\16\27\u00a8\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\7\33\u00b3\n\33\f\33\16\33\u00b6\13\33\3\33\3\33\3\34\3\34\5\34"+
		"\u00bc\n\34\3\34\5\34\u00bf\n\34\3\35\6\35\u00c2\n\35\r\35\16\35\u00c3"+
		"\3\36\6\36\u00c7\n\36\r\36\16\36\u00c8\4\u00b4\u00c8\37\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\2\1"+
		"\61\2\1\63\2\1\65\31\1\67\32\19\33\1;\34\1\3\2\30\4\2HHhh\4\2RRrr\4\2"+
		"VVvv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2KKkk\4\2PPpp\4\2TTtt\4\2EEee\4"+
		"\2FFff\4\2QQqq\4\2IIii\4\2WWww\4\2UUuu\4\2DDdd\5\2C\\aac|\3\2\63;\3\2"+
		"\62;\4\2\13\13\"\"\4\2\f\f\17\17\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2"+
		"\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31W\3"+
		"\2\2\2\33`\3\2\2\2\35j\3\2\2\2\37n\3\2\2\2!q\3\2\2\2#y\3\2\2\2%\u0080"+
		"\3\2\2\2\'\u0089\3\2\2\2)\u0092\3\2\2\2+\u009d\3\2\2\2-\u00a6\3\2\2\2"+
		"/\u00aa\3\2\2\2\61\u00ac\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67"+
		"\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c6\3\2\2\2=>\7?\2\2>\4\3\2\2\2?@\7."+
		"\2\2@\6\3\2\2\2AB\7=\2\2B\b\3\2\2\2CD\7}\2\2D\n\3\2\2\2EF\7\177\2\2F\f"+
		"\3\2\2\2GH\7&\2\2H\16\3\2\2\2IJ\7*\2\2J\20\3\2\2\2KL\7+\2\2L\22\3\2\2"+
		"\2MN\7]\2\2N\24\3\2\2\2OP\7_\2\2P\26\3\2\2\2QR\7#\2\2RS\7&\2\2ST\3\2\2"+
		"\2TU\t\2\2\2UV\t\3\2\2V\30\3\2\2\2WX\t\4\2\2XY\t\5\2\2YZ\t\6\2\2Z[\t\3"+
		"\2\2[\\\t\7\2\2\\]\t\b\2\2]^\t\4\2\2^_\t\5\2\2_\32\3\2\2\2`a\t\t\2\2a"+
		"b\t\n\2\2bc\t\4\2\2cd\t\5\2\2de\t\13\2\2ef\t\2\2\2fg\t\b\2\2gh\t\f\2\2"+
		"hi\t\5\2\2i\34\3\2\2\2jk\t\5\2\2kl\t\n\2\2lm\t\r\2\2m\36\3\2\2\2no\t\r"+
		"\2\2op\t\16\2\2p \3\2\2\2qr\t\3\2\2rs\t\13\2\2st\t\16\2\2tu\t\17\2\2u"+
		"v\t\13\2\2vw\t\b\2\2wx\t\6\2\2x\"\3\2\2\2yz\t\6\2\2z{\t\16\2\2{|\t\r\2"+
		"\2|}\t\20\2\2}~\t\7\2\2~\177\t\5\2\2\177$\3\2\2\2\u0080\u0081\t\f\2\2"+
		"\u0081\u0082\t\16\2\2\u0082\u0083\t\n\2\2\u0083\u0084\t\4\2\2\u0084\u0085"+
		"\t\b\2\2\u0085\u0086\t\t\2\2\u0086\u0087\t\n\2\2\u0087\u0088\t\21\2\2"+
		"\u0088&\3\2\2\2\u0089\u008a\t\2\2\2\u008a\u008b\t\20\2\2\u008b\u008c\t"+
		"\n\2\2\u008c\u008d\t\f\2\2\u008d\u008e\t\4\2\2\u008e\u008f\t\t\2\2\u008f"+
		"\u0090\t\16\2\2\u0090\u0091\t\n\2\2\u0091(\3\2\2\2\u0092\u0093\t\21\2"+
		"\2\u0093\u0094\t\20\2\2\u0094\u0095\t\22\2\2\u0095\u0096\t\13\2\2\u0096"+
		"\u0097\t\16\2\2\u0097\u0098\t\20\2\2\u0098\u0099\t\4\2\2\u0099\u009a\t"+
		"\t\2\2\u009a\u009b\t\n\2\2\u009b\u009c\t\5\2\2\u009c*\3\2\2\2\u009d\u00a2"+
		"\5/\30\2\u009e\u00a1\5/\30\2\u009f\u00a1\5\63\32\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\63\32\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9.\3\2\2\2\u00aa\u00ab\t\23\2\2\u00ab\60\3\2\2\2\u00ac\u00ad"+
		"\t\24\2\2\u00ad\62\3\2\2\2\u00ae\u00af\t\25\2\2\u00af\64\3\2\2\2\u00b0"+
		"\u00b4\7$\2\2\u00b1\u00b3\13\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\66\3\2\2\2\u00b9\u00bb\7\17\2"+
		"\2\u00ba\u00bc\7\f\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bf\7\f\2\2\u00be\u00b9\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"8\3\2\2\2\u00c0\u00c2\t\26\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4:\3\2\2\2\u00c5\u00c7\n"+
		"\27\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9<\3\2\2\2\13\2\u00a0\u00a2\u00a8\u00b4\u00bb\u00be"+
		"\u00c3\u00c8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}