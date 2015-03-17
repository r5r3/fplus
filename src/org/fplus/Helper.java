package org.fplus;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.fplus.parser.fplusParser;

/**
 * Static methods for tasks in the Translator
 * @author Robert Redl
 */
public class Helper {
    
    /**
     * Get the white space at the beginning for a parser rule
     * @param ctx
     * @return
     */
    public static String getLeadingWS(ParserRuleContext ctx) {
        if (ctx.start.getType() == fplusParser.WS) return ctx.start.getText();
        else return "";
    }
    
    /**
     * Get the WS in front of a Terminal node
     * @param tn
     * @param ts    token stream from which tn is
     * @return
     */
    public static String getLeadingWS(TerminalNode tn, TokenStream ts) {
        return getLeadingWS(tn.getSymbol(), ts);
    }
    
    /**
     * Get the WS in front of a Token
     * @param tn
     * @param ts    token stream from which tn is
     * @return
     */
    public static String getLeadingWS(Token tn, TokenStream ts) {
        int index = tn.getTokenIndex();
        if (ts.get(index-1).getType() == fplusParser.WS) return ts.get(index-1).getText();
        else return "";
    }
}
