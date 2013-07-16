// Generated from fplus.g4 by ANTLR 4.1
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Assign=1, Comma=2, Semicolon=3, LeftBrace=4, RightBrace=5, Dollar=6, LeftParen=7, 
		RightParen=8, LeftBracket=9, RightBracket=10, Prefix=11, Template=12, 
		Interface=13, End=14, Do=15, Program=16, Module=17, Contains=18, Function=19, 
		Subroutine=20, Identifier=21, IntegerConstant=22, StringLiteral=23, Newline=24, 
		WS=25, Noise=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "Prefix", "Template", "Interface", "End", "Do", "Program", "Module", 
		"Contains", "Function", "Subroutine", "Identifier", "IntegerConstant", 
		"StringLiteral", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBegin = 5, RULE_procedureBlock = 6, RULE_functionBlock = 7, 
		RULE_subroutineBlock = 8, RULE_interfaceLine = 9, RULE_list = 10, RULE_listItem = 11, 
		RULE_listAssignment = 12, RULE_contentBlock = 13, RULE_contentLine = 14, 
		RULE_placeholder = 15, RULE_variableDefinition = 16;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", "interfaceLine", 
		"list", "listItem", "listAssignment", "contentBlock", "contentLine", "placeholder", 
		"variableDefinition"
	};

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public fplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FortranFileContext extends ParserRuleContext {
		public ModuleBlockContext moduleBlock(int i) {
			return getRuleContext(ModuleBlockContext.class,i);
		}
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<ModuleBlockContext> moduleBlock() {
			return getRuleContexts(ModuleBlockContext.class);
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
	}

	public final FortranFileContext fortranFile() throws RecognitionException {
		FortranFileContext _localctx = new FortranFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fortranFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(36);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(34); moduleBlock();
						}
						break;

					case 2:
						{
						setState(35); contentBlock();
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41); programBlock();
				}
				break;
			}
			setState(45);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(44); contentBlock();
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Program() { return getTokens(fplusParser.Program); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Program(int i) {
			return getToken(fplusParser.Program, i);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
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
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(47); match(WS);
				}
			}

			setState(50); match(Program);
			setState(51); match(WS);
			setState(52); match(Identifier);
			setState(54);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53); match(WS);
				}
			}

			setState(56); match(Newline);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); contentBlock();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(64);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63); match(WS);
				}
			}

			setState(66); match(End);
			setState(67); match(WS);
			setState(68); match(Program);
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(69); match(WS);
				}
				break;
			}
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(72); match(Identifier);
				}
				break;
			}
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(75); match(WS);
				}
				break;
			}
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(78); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public List<InterfaceLineContext> interfaceLine() {
			return getRuleContexts(InterfaceLineContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public InterfaceLineContext interfaceLine(int i) {
			return getRuleContext(InterfaceLineContext.class,i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
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
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81); match(WS);
				}
			}

			setState(84); match(Module);
			setState(85); match(WS);
			setState(86); match(Identifier);
			setState(88);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(87); match(WS);
				}
			}

			setState(90); match(Newline);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(93);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(91); contentBlock();
						}
						break;

					case 2:
						{
						setState(92); interfaceLine();
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(99);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(98); match(WS);
				}
			}

			setState(101); match(Contains);
			setState(103);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(102); match(WS);
				}
			}

			setState(105); match(Newline);
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(106); contentBlock();
				}
				break;
			}
			setState(110);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109); match(WS);
				}
			}

			setState(112); match(End);
			setState(113); match(WS);
			setState(114); match(Module);
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(115); match(WS);
				}
				break;
			}
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(118); match(Identifier);
				}
				break;
			}
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(121); match(Newline);
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

	public static class TemplateBlockContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(124); match(WS);
				}
			}

			setState(127); match(Prefix);
			setState(128); match(WS);
			setState(129); match(Template);
			setState(131);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(130); match(WS);
				}
			}

			setState(134);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(133); match(Identifier);
				}
			}

			setState(136); match(Newline);
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(137); contentBlock();
				}
				break;
			}
			setState(141);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(140); match(WS);
				}
			}

			setState(143); match(Prefix);
			setState(144); match(WS);
			setState(145); match(End);
			setState(146); match(WS);
			setState(147); match(Template);
			setState(149);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(148); match(WS);
				}
			}

			setState(152);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(151); match(Identifier);
				}
			}

			setState(154); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public LoopBeginContext loopBegin() {
			return getRuleContext(LoopBeginContext.class,0);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
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
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); loopBegin();
			setState(158);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(157); match(WS);
				}
			}

			setState(160); match(Newline);
			setState(161); contentBlock();
			setState(163);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(162); match(WS);
				}
			}

			setState(165); match(Prefix);
			setState(166); match(WS);
			setState(167); match(End);
			setState(168); match(WS);
			setState(169); match(Do);
			setState(171);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(170); match(WS);
				}
			}

			setState(173); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final LoopBeginContext loopBegin() throws RecognitionException {
		LoopBeginContext _localctx = new LoopBeginContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(175); match(WS);
				}
			}

			setState(178); match(Prefix);
			setState(179); match(WS);
			setState(180); match(Do);
			setState(181); match(WS);
			setState(182); listAssignment();
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
		public SubroutineBlockContext subroutineBlock() {
			return getRuleContext(SubroutineBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureBlock);
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); functionBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); subroutineBlock();
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
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
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(190);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(188); placeholder();
					}
					break;

				case 2:
					{
					setState(189);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(Function);
			setState(196); match(WS);
			setState(197); match(Identifier);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204); match(Newline);
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(205); contentBlock();
				}
				break;
			}
			setState(209);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(208); match(WS);
				}
			}

			setState(211); match(End);
			setState(212); match(WS);
			setState(213); match(Function);
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(214); match(WS);
				}
				break;
			}
			setState(218);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(217); match(Identifier);
				}
			}

			setState(221);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(220); match(WS);
				}
			}

			setState(223); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
		}
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
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(225); match(WS);
				}
			}

			setState(228); match(Subroutine);
			setState(229); match(WS);
			setState(230); match(Identifier);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237); match(Newline);
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(238); contentBlock();
				}
				break;
			}
			setState(242);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(241); match(WS);
				}
			}

			setState(244); match(End);
			setState(245); match(WS);
			setState(246); match(Subroutine);
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(247); match(WS);
				}
				break;
			}
			setState(251);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(250); match(Identifier);
				}
			}

			setState(254);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(253); match(WS);
				}
			}

			setState(256); match(Newline);
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
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Template() { return getToken(fplusParser.Template, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Interface() { return getToken(fplusParser.Interface, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
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
	}

	public final InterfaceLineContext interfaceLine() throws RecognitionException {
		InterfaceLineContext _localctx = new InterfaceLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(258); match(WS);
				}
			}

			setState(261); match(Prefix);
			setState(262); match(WS);
			setState(263); match(Interface);
			setState(264); match(WS);
			setState(265); match(Template);
			setState(266); match(WS);
			setState(267); match(Identifier);
			setState(269);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(268); match(WS);
				}
			}

			setState(271); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273); listItem();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(274); match(WS);
					setState(275); listItem();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(LeftBrace);
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(282);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(288); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(fplusParser.IntegerConstant); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(fplusParser.IntegerConstant, i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listAssignment);
		int _la;
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); match(Identifier);
				setState(294);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(293); match(WS);
					}
				}

				setState(296); match(Assign);
				setState(298);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(297); match(WS);
					}
				}

				setState(300); match(IntegerConstant);
				setState(302);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(301); match(WS);
					}
				}

				setState(304); match(Comma);
				setState(306);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(305); match(WS);
					}
				}

				setState(308); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(Identifier);
				setState(311);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(310); match(WS);
					}
				}

				setState(313); match(Assign);
				setState(315);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(314); match(WS);
					}
					break;
				}
				setState(317); list();
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

	public static class ContentBlockContext extends ParserRuleContext {
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
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
	}

	public final ContentBlockContext contentBlock() throws RecognitionException {
		ContentBlockContext _localctx = new ContentBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(325);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(320); loopBlock();
						}
						break;

					case 2:
						{
						setState(321); templateBlock();
						}
						break;

					case 3:
						{
						setState(322); variableDefinition();
						}
						break;

					case 4:
						{
						setState(323); procedureBlock();
						}
						break;

					case 5:
						{
						setState(324); contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
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
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(329); match(WS);
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(334);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(332); placeholder();
						}
						break;

					case 2:
						{
						setState(333);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Prefix) | (1L << Function) | (1L << Subroutine))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(339); match(Newline);
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
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
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
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_placeholder);
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); match(Dollar);
				setState(342); match(LeftBrace);
				setState(343); match(Identifier);
				setState(344); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345); match(Dollar);
				setState(346); match(LeftBrace);
				setState(347); match(Identifier);
				setState(348); match(LeftParen);
				setState(349); match(Identifier);
				setState(350); match(RightParen);
				setState(351); match(RightBrace);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
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
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(354); match(WS);
				}
			}

			setState(357); match(Prefix);
			setState(358); match(WS);
			setState(359); listAssignment();
			setState(361);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(360); match(WS);
				}
			}

			setState(363); match(Newline);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\34\u0170\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\5\2-\n\2\3\2\5\2\60\n\2\3\3\5\3"+
		"\63\n\3\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\5"+
		"\3C\n\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\3\5\3R\n"+
		"\3\3\4\5\4U\n\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4"+
		"c\13\4\3\4\5\4f\n\4\3\4\3\4\5\4j\n\4\3\4\3\4\5\4n\n\4\3\4\5\4q\n\4\3\4"+
		"\3\4\3\4\3\4\5\4w\n\4\3\4\5\4z\n\4\3\4\5\4}\n\4\3\5\5\5\u0080\n\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0086\n\5\3\5\5\5\u0089\n\5\3\5\3\5\5\5\u008d\n\5\3\5"+
		"\5\5\u0090\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0098\n\5\3\5\5\5\u009b\n\5"+
		"\3\5\3\5\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\3\7\5\7\u00b3\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\b\u00bd\n\b\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\t\3\t\5\t\u00d1\n\t"+
		"\3\t\5\t\u00d4\n\t\3\t\3\t\3\t\3\t\5\t\u00da\n\t\3\t\5\t\u00dd\n\t\3\t"+
		"\5\t\u00e0\n\t\3\t\3\t\3\n\5\n\u00e5\n\n\3\n\3\n\3\n\3\n\7\n\u00eb\n\n"+
		"\f\n\16\n\u00ee\13\n\3\n\3\n\5\n\u00f2\n\n\3\n\5\n\u00f5\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00fb\n\n\3\n\5\n\u00fe\n\n\3\n\5\n\u0101\n\n\3\n\3\n\3\13"+
		"\5\13\u0106\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0110\n"+
		"\13\3\13\3\13\3\f\3\f\3\f\7\f\u0117\n\f\f\f\16\f\u011a\13\f\3\r\3\r\7"+
		"\r\u011e\n\r\f\r\16\r\u0121\13\r\3\r\3\r\5\r\u0125\n\r\3\16\3\16\5\16"+
		"\u0129\n\16\3\16\3\16\5\16\u012d\n\16\3\16\3\16\5\16\u0131\n\16\3\16\3"+
		"\16\5\16\u0135\n\16\3\16\3\16\3\16\5\16\u013a\n\16\3\16\3\16\5\16\u013e"+
		"\n\16\3\16\5\16\u0141\n\16\3\17\3\17\3\17\3\17\3\17\6\17\u0148\n\17\r"+
		"\17\16\17\u0149\3\20\5\20\u014d\n\20\3\20\3\20\7\20\u0151\n\20\f\20\16"+
		"\20\u0154\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0163\n\21\3\22\5\22\u0166\n\22\3\22\3\22\3\22\3\22\5"+
		"\22\u016c\n\22\3\22\3\22\3\22\4\u011f\u0152\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\5\4\2\25\25\32\32\3\2\32\32\4\2\r\r\25\26\u01a7\2"+
		"(\3\2\2\2\4\62\3\2\2\2\6T\3\2\2\2\b\177\3\2\2\2\n\u009e\3\2\2\2\f\u00b2"+
		"\3\2\2\2\16\u00bc\3\2\2\2\20\u00c2\3\2\2\2\22\u00e4\3\2\2\2\24\u0105\3"+
		"\2\2\2\26\u0113\3\2\2\2\30\u0124\3\2\2\2\32\u0140\3\2\2\2\34\u0147\3\2"+
		"\2\2\36\u014c\3\2\2\2 \u0162\3\2\2\2\"\u0165\3\2\2\2$\'\5\6\4\2%\'\5\34"+
		"\17\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3"+
		"\2\2\2+-\5\4\3\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\34\17\2/.\3\2\2\2"+
		"/\60\3\2\2\2\60\3\3\2\2\2\61\63\7\33\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\3\2\2\2\64\65\7\22\2\2\65\66\7\33\2\2\668\7\27\2\2\679\7\33\2\28\67"+
		"\3\2\2\289\3\2\2\29:\3\2\2\2:>\7\32\2\2;=\5\34\17\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2AC\7\33\2\2BA\3\2\2\2BC\3\2"+
		"\2\2CD\3\2\2\2DE\7\20\2\2EF\7\33\2\2FH\7\22\2\2GI\7\33\2\2HG\3\2\2\2H"+
		"I\3\2\2\2IK\3\2\2\2JL\7\27\2\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7\33\2"+
		"\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\7\32\2\2QP\3\2\2\2QR\3\2\2\2R\5\3\2"+
		"\2\2SU\7\33\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\23\2\2WX\7\33\2\2XZ"+
		"\7\27\2\2Y[\7\33\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\a\7\32\2\2]`\5\34"+
		"\17\2^`\5\24\13\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be"+
		"\3\2\2\2ca\3\2\2\2df\7\33\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\24\2\2"+
		"hj\7\33\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\32\2\2ln\5\34\17\2ml\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2oq\7\33\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7"+
		"\20\2\2st\7\33\2\2tv\7\23\2\2uw\7\33\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xz\7\27\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\7\32\2\2|{\3\2\2\2|}\3\2\2"+
		"\2}\7\3\2\2\2~\u0080\7\33\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\r\2\2\u0082\u0083\7\33\2\2\u0083\u0085\7\16\2\2"+
		"\u0084\u0086\7\33\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0089\7\27\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008c\7\32\2\2\u008b\u008d\5\34\17\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\7\33"+
		"\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\r\2\2\u0092\u0093\7\33\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7"+
		"\33\2\2\u0095\u0097\7\16\2\2\u0096\u0098\7\33\2\2\u0097\u0096\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\7\27\2\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\32\2\2"+
		"\u009d\t\3\2\2\2\u009e\u00a0\5\f\7\2\u009f\u00a1\7\33\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\32\2\2"+
		"\u00a3\u00a5\5\34\17\2\u00a4\u00a6\7\33\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7\33"+
		"\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\7\21\2\2\u00ac"+
		"\u00ae\7\33\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00b0\7\32\2\2\u00b0\13\3\2\2\2\u00b1\u00b3\7\33\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\r"+
		"\2\2\u00b5\u00b6\7\33\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8\7\33\2\2\u00b8"+
		"\u00b9\5\32\16\2\u00b9\r\3\2\2\2\u00ba\u00bd\5\20\t\2\u00bb\u00bd\5\22"+
		"\n\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00c1"+
		"\5 \21\2\u00bf\u00c1\n\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\7\33\2\2\u00c7"+
		"\u00cb\7\27\2\2\u00c8\u00ca\n\3\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\7\32\2\2\u00cf\u00d1\5\34\17\2\u00d0\u00cf"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\7\33\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\7\20\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00d9\7\25\2\2\u00d8\u00da\7\33\2"+
		"\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd"+
		"\7\27\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2"+
		"\u00de\u00e0\7\33\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2\21\3\2\2\2\u00e3\u00e5\7\33\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\26"+
		"\2\2\u00e7\u00e8\7\33\2\2\u00e8\u00ec\7\27\2\2\u00e9\u00eb\n\3\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\32\2\2\u00f0"+
		"\u00f2\5\34\17\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3"+
		"\2\2\2\u00f3\u00f5\7\33\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00fa\7"+
		"\26\2\2\u00f9\u00fb\7\33\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fe\7\27\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\7\33\2\2\u0100\u00ff\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\32\2\2\u0103\23\3\2\2"+
		"\2\u0104\u0106\7\33\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u0109\7\33\2\2\u0109\u010a\7"+
		"\17\2\2\u010a\u010b\7\33\2\2\u010b\u010c\7\16\2\2\u010c\u010d\7\33\2\2"+
		"\u010d\u010f\7\27\2\2\u010e\u0110\7\33\2\2\u010f\u010e\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\32\2\2\u0112\25\3\2\2\2\u0113"+
		"\u0118\5\30\r\2\u0114\u0115\7\33\2\2\u0115\u0117\5\30\r\2\u0116\u0114"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\27\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\7\6\2\2\u011c\u011e\n\3\2"+
		"\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0125\7\7\2\2\u0123"+
		"\u0125\n\3\2\2\u0124\u011b\3\2\2\2\u0124\u0123\3\2\2\2\u0125\31\3\2\2"+
		"\2\u0126\u0128\7\27\2\2\u0127\u0129\7\33\2\2\u0128\u0127\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7\3\2\2\u012b\u012d\7\33"+
		"\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\7\30\2\2\u012f\u0131\7\33\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\7\4\2\2\u0133\u0135\7\33\2\2\u0134"+
		"\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0141\7\30"+
		"\2\2\u0137\u0139\7\27\2\2\u0138\u013a\7\33\2\2\u0139\u0138\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7\3\2\2\u013c\u013e\7\33"+
		"\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\5\26\f\2\u0140\u0126\3\2\2\2\u0140\u0137\3\2\2\2\u0141\33\3\2\2"+
		"\2\u0142\u0148\5\n\6\2\u0143\u0148\5\b\5\2\u0144\u0148\5\"\22\2\u0145"+
		"\u0148\5\16\b\2\u0146\u0148\5\36\20\2\u0147\u0142\3\2\2\2\u0147\u0143"+
		"\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\35\3\2\2"+
		"\2\u014b\u014d\7\33\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u0152\3\2\2\2\u014e\u0151\5 \21\2\u014f\u0151\n\4\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\32"+
		"\2\2\u0156\37\3\2\2\2\u0157\u0158\7\b\2\2\u0158\u0159\7\6\2\2\u0159\u015a"+
		"\7\27\2\2\u015a\u0163\7\7\2\2\u015b\u015c\7\b\2\2\u015c\u015d\7\6\2\2"+
		"\u015d\u015e\7\27\2\2\u015e\u015f\7\t\2\2\u015f\u0160\7\27\2\2\u0160\u0161"+
		"\7\n\2\2\u0161\u0163\7\7\2\2\u0162\u0157\3\2\2\2\u0162\u015b\3\2\2\2\u0163"+
		"!\3\2\2\2\u0164\u0166\7\33\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\7\r\2\2\u0168\u0169\7\33\2\2\u0169\u016b"+
		"\5\32\16\2\u016a\u016c\7\33\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016d\u016e\7\32\2\2\u016e#\3\2\2\2H&(,/\628>B"+
		"HKNQTZ_aeimpvy|\177\u0085\u0088\u008c\u008f\u0097\u009a\u00a0\u00a5\u00ad"+
		"\u00b2\u00bc\u00c0\u00c2\u00cb\u00d0\u00d3\u00d9\u00dc\u00df\u00e4\u00ec"+
		"\u00f1\u00f4\u00fa\u00fd\u0100\u0105\u010f\u0118\u011f\u0124\u0128\u012c"+
		"\u0130\u0134\u0139\u013d\u0140\u0147\u0149\u014c\u0150\u0152\u0162\u0165"+
		"\u016b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}