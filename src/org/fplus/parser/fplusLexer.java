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
		End=13, Do=14, Program=15, Module=16, Contains=17, Identifier=18, IntegerConstant=19, 
		StringLiteral=20, Newline=21, WS=22, Noise=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", "']'", 
		"Prefix", "Template", "End", "Do", "Program", "Module", "Contains", "Identifier", 
		"IntegerConstant", "StringLiteral", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "Prefix", "Template", "End", 
		"Do", "Program", "Module", "Contains", "Identifier", "IntegerConstant", 
		"Nondigit", "NonzeroDigit", "Digit", "StringLiteral", "Newline", "WS", 
		"Noise"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23}\n\23"+
		"\f\23\16\23\u0080\13\23\3\24\6\24\u0083\n\24\r\24\16\24\u0084\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u008f\n\30\f\30\16\30\u0092\13\30"+
		"\3\30\3\30\3\31\3\31\5\31\u0098\n\31\3\31\5\31\u009b\n\31\3\32\6\32\u009e"+
		"\n\32\r\32\16\32\u009f\3\33\6\33\u00a3\n\33\r\33\16\33\u00a4\4\u0090\u00a4"+
		"\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\2\1"+
		"+\2\1-\2\1/\26\1\61\27\1\63\30\1\65\31\1\3\2\27\4\2HHhh\4\2RRrr\4\2VV"+
		"vv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2PPpp\4\2FFff\4\2QQqq\4\2TTtt\4\2"+
		"IIii\4\2WWww\4\2EEee\4\2KKkk\4\2UUuu\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2"+
		"\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2"+
		"\25I\3\2\2\2\27K\3\2\2\2\31Q\3\2\2\2\33Z\3\2\2\2\35^\3\2\2\2\37a\3\2\2"+
		"\2!i\3\2\2\2#p\3\2\2\2%y\3\2\2\2\'\u0082\3\2\2\2)\u0086\3\2\2\2+\u0088"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u009a\3\2\2\2\63\u009d\3\2\2"+
		"\2\65\u00a2\3\2\2\2\678\7?\2\28\4\3\2\2\29:\7.\2\2:\6\3\2\2\2;<\7=\2\2"+
		"<\b\3\2\2\2=>\7}\2\2>\n\3\2\2\2?@\7\177\2\2@\f\3\2\2\2AB\7&\2\2B\16\3"+
		"\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7+\2\2F\22\3\2\2\2GH\7]\2\2H\24\3\2\2\2"+
		"IJ\7_\2\2J\26\3\2\2\2KL\7#\2\2LM\7&\2\2MN\3\2\2\2NO\t\2\2\2OP\t\3\2\2"+
		"P\30\3\2\2\2QR\t\4\2\2RS\t\5\2\2ST\t\6\2\2TU\t\3\2\2UV\t\7\2\2VW\t\b\2"+
		"\2WX\t\4\2\2XY\t\5\2\2Y\32\3\2\2\2Z[\t\5\2\2[\\\t\t\2\2\\]\t\n\2\2]\34"+
		"\3\2\2\2^_\t\n\2\2_`\t\13\2\2`\36\3\2\2\2ab\t\3\2\2bc\t\f\2\2cd\t\13\2"+
		"\2de\t\r\2\2ef\t\f\2\2fg\t\b\2\2gh\t\6\2\2h \3\2\2\2ij\t\6\2\2jk\t\13"+
		"\2\2kl\t\n\2\2lm\t\16\2\2mn\t\7\2\2no\t\5\2\2o\"\3\2\2\2pq\t\17\2\2qr"+
		"\t\13\2\2rs\t\t\2\2st\t\4\2\2tu\t\b\2\2uv\t\20\2\2vw\t\t\2\2wx\t\21\2"+
		"\2x$\3\2\2\2y~\5)\25\2z}\5)\25\2{}\5-\27\2|z\3\2\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177&\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\5-\27\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085(\3\2\2\2\u0086\u0087\t\22\2\2\u0087*\3\2\2\2\u0088"+
		"\u0089\t\23\2\2\u0089,\3\2\2\2\u008a\u008b\t\24\2\2\u008b.\3\2\2\2\u008c"+
		"\u0090\7$\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7$\2\2\u0094\60\3\2\2\2\u0095\u0097\7\17\2"+
		"\2\u0096\u0098\7\f\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u009b\7\f\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\62\3\2\2\2\u009c\u009e\t\25\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\64\3\2\2\2\u00a1\u00a3"+
		"\n\26\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\66\3\2\2\2\13\2|~\u0084\u0090\u0097\u009a\u009f"+
		"\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}