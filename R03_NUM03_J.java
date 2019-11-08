/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *
 *  Calls a non-complient get integer method. All input is taken in through 
 *  the console after the program is compiled. To view results compile the 
 *  program, enter a number and click enter. Results will be printed out to 
 *  the console.
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
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    public static int nonComplientGetInteger(DataInputStream is) throws IOException {
        return is.readInt(); 
    }

}
