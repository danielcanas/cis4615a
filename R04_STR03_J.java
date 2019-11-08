/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *
 *  Calls both a non-complient and complient version of a method which encodes
 *  a BigInteger.
 * 
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args) {
        // Calls non-complient version
        nonComplientEncode();
        // Calls complient version
        complientEncode();
    }

    /* 
    Rule 04. Characters and Strings (STR)
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
    Rule 04-STR03
    */

    public static void nonComplientEncode() {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray); 
        System.out.println(x);
    }

    public static void complientEncode() { 
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray); 
        x = new BigInteger(ns);
        System.out.println(x);
    }
}
