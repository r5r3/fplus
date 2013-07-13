package org.fplus;

import java.util.ArrayList;

/**
 * Variables are used in loop and else where to hold replacements.
 * All variables are Arrays
 * 
 * @author
 * Robert Schuster
 */
public class Variable {

    public String name;
    ArrayList<String> values;

    public Variable(String name) {
        this.name = name;
        this.values = new ArrayList<String>();
    }
    
    /**
     * Add a value to this variable
     * @param value
     */
    public void addValue(String value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        String result = this.name + " =";
        if (this.values.isEmpty()) {
            result += " empty";
        } else {
            for (int i = 0; i < this.values.size(); i++) {
                result += " {" + this.values.get(i) + "}";
            }
        }
        return result;
    }
    
    
}
