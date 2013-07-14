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
		End=13, Do=14, In=15, Program=16, Module=17, Contains=18, Identifier=19, 
		IntegerConstant=20, StringLiteral=21, Newline=22, WS=23, Noise=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", "']'", 
		"Prefix", "Template", "End", "Do", "In", "Program", "Module", "Contains", 
		"Identifier", "IntegerConstant", "StringLiteral", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "Prefix", "Template", "End", 
		"Do", "In", "Program", "Module", "Contains", "Identifier", "IntegerConstant", 
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24\3\25\3\25\7\25\u0089"+
		"\n\25\f\25\16\25\u008c\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7"+
		"\31\u0096\n\31\f\31\16\31\u0099\13\31\3\31\3\31\3\32\3\32\5\32\u009f\n"+
		"\32\3\32\5\32\u00a2\n\32\3\33\6\33\u00a5\n\33\r\33\16\33\u00a6\3\34\6"+
		"\34\u00aa\n\34\r\34\16\34\u00ab\4\u0097\u00ab\35\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\2\1-\2\1/\2\1\61\27\1\63"+
		"\30\1\65\31\1\67\32\1\3\2\27\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4"+
		"\2NNnn\4\2CCcc\4\2PPpp\4\2FFff\4\2QQqq\4\2KKkk\4\2TTtt\4\2IIii\4\2WWw"+
		"w\4\2EEee\4\2UUuu\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2"+
		"\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3"+
		"\2\2\2\27M\3\2\2\2\31S\3\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37c\3\2\2\2!f"+
		"\3\2\2\2#n\3\2\2\2%u\3\2\2\2\'~\3\2\2\2)\u0086\3\2\2\2+\u008d\3\2\2\2"+
		"-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u00a1\3\2\2\2\65\u00a4"+
		"\3\2\2\2\67\u00a9\3\2\2\29:\7?\2\2:\4\3\2\2\2;<\7.\2\2<\6\3\2\2\2=>\7"+
		"=\2\2>\b\3\2\2\2?@\7}\2\2@\n\3\2\2\2AB\7\177\2\2B\f\3\2\2\2CD\7&\2\2D"+
		"\16\3\2\2\2EF\7*\2\2F\20\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7]\2\2J\24\3\2"+
		"\2\2KL\7_\2\2L\26\3\2\2\2MN\7#\2\2NO\7&\2\2OP\3\2\2\2PQ\t\2\2\2QR\t\3"+
		"\2\2R\30\3\2\2\2ST\t\4\2\2TU\t\5\2\2UV\t\6\2\2VW\t\3\2\2WX\t\7\2\2XY\t"+
		"\b\2\2YZ\t\4\2\2Z[\t\5\2\2[\32\3\2\2\2\\]\t\5\2\2]^\t\t\2\2^_\t\n\2\2"+
		"_\34\3\2\2\2`a\t\n\2\2ab\t\13\2\2b\36\3\2\2\2cd\t\f\2\2de\t\t\2\2e \3"+
		"\2\2\2fg\t\3\2\2gh\t\r\2\2hi\t\13\2\2ij\t\16\2\2jk\t\r\2\2kl\t\b\2\2l"+
		"m\t\6\2\2m\"\3\2\2\2no\t\6\2\2op\t\13\2\2pq\t\n\2\2qr\t\17\2\2rs\t\7\2"+
		"\2st\t\5\2\2t$\3\2\2\2uv\t\20\2\2vw\t\13\2\2wx\t\t\2\2xy\t\4\2\2yz\t\b"+
		"\2\2z{\t\f\2\2{|\t\t\2\2|}\t\21\2\2}&\3\2\2\2~\u0083\5+\26\2\177\u0082"+
		"\5+\26\2\u0080\u0082\5/\30\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084(\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0086\u008a\5-\27\2\u0087\u0089\5/\30\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"*\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\t\22\2\2\u008e,\3\2\2\2\u008f"+
		"\u0090\t\23\2\2\u0090.\3\2\2\2\u0091\u0092\t\24\2\2\u0092\60\3\2\2\2\u0093"+
		"\u0097\7$\2\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7$\2\2\u009b\62\3\2\2\2\u009c\u009e\7\17\2"+
		"\2\u009d\u009f\7\f\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u00a2\7\f\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\64\3\2\2\2\u00a3\u00a5\t\25\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\66\3\2\2\2\u00a8\u00aa"+
		"\n\26\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ac8\3\2\2\2\13\2\u0081\u0083\u008a\u0097\u009e"+
		"\u00a1\u00a6\u00ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}