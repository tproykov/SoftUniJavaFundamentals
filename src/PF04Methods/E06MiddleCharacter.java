package PF04Methods;

import java.util.Scanner;

public class E06MiddleCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        printMiddleCharacter(string);
    }
    private static void printMiddleCharacter(String string) {
        if (string.length() % 2 != 0) {
            System.out.println(string.charAt(string.length() / 2));
        }
        else {
            System.out.print(string.charAt(string.length() / 2 - 1));
            System.out.print(string.charAt(string.length() / 2));
        }
    }
}

// You will receive a single string. Write a method that prints the middle character. If the length of
// the string is even, there are two middle characters.
