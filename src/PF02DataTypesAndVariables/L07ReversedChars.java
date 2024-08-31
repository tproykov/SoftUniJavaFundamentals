package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L07ReversedChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);
        char character3 = scanner.nextLine().charAt(0);

        System.out.println("" + character3 + " " + character2 + " " + character1);
    }
}
// Write a program that takes 3 lines of characters and prints them in reversed order with
// a space between them.
