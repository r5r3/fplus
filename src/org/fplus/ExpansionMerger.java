package org.fplus;

import java.util.GregorianCalendar;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fplus.parser.fplusBaseListener;
import org.fplus.parser.fplusParser;

/**
 * This class is used in the second pass to merge all expansion created by
 * the visitor. Rule without expansion use there text content as expansion.
 * 
 * @author Robert Schuster
 */
public class ExpansionMerger extends fplusBaseListener {
    
    // all informations created by the visitor are stored here
    ParseTreeAnnotations info;

    public ExpansionMerger(ParseTreeAnnotations info) {
        this.info = info;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // don't merge rules that have there own expansion methode
        if (info.hasOwnExpansion(ctx)) return;
        
        // merge the children of this rule
        mergeRuleExpansions(ctx);
        
        // is this is the head node, then walk the tree again to get the 
        // changes from interfaces for templates
        if (ctx != info.head) return;
        
        // are there unexpanded interface lines?
        if (!info.interfaceLines.isEmpty()) {
            for (fplusParser.InterfaceLineContext ilc:info.interfaceLines.values()) {
                Logger.Warning(String.format("unused interface line '%s'.", ilc.Identifier().getText()), ilc.Interface().getSymbol().getLine());
            }
        }
        
        // are there unexpanded generic lines?
        if (!info.genericLines.isEmpty()) {
            for (fplusParser.GenericTypeBoundLineContext glc:info.genericLines.values()) {
                Logger.Warning(String.format("unused interface line '%s'.", glc.Identifier().get(glc.Identifier().size()-1).getText()), glc.Generic().getSymbol().getLine());
            }
        }
        
        // store the final result if this head node
        String translation = info.getExpansion(ctx);
        System.out.println(String.format("%s This file was automatically created by fplus on %s", info.LineCommentPrefix, new GregorianCalendar().getTime().toString()));
        System.out.println(translation);
    }
    
    /**
     * Combine the Expansions from all children of a rule
     * @param ctx
     */
    public void mergeRuleExpansions(ParserRuleContext ctx) {
        // create the expansion
        StringBuilder buffer = new StringBuilder();
        for (int i=0; i<ctx.getChildCount();i++) {
            ParseTree child = ctx.getChild(i);
            String expansion = info.getExpansion(child);
            if (expansion != null) {
                buffer.append(expansion);
            } else {
                buffer.append(child.getText());
            }
        }
        if (buffer.length() > 0) info.setExpansion(ctx, buffer.toString());
    }   
    
}
