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
    
    /**
     * The index starts at 1 when in fortran mode
     */
    private static boolean fortranMode = true;

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
        String result = this.name + " = ";
        if (this.values.isEmpty()) {
            result += "empty";
        } else {
            result += this.getElementsString();
        }
        return result;
    }
    
    /**
     * Get all array elements in {}.
     * @return
     */
    public String getElementsString() {
        String result = "";
        for (int i = 0; i < this.values.size(); i++) {
            result += "{" + this.values.get(i) + "} ";
        }
        return result;
    }
    
    /**
     * Get an element for this variable as a new variable
     * @param i
     * @return
     */
    public Variable getElement(int i) {
        Variable result = new Variable(this.name);
        result.addValue(this.getValue(i));
        return result;
    }
    
    /**
     * Returns the value at a given index as a string
     * @param i
     * @return
     */
    public String getValue(int i) {
        return fortranMode ? values.get(i-1) : values.get(i);   
    }
    
    public void setValue(int i, String newvalue) {
        values.set(fortranMode ? i-1 : i, newvalue);
    }
    
    /**
     * Returns the value at the position i as integer if convertable, if not 
     * null is returned.
     * @param i
     * @return
     */
    public Integer getValueAsInt(int i) {
        String val = this.getValue(i);
        try {
            Integer x = Integer.valueOf(val);
            return x;
        } catch (NumberFormatException ex) {
            return null;
        }
    }
    
    /**
     * The number of elements in this variable
     * @return
     */
    public int length() {
        return this.values.size();
    }
    
    /**
     * Add the values of the variable var to this variable and return the 
     * result as a new variable.
     * @param var   a variable of the same dimension than this variable, 
     *              or one dimensional, or any dimension in the case that 
     *              this variable is one dimensional.
     * @return
     */
    public Variable addVariable(Variable var) {
        // convert both variables to Integer arrays
        Integer[] var1 = new Integer[this.length()];
        Integer[] var2 = new Integer[this.length()];
        return null;
    }
}
