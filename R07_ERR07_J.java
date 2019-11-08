/******************************************************************************
 *  Compilation:  javac R07_ERR07_J.java
 *  Execution:    java R07_ERR07_J
 *
 *
 *  Calls a complient and non-complient version of the isCapitalized function.
 *  On both calls, the string passed in is null. The non-complient solution throws
 *  a runtime exception. The complient solution throws a null pointer exception.
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.io.*;

public class R07_ERR07_J {

    public static void main(String[] args) {
      String testString = null;

      // The complient code throws a null pointer exception.
      complientIsCapitalized(testString);
      // The non-complient code throws a runtime exception.
      nonComplientIsCapitalized(testString);
    
    }

    /* 
    Rule 07. Exceptional Behavior (ERR)
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/ERR07-J.+Do+not+throw+RuntimeException%2C+Exception%2C+or+Throwable
    Rule 07-ERR07
    */

    public static boolean nonComplientIsCapitalized(String s) {
      if (s == null) {
        throw new RuntimeException("Null String");
      }
      if (s.equals("")) {
        return true;
      }
      String first = s.substring(0, 1);
      String rest = s.substring(1);
      return (first.equals(first.toUpperCase()) &&
              rest.equals(rest.toLowerCase()));
    }

    public static boolean complientIsCapitalized(String s) {
      if (s == null) {
        throw new NullPointerException();
      }
      if (s.equals("")) {
        return true;
      }
      String first = s.substring(0, 1);
      String rest = s.substring(1);
      return (first.equals(first.toUpperCase()) &&
              rest.equals(rest.toLowerCase()));
    }

}
