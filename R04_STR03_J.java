/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *
 *  Calls a non-complient encoding function which encodes a BigIneger.
 * 
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args) {
        // Calls non-complient version
        nonComplientEncode();
    }

    public static void nonComplientEncode() {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray); 
        System.out.println(x);
    }

}
