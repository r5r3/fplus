package org.fplus;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fplus.parser.fplusParser;

/**
 * Static methods for tasks in the Translator
 * @author Robert Schuster
 */
public class Helper {
    
    public static String getLeadingWS(ParserRuleContext ctx) {
        if (ctx.start.getType() == fplusParser.WS) return ctx.start.getText();
        else return "";
    }
}
