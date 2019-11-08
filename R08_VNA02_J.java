/******************************************************************************
 *  Compilation:  javac R08_VNA02_J.java
 *  Execution:    java  R08_VNA02_J
 *
 *  Calls both a non-complient version of the of a function to toggle
 *  the value of the flag variable. The non-complient version is not synchronized
 *  and therefore may not be visible to all threads.
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


  public static void main(String[] args) {
    System.out.println(flag);
    nonComplientToggle();
    System.out.println(flag);
  }

}
