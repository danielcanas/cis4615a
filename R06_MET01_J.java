/******************************************************************************
 *  Compilation:  javac R06_MET01_J.java
 *  Execution:    java R06_MET01_J
 *
 *
 *  Calls function getAbsAdd(x,y) with illegal values.
 * 
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;

public class R06_MET01_J {

    public static void main(String[] args) {
        // Used for testing non secure version
        int a = 17;
        System.out.println("a = " + a);
        int b = 42;
        System.out.println("b = " + b);
        int c = nonComplientGetAbsAdd(a, b);
        System.out.println("c = " + c);
       
     }

    public static int nonComplientGetAbsAdd(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }
}
