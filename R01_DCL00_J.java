/******************************************************************************
 *  Compilation:  javac R01_DCL00_J.java
 *  Execution:    java R01_DCL00_J
 *
 *
 *  Creates two non-complient classes. The non-complient solution
 *  prints out an unexpected result.
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;

// The following two classes are not complient
class A_NON_COMPLIENT {
  public static final int a = B_NON_COMPLIENT.b + 1;
  // ...
}
 
class B_NON_COMPLIENT {
  public static final int b = A_NON_COMPLIENT.a + 1;
  // ...
}

public class R01_DCL00_J {

    public static void main(String[] args) {
      B_NON_COMPLIENT test =  new B_NON_COMPLIENT();

      // Prints the wrong value
      System.out.println(test.b);
    }

}
