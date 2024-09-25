package PF04Methods;

import java.util.Scanner;

public class E09PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();
        }
    }
    private static boolean isPalindrome(String command) {
        String reversed = "";
        for (int i = command.length() - 1; i >= 0; i--) {
            reversed += command.charAt(i);
        }
        return command.equals(reversed);
    }
}

// A palindrome is a number that reads the same backward as forward, such as 323 or 1001. Write a program
// that reads a positive integer number until you receive "END". For each numbered print, whether the
// number is palindrome or not.
