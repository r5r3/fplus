package org.fplus;

/**
 * Some methods for errors and warnings
 * @author
 * Robert Schuster
 */
public class Logger {
    
    /**
     * Show warnings with or without line numbers
     * @param text
     * @param line
     */
    public static void Warning(String text, Integer line) {
        System.err.println("WARNING: " + text);
    }
    
    /**
     * Show an error message and exit 
     * @param text
     * @param line
     */
    public static void Error(String text, Integer line) {
        System.err.println("ERROR: "+text);
        System.exit(-1);
    }
}
