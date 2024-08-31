package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L06CharsToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);
        char character3 = scanner.nextLine().charAt(0);

        String output = "" + character1 + character2 + character3;

        System.out.println(output);
    }
}
// Write a program that reads 3 lines of input. On each line, you get a single character.
// Combine all the characters into one string and print it on the console.
