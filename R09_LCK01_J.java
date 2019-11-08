/******************************************************************************
 *  Compilation:  javac R09_LCK01_J.java
 *  Execution:    java R09_LCK01_J
 *
 *  Calls a non-complient method which locks on a final string literal.
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*; 

public class R09_LCK01_J {

    private static final String Lock1 = "LOCK1";

    public static void main(String[] args) {
      // Call non-complient method which locks on a final string literal.
      nonComplientDoSomething();
    }

    public static void nonComplientDoSomething() {
      synchronized (Lock1) {
        System.out.println(Lock1);
      }
    }

}
