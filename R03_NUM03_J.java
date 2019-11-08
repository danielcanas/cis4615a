/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *
 *  Calls function both a non-complient get integer and a complient version.
 *  All input is taken in through the console after the program is compiled.
 *  To view results compile the program, enter a number and click enter, enter
 *  another number and click enter (can be the same number twice to view differences
 *  in the two functions), and results will be printed out to the console.
 * 
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.regex.Pattern;
import java.io.*;

public class R03_NUM03_J {

    public static void main(String[] args) {
        InputStream stream = System.in;
        DataInputStream is = new DataInputStream(stream);

        try {
            System.out.println(nonComplientGetInteger(is));
            System.out.println(complientGetInteger(is));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    /* 
    Rule 03. Numeric Types and Operations (NUM)
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
    Rule 03-NUM03
    */

    public static int nonComplientGetInteger(DataInputStream is) throws IOException {
        return is.readInt(); 
    }

    public static long complientGetInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

}
