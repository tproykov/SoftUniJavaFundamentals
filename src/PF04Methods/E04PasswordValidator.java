package PF04Methods;

import java.util.Scanner;

public class E04PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!checkPasswordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkPasswordCharacters(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkPasswordDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (checkPasswordLength(password) && checkPasswordCharacters(password)
                && checkPasswordDigits(password)) {
            System.out.println("Password is valid");
        }
    }
    private static boolean checkPasswordLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean checkPasswordCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkPasswordDigits(String password) {
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            }
        }
        return digits >= 2;
    }
}

// Write a program that checks if a given password is valid. Password rules are:
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.
//If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule,
// print a message:
//•	"Password must be between 6 and 10 characters"
//•	"Password must consist only of letters and digits"
//•	"Password must have at least 2 digits"