/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *
 *  Calls non-complient replace method on a string.
 * 
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class R02_XP00_J {

    public static void main(String[] args) {
        // Is not able to replace i with 9 correctly
        nonComplientReplace();
    }

    public static void nonComplientReplace(){
        String original = "insecure";
        original.replace('i', '9');
        System.out.println(original);
    }

}
