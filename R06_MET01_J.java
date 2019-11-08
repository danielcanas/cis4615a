/******************************************************************************
 *  Compilation:  javac R06_MET01_J.java
 *  Execution:    java R06_MET01_J
 *
 *
 *  Calls function getAbsAdd(x,y) with legal and illegal values.
 * 
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;

public class R06_MET01_J {

    public static void main(String[] args) {
        // Used for testing non secure version
        int a = 17;
        System.out.println("a = " + a);
        int b = 42;
        System.out.println("b = " + b);
        int c = nonComplientGetAbsAdd(a, b);
        System.out.println("c = " + c);
 
        // Used for testing secure version (This throws an exception)
        a = Integer.MIN_VALUE;
        System.out.println("a = " + a);
        b = Integer.MAX_VALUE;
        System.out.println("b = " + b);
        c = complientGetAbsAdd(a, b);
        System.out.println("c = " + c);
       
     }

     /* 
     Rule 06. Methods (MET)
     Corrected code per:
     https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     Rule 06-MET01
     */

     public static int nonComplientGetAbsAdd(int x, int y) {
        return Math.abs(x) + Math.abs(y);
      }

     public static int complientGetAbsAdd(int x, int y) {
      if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
        throw new IllegalArgumentException();
      }

      int absX = Math.abs(x);
      int absY = Math.abs(y);

      if (absX > Integer.MAX_VALUE - absY) {
        throw new IllegalArgumentException();
      }
      
      return absX + absY;
    }
}
