package PF01ConditionalStatementsAndLoops;

import java.util.Collections;
import java.util.Scanner;

public class E05Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
    }
}

// You will be given a string representing a username. The password will be that
// username reversed. Until you receive the correct password, print on the console
// "Incorrect password. Try again.". When you receive the correct password, print
// "User {username} logged in." However, on the fourth try, if the password is still
// not correct, print "User {username} blocked!" and end the program.
