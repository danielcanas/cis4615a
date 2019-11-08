/******************************************************************************
 *  Compilation:  javac R01_DCL00_J.java
 *  Execution:    java R01_DCL00_J
 *
 *
 *  Creates 4 classes, two complient and two non-complient. When values are printed
 *  the complient solution prints out the intended results. The non-complient solution
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

// The following two classses are compleient (Dependencies are removed)

class A_COMPLIENT {
  public static final int a = 2;
  // ...
}
 
class B_COMPLIENT {
  public static final int b = A_COMPLIENT.a + 1;
  // ...
}

/* 
Rule 01. Declarations and Initialization (DCL)
Corrected code per:
https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles
Rule 01-DCL00
*/

public class R01_DCL00_J {

    public static void main(String[] args) {
      B_NON_COMPLIENT test =  new B_NON_COMPLIENT();
      B_COMPLIENT test2  = new B_COMPLIENT();

      // Prints the wrong value
      System.out.println(test.b);
      // Prints the correct value
      System.out.println(test2.b);
    }

}
