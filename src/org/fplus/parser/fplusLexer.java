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
		Placeholder=1, Assign=2, Comma=3, Semicolon=4, LeftBrace=5, RightBrace=6, 
		DollarLeftBrace=7, Prefix=8, Template=9, End=10, Do=11, In=12, Program=13, 
		Module=14, Contains=15, Identifier=16, IntegerConstant=17, StringLiteral=18, 
		Newline=19, WS=20, Noise=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Placeholder", "'='", "','", "';'", "'{'", "'}'", "'${'", "Prefix", "Template", 
		"End", "Do", "In", "Program", "Module", "Contains", "Identifier", "IntegerConstant", 
		"StringLiteral", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Placeholder", "Assign", "Comma", "Semicolon", "LeftBrace", "RightBrace", 
		"DollarLeftBrace", "Prefix", "Template", "End", "Do", "In", "Program", 
		"Module", "Contains", "Identifier", "IntegerConstant", "Nondigit", "NonzeroDigit", 
		"Digit", "StringLiteral", "Newline", "WS", "Noise"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21{\n\21\f\21\16\21~\13\21"+
		"\3\22\3\22\7\22\u0082\n\22\f\22\16\22\u0085\13\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\7\26\u008f\n\26\f\26\16\26\u0092\13\26\3\26\3\26"+
		"\3\27\3\27\5\27\u0098\n\27\3\27\5\27\u009b\n\27\3\30\6\30\u009e\n\30\r"+
		"\30\16\30\u009f\3\31\6\31\u00a3\n\31\r\31\16\31\u00a4\4\u0090\u00a4\32"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'\2\1)\2\1+\24\1"+
		"-\25\1/\26\1\61\27\1\3\2\27\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4"+
		"\2NNnn\4\2CCcc\4\2PPpp\4\2FFff\4\2QQqq\4\2KKkk\4\2TTtt\4\2IIii\4\2WWw"+
		"w\4\2EEee\4\2UUuu\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2"+
		"\21F\3\2\2\2\23L\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31\\\3\2\2\2\33_\3\2"+
		"\2\2\35g\3\2\2\2\37n\3\2\2\2!w\3\2\2\2#\177\3\2\2\2%\u0086\3\2\2\2\'\u0088"+
		"\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\64\7&\2\2\64\65\7}\2\2\65\66\3\2\2\2\66\67\5!\21\2\67"+
		"8\7\177\2\28\4\3\2\2\29:\7?\2\2:\6\3\2\2\2;<\7.\2\2<\b\3\2\2\2=>\7=\2"+
		"\2>\n\3\2\2\2?@\7}\2\2@\f\3\2\2\2AB\7\177\2\2B\16\3\2\2\2CD\7&\2\2DE\7"+
		"}\2\2E\20\3\2\2\2FG\7#\2\2GH\7&\2\2HI\3\2\2\2IJ\t\2\2\2JK\t\3\2\2K\22"+
		"\3\2\2\2LM\t\4\2\2MN\t\5\2\2NO\t\6\2\2OP\t\3\2\2PQ\t\7\2\2QR\t\b\2\2R"+
		"S\t\4\2\2ST\t\5\2\2T\24\3\2\2\2UV\t\5\2\2VW\t\t\2\2WX\t\n\2\2X\26\3\2"+
		"\2\2YZ\t\n\2\2Z[\t\13\2\2[\30\3\2\2\2\\]\t\f\2\2]^\t\t\2\2^\32\3\2\2\2"+
		"_`\t\3\2\2`a\t\r\2\2ab\t\13\2\2bc\t\16\2\2cd\t\r\2\2de\t\b\2\2ef\t\6\2"+
		"\2f\34\3\2\2\2gh\t\6\2\2hi\t\13\2\2ij\t\n\2\2jk\t\17\2\2kl\t\7\2\2lm\t"+
		"\5\2\2m\36\3\2\2\2no\t\20\2\2op\t\13\2\2pq\t\t\2\2qr\t\4\2\2rs\t\b\2\2"+
		"st\t\f\2\2tu\t\t\2\2uv\t\21\2\2v \3\2\2\2w|\5%\23\2x{\5%\23\2y{\5)\25"+
		"\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~|\3\2"+
		"\2\2\177\u0083\5\'\24\2\u0080\u0082\5)\25\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084$\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0086\u0087\t\22\2\2\u0087&\3\2\2\2\u0088\u0089\t"+
		"\23\2\2\u0089(\3\2\2\2\u008a\u008b\t\24\2\2\u008b*\3\2\2\2\u008c\u0090"+
		"\7$\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\7$\2\2\u0094,\3\2\2\2\u0095\u0097\7\17\2\2\u0096\u0098"+
		"\7\f\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009b\7\f\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b.\3\2\2\2"+
		"\u009c\u009e\t\25\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\60\3\2\2\2\u00a1\u00a3\n\26\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\62\3\2\2\2\13\2z|\u0083\u0090\u0097\u009a\u009f\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}