/******************************************************************************
 *  Compilation:  javac R10_THI00_J.java
 *  Execution:    java R10_THI00_J
 *
 *  Implements the Runnable class and shows examples of starting a thread correctly
 *  using the start() method and starting a thread incorrecly by directly invoking
 *  the run() method.
 * 
 * 
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*; 

public class R10_THI00_J implements Runnable {

  @Override public void run() {
    System.out.println("We are running!");
  }

  /* 
  Rule 10. Thread APIs (THI)
  Corrected code per:
  https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487912
  Rule 10-THI00
  */

  public static void main(String[] args) {
    // This non complient code directly invokes the run() method to start a thread.
    R10_THI00_J test = new R10_THI00_J();
    new Thread(test).run();

    // This complient code correctly uses the start() method to tell the Java runtime to start a new thread.
    R10_THI00_J test2 = new R10_THI00_J();
    new Thread(test2).start();
  }

}
