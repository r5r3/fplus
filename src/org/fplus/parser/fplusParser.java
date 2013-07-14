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
		End=13, Do=14, In=15, Program=16, Module=17, Contains=18, Identifier=19, 
		IntegerConstant=20, StringLiteral=21, Newline=22, WS=23, Noise=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "Prefix", "Template", "End", "Do", "In", "Program", "Module", "Contains", 
		"Identifier", "IntegerConstant", "StringLiteral", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBlockContent = 5, RULE_loopBegin = 6, RULE_list = 7, 
		RULE_listItem = 8, RULE_listAssignment = 9, RULE_contentBlock = 10, RULE_contentLine = 11, 
		RULE_placeholder = 12;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBlockContent", "loopBegin", "list", "listItem", "listAssignment", 
		"contentBlock", "contentLine", "placeholder"
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
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(26); contentBlock();
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(29); moduleBlock();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35); programBlock();
				}
				break;
			}
			setState(39);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Template) | (1L << End) | (1L << Do) | (1L << In) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(38); contentBlock();
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
			setState(42);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41); match(WS);
				}
			}

			setState(44); match(Program);
			setState(45); match(WS);
			setState(46); match(Identifier);
			setState(48);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(47); match(WS);
				}
			}

			setState(50); match(Newline);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(54);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(51); contentBlock();
						}
						break;

					case 2:
						{
						setState(52); loopBlock();
						}
						break;

					case 3:
						{
						setState(53); match(Newline);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(60);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(59); match(WS);
				}
			}

			setState(62); match(End);
			setState(63); match(WS);
			setState(64); match(Program);
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(65); match(WS);
				}
				break;
			}
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(68); match(Identifier);
				}
				break;
			}
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(71); match(WS);
				}
				break;
			}
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(74); match(Newline);
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
			setState(78);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77); match(WS);
				}
			}

			setState(80); match(Module);
			setState(81); match(WS);
			setState(82); match(Identifier);
			setState(84);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(83); match(WS);
				}
			}

			setState(86); match(Newline);
			setState(88);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(87); match(WS);
				}
			}

			setState(90); match(Contains);
			setState(92);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(91); match(WS);
				}
			}

			setState(94); match(Newline);
			setState(96);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(95); match(WS);
				}
			}

			setState(98); match(End);
			setState(99); match(WS);
			setState(100); match(Module);
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(101); match(WS);
				}
				break;
			}
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(104); match(Identifier);
				}
				break;
			}
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(107); match(Newline);
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
			setState(111);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(110); match(WS);
				}
			}

			setState(113); match(Prefix);
			setState(114); match(WS);
			setState(115); match(Template);
			setState(117);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(116); match(WS);
				}
			}

			setState(120);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(119); match(Identifier);
				}
			}

			setState(122); match(Newline);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); loopBlock();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(130);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(129); match(WS);
				}
			}

			setState(132); match(Prefix);
			setState(133); match(WS);
			setState(134); match(End);
			setState(135); match(WS);
			setState(136); match(Template);
			setState(138);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137); match(WS);
				}
			}

			setState(141);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(140); match(Identifier);
				}
			}

			setState(143); match(Newline);
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
			setState(145); loopBegin();
			setState(147);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(146); match(WS);
				}
			}

			setState(149); match(Newline);
			setState(150); loopBlockContent();
			setState(152);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(151); match(WS);
				}
			}

			setState(154); match(Prefix);
			setState(155); match(WS);
			setState(156); match(End);
			setState(157); match(WS);
			setState(158); match(Do);
			setState(160);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(159); match(WS);
				}
			}

			setState(162); match(Newline);
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
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(167);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(164); contentBlock();
						}
						break;

					case 2:
						{
						setState(165); loopBlock();
						}
						break;

					case 3:
						{
						setState(166); match(Newline);
						}
						break;
					}
					} 
				}
				setState(171);
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
			setState(173);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(172); match(WS);
				}
			}

			setState(175); match(Prefix);
			setState(176); match(WS);
			setState(177); match(Do);
			setState(178); match(WS);
			setState(179); listAssignment();
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
			setState(181); listItem();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(182); match(WS);
					setState(183); listItem();
					}
					} 
				}
				setState(188);
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
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); match(LeftBrace);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(190);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(196); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); match(Identifier);
				setState(202);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(201); match(WS);
					}
				}

				setState(204); match(Assign);
				setState(206);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(205); match(WS);
					}
				}

				setState(208); match(IntegerConstant);
				setState(210);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(209); match(WS);
					}
				}

				setState(212); match(Comma);
				setState(214);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(213); match(WS);
					}
				}

				setState(216); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(Identifier);
				setState(219);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(218); match(WS);
					}
				}

				setState(221); match(In);
				setState(223);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(222); match(WS);
					}
					break;
				}
				setState(225); list();
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
			setState(229); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(228); contentLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
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
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
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
		enterRule(_localctx, 22, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(233); placeholder();
						}
						break;

					case 2:
						{
						setState(234);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Prefix) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(240); match(Newline);
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
		enterRule(_localctx, 24, RULE_placeholder);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(Dollar);
				setState(243); match(LeftBrace);
				setState(244); match(Identifier);
				setState(245); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); match(Dollar);
				setState(247); match(LeftBrace);
				setState(248); match(Identifier);
				setState(249); match(LeftParen);
				setState(250); match(Identifier);
				setState(251); match(RightParen);
				setState(252); match(RightBrace);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u0102\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$"+
		"\13\2\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\5\3?\n\3\3\3\3\3\3\3\3"+
		"\3\5\3E\n\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\4\5\4Q\n\4\3\4\3"+
		"\4\3\4\3\4\5\4W\n\4\3\4\3\4\5\4[\n\4\3\4\3\4\5\4_\n\4\3\4\3\4\5\4c\n\4"+
		"\3\4\3\4\3\4\3\4\5\4i\n\4\3\4\5\4l\n\4\3\4\5\4o\n\4\3\5\5\5r\n\5\3\5\3"+
		"\5\3\5\3\5\5\5x\n\5\3\5\5\5{\n\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13"+
		"\5\3\5\5\5\u0085\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\5\5\5\u0090"+
		"\n\5\3\5\3\5\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u00aa\n\7\f\7\16"+
		"\7\u00ad\13\7\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7"+
		"\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5"+
		"\13\n\3\n\3\n\5\n\u00c9\n\n\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\5\13\u00d1"+
		"\n\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\5\13\u00d9\n\13\3\13\3\13\3"+
		"\13\5\13\u00de\n\13\3\13\3\13\5\13\u00e2\n\13\3\13\5\13\u00e5\n\13\3\f"+
		"\6\f\u00e8\n\f\r\f\16\f\u00e9\3\r\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0100\n\16\3\16\4\u00c3\u00ef\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4"+
		"\3\2\30\30\3\2\r\r\u0126\2\35\3\2\2\2\4,\3\2\2\2\6P\3\2\2\2\bq\3\2\2\2"+
		"\n\u0093\3\2\2\2\f\u00ab\3\2\2\2\16\u00af\3\2\2\2\20\u00b7\3\2\2\2\22"+
		"\u00c8\3\2\2\2\24\u00e4\3\2\2\2\26\u00e7\3\2\2\2\30\u00ef\3\2\2\2\32\u00ff"+
		"\3\2\2\2\34\36\5\26\f\2\35\34\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37!\5"+
		"\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2%\'\5\4\3\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\5\26\f\2)(\3\2\2\2)*\3"+
		"\2\2\2*\3\3\2\2\2+-\7\31\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\22\2\2"+
		"/\60\7\31\2\2\60\62\7\25\2\2\61\63\7\31\2\2\62\61\3\2\2\2\62\63\3\2\2"+
		"\2\63\64\3\2\2\2\64:\7\30\2\2\659\5\26\f\2\669\5\n\6\2\679\7\30\2\28\65"+
		"\3\2\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2=?\7\31\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\17\2\2AB\7\31"+
		"\2\2BD\7\22\2\2CE\7\31\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\25\2\2GF"+
		"\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\31\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2"+
		"LN\7\30\2\2ML\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OQ\7\31\2\2PO\3\2\2\2PQ\3\2"+
		"\2\2QR\3\2\2\2RS\7\23\2\2ST\7\31\2\2TV\7\25\2\2UW\7\31\2\2VU\3\2\2\2V"+
		"W\3\2\2\2WX\3\2\2\2XZ\7\30\2\2Y[\7\31\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2"+
		"\2\\^\7\24\2\2]_\7\31\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\30\2\2ac\7"+
		"\31\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\17\2\2ef\7\31\2\2fh\7\23\2\2"+
		"gi\7\31\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\7\25\2\2kj\3\2\2\2kl\3\2\2"+
		"\2ln\3\2\2\2mo\7\30\2\2nm\3\2\2\2no\3\2\2\2o\7\3\2\2\2pr\7\31\2\2qp\3"+
		"\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\r\2\2tu\7\31\2\2uw\7\16\2\2vx\7\31\2\2"+
		"wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\7\25\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2"+
		"\2|\u0080\7\30\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\7\31\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\31\2\2\u0088\u0089\7\17\2\2\u0089"+
		"\u008a\7\31\2\2\u008a\u008c\7\16\2\2\u008b\u008d\7\31\2\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\7\25\2\2"+
		"\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\7\30\2\2\u0092\t\3\2\2\2\u0093\u0095\5\16\b\2\u0094\u0096\7\31\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\30"+
		"\2\2\u0098\u009a\5\f\7\2\u0099\u009b\7\31\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\7\31"+
		"\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a2\7\20\2\2\u00a1"+
		"\u00a3\7\31\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\7\30\2\2\u00a5\13\3\2\2\2\u00a6\u00aa\5\26\f\2\u00a7"+
		"\u00aa\5\n\6\2\u00a8\u00aa\7\30\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\31\2"+
		"\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\7\r\2\2\u00b2\u00b3\7\31\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\7\31\2"+
		"\2\u00b5\u00b6\5\24\13\2\u00b6\17\3\2\2\2\u00b7\u00bc\5\22\n\2\u00b8\u00b9"+
		"\7\31\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c3\7\6\2\2\u00c0\u00c2\n\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\7\7\2\2\u00c7\u00c9\n\2\2\2\u00c8"+
		"\u00bf\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\23\3\2\2\2\u00ca\u00cc\7\25\2"+
		"\2\u00cb\u00cd\7\31\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\7\3\2\2\u00cf\u00d1\7\31\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\26\2\2\u00d3"+
		"\u00d5\7\31\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d8\7\4\2\2\u00d7\u00d9\7\31\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e5\7\26\2\2\u00db\u00dd\7"+
		"\25\2\2\u00dc\u00de\7\31\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\7\21\2\2\u00e0\u00e2\7\31\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\20\t\2\u00e4"+
		"\u00ca\3\2\2\2\u00e4\u00db\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e8\5\30\r"+
		"\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ee\5\32\16\2\u00ec\u00ee\n\3\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7\30\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\7\6\2"+
		"\2\u00f6\u00f7\7\25\2\2\u00f7\u0100\7\7\2\2\u00f8\u00f9\7\b\2\2\u00f9"+
		"\u00fa\7\6\2\2\u00fa\u00fb\7\25\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\7"+
		"\25\2\2\u00fd\u00fe\7\n\2\2\u00fe\u0100\7\7\2\2\u00ff\u00f4\3\2\2\2\u00ff"+
		"\u00f8\3\2\2\2\u0100\33\3\2\2\2\62\35\"&),\628:>DGJMPVZ^bhknqwz\u0080"+
		"\u0084\u008c\u008f\u0095\u009a\u00a2\u00a9\u00ab\u00af\u00bc\u00c3\u00c8"+
		"\u00cc\u00d0\u00d4\u00d8\u00dd\u00e1\u00e4\u00e9\u00ed\u00ef\u00ff";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}