// Generated from fplus.g4 by ANTLR 4.5
package org.fplus.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fplusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Equal=1, NotEqual=2, Assign=3, Comma=4, Semicolon=5, Colon=6, LeftBrace=7, 
		RightBrace=8, Dollar=9, LeftParen=10, RightParen=11, LeftBracket=12, RightBracket=13, 
		Smaller=14, Larger=15, Exclamation=16, Plus=17, Minus=18, Star=19, Slash=20, 
		Prefix=21, Template=22, Interface=23, End=24, Do=25, Program=26, Module=27, 
		Contains=28, Function=29, Subroutine=30, Procedure=31, Recursive=32, Elemental=33, 
		Type=34, Class=35, Extends=36, Private=37, Public=38, Sequence=39, Abstract=40, 
		Bind=41, Generic=42, If=43, Then=44, Else=45, And=46, Not=47, Or=48, Integer=49, 
		Real=50, Complex=51, Logical=52, Character=53, Kind=54, Len=55, Pointer=56, 
		Dynamic_Cast=57, Identifier=58, IntegerConstant=59, FloatConstant=60, 
		StringLiteral=61, AssignPointer=62, OperatorOverload=63, Newline=64, WS=65, 
		Noise=66;
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_containsLine = 3, 
		RULE_templateBlock = 4, RULE_loopBlock = 5, RULE_loopBegin = 6, RULE_procedureBlock = 7, 
		RULE_functionBlock = 8, RULE_subroutineBlock = 9, RULE_typeDefinitionBlock = 10, 
		RULE_dataType = 11, RULE_dataTypeParameter = 12, RULE_fortranInterfaceBlock = 13, 
		RULE_typeAttributes = 14, RULE_genericTypeBoundLine = 15, RULE_interfaceLine = 16, 
		RULE_list = 17, RULE_listItem = 18, RULE_listAssignment = 19, RULE_ifStatement = 20, 
		RULE_ifSingleLine = 21, RULE_ifBlock = 22, RULE_contentBlock = 23, RULE_content = 24, 
		RULE_contentLine = 25, RULE_placeholder = 26, RULE_dynamicCast = 27, RULE_variableDefinition = 28, 
		RULE_lineComment = 29, RULE_expr = 30, RULE_logicalExpr = 31;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "containsLine", "templateBlock", 
		"loopBlock", "loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", 
		"typeDefinitionBlock", "dataType", "dataTypeParameter", "fortranInterfaceBlock", 
		"typeAttributes", "genericTypeBoundLine", "interfaceLine", "list", "listItem", 
		"listAssignment", "ifStatement", "ifSingleLine", "ifBlock", "contentBlock", 
		"content", "contentLine", "placeholder", "dynamicCast", "variableDefinition", 
		"lineComment", "expr", "logicalExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=='", "'/='", "'='", "','", "';'", "':'", "'{'", "'}'", "'$'", 
		"'('", "')'", "'['", "']'", "'<'", "'>'", "'!'", "'+'", "'-'", "'*'", 
		"'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Equal", "NotEqual", "Assign", "Comma", "Semicolon", "Colon", "LeftBrace", 
		"RightBrace", "Dollar", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"Smaller", "Larger", "Exclamation", "Plus", "Minus", "Star", "Slash", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Procedure", "Recursive", "Elemental", "Type", 
		"Class", "Extends", "Private", "Public", "Sequence", "Abstract", "Bind", 
		"Generic", "If", "Then", "Else", "And", "Not", "Or", "Integer", "Real", 
		"Complex", "Logical", "Character", "Kind", "Len", "Pointer", "Dynamic_Cast", 
		"Identifier", "IntegerConstant", "FloatConstant", "StringLiteral", "AssignPointer", 
		"OperatorOverload", "Newline", "WS", "Noise"
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

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FortranFileContext extends ParserRuleContext {
		public List<ModuleBlockContext> moduleBlock() {
			return getRuleContexts(ModuleBlockContext.class);
		}
		public ModuleBlockContext moduleBlock(int i) {
			return getRuleContext(ModuleBlockContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public FortranFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortranFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFortranFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFortranFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFortranFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FortranFileContext fortranFile() throws RecognitionException {
		FortranFileContext _localctx = new FortranFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fortranFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(64);
						moduleBlock();
						}
						break;
					case 2:
						{
						setState(65);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(71);
				programBlock();
				}
				break;
			}
			setState(75);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Newline - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				setState(74);
				contentBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBlockContext extends ParserRuleContext {
		public List<TerminalNode> Program() { return getTokens(fplusParser.Program); }
		public TerminalNode Program(int i) {
			return getToken(fplusParser.Program, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ContainsLineContext containsLine() {
			return getRuleContext(ContainsLineContext.class,0);
		}
		public ProgramBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterProgramBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitProgramBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProgramBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77);
				match(WS);
				}
			}

			setState(80);
			match(Program);
			setState(81);
			match(WS);
			setState(82);
			match(Identifier);
			setState(84);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(83);
				match(WS);
				}
			}

			setState(86);
			match(Newline);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					contentBlock();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(93);
				containsLine();
				}
				break;
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					contentBlock();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(103);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(102);
				match(WS);
				}
			}

			setState(105);
			match(End);
			setState(106);
			match(WS);
			setState(107);
			match(Program);
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(108);
				match(WS);
				}
				break;
			}
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(111);
				match(Identifier);
				}
				break;
			}
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(114);
				match(WS);
				}
				break;
			}
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(117);
				match(Newline);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBlockContext extends ParserRuleContext {
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<InterfaceLineContext> interfaceLine() {
			return getRuleContexts(InterfaceLineContext.class);
		}
		public InterfaceLineContext interfaceLine(int i) {
			return getRuleContext(InterfaceLineContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ContainsLineContext containsLine() {
			return getRuleContext(ContainsLineContext.class,0);
		}
		public ModuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterModuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitModuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitModuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(120);
				match(WS);
				}
			}

			setState(123);
			match(Module);
			setState(124);
			match(WS);
			setState(125);
			match(Identifier);
			setState(127);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(126);
				match(WS);
				}
			}

			setState(129);
			match(Newline);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(132);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(130);
						interfaceLine();
						}
						break;
					case 2:
						{
						setState(131);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(137);
				containsLine();
				}
				break;
			}
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(140);
				contentBlock();
				}
				break;
			}
			setState(144);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(143);
				match(WS);
				}
			}

			setState(146);
			match(End);
			setState(147);
			match(WS);
			setState(148);
			match(Module);
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(149);
				match(WS);
				}
				break;
			}
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(152);
				match(Identifier);
				}
				break;
			}
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(155);
				match(Newline);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainsLineContext extends ParserRuleContext {
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContainsLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContainsLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContainsLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContainsLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsLineContext containsLine() throws RecognitionException {
		ContainsLineContext _localctx = new ContainsLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_containsLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(158);
				match(WS);
				}
			}

			setState(161);
			match(Contains);
			setState(163);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(162);
				match(WS);
				}
			}

			setState(165);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBlockContext extends ParserRuleContext {
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TemplateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTemplateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTemplateBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTemplateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167);
				match(WS);
				}
			}

			setState(170);
			match(Prefix);
			setState(171);
			match(WS);
			setState(172);
			match(Template);
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(173);
				match(WS);
				}
				break;
			}
			setState(177);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(176);
				match(Identifier);
				}
			}

			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(179);
				match(WS);
				}
				break;
			}
			setState(183);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(182);
				match(OperatorOverload);
				}
			}

			setState(186);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(185);
				match(WS);
				}
			}

			setState(188);
			match(Newline);
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(189);
				contentBlock();
				}
				break;
			}
			setState(193);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(192);
				match(WS);
				}
			}

			setState(195);
			match(Prefix);
			setState(196);
			match(WS);
			setState(197);
			match(End);
			setState(198);
			match(WS);
			setState(199);
			match(Template);
			setState(201);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200);
				match(WS);
				}
			}

			setState(204);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(203);
				match(Identifier);
				}
			}

			setState(206);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBlockContext extends ParserRuleContext {
		public LoopBeginContext loopBegin() {
			return getRuleContext(LoopBeginContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			loopBegin();
			setState(210);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(209);
				match(WS);
				}
			}

			setState(212);
			match(Newline);
			setState(213);
			contentBlock();
			setState(215);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(214);
				match(WS);
				}
			}

			setState(217);
			match(Prefix);
			setState(218);
			match(WS);
			setState(219);
			match(End);
			setState(220);
			match(WS);
			setState(221);
			match(Do);
			setState(223);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(222);
				match(WS);
				}
			}

			setState(225);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBeginContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public LoopBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLoopBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLoopBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBeginContext loopBegin() throws RecognitionException {
		LoopBeginContext _localctx = new LoopBeginContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(227);
				match(WS);
				}
			}

			setState(230);
			match(Prefix);
			setState(231);
			match(WS);
			setState(232);
			match(Do);
			setState(233);
			match(WS);
			setState(234);
			listAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBlockContext extends ParserRuleContext {
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public SubroutineBlockContext subroutineBlock() {
			return getRuleContext(SubroutineBlockContext.class,0);
		}
		public ProcedureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterProcedureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitProcedureBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProcedureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedureBlock);
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				functionBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				subroutineBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || _la==WS || _la==Noise) {
				{
				setState(242);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(240);
					placeholder();
					}
					break;
				case 2:
					{
					setState(241);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(Function);
			setState(248);
			match(WS);
			setState(249);
			match(Identifier);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || _la==WS || _la==Noise) {
				{
				{
				setState(250);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(Newline);
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(257);
				contentBlock();
				}
				break;
			}
			setState(261);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(260);
				match(WS);
				}
			}

			setState(263);
			match(End);
			setState(264);
			match(WS);
			setState(265);
			match(Function);
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(266);
				match(WS);
				}
				break;
			}
			setState(270);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(269);
				match(Identifier);
				}
			}

			setState(273);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(272);
				match(WS);
				}
			}

			setState(275);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineBlockContext extends ParserRuleContext {
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode Recursive() { return getToken(fplusParser.Recursive, 0); }
		public TerminalNode Elemental() { return getToken(fplusParser.Elemental, 0); }
		public SubroutineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterSubroutineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitSubroutineBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitSubroutineBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(277);
				match(WS);
				}
				break;
			}
			setState(281);
			_la = _input.LA(1);
			if (_la==Recursive || _la==Elemental) {
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==Recursive || _la==Elemental) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(284);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(283);
				match(WS);
				}
			}

			setState(286);
			match(Subroutine);
			setState(287);
			match(WS);
			setState(288);
			match(Identifier);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || _la==WS || _la==Noise) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(Newline);
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(296);
				contentBlock();
				}
				break;
			}
			setState(300);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(299);
				match(WS);
				}
			}

			setState(302);
			match(End);
			setState(303);
			match(WS);
			setState(304);
			match(Subroutine);
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(305);
				match(WS);
				}
				break;
			}
			setState(309);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(308);
				match(Identifier);
				}
			}

			setState(312);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(311);
				match(WS);
				}
			}

			setState(314);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionBlockContext extends ParserRuleContext {
		public List<TerminalNode> Type() { return getTokens(fplusParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(fplusParser.Type, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TypeAttributesContext> typeAttributes() {
			return getRuleContexts(TypeAttributesContext.class);
		}
		public TypeAttributesContext typeAttributes(int i) {
			return getRuleContext(TypeAttributesContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public List<GenericTypeBoundLineContext> genericTypeBoundLine() {
			return getRuleContexts(GenericTypeBoundLineContext.class);
		}
		public GenericTypeBoundLineContext genericTypeBoundLine(int i) {
			return getRuleContext(GenericTypeBoundLineContext.class,i);
		}
		public TypeDefinitionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTypeDefinitionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTypeDefinitionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeDefinitionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionBlockContext typeDefinitionBlock() throws RecognitionException {
		TypeDefinitionBlockContext _localctx = new TypeDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDefinitionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(316);
				match(WS);
				}
			}

			setState(319);
			match(Type);
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(320);
				match(WS);
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(323);
						match(WS);
						}
					}

					setState(326);
					match(Comma);
					setState(328);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(327);
						match(WS);
						}
					}

					setState(330);
					typeAttributes();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(336);
				match(WS);
				}
				break;
			}
			setState(341);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(339);
				match(Colon);
				setState(340);
				match(Colon);
				}
			}

			setState(344);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(343);
				match(WS);
				}
			}

			setState(346);
			match(Identifier);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || _la==WS || _la==Noise) {
				{
				{
				setState(347);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(Newline);
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(354);
				contentBlock();
				}
				break;
			}
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(358);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(357);
					match(WS);
					}
				}

				setState(360);
				match(Contains);
				setState(362);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(361);
					match(WS);
					}
				}

				setState(364);
				match(Newline);
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(369);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(367);
						contentBlock();
						}
						break;
					case 2:
						{
						setState(368);
						genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(375);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(374);
				match(WS);
				}
			}

			setState(377);
			match(End);
			setState(378);
			match(WS);
			setState(379);
			match(Type);
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(380);
				match(WS);
				}
				break;
			}
			setState(384);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(383);
				match(Identifier);
				}
			}

			setState(387);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(386);
				match(WS);
				}
			}

			setState(389);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(fplusParser.Type, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Class() { return getToken(fplusParser.Class, 0); }
		public TerminalNode Integer() { return getToken(fplusParser.Integer, 0); }
		public TerminalNode Real() { return getToken(fplusParser.Real, 0); }
		public TerminalNode Complex() { return getToken(fplusParser.Complex, 0); }
		public TerminalNode Logical() { return getToken(fplusParser.Logical, 0); }
		public TerminalNode Character() { return getToken(fplusParser.Character, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode IntegerConstant() { return getToken(fplusParser.IntegerConstant, 0); }
		public TerminalNode Kind() { return getToken(fplusParser.Kind, 0); }
		public TerminalNode Len() { return getToken(fplusParser.Len, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			switch (_input.LA(1)) {
			case Integer:
			case Real:
			case Complex:
			case Logical:
			case Character:
				{
				setState(391);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(393);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(392);
					match(WS);
					}
					break;
				}
				setState(422);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(395);
					match(LeftParen);
					setState(397);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(396);
						match(WS);
						}
					}

					setState(415);
					switch (_input.LA(1)) {
					case Kind:
						{
						setState(399);
						match(Kind);
						setState(401);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(400);
							match(WS);
							}
						}

						setState(403);
						match(Assign);
						setState(405);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(404);
							match(WS);
							}
						}

						}
						break;
					case Len:
						{
						setState(407);
						match(Len);
						setState(409);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(408);
							match(WS);
							}
						}

						setState(411);
						match(Assign);
						setState(413);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(412);
							match(WS);
							}
						}

						}
						break;
					case Identifier:
					case IntegerConstant:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(417);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==IntegerConstant) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(419);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(418);
						match(WS);
						}
					}

					setState(421);
					match(RightParen);
					}
				}

				}
				break;
			case Type:
				{
				setState(424);
				match(Type);
				setState(426);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(425);
					match(WS);
					}
				}

				setState(428);
				match(LeftParen);
				setState(430);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(429);
					match(WS);
					}
				}

				setState(432);
				match(Identifier);
				setState(434);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(433);
					match(WS);
					}
				}

				setState(436);
				match(RightParen);
				}
				break;
			case Class:
				{
				setState(437);
				match(Class);
				setState(439);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(438);
					match(WS);
					}
				}

				setState(441);
				match(LeftParen);
				setState(443);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(442);
					match(WS);
					}
				}

				setState(445);
				match(Identifier);
				setState(447);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(446);
					match(WS);
					}
				}

				setState(449);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeParameterContext extends ParserRuleContext {
		public TerminalNode Pointer() { return getToken(fplusParser.Pointer, 0); }
		public DataTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDataTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDataTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDataTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeParameterContext dataTypeParameter() throws RecognitionException {
		DataTypeParameterContext _localctx = new DataTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(Pointer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FortranInterfaceBlockContext extends ParserRuleContext {
		public List<TerminalNode> Interface() { return getTokens(fplusParser.Interface); }
		public TerminalNode Interface(int i) {
			return getToken(fplusParser.Interface, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public List<TerminalNode> Procedure() { return getTokens(fplusParser.Procedure); }
		public TerminalNode Procedure(int i) {
			return getToken(fplusParser.Procedure, i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public FortranInterfaceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortranInterfaceBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFortranInterfaceBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFortranInterfaceBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFortranInterfaceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FortranInterfaceBlockContext fortranInterfaceBlock() throws RecognitionException {
		FortranInterfaceBlockContext _localctx = new FortranInterfaceBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fortranInterfaceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(454);
				match(WS);
				}
			}

			setState(457);
			match(Interface);
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(458);
				match(WS);
				}
				break;
			}
			setState(462);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(461);
				match(Identifier);
				}
			}

			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(464);
				match(WS);
				}
				break;
			}
			setState(468);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(467);
				match(OperatorOverload);
				}
			}

			setState(471);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(470);
				match(WS);
				}
			}

			setState(473);
			match(Newline);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(504);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(475);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(474);
							match(WS);
							}
							break;
						}
						setState(478);
						_la = _input.LA(1);
						if (_la==Module) {
							{
							setState(477);
							match(Module);
							}
						}

						setState(481);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(480);
							match(WS);
							}
						}

						setState(483);
						match(Procedure);
						setState(484);
						match(WS);
						setState(485);
						match(Identifier);
						setState(496);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(487);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(486);
									match(WS);
									}
								}

								setState(489);
								match(Comma);
								setState(491);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(490);
									match(WS);
									}
								}

								setState(493);
								match(Identifier);
								}
								} 
							}
							setState(498);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						}
						setState(500);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(499);
							match(WS);
							}
						}

						setState(502);
						match(Newline);
						}
						break;
					case 2:
						{
						setState(503);
						procedureBlock();
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(510);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(509);
				match(WS);
				}
			}

			setState(512);
			match(End);
			setState(513);
			match(WS);
			setState(514);
			match(Interface);
			setState(516);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(515);
				match(WS);
				}
				break;
			}
			setState(519);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(518);
				match(Identifier);
				}
			}

			setState(522);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(521);
				match(WS);
				}
			}

			setState(524);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAttributesContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(fplusParser.Private, 0); }
		public TerminalNode Public() { return getToken(fplusParser.Public, 0); }
		public TerminalNode Sequence() { return getToken(fplusParser.Sequence, 0); }
		public TerminalNode Abstract() { return getToken(fplusParser.Abstract, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Extends() { return getToken(fplusParser.Extends, 0); }
		public TerminalNode Bind() { return getToken(fplusParser.Bind, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TypeAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTypeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTypeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAttributesContext typeAttributes() throws RecognitionException {
		TypeAttributesContext _localctx = new TypeAttributesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeAttributes);
		int _la;
		try {
			setState(540);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Extends:
			case Bind:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(529);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(528);
					match(WS);
					}
				}

				setState(531);
				match(LeftParen);
				setState(533);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(532);
					match(WS);
					}
				}

				setState(535);
				match(Identifier);
				setState(537);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(536);
					match(WS);
					}
				}

				setState(539);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeBoundLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Generic() { return getToken(fplusParser.Generic, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode AssignPointer() { return getToken(fplusParser.AssignPointer, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> Private() { return getTokens(fplusParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(fplusParser.Private, i);
		}
		public List<TerminalNode> Public() { return getTokens(fplusParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(fplusParser.Public, i);
		}
		public GenericTypeBoundLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeBoundLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterGenericTypeBoundLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitGenericTypeBoundLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitGenericTypeBoundLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeBoundLineContext genericTypeBoundLine() throws RecognitionException {
		GenericTypeBoundLineContext _localctx = new GenericTypeBoundLineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericTypeBoundLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(542);
				match(WS);
				}
			}

			setState(545);
			match(Prefix);
			setState(546);
			match(WS);
			setState(547);
			match(Generic);
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(548);
				match(WS);
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(551);
						match(WS);
						}
					}

					setState(554);
					match(Comma);
					setState(556);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(555);
						match(WS);
						}
					}

					setState(558);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(565);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(564);
				match(WS);
				}
			}

			setState(567);
			match(Colon);
			setState(568);
			match(Colon);
			setState(570);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(569);
				match(WS);
				}
			}

			setState(572);
			match(Identifier);
			setState(574);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(573);
				match(WS);
				}
			}

			setState(576);
			match(AssignPointer);
			setState(578);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(577);
				match(WS);
				}
			}

			setState(580);
			match(Identifier);
			setState(582);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(581);
				match(WS);
				}
			}

			setState(584);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Interface() { return getToken(fplusParser.Interface, 0); }
		public TerminalNode Template() { return getToken(fplusParser.Template, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public InterfaceLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterInterfaceLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitInterfaceLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitInterfaceLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceLineContext interfaceLine() throws RecognitionException {
		InterfaceLineContext _localctx = new InterfaceLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(586);
				match(WS);
				}
			}

			setState(589);
			match(Prefix);
			setState(590);
			match(WS);
			setState(591);
			match(Interface);
			setState(592);
			match(WS);
			setState(593);
			match(Template);
			setState(594);
			match(WS);
			setState(595);
			match(Identifier);
			setState(597);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(596);
				match(WS);
				}
				break;
			}
			setState(600);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(599);
				match(OperatorOverload);
				}
			}

			setState(603);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(602);
				match(WS);
				}
			}

			setState(605);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			listItem();
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(WS);
					setState(609);
					listItem();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitListItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(LeftBrace);
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(616);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(621);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				setState(622);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public List<TerminalNode> IntegerConstant() { return getTokens(fplusParser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(fplusParser.IntegerConstant, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterListAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitListAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitListAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listAssignment);
		int _la;
		try {
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(Identifier);
				setState(628);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(627);
					match(WS);
					}
				}

				setState(630);
				match(Assign);
				setState(632);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(631);
					match(WS);
					}
				}

				setState(634);
				match(IntegerConstant);
				setState(636);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(635);
					match(WS);
					}
				}

				setState(638);
				match(Comma);
				setState(640);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(639);
					match(WS);
					}
				}

				setState(642);
				match(IntegerConstant);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(Identifier);
				setState(645);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(644);
					match(WS);
					}
				}

				setState(647);
				match(Assign);
				setState(649);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(648);
					match(WS);
					}
					break;
				}
				setState(651);
				list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfSingleLineContext ifSingleLine() {
			return getRuleContext(IfSingleLineContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				ifSingleLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfSingleLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode If() { return getToken(fplusParser.If, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ContentLineContext contentLine() {
			return getRuleContext(ContentLineContext.class,0);
		}
		public IfSingleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSingleLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfSingleLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfSingleLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfSingleLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSingleLineContext ifSingleLine() throws RecognitionException {
		IfSingleLineContext _localctx = new IfSingleLineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifSingleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(658);
				match(WS);
				}
			}

			setState(661);
			match(Prefix);
			setState(662);
			match(WS);
			setState(663);
			match(If);
			setState(665);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(664);
				match(WS);
				}
			}

			setState(667);
			match(LeftParen);
			setState(669);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(668);
				match(WS);
				}
			}

			setState(671);
			logicalExpr(0);
			setState(673);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(672);
				match(WS);
				}
			}

			setState(675);
			match(RightParen);
			setState(677);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(676);
				match(WS);
				}
				break;
			}
			setState(679);
			contentLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> If() { return getTokens(fplusParser.If); }
		public TerminalNode If(int i) {
			return getToken(fplusParser.If, i);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode Then() { return getToken(fplusParser.Then, 0); }
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Else() { return getToken(fplusParser.Else, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(681);
				match(WS);
				}
			}

			setState(684);
			match(Prefix);
			setState(685);
			match(WS);
			setState(686);
			match(If);
			setState(688);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(687);
				match(WS);
				}
			}

			setState(690);
			match(LeftParen);
			setState(692);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(691);
				match(WS);
				}
			}

			setState(694);
			logicalExpr(0);
			setState(696);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(695);
				match(WS);
				}
			}

			setState(698);
			match(RightParen);
			setState(700);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(699);
				match(WS);
				}
			}

			setState(702);
			match(Then);
			setState(704);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(703);
				match(WS);
				}
			}

			setState(706);
			match(Newline);
			setState(707);
			contentBlock();
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(709);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(708);
					match(WS);
					}
				}

				setState(711);
				match(Prefix);
				setState(712);
				match(WS);
				setState(713);
				match(Else);
				setState(715);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(714);
					match(WS);
					}
				}

				setState(717);
				match(Newline);
				setState(718);
				contentBlock();
				}
				break;
			}
			setState(722);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(721);
				match(WS);
				}
			}

			setState(724);
			match(Prefix);
			setState(725);
			match(WS);
			setState(726);
			match(End);
			setState(727);
			match(WS);
			setState(728);
			match(If);
			setState(730);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(729);
				match(WS);
				}
			}

			setState(732);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentBlockContext extends ParserRuleContext {
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public List<TypeDefinitionBlockContext> typeDefinitionBlock() {
			return getRuleContexts(TypeDefinitionBlockContext.class);
		}
		public TypeDefinitionBlockContext typeDefinitionBlock(int i) {
			return getRuleContext(TypeDefinitionBlockContext.class,i);
		}
		public List<FortranInterfaceBlockContext> fortranInterfaceBlock() {
			return getRuleContexts(FortranInterfaceBlockContext.class);
		}
		public FortranInterfaceBlockContext fortranInterfaceBlock(int i) {
			return getRuleContext(FortranInterfaceBlockContext.class,i);
		}
		public List<LineCommentContext> lineComment() {
			return getRuleContexts(LineCommentContext.class);
		}
		public LineCommentContext lineComment(int i) {
			return getRuleContext(LineCommentContext.class,i);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public ContentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentBlockContext contentBlock() throws RecognitionException {
		ContentBlockContext _localctx = new ContentBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(743);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(734);
						loopBlock();
						}
						break;
					case 2:
						{
						setState(735);
						templateBlock();
						}
						break;
					case 3:
						{
						setState(736);
						variableDefinition();
						}
						break;
					case 4:
						{
						setState(737);
						ifStatement();
						}
						break;
					case 5:
						{
						setState(738);
						procedureBlock();
						}
						break;
					case 6:
						{
						setState(739);
						typeDefinitionBlock();
						}
						break;
					case 7:
						{
						setState(740);
						fortranInterfaceBlock();
						}
						break;
					case 8:
						{
						setState(741);
						lineComment();
						}
						break;
					case 9:
						{
						setState(742);
						contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(745); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public PlaceholderContext placeholder() {
			return getRuleContext(PlaceholderContext.class,0);
		}
		public DynamicCastContext dynamicCast() {
			return getRuleContext(DynamicCastContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode Subroutine() { return getToken(fplusParser.Subroutine, 0); }
		public TerminalNode Function() { return getToken(fplusParser.Function, 0); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Module() { return getToken(fplusParser.Module, 0); }
		public TerminalNode Program() { return getToken(fplusParser.Program, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(747);
				match(LeftParen);
				setState(749);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(748);
					match(WS);
					}
					break;
				}
				setState(751);
				content();
				setState(753);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(752);
					match(WS);
					}
				}

				setState(755);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(757);
				placeholder();
				}
				break;
			case 3:
				{
				setState(758);
				dynamicCast();
				}
				break;
			case 4:
				{
				setState(759);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (Prefix - 21)) | (1L << (Program - 21)) | (1L << (Module - 21)) | (1L << (Contains - 21)) | (1L << (Function - 21)) | (1L << (Subroutine - 21)) | (1L << (Newline - 21)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentLineContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public LineCommentContext lineComment() {
			return getRuleContext(LineCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ContentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_contentLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(762);
				match(WS);
				}
				break;
			}
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(765);
					content();
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(773);
			switch (_input.LA(1)) {
			case Newline:
				{
				setState(771);
				match(Newline);
				}
				break;
			case Exclamation:
			case WS:
				{
				setState(772);
				lineComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceholderContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_placeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(Dollar);
			setState(776);
			match(LeftBrace);
			setState(778);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(777);
				match(WS);
				}
			}

			setState(782);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(780);
				expr(0);
				}
				break;
			case 2:
				{
				setState(781);
				logicalExpr(0);
				}
				break;
			}
			setState(785);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(784);
				match(WS);
				}
			}

			setState(787);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicCastContext extends ParserRuleContext {
		public TerminalNode Dynamic_Cast() { return getToken(fplusParser.Dynamic_Cast, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<DataTypeParameterContext> dataTypeParameter() {
			return getRuleContexts(DataTypeParameterContext.class);
		}
		public DataTypeParameterContext dataTypeParameter(int i) {
			return getRuleContext(DataTypeParameterContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public DynamicCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDynamicCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDynamicCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDynamicCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicCastContext dynamicCast() throws RecognitionException {
		DynamicCastContext _localctx = new DynamicCastContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dynamicCast);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(Dynamic_Cast);
			setState(791);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(790);
				match(WS);
				}
			}

			setState(793);
			match(Smaller);
			setState(795);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(794);
				match(WS);
				}
			}

			setState(797);
			dataType();
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(799);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(798);
						match(WS);
						}
					}

					setState(801);
					match(Comma);
					setState(803);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(802);
						match(WS);
						}
					}

					setState(805);
					dataTypeParameter();
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(812);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(811);
				match(WS);
				}
			}

			setState(814);
			match(Larger);
			setState(816);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(815);
				match(WS);
				}
			}

			setState(818);
			match(LeftParen);
			setState(823); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(820);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						setState(819);
						match(WS);
						}
						break;
					}
					setState(822);
					content();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(825); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(828);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(827);
				match(WS);
				}
			}

			setState(830);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(832);
				match(WS);
				}
			}

			setState(835);
			match(Prefix);
			setState(836);
			match(WS);
			setState(837);
			listAssignment();
			setState(839);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(838);
				match(WS);
				}
			}

			setState(841);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineCommentContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public LineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLineComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLineComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineCommentContext lineComment() throws RecognitionException {
		LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(843);
				match(WS);
				}
			}

			setState(846);
			match(Exclamation);
			setState(847);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==Dollar) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << OperatorOverload))) != 0) || _la==WS || _la==Noise) {
				{
				setState(850);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(848);
					placeholder();
					}
					break;
				case 2:
					{
					setState(849);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Newline) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(855);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprConstantsContext extends ExprContext {
		public TerminalNode IntegerConstant() { return getToken(fplusParser.IntegerConstant, 0); }
		public ExprConstantsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprConstants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArraySubscriptContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprArraySubscriptContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprArraySubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprArraySubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprArraySubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVariableContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(858);
				match(LeftParen);
				setState(860);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(859);
					match(WS);
					}
				}

				setState(862);
				expr(0);
				setState(864);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(863);
					match(WS);
					}
				}

				setState(866);
				match(RightParen);
				}
				break;
			case 2:
				{
				_localctx = new ExprConstantsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(868);
				match(IntegerConstant);
				}
				break;
			case 3:
				{
				_localctx = new ExprArraySubscriptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869);
				match(Identifier);
				setState(871);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(870);
					match(WS);
					}
				}

				setState(873);
				match(LeftParen);
				setState(875);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(874);
					match(WS);
					}
				}

				setState(877);
				expr(0);
				setState(879);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(878);
					match(WS);
					}
				}

				setState(881);
				match(RightParen);
				}
				break;
			case 4:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(883);
				match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(904);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(886);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(888);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(887);
							match(WS);
							}
						}

						setState(890);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Star || _la==Slash) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(892);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(891);
							match(WS);
							}
						}

						setState(894);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(897);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(896);
							match(WS);
							}
						}

						setState(899);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(901);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(900);
							match(WS);
							}
						}

						setState(903);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalExprContext extends ParserRuleContext {
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	 
		public LogicalExprContext() { }
		public void copyFrom(LogicalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExprNotContext extends LogicalExprContext {
		public TerminalNode Not() { return getToken(fplusParser.Not, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public LogicalExprNotContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprOrContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(fplusParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprOrContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprAndContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode And() { return getToken(fplusParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprAndContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprCompareContext extends LogicalExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprCompareContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		return logicalExpr(0);
	}

	private LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_logicalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new LogicalExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(910);
				match(Not);
				setState(912);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(911);
					match(WS);
					}
				}

				setState(914);
				logicalExpr(2);
				}
				break;
			case LeftParen:
			case Identifier:
			case IntegerConstant:
				{
				_localctx = new LogicalExprCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(915);
				expr(0);
				setState(917);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(916);
					match(WS);
					}
				}

				setState(919);
				((LogicalExprCompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Smaller) | (1L << Larger))) != 0)) ) {
					((LogicalExprCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(921);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(920);
					match(WS);
					}
				}

				setState(923);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(945);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExprAndContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(927);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(929);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(928);
							match(WS);
							}
						}

						setState(931);
						match(And);
						setState(933);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(932);
							match(WS);
							}
						}

						setState(935);
						logicalExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExprOrContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(936);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(938);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(937);
							match(WS);
							}
						}

						setState(940);
						match(Or);
						setState(942);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(941);
							match(WS);
							}
						}

						setState(944);
						logicalExpr(4);
						}
						break;
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 31:
			return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3D\u03b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\5\2K\n\2\3\2\5\2N\n\2\3\3\5\3"+
		"Q\n\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\5\3"+
		"a\n\3\3\3\7\3d\n\3\f\3\16\3g\13\3\3\3\5\3j\n\3\3\3\3\3\3\3\3\3\5\3p\n"+
		"\3\3\3\5\3s\n\3\3\3\5\3v\n\3\3\3\5\3y\n\3\3\4\5\4|\n\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0082\n\4\3\4\3\4\3\4\7\4\u0087\n\4\f\4\16\4\u008a\13\4\3\4\5\4\u008d"+
		"\n\4\3\4\5\4\u0090\n\4\3\4\5\4\u0093\n\4\3\4\3\4\3\4\3\4\5\4\u0099\n\4"+
		"\3\4\5\4\u009c\n\4\3\4\5\4\u009f\n\4\3\5\5\5\u00a2\n\5\3\5\3\5\5\5\u00a6"+
		"\n\5\3\5\3\5\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\5\6\u00b4"+
		"\n\6\3\6\5\6\u00b7\n\6\3\6\5\6\u00ba\n\6\3\6\5\6\u00bd\n\6\3\6\3\6\5\6"+
		"\u00c1\n\6\3\6\5\6\u00c4\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cc\n\6\3\6"+
		"\5\6\u00cf\n\6\3\6\3\6\3\7\3\7\5\7\u00d5\n\7\3\7\3\7\3\7\5\7\u00da\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e2\n\7\3\7\3\7\3\b\5\b\u00e7\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00f1\n\t\3\n\3\n\7\n\u00f5\n\n\f\n\16"+
		"\n\u00f8\13\n\3\n\3\n\3\n\3\n\7\n\u00fe\n\n\f\n\16\n\u0101\13\n\3\n\3"+
		"\n\5\n\u0105\n\n\3\n\5\n\u0108\n\n\3\n\3\n\3\n\3\n\5\n\u010e\n\n\3\n\5"+
		"\n\u0111\n\n\3\n\5\n\u0114\n\n\3\n\3\n\3\13\5\13\u0119\n\13\3\13\5\13"+
		"\u011c\n\13\3\13\5\13\u011f\n\13\3\13\3\13\3\13\3\13\7\13\u0125\n\13\f"+
		"\13\16\13\u0128\13\13\3\13\3\13\5\13\u012c\n\13\3\13\5\13\u012f\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0135\n\13\3\13\5\13\u0138\n\13\3\13\5\13\u013b"+
		"\n\13\3\13\3\13\3\f\5\f\u0140\n\f\3\f\3\f\5\f\u0144\n\f\3\f\5\f\u0147"+
		"\n\f\3\f\3\f\5\f\u014b\n\f\3\f\7\f\u014e\n\f\f\f\16\f\u0151\13\f\3\f\5"+
		"\f\u0154\n\f\3\f\3\f\5\f\u0158\n\f\3\f\5\f\u015b\n\f\3\f\3\f\7\f\u015f"+
		"\n\f\f\f\16\f\u0162\13\f\3\f\3\f\5\f\u0166\n\f\3\f\5\f\u0169\n\f\3\f\3"+
		"\f\5\f\u016d\n\f\3\f\5\f\u0170\n\f\3\f\3\f\7\f\u0174\n\f\f\f\16\f\u0177"+
		"\13\f\3\f\5\f\u017a\n\f\3\f\3\f\3\f\3\f\5\f\u0180\n\f\3\f\5\f\u0183\n"+
		"\f\3\f\5\f\u0186\n\f\3\f\3\f\3\r\3\r\5\r\u018c\n\r\3\r\3\r\5\r\u0190\n"+
		"\r\3\r\3\r\5\r\u0194\n\r\3\r\3\r\5\r\u0198\n\r\3\r\3\r\5\r\u019c\n\r\3"+
		"\r\3\r\5\r\u01a0\n\r\5\r\u01a2\n\r\3\r\3\r\5\r\u01a6\n\r\3\r\5\r\u01a9"+
		"\n\r\3\r\3\r\5\r\u01ad\n\r\3\r\3\r\5\r\u01b1\n\r\3\r\3\r\5\r\u01b5\n\r"+
		"\3\r\3\r\3\r\5\r\u01ba\n\r\3\r\3\r\5\r\u01be\n\r\3\r\3\r\5\r\u01c2\n\r"+
		"\3\r\5\r\u01c5\n\r\3\16\3\16\3\17\5\17\u01ca\n\17\3\17\3\17\5\17\u01ce"+
		"\n\17\3\17\5\17\u01d1\n\17\3\17\5\17\u01d4\n\17\3\17\5\17\u01d7\n\17\3"+
		"\17\5\17\u01da\n\17\3\17\3\17\5\17\u01de\n\17\3\17\5\17\u01e1\n\17\3\17"+
		"\5\17\u01e4\n\17\3\17\3\17\3\17\3\17\5\17\u01ea\n\17\3\17\3\17\5\17\u01ee"+
		"\n\17\3\17\7\17\u01f1\n\17\f\17\16\17\u01f4\13\17\3\17\5\17\u01f7\n\17"+
		"\3\17\3\17\7\17\u01fb\n\17\f\17\16\17\u01fe\13\17\3\17\5\17\u0201\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0207\n\17\3\17\5\17\u020a\n\17\3\17\5\17\u020d"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0214\n\20\3\20\3\20\5\20\u0218\n"+
		"\20\3\20\3\20\5\20\u021c\n\20\3\20\5\20\u021f\n\20\3\21\5\21\u0222\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0228\n\21\3\21\5\21\u022b\n\21\3\21\3\21\5"+
		"\21\u022f\n\21\3\21\7\21\u0232\n\21\f\21\16\21\u0235\13\21\3\21\5\21\u0238"+
		"\n\21\3\21\3\21\3\21\5\21\u023d\n\21\3\21\3\21\5\21\u0241\n\21\3\21\3"+
		"\21\5\21\u0245\n\21\3\21\3\21\5\21\u0249\n\21\3\21\3\21\3\22\5\22\u024e"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0258\n\22\3\22\5\22"+
		"\u025b\n\22\3\22\5\22\u025e\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u0265\n"+
		"\23\f\23\16\23\u0268\13\23\3\24\3\24\7\24\u026c\n\24\f\24\16\24\u026f"+
		"\13\24\3\24\3\24\5\24\u0273\n\24\3\25\3\25\5\25\u0277\n\25\3\25\3\25\5"+
		"\25\u027b\n\25\3\25\3\25\5\25\u027f\n\25\3\25\3\25\5\25\u0283\n\25\3\25"+
		"\3\25\3\25\5\25\u0288\n\25\3\25\3\25\5\25\u028c\n\25\3\25\5\25\u028f\n"+
		"\25\3\26\3\26\5\26\u0293\n\26\3\27\5\27\u0296\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u029c\n\27\3\27\3\27\5\27\u02a0\n\27\3\27\3\27\5\27\u02a4\n\27\3"+
		"\27\3\27\5\27\u02a8\n\27\3\27\3\27\3\30\5\30\u02ad\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u02b3\n\30\3\30\3\30\5\30\u02b7\n\30\3\30\3\30\5\30\u02bb\n"+
		"\30\3\30\3\30\5\30\u02bf\n\30\3\30\3\30\5\30\u02c3\n\30\3\30\3\30\3\30"+
		"\5\30\u02c8\n\30\3\30\3\30\3\30\3\30\5\30\u02ce\n\30\3\30\3\30\5\30\u02d2"+
		"\n\30\3\30\5\30\u02d5\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02dd\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u02ea"+
		"\n\31\r\31\16\31\u02eb\3\32\3\32\5\32\u02f0\n\32\3\32\3\32\5\32\u02f4"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u02fb\n\32\3\33\5\33\u02fe\n\33\3"+
		"\33\7\33\u0301\n\33\f\33\16\33\u0304\13\33\3\33\3\33\5\33\u0308\n\33\3"+
		"\34\3\34\3\34\5\34\u030d\n\34\3\34\3\34\5\34\u0311\n\34\3\34\5\34\u0314"+
		"\n\34\3\34\3\34\3\35\3\35\5\35\u031a\n\35\3\35\3\35\5\35\u031e\n\35\3"+
		"\35\3\35\5\35\u0322\n\35\3\35\3\35\5\35\u0326\n\35\3\35\7\35\u0329\n\35"+
		"\f\35\16\35\u032c\13\35\3\35\5\35\u032f\n\35\3\35\3\35\5\35\u0333\n\35"+
		"\3\35\3\35\5\35\u0337\n\35\3\35\6\35\u033a\n\35\r\35\16\35\u033b\3\35"+
		"\5\35\u033f\n\35\3\35\3\35\3\36\5\36\u0344\n\36\3\36\3\36\3\36\3\36\5"+
		"\36\u034a\n\36\3\36\3\36\3\37\5\37\u034f\n\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0355\n\37\f\37\16\37\u0358\13\37\3\37\3\37\3 \3 \3 \5 \u035f\n \3 \3"+
		" \5 \u0363\n \3 \3 \3 \3 \3 \5 \u036a\n \3 \3 \5 \u036e\n \3 \3 \5 \u0372"+
		"\n \3 \3 \3 \5 \u0377\n \3 \3 \5 \u037b\n \3 \3 \5 \u037f\n \3 \3 \3 "+
		"\5 \u0384\n \3 \3 \5 \u0388\n \3 \7 \u038b\n \f \16 \u038e\13 \3!\3!\3"+
		"!\5!\u0393\n!\3!\3!\3!\5!\u0398\n!\3!\3!\5!\u039c\n!\3!\3!\5!\u03a0\n"+
		"!\3!\3!\5!\u03a4\n!\3!\3!\5!\u03a8\n!\3!\3!\3!\5!\u03ad\n!\3!\3!\5!\u03b1"+
		"\n!\3!\7!\u03b4\n!\f!\16!\u03b7\13!\3!\4\u026d\u0302\4>@\"\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\17\4\2\37\37B"+
		"B\3\2BB\3\2\"#\3\2\63\67\3\2<=\3\2\'*\4\2&&++\3\2\'(\5\2\27\27\34 BB\3"+
		"\2\13\13\3\2\25\26\3\2\23\24\4\2\3\4\20\21\u0472\2F\3\2\2\2\4P\3\2\2\2"+
		"\6{\3\2\2\2\b\u00a1\3\2\2\2\n\u00aa\3\2\2\2\f\u00d2\3\2\2\2\16\u00e6\3"+
		"\2\2\2\20\u00f0\3\2\2\2\22\u00f6\3\2\2\2\24\u0118\3\2\2\2\26\u013f\3\2"+
		"\2\2\30\u01c4\3\2\2\2\32\u01c6\3\2\2\2\34\u01c9\3\2\2\2\36\u021e\3\2\2"+
		"\2 \u0221\3\2\2\2\"\u024d\3\2\2\2$\u0261\3\2\2\2&\u0272\3\2\2\2(\u028e"+
		"\3\2\2\2*\u0292\3\2\2\2,\u0295\3\2\2\2.\u02ac\3\2\2\2\60\u02e9\3\2\2\2"+
		"\62\u02fa\3\2\2\2\64\u02fd\3\2\2\2\66\u0309\3\2\2\28\u0317\3\2\2\2:\u0343"+
		"\3\2\2\2<\u034e\3\2\2\2>\u0376\3\2\2\2@\u039f\3\2\2\2BE\5\6\4\2CE\5\60"+
		"\31\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2IK\5\4\3\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\60\31\2ML\3\2\2\2M"+
		"N\3\2\2\2N\3\3\2\2\2OQ\7C\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\34\2\2"+
		"ST\7C\2\2TV\7<\2\2UW\7C\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2X\\\7B\2\2Y["+
		"\5\60\31\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2_a\5\b\5\2`_\3\2\2\2`a\3\2\2\2ae\3\2\2\2bd\5\60\31\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7C\2\2ih\3\2\2\2ij\3"+
		"\2\2\2jk\3\2\2\2kl\7\32\2\2lm\7C\2\2mo\7\34\2\2np\7C\2\2on\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qs\7<\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\7C\2\2ut\3\2"+
		"\2\2uv\3\2\2\2vx\3\2\2\2wy\7B\2\2xw\3\2\2\2xy\3\2\2\2y\5\3\2\2\2z|\7C"+
		"\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\35\2\2~\177\7C\2\2\177\u0081\7"+
		"<\2\2\u0080\u0082\7C\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0088\7B\2\2\u0084\u0087\5\"\22\2\u0085\u0087\5\60"+
		"\31\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008d\5\b\5\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0090\5\60\31\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\7C\2\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\32\2\2\u0095\u0096\7"+
		"C\2\2\u0096\u0098\7\35\2\2\u0097\u0099\7C\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\7<\2\2\u009b\u009a\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\7B\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\7\3\2\2\2\u00a0\u00a2\7C\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\7\36\2\2\u00a4\u00a6\7C\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7B\2\2\u00a8\t\3\2\2\2\u00a9\u00ab\7C\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\27"+
		"\2\2\u00ad\u00ae\7C\2\2\u00ae\u00b0\7\30\2\2\u00af\u00b1\7C\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\7<"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b7\7C\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00ba\7A\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00bd\7C\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7B\2\2\u00bf\u00c1\5\60\31\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\7C"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\27\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7\32\2\2\u00c8\u00c9\7"+
		"C\2\2\u00c9\u00cb\7\30\2\2\u00ca\u00cc\7C\2\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\7<\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7B\2\2\u00d1"+
		"\13\3\2\2\2\u00d2\u00d4\5\16\b\2\u00d3\u00d5\7C\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7B\2\2\u00d7\u00d9"+
		"\5\60\31\2\u00d8\u00da\7C\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de"+
		"\7\32\2\2\u00de\u00df\7C\2\2\u00df\u00e1\7\33\2\2\u00e0\u00e2\7C\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7B"+
		"\2\2\u00e4\r\3\2\2\2\u00e5\u00e7\7C\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\7C\2\2\u00ea"+
		"\u00eb\7\33\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\5(\25\2\u00ed\17\3\2\2"+
		"\2\u00ee\u00f1\5\22\n\2\u00ef\u00f1\5\24\13\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\21\3\2\2\2\u00f2\u00f5\5\66\34\2\u00f3\u00f5\n\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7C\2\2\u00fb\u00ff\7<\2\2\u00fc"+
		"\u00fe\n\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0104\7B\2\2\u0103\u0105\5\60\31\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\7C\2\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\32\2\2\u010a\u010b\7"+
		"C\2\2\u010b\u010d\7\37\2\2\u010c\u010e\7C\2\2\u010d\u010c\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\7<\2\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\7C\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7B"+
		"\2\2\u0116\23\3\2\2\2\u0117\u0119\7C\2\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\7C\2\2\u011e\u011d\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7 \2\2\u0121"+
		"\u0122\7C\2\2\u0122\u0126\7<\2\2\u0123\u0125\n\3\2\2\u0124\u0123\3\2\2"+
		"\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7B\2\2\u012a\u012c\5\60\31\2"+
		"\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f"+
		"\7C\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\7\32\2\2\u0131\u0132\7C\2\2\u0132\u0134\7 \2\2\u0133\u0135\7C\2"+
		"\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138"+
		"\7<\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\7C\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\7B\2\2\u013d\25\3\2\2\2\u013e\u0140\7C\2\2\u013f\u013e"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\7$\2\2\u0142"+
		"\u0144\7C\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014f\3\2"+
		"\2\2\u0145\u0147\7C\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\7\6\2\2\u0149\u014b\7C\2\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\5\36\20\2\u014d"+
		"\u0146\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7C\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7\b"+
		"\2\2\u0156\u0158\7\b\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u015b\7C\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u0160\7<\2\2\u015d\u015f\n\3\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7B\2\2\u0164"+
		"\u0166\5\60\31\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016f\3"+
		"\2\2\2\u0167\u0169\7C\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\7\36\2\2\u016b\u016d\7C\2\2\u016c\u016b\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\7B\2\2\u016f"+
		"\u0168\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0175\3\2\2\2\u0171\u0174\5\60"+
		"\31\2\u0172\u0174\5 \21\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u017a\7C\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7\32\2\2\u017c\u017d\7"+
		"C\2\2\u017d\u017f\7$\2\2\u017e\u0180\7C\2\2\u017f\u017e\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\7<\2\2\u0182\u0181\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7C\2\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7B"+
		"\2\2\u0188\27\3\2\2\2\u0189\u018b\t\5\2\2\u018a\u018c\7C\2\2\u018b\u018a"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u01a8\3\2\2\2\u018d\u018f\7\f\2\2\u018e"+
		"\u0190\7C\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u01a1\3\2"+
		"\2\2\u0191\u0193\78\2\2\u0192\u0194\7C\2\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\7\5\2\2\u0196\u0198\7C\2\2\u0197"+
		"\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a2\3\2\2\2\u0199\u019b\79"+
		"\2\2\u019a\u019c\7C\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\7\5\2\2\u019e\u01a0\7C\2\2\u019f\u019e\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u0191\3\2\2\2\u01a1"+
		"\u0199\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\t\6"+
		"\2\2\u01a4\u01a6\7C\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\7\r\2\2\u01a8\u018d\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01c5\3\2\2\2\u01aa\u01ac\7$\2\2\u01ab\u01ad\7C\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\7\f\2\2\u01af"+
		"\u01b1\7C\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\7<\2\2\u01b3\u01b5\7C\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01c5\7\r\2\2\u01b7\u01b9\7%\2\2\u01b8"+
		"\u01ba\7C\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\7\f\2\2\u01bc\u01be\7C\2\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7<\2\2\u01c0\u01c2\7C\2"+
		"\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5"+
		"\7\r\2\2\u01c4\u0189\3\2\2\2\u01c4\u01aa\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c5"+
		"\31\3\2\2\2\u01c6\u01c7\7:\2\2\u01c7\33\3\2\2\2\u01c8\u01ca\7C\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\7\31"+
		"\2\2\u01cc\u01ce\7C\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01d1\7<\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\7C\2\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\7A\2\2\u01d6\u01d5\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\7C\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01fc\7B"+
		"\2\2\u01dc\u01de\7C\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01e0\3\2\2\2\u01df\u01e1\7\35\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3"+
		"\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\7C\2\2\u01e3\u01e2\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7!\2\2\u01e6\u01e7\7C\2"+
		"\2\u01e7\u01f2\7<\2\2\u01e8\u01ea\7C\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\7\6\2\2\u01ec\u01ee\7C\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\7<"+
		"\2\2\u01f0\u01e9\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\7C"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fb\7B\2\2\u01f9\u01fb\5\20\t\2\u01fa\u01dd\3\2\2\2\u01fa\u01f9\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7C\2\2\u0200\u01ff\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7\32\2\2\u0203"+
		"\u0204\7C\2\2\u0204\u0206\7\31\2\2\u0205\u0207\7C\2\2\u0206\u0205\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\7<\2\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d\7C"+
		"\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\7B\2\2\u020f\35\3\2\2\2\u0210\u021f\t\7\2\2\u0211\u0213\t\b\2\2"+
		"\u0212\u0214\7C\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0217\7\f\2\2\u0216\u0218\7C\2\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\7<\2\2\u021a\u021c\7C\2"+
		"\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f"+
		"\7\r\2\2\u021e\u0210\3\2\2\2\u021e\u0211\3\2\2\2\u021f\37\3\2\2\2\u0220"+
		"\u0222\7C\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\7\27\2\2\u0224\u0225\7C\2\2\u0225\u0227\7,\2\2\u0226"+
		"\u0228\7C\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0233\3\2"+
		"\2\2\u0229\u022b\7C\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022e\7\6\2\2\u022d\u022f\7C\2\2\u022e\u022d\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\t\t\2\2\u0231"+
		"\u022a\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0238\7C\2\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\7\b"+
		"\2\2\u023a\u023c\7\b\2\2\u023b\u023d\7C\2\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\7<\2\2\u023f\u0241\7C\2"+
		"\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244"+
		"\7@\2\2\u0243\u0245\7C\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\7<\2\2\u0247\u0249\7C\2\2\u0248\u0247\3\2\2"+
		"\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7B\2\2\u024b!\3"+
		"\2\2\2\u024c\u024e\7C\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\7\27\2\2\u0250\u0251\7C\2\2\u0251\u0252\7\31"+
		"\2\2\u0252\u0253\7C\2\2\u0253\u0254\7\30\2\2\u0254\u0255\7C\2\2\u0255"+
		"\u0257\7<\2\2\u0256\u0258\7C\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u025a\3\2\2\2\u0259\u025b\7A\2\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e\7C\2\2\u025d\u025c\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7B\2\2\u0260#\3\2\2\2\u0261"+
		"\u0266\5&\24\2\u0262\u0263\7C\2\2\u0263\u0265\5&\24\2\u0264\u0262\3\2"+
		"\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"%\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026d\7\t\2\2\u026a\u026c\n\3\2\2"+
		"\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026e\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0273\7\n\2\2\u0271"+
		"\u0273\n\3\2\2\u0272\u0269\3\2\2\2\u0272\u0271\3\2\2\2\u0273\'\3\2\2\2"+
		"\u0274\u0276\7<\2\2\u0275\u0277\7C\2\2\u0276\u0275\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\7\5\2\2\u0279\u027b\7C\2\2\u027a"+
		"\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\7="+
		"\2\2\u027d\u027f\7C\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0282\7\6\2\2\u0281\u0283\7C\2\2\u0282\u0281\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u028f\7=\2\2\u0285"+
		"\u0287\7<\2\2\u0286\u0288\7C\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2"+
		"\2\u0288\u0289\3\2\2\2\u0289\u028b\7\5\2\2\u028a\u028c\7C\2\2\u028b\u028a"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\5$\23\2\u028e"+
		"\u0274\3\2\2\2\u028e\u0285\3\2\2\2\u028f)\3\2\2\2\u0290\u0293\5.\30\2"+
		"\u0291\u0293\5,\27\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2\2\2\u0293+\3"+
		"\2\2\2\u0294\u0296\7C\2\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\7\27\2\2\u0298\u0299\7C\2\2\u0299\u029b\7-"+
		"\2\2\u029a\u029c\7C\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029f\7\f\2\2\u029e\u02a0\7C\2\2\u029f\u029e\3\2"+
		"\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\5@!\2\u02a2\u02a4"+
		"\7C\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\7\r\2\2\u02a6\u02a8\7C\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5\64\33\2\u02aa-\3\2\2\2\u02ab\u02ad"+
		"\7C\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\7\27\2\2\u02af\u02b0\7C\2\2\u02b0\u02b2\7-\2\2\u02b1\u02b3\7C\2"+
		"\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6"+
		"\7\f\2\2\u02b5\u02b7\7C\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\5@!\2\u02b9\u02bb\7C\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\7\r\2\2\u02bd\u02bf"+
		"\7C\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c2\7.\2\2\u02c1\u02c3\7C\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2"+
		"\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\7B\2\2\u02c5\u02d1\5\60\31\2\u02c6"+
		"\u02c8\7C\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02ca\7\27\2\2\u02ca\u02cb\7C\2\2\u02cb\u02cd\7/\2\2\u02cc"+
		"\u02ce\7C\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\7B\2\2\u02d0\u02d2\5\60\31\2\u02d1\u02c7\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d5\7C\2\2\u02d4\u02d3\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\7\27\2\2\u02d7"+
		"\u02d8\7C\2\2\u02d8\u02d9\7\32\2\2\u02d9\u02da\7C\2\2\u02da\u02dc\7-\2"+
		"\2\u02db\u02dd\7C\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02df\7B\2\2\u02df/\3\2\2\2\u02e0\u02ea\5\f\7\2\u02e1\u02ea"+
		"\5\n\6\2\u02e2\u02ea\5:\36\2\u02e3\u02ea\5*\26\2\u02e4\u02ea\5\20\t\2"+
		"\u02e5\u02ea\5\26\f\2\u02e6\u02ea\5\34\17\2\u02e7\u02ea\5<\37\2\u02e8"+
		"\u02ea\5\64\33\2\u02e9\u02e0\3\2\2\2\u02e9\u02e1\3\2\2\2\u02e9\u02e2\3"+
		"\2\2\2\u02e9\u02e3\3\2\2\2\u02e9\u02e4\3\2\2\2\u02e9\u02e5\3\2\2\2\u02e9"+
		"\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\61\3\2\2\2\u02ed\u02ef"+
		"\7\f\2\2\u02ee\u02f0\7C\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f3\5\62\32\2\u02f2\u02f4\7C\2\2\u02f3\u02f2\3"+
		"\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7\r\2\2\u02f6"+
		"\u02fb\3\2\2\2\u02f7\u02fb\5\66\34\2\u02f8\u02fb\58\35\2\u02f9\u02fb\n"+
		"\n\2\2\u02fa\u02ed\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fb\63\3\2\2\2\u02fc\u02fe\7C\2\2\u02fd\u02fc\3\2\2\2"+
		"\u02fd\u02fe\3\2\2\2\u02fe\u0302\3\2\2\2\u02ff\u0301\5\62\32\2\u0300\u02ff"+
		"\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303"+
		"\u0307\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0308\7B\2\2\u0306\u0308\5<\37"+
		"\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308\65\3\2\2\2\u0309\u030a"+
		"\7\13\2\2\u030a\u030c\7\t\2\2\u030b\u030d\7C\2\2\u030c\u030b\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u0311\5> \2\u030f\u0311\5@!\2"+
		"\u0310\u030e\3\2\2\2\u0310\u030f\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0314"+
		"\7C\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0316\7\n\2\2\u0316\67\3\2\2\2\u0317\u0319\7;\2\2\u0318\u031a\7C\2\2"+
		"\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d"+
		"\7\20\2\2\u031c\u031e\7C\2\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u032a\5\30\r\2\u0320\u0322\7C\2\2\u0321\u0320\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\7\6\2\2\u0324"+
		"\u0326\7C\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u0329\5\32\16\2\u0328\u0321\3\2\2\2\u0329\u032c\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d\u032f\7C\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0332\7\21\2\2\u0331\u0333\7C\2\2\u0332\u0331\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0339\7\f\2\2\u0335"+
		"\u0337\7C\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2"+
		"\2\2\u0338\u033a\5\62\32\2\u0339\u0336\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033f\7C"+
		"\2\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0341\7\r\2\2\u03419\3\2\2\2\u0342\u0344\7C\2\2\u0343\u0342\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\7\27\2\2\u0346\u0347\7"+
		"C\2\2\u0347\u0349\5(\25\2\u0348\u034a\7C\2\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\7B\2\2\u034c;\3\2\2\2\u034d"+
		"\u034f\7C\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0351\7\22\2\2\u0351\u0356\n\13\2\2\u0352\u0355\5\66\34\2\u0353"+
		"\u0355\n\3\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2"+
		"\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358"+
		"\u0356\3\2\2\2\u0359\u035a\7B\2\2\u035a=\3\2\2\2\u035b\u035c\b \1\2\u035c"+
		"\u035e\7\f\2\2\u035d\u035f\7C\2\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2"+
		"\2\2\u035f\u0360\3\2\2\2\u0360\u0362\5> \2\u0361\u0363\7C\2\2\u0362\u0361"+
		"\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7\r\2\2\u0365"+
		"\u0377\3\2\2\2\u0366\u0377\7=\2\2\u0367\u0369\7<\2\2\u0368\u036a\7C\2"+
		"\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d"+
		"\7\f\2\2\u036c\u036e\7C\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0371\5> \2\u0370\u0372\7C\2\2\u0371\u0370\3\2\2"+
		"\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\7\r\2\2\u0374\u0377"+
		"\3\2\2\2\u0375\u0377\7<\2\2\u0376\u035b\3\2\2\2\u0376\u0366\3\2\2\2\u0376"+
		"\u0367\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u038c\3\2\2\2\u0378\u037a\f\b"+
		"\2\2\u0379\u037b\7C\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037e\t\f\2\2\u037d\u037f\7C\2\2\u037e\u037d\3\2"+
		"\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u038b\5> \t\u0381\u0383"+
		"\f\7\2\2\u0382\u0384\7C\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0387\t\r\2\2\u0386\u0388\7C\2\2\u0387\u0386\3\2"+
		"\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\5> \b\u038a\u0378"+
		"\3\2\2\2\u038a\u0381\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d?\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0390\b!\1\2\u0390"+
		"\u0392\7\61\2\2\u0391\u0393\7C\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u03a0\5@!\4\u0395\u0397\5> \2\u0396\u0398"+
		"\7C\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039b\t\16\2\2\u039a\u039c\7C\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039d\u039e\5> \2\u039e\u03a0\3\2\2\2\u039f\u038f"+
		"\3\2\2\2\u039f\u0395\3\2\2\2\u03a0\u03b5\3\2\2\2\u03a1\u03a3\f\6\2\2\u03a2"+
		"\u03a4\7C\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2"+
		"\2\2\u03a5\u03a7\7\60\2\2\u03a6\u03a8\7C\2\2\u03a7\u03a6\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03b4\5@!\7\u03aa\u03ac\f\5\2"+
		"\2\u03ab\u03ad\7C\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03b0\7\62\2\2\u03af\u03b1\7C\2\2\u03b0\u03af\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\5@!\6\u03b3\u03a1\3\2\2"+
		"\2\u03b3\u03aa\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6A\3\2\2\2\u03b7\u03b5\3\2\2\2\u00cfDFJMPV\\`eiorux{\u0081"+
		"\u0086\u0088\u008c\u008f\u0092\u0098\u009b\u009e\u00a1\u00a5\u00aa\u00b0"+
		"\u00b3\u00b6\u00b9\u00bc\u00c0\u00c3\u00cb\u00ce\u00d4\u00d9\u00e1\u00e6"+
		"\u00f0\u00f4\u00f6\u00ff\u0104\u0107\u010d\u0110\u0113\u0118\u011b\u011e"+
		"\u0126\u012b\u012e\u0134\u0137\u013a\u013f\u0143\u0146\u014a\u014f\u0153"+
		"\u0157\u015a\u0160\u0165\u0168\u016c\u016f\u0173\u0175\u0179\u017f\u0182"+
		"\u0185\u018b\u018f\u0193\u0197\u019b\u019f\u01a1\u01a5\u01a8\u01ac\u01b0"+
		"\u01b4\u01b9\u01bd\u01c1\u01c4\u01c9\u01cd\u01d0\u01d3\u01d6\u01d9\u01dd"+
		"\u01e0\u01e3\u01e9\u01ed\u01f2\u01f6\u01fa\u01fc\u0200\u0206\u0209\u020c"+
		"\u0213\u0217\u021b\u021e\u0221\u0227\u022a\u022e\u0233\u0237\u023c\u0240"+
		"\u0244\u0248\u024d\u0257\u025a\u025d\u0266\u026d\u0272\u0276\u027a\u027e"+
		"\u0282\u0287\u028b\u028e\u0292\u0295\u029b\u029f\u02a3\u02a7\u02ac\u02b2"+
		"\u02b6\u02ba\u02be\u02c2\u02c7\u02cd\u02d1\u02d4\u02dc\u02e9\u02eb\u02ef"+
		"\u02f3\u02fa\u02fd\u0302\u0307\u030c\u0310\u0313\u0319\u031d\u0321\u0325"+
		"\u032a\u032e\u0332\u0336\u033b\u033e\u0343\u0349\u034e\u0354\u0356\u035e"+
		"\u0362\u0369\u036d\u0371\u0376\u037a\u037e\u0383\u0387\u038a\u038c\u0392"+
		"\u0397\u039b\u039f\u03a3\u03a7\u03ac\u03b0\u03b3\u03b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}