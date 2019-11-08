/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *
 *  Prints out our bad username without calling the sanitizeUser() function
 *  first and then calls the sanitizeUser() function prior to printing it again.
 * 
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class R00_IDS03_J {

    public static void main(String[] args) {
        String badUsername = "!$@Bad";
        //Testing for a non-successful login.
        System.out.println("Login not successful for: " + badUsername);
        // Sanitizing user prior to logging out to the console.
        System.out.println("Login not successful for: " + sanitizeUser(badUsername));
    }

    /* 
    Rule 00. Input Sanitation and Data Sanitation
    Corrected code per:
    https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
    Rule 00-IDS03
    */

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
            ? username : "unauthorized user";
    }

}
