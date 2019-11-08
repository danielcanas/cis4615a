/******************************************************************************
 *  Compilation:  javac R07_ERR07_J.java
 *  Execution:    java R07_ERR07_J
 *
 *
 *  Calls a non-complient version of the isCapitalized function.
 *  The string passed in is null. The non-complient solution throws
 *  a runtime exception.
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

      // The non-complient code throws a runtime exception.
      nonComplientIsCapitalized(testString);
    
    }

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

}
