/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *
 *  Calls function both a non-complient replace and a complient version
 * 
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class R02_XP00_J {

    public static void main(String[] args) {
        // Is not able to replace i with 9 correctly
        nonComplientReplace();
        // Correctly replaces i with the number 9
        complientReplace();
    }

    /* 
    Rule 02. Expressions (EXP)
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
    Rule 02-XP00
    */

    public static void nonComplientReplace(){
        String original = "insecure";
        original.replace('i', '9');
        System.out.println(original);
    }

    public static void complientReplace(){
        String original = "insecure";
        original = original.replace('i', '9');
        System.out.println(original);
    }

}
