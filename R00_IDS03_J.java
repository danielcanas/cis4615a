/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *
 *  Prints out our bad username without calling the sanitizeUser() function
 *  first.
 * 
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class R00_IDS03_J {

    public static void main(String[] args) {
        String badUsername = "!$@Bad";
        //Testing for a non-successful login.
        System.out.println("Login successful for: " + badUsername);
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
            ? username : "unauthorized user";
    }

}
