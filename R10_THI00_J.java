/******************************************************************************
 *  Compilation:  javac R10_THI00_J.java
 *  Execution:    java R10_THI00_J
 *
 *  Implements the Runnable class and shows an example of starting a thread 
 *  incorrecly by directly invoking the run() method.
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

  public static void main(String[] args) {
    // This non complient code directly invokes the run() method to start a thread.
    R10_THI00_J test = new R10_THI00_J();
    new Thread(test).run();

  }

}
