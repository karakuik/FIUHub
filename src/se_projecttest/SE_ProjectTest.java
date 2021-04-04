/*
 * Methods to verify is username, password and email are valid
 */
package se_projecttest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; // Used for email validation

/**
 *
 * @author Javier
 */
public class SE_ProjectTest {

    public static final int PW_LEN = 20; //Password length is 10 characters long
    public static final String userChars = "^[a-zA-Z0-9_-]{5,20}$";
    static Scanner input = new Scanner(System.in);

    /**
     * Three methods will be used for validation One method to verify username
     * One method to verify password One method to verify e-mail
     */
    public static void main(String[] args) {
        /**
         * Local variables used for testing purposes
         */
        String name;
        String pw;
        String email;

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a username: -- (Must be between 5 to 20 characters long)\n");
//        System.out.println("Username needs to contain at least one upper-case letter, lower-case letters, numbers and a special character\n\n");
//        name = input.nextLine();
//        verifyUserName(name);
//
//        System.out.println("Enter a Password: -- (Must be between 5 to 10 characters long\n");
//        pw = input.nextLine();
//        verifyPassword(pw);
//        System.out.println("Enter an Email:\n");
//        email = input.nextLine();
//        verifyEmail(email);

        bioWordLimit();
    }

    public static void verifyUserName(String username) {

        int userLen = 20; //username length is 10 characters long
        int i;
        String regex_usr = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$";
        boolean valid = true;

        do {
            if (username.length() > userLen) {
                System.out.println("Username length is too long.\n");
                valid = false;
                username = input.nextLine();
            }
            if (!username.matches(regex_usr)) {
                System.out.println("Invalid characters found under " + username + ". Please provide a valid username.\n");
                valid = false;
                username = input.nextLine();
            }
        } while (username.length() > userLen || valid == false);

        System.out.println(username + " is valid.\n");
    }

    public static void verifyPassword(String pw) {

        String regex_pw = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex_pw);
        Matcher m = p.matcher(pw);
        boolean valid = true;

        do {
            if (pw == null) {
                System.out.println("Password is empty.\n");
                valid = false;
                pw = input.nextLine();
            } else if (pw.length() > PW_LEN) {
                System.out.println("Password is too long. Try again:\n");
                valid = false;
                pw = input.nextLine();
            } else if (m.matches() == false) {
                //System.out.println(m.matches());
                System.out.println("Invalid password. Try again:\n");
                valid = false;
                pw = input.nextLine();
            }

        } while (valid);

        System.out.println(pw + " is valid.\n");
    }

    public static boolean verifyEmail(String email) {

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        boolean isValid = true;
        Pattern pattern = Pattern.compile(regex);

        do {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches() == false) {
                isValid = false;
                System.out.println(email + " is not valid.\n");
                System.out.println("Enter a valid email address.\n");
                email = input.nextLine();

            } else {
                System.out.println(email + " is a valid email.\n");

            }

        } while (pattern.matcher(email).matches() != isValid);

        return isValid;
    }

    public static void bioWordLimit() {
        int limit = 64; // 400 character limit => 64 words for bio
        boolean valid = true;
        int wordCount = 0;
        char [] chtr;
      
           
        
        do {
            System.out.println("Provide a bio for your profile.\n");
            String bio = input.nextLine();
            chtr = new char[bio.length()];
            
            for (int i = 0; i < bio.length(); i++) {
                chtr[i] = bio.charAt(i);
                if( ((i>0)&&(chtr[i]!=' ')&&(chtr[i-1]==' ')) || ((chtr[0]!=' ')&&(i==0)) )  
                    wordCount++;
                
            }
            
            if (wordCount > limit) {
                System.out.println("Number of words: " + wordCount);
                System.out.println("You have exceeded the character limit.\n");
                valid = false;
            } else {
                System.out.println("-------------BIO-----------\n\n");
                System.out.println("Number of words: " + wordCount);
                System.out.println(bio);
                valid = true;
                
            }

        } while (valid==false);

    }
}
