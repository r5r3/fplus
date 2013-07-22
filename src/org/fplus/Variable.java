package org.fplus;

import java.util.ArrayList;
import org.fplus.parser.fplusParser;

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
    
    /**
     * Constants for true and false values
     */
    public static String TRUE = ".true.";
    public static String FALSE = ".false.";
    
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
        return Variable.getValueAsInt(val);
    }
    
    public static Integer getValueAsInt(String val) {
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
    
    public static String logicalOperationOnString(int operation, String str1, String str2) {
        // A string for the result
        String result = null;
        // try to convert both to int
        Integer i1 = getValueAsInt(str1);
        Integer i2 = getValueAsInt(str2);
        // perform the operation itself
        switch (operation) {
            case fplusParser.Equal:
                if (i1 != null && i2 != null) result = i1 == i2 ? Variable.TRUE : Variable.FALSE;
                    else result = str1.equals(str2) ? Variable.TRUE : Variable.FALSE;
                break;
            case fplusParser.NotEqual:
                if (i1 != null && i2 != null) result = i1 != i2 ? Variable.TRUE : Variable.FALSE;
                    else result = !str1.equals(str2) ? Variable.TRUE : Variable.FALSE;
                break;
            case fplusParser.Larger:
                if (i1 != null && i2 != null) result = i1 > i2 ? Variable.TRUE : Variable.FALSE;
                    else result = str1.compareTo(str2) > 0 ? Variable.TRUE : Variable.FALSE;
                break;
            case fplusParser.Smaller:
                if (i1 != null && i2 != null) result = i1 < i2 ? Variable.TRUE : Variable.FALSE;
                    else result = str1.compareTo(str2) < 0 ? Variable.TRUE : Variable.FALSE;
                break;
            case fplusParser.And:
                result = str1.equals(Variable.TRUE) && str2.equals(Variable.TRUE) ? Variable.TRUE : Variable.FALSE;
                break;                
            case fplusParser.Or:
                result = str1.equals(Variable.TRUE) || str2.equals(Variable.TRUE) ? Variable.TRUE : Variable.FALSE;
                break;                
            default:
                Logger.Error("unsupported logical operation: "+operation, null);
        }      
        return result;
    }
    
    /**
     * Perform a comparison between two variables
     * @param operation
     * @param var
     * @return
     */
    public Variable logicalOperation(int operation, Variable var) {
        String opname;
        switch (operation) {
            case fplusParser.And:
                opname = ".and.";
                break;
            case fplusParser.Or:
                opname = ".or.";
                break;
            default:
                opname = fplusParser.tokenNames[operation].replace("'", "");
        }
        Variable result = new Variable(this.name + opname + var.name);
        // check the dimensions
        int l1 = this.length();
        int l2 = var.length();
        // all variables need add least one element
        if (l1 == 0 || l2 == 0) {
            Logger.Warning("empty variables in logical expression", null);
            return null;
        }
        // if the dimensions are different, then one of them needs to be 1
        if (l1 != l2 && l1 != 1 && l2 != 1) {
            Logger.Warning("the dimensions must be either the same, or one of them must be one.", null);
            return null;
        }
        // perform the actual operation
        if (l1 == 1) {
            for (int i=0; i<l2; i++) {
                String str1 = this.getValue(fortranMode ? 1 : 0);
                String str2 = var.getValue(fortranMode ? i+1 : i);
                result.addValue(logicalOperationOnString(operation, str1, str2));
            }
            return result;
        }
        if (l2 == 1) {
            for (int i=0; i<l1; i++) {
                String str1 = this.getValue(fortranMode ? i+1 : i);
                String str2 = var.getValue(fortranMode ? 1 : 0);
                result.addValue(logicalOperationOnString(operation, str1, str2));
            }
            return result;
        }
        if (l1 == l2) {
            for (int i=0; i<l1; i++) {
                String str1 = this.getValue(fortranMode ? i+1 : i);
                String str2 = var.getValue(fortranMode ? i+1 : i);
                result.addValue(logicalOperationOnString(operation, str1, str2));
            }
            return result;            
        }
        return null;
    }
    
    /**
     * Add, substract, multiply, or divied the values of the variable var to 
     * this variable and return the result as a new variable.
     * @param var   a variable of the same dimension than this variable, 
     *              or one dimensional, or any dimension in the case that 
     *              this variable is one dimensional.
     * @return
     */
    public Variable mathematicalOperation(char operation, Variable var) {
        Variable result = new Variable(this.name + operation + var.name);
        // check the dimensions
        int l1 = this.length();
        int l2 = var.length();
        // all variables need add least one element
        if (l1 == 0 || l2 == 0) {
            Logger.Warning("empty variables in mathematical expression", null);
            return null;
        }
        // if the dimensions are different, then one of them needs to be 1
        if (l1 != l2 && l1 != 1 && l2 != 1) {
            Logger.Warning("the dimensions must be either the same, or one of them must be one.", null);
            return null;
        }
        // convert both variables to Integer arrays
        Integer[] var1 = new Integer[l1];
        Integer[] var2 = new Integer[l2];
        for (int i=0; i<l1; i++) {
            var1[i] = this.getValueAsInt(fortranMode ? i+1 : i);
            if (var1[i] == null) {
                Logger.Warning("mathematical expressions are only implemented for integers. This is not an integer: "+this.getValue(fortranMode ? i+1 : i), null);
                return null;
            }
        }
        for (int i=0; i<l2; i++) {
            var2[i] = var.getValueAsInt(fortranMode ? i+1 : i);
            if (var2[i] == null) {
                Logger.Warning("mathematical expressions are only implemented for integers. This is not an integer: "+var.getValue(fortranMode ? i+1 : i), null);
                return null;
            }
        }
        // perform the actual operation
        if (l1 == 1) {
            for (int i=0; i<l2; i++) {
                if (operation == '+') result.addValue(Integer.toString(var1[0]+var2[i]));
                if (operation == '-') result.addValue(Integer.toString(var1[0]-var2[i]));
                if (operation == '*') result.addValue(Integer.toString(var1[0]*var2[i]));
                if (operation == '/') result.addValue(Integer.toString(var1[0]/var2[i]));
            }
            return result;
        }
        if (l2 == 1) {
            for (int i=0; i<l1; i++) {
                if (operation == '+') result.addValue(Integer.toString(var1[i]+var2[0]));
                if (operation == '-') result.addValue(Integer.toString(var1[i]-var2[0]));
                if (operation == '*') result.addValue(Integer.toString(var1[i]*var2[0]));
                if (operation == '/') result.addValue(Integer.toString(var1[i]/var2[0]));
            }
            return result;
        }
        if (l1 == l2) {
            for (int i=0; i<l1; i++) {
                if (operation == '+') result.addValue(Integer.toString(var1[i]+var2[i]));
                if (operation == '-') result.addValue(Integer.toString(var1[i]-var2[i]));
                if (operation == '*') result.addValue(Integer.toString(var1[i]*var2[i]));
                if (operation == '/') result.addValue(Integer.toString(var1[i]/var2[i]));
            }
            return result;            
        }
        return null;
    }
}
