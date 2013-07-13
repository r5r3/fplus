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
		Placeholder=1, Assign=2, Comma=3, Semicolon=4, LeftBrace=5, RightBrace=6, 
		DollarLeftBrace=7, Prefix=8, Template=9, End=10, Do=11, In=12, Program=13, 
		Module=14, Contains=15, Identifier=16, IntegerConstant=17, StringLiteral=18, 
		Newline=19, WS=20, Noise=21;
	public static final String[] tokenNames = {
		"<INVALID>", "Placeholder", "'='", "','", "';'", "'{'", "'}'", "'${'", 
		"Prefix", "Template", "End", "Do", "In", "Program", "Module", "Contains", 
		"Identifier", "IntegerConstant", "StringLiteral", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBlockContent = 5, RULE_loopBegin = 6, RULE_list = 7, 
		RULE_listItem = 8, RULE_listAssignment = 9, RULE_contentBlock = 10, RULE_contentLine = 11;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBlockContent", "loopBegin", "list", "listItem", "listAssignment", 
		"contentBlock", "contentLine"
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
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(24); contentBlock();
				}
				break;
			}
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(27); moduleBlock();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33); programBlock();
				}
				break;
			}
			setState(37);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Placeholder) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << DollarLeftBrace) | (1L << Template) | (1L << End) | (1L << Do) | (1L << In) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(36); contentBlock();
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
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
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
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
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
			setState(40);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(39); match(WS);
				}
			}

			setState(42); match(Program);
			setState(43); match(WS);
			setState(44); match(Identifier);
			setState(46);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(45); match(WS);
				}
			}

			setState(48); match(Newline);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(52);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(49); contentBlock();
						}
						break;

					case 2:
						{
						setState(50); loopBlock();
						}
						break;

					case 3:
						{
						setState(51); match(Newline);
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(58);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57); match(WS);
				}
			}

			setState(60); match(End);
			setState(61); match(WS);
			setState(62); match(Program);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(63); match(WS);
				}
				break;
			}
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(66); match(Identifier);
				}
				break;
			}
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(69); match(WS);
				}
				break;
			}
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(72); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75); match(WS);
				}
			}

			setState(78); match(Module);
			setState(79); match(WS);
			setState(80); match(Identifier);
			setState(82);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81); match(WS);
				}
			}

			setState(84); match(Newline);
			setState(86);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85); match(WS);
				}
			}

			setState(88); match(Contains);
			setState(90);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89); match(WS);
				}
			}

			setState(92); match(Newline);
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93); match(WS);
				}
			}

			setState(96); match(End);
			setState(97); match(WS);
			setState(98); match(Module);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(99); match(WS);
				}
				break;
			}
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(102); match(Identifier);
				}
				break;
			}
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(105); match(Newline);
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
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(108); match(WS);
				}
			}

			setState(111); match(Prefix);
			setState(112); match(WS);
			setState(113); match(Template);
			setState(115);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(114); match(WS);
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(117); match(Identifier);
				}
			}

			setState(120); match(Newline);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); loopBlock();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(127); match(WS);
				}
			}

			setState(130); match(Prefix);
			setState(131); match(WS);
			setState(132); match(End);
			setState(133); match(WS);
			setState(134); match(Template);
			setState(136);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(135); match(WS);
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(138); match(Identifier);
				}
			}

			setState(141); match(Newline);
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
		public LoopBlockContentContext loopBlockContent() {
			return getRuleContext(LoopBlockContentContext.class,0);
		}
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
			setState(143); loopBegin();
			setState(145);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(144); match(WS);
				}
			}

			setState(147); match(Newline);
			setState(148); loopBlockContent();
			setState(150);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(149); match(WS);
				}
			}

			setState(152); match(Prefix);
			setState(153); match(WS);
			setState(154); match(End);
			setState(155); match(WS);
			setState(156); match(Do);
			setState(158);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(157); match(WS);
				}
			}

			setState(160); match(Newline);
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

	public static class LoopBlockContentContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public LoopBlockContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLoopBlockContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLoopBlockContent(this);
		}
	}

	public final LoopBlockContentContext loopBlockContent() throws RecognitionException {
		LoopBlockContentContext _localctx = new LoopBlockContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBlockContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(162); contentBlock();
						}
						break;

					case 2:
						{
						setState(163); loopBlock();
						}
						break;

					case 3:
						{
						setState(164); match(Newline);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 12, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(170); match(WS);
				}
			}

			setState(173); match(Prefix);
			setState(174); match(WS);
			setState(175); match(Do);
			setState(176); match(WS);
			setState(177); listAssignment();
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
		enterRule(_localctx, 14, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179); listItem();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(180); match(WS);
					setState(181); listItem();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 16, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(LeftBrace);
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(188);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(194); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
		public TerminalNode In() { return getToken(fplusParser.In, 0); }
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
		enterRule(_localctx, 18, RULE_listAssignment);
		int _la;
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(Identifier);
				setState(200);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(199); match(WS);
					}
				}

				setState(202); match(Assign);
				setState(204);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(203); match(WS);
					}
				}

				setState(206); match(IntegerConstant);
				setState(208);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(207); match(WS);
					}
				}

				setState(210); match(Comma);
				setState(212);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(211); match(WS);
					}
				}

				setState(214); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); match(Identifier);
				setState(217);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(216); match(WS);
					}
				}

				setState(219); match(In);
				setState(221);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(220); match(WS);
					}
					break;
				}
				setState(223); list();
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
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
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
		enterRule(_localctx, 20, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(226); contentLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
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
		enterRule(_localctx, 22, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(231);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Prefix) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(237); match(Newline);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3"+
		"\2\5\2%\n\2\3\2\5\2(\n\2\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\3\5\3"+
		"C\n\3\3\3\5\3F\n\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\4\5\4O\n\4\3\4\3\4\3\4"+
		"\3\4\5\4U\n\4\3\4\3\4\5\4Y\n\4\3\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n\4\3\4\3"+
		"\4\3\4\3\4\5\4g\n\4\3\4\5\4j\n\4\3\4\5\4m\n\4\3\5\5\5p\n\5\3\5\3\5\3\5"+
		"\3\5\5\5v\n\5\3\5\5\5y\n\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\5"+
		"\5\u0083\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\5\5\5\u008e\n\5\3"+
		"\5\3\5\3\6\3\6\5\6\u0094\n\6\3\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab"+
		"\13\7\3\b\5\b\u00ae\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00b9"+
		"\n\t\f\t\16\t\u00bc\13\t\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n"+
		"\3\n\5\n\u00c7\n\n\3\13\3\13\5\13\u00cb\n\13\3\13\3\13\5\13\u00cf\n\13"+
		"\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\5"+
		"\13\u00dc\n\13\3\13\3\13\5\13\u00e0\n\13\3\13\5\13\u00e3\n\13\3\f\6\f"+
		"\u00e6\n\f\r\f\16\f\u00e7\3\r\7\r\u00eb\n\r\f\r\16\r\u00ee\13\r\3\r\3"+
		"\r\3\r\4\u00c1\u00ec\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\25\25\3"+
		"\2\n\n\u0115\2\33\3\2\2\2\4*\3\2\2\2\6N\3\2\2\2\bo\3\2\2\2\n\u0091\3\2"+
		"\2\2\f\u00a9\3\2\2\2\16\u00ad\3\2\2\2\20\u00b5\3\2\2\2\22\u00c6\3\2\2"+
		"\2\24\u00e2\3\2\2\2\26\u00e5\3\2\2\2\30\u00ec\3\2\2\2\32\34\5\26\f\2\33"+
		"\32\3\2\2\2\33\34\3\2\2\2\34 \3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3\2\2\2#%\5\4\3\2$#\3\2\2"+
		"\2$%\3\2\2\2%\'\3\2\2\2&(\5\26\f\2\'&\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)+"+
		"\7\26\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\17\2\2-.\7\26\2\2.\60\7\22"+
		"\2\2/\61\7\26\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\628\7\25\2\2"+
		"\63\67\5\26\f\2\64\67\5\n\6\2\65\67\7\25\2\2\66\63\3\2\2\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		";=\7\26\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\f\2\2?@\7\26\2\2@B\7\17"+
		"\2\2AC\7\26\2\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\7\22\2\2ED\3\2\2\2EF\3"+
		"\2\2\2FH\3\2\2\2GI\7\26\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\7\25\2\2K"+
		"J\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MO\7\26\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\7\20\2\2QR\7\26\2\2RT\7\22\2\2SU\7\26\2\2TS\3\2\2\2TU\3\2\2\2UV\3"+
		"\2\2\2VX\7\25\2\2WY\7\26\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\21\2\2"+
		"[]\7\26\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\25\2\2_a\7\26\2\2`_\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\f\2\2cd\7\26\2\2df\7\20\2\2eg\7\26\2\2"+
		"fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\7\22\2\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2"+
		"\2km\7\25\2\2lk\3\2\2\2lm\3\2\2\2m\7\3\2\2\2np\7\26\2\2on\3\2\2\2op\3"+
		"\2\2\2pq\3\2\2\2qr\7\n\2\2rs\7\26\2\2su\7\13\2\2tv\7\26\2\2ut\3\2\2\2"+
		"uv\3\2\2\2vx\3\2\2\2wy\7\22\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z~\7\25\2"+
		"\2{}\5\n\6\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\26\2\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\26"+
		"\2\2\u0086\u0087\7\f\2\2\u0087\u0088\7\26\2\2\u0088\u008a\7\13\2\2\u0089"+
		"\u008b\7\26\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3"+
		"\2\2\2\u008c\u008e\7\22\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\25\2\2\u0090\t\3\2\2\2\u0091\u0093\5\16\b"+
		"\2\u0092\u0094\7\26\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\25\2\2\u0096\u0098\5\f\7\2\u0097\u0099\7"+
		"\26\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\7\n\2\2\u009b\u009c\7\26\2\2\u009c\u009d\7\f\2\2\u009d\u009e\7"+
		"\26\2\2\u009e\u00a0\7\r\2\2\u009f\u00a1\7\26\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\13\3\2\2"+
		"\2\u00a4\u00a8\5\26\f\2\u00a5\u00a8\5\n\6\2\u00a6\u00a8\7\25\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ae\7\26\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2"+
		"\7\r\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\5\24\13\2\u00b4\17\3\2\2\2\u00b5"+
		"\u00ba\5\22\n\2\u00b6\u00b7\7\26\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\21\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7\7\2\2\u00be\u00c0\n\2\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\7\b\2\2\u00c5"+
		"\u00c7\n\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\23\3\2\2"+
		"\2\u00c8\u00ca\7\22\2\2\u00c9\u00cb\7\26\2\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\4\2\2\u00cd\u00cf\7\26"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\7\23\2\2\u00d1\u00d3\7\26\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\5\2\2\u00d5\u00d7\7\26\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e3\7\23"+
		"\2\2\u00d9\u00db\7\22\2\2\u00da\u00dc\7\26\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\16\2\2\u00de\u00e0\7"+
		"\26\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\5\20\t\2\u00e2\u00c8\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e3\25\3\2\2"+
		"\2\u00e4\u00e6\5\30\r\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\27\3\2\2\2\u00e9\u00eb\n\3\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\25\2\2"+
		"\u00f0\31\3\2\2\2\60\33 $\'*\60\668<BEHKNTX\\`filoux~\u0082\u008a\u008d"+
		"\u0093\u0098\u00a0\u00a7\u00a9\u00ad\u00ba\u00c1\u00c6\u00ca\u00ce\u00d2"+
		"\u00d6\u00db\u00df\u00e2\u00e7\u00ec";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}