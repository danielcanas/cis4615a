/******************************************************************************
 *  Compilation:  javac R08_VNA02_J.java
 *  Execution:    java  R08_VNA02_J
 *
 *  Calls both a complient and non-complient version of the of a function to toggle
 *  the value of the flag variable. The non-complient version us not synchronized
 *  and therefore may not be visible to all threads. The compleint version of the
 *  function ensures that the flag toggle is visible through from all threads.
 * 
 * 
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*; 

public class R08_VNA02_J {

  private static boolean flag = true;

  public static void nonComplientToggle() { 
    flag = !flag;
  }

  public static boolean nonComplientGetFlag() { 
    return flag;
  }

  public static synchronized void complientToggle() {
    flag ^= true; // Same as flag = !flag;
  }

  public static synchronized boolean complientGetFlag() {
    return flag;
  }

  /* 
  Rule 08. Visibility and Atomicity (VNA)
  Corrected code per:
  https://wiki.sei.cmu.edu/confluence/display/java/VNA02-J.+Ensure+that+compound+operations+on+shared+variables+are+atomic
  Rule 08-VNA02
  */

  public static void main(String[] args) {
    System.out.println(flag);
    nonComplientToggle();
    System.out.println(flag);
    complientToggle();
    System.out.println(flag);
  }

}
