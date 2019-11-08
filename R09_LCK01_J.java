/******************************************************************************
 *  Compilation:  javac R09_LCK01_J.java
 *  Execution:    java R09_LCK01_J
 *
 *  Calls a non-complient method which locks on a final string literal 
 *  and a complient method which locks on a noninterned String instance.
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*; 

public class R09_LCK01_J {

    private static final String Lock1 = "LOCK1";
    private static final String Lock2 = new String("LOCK2");

    public static void main(String[] args) {
      // Call non-complient method which locks on a final string literal.
      nonComplientDoSomething();
      // Call complient method which locks on a noninterned String instance.
      complientDoSomething();
    }

    /* 
    Rule 09. Locking (LCK)
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/LCK01-J.+Do+not+synchronize+on+objects+that+may+be+reused
    Rule 09-LCK01
    */

    public static void nonComplientDoSomething() {
      synchronized (Lock1) {
        System.out.println(Lock1);
      }
    }

    public static void complientDoSomething() {
      synchronized (Lock2) {
        System.out.println(Lock2);
      }
    }

}
