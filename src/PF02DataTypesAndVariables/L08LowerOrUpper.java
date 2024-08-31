package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L08LowerOrUpper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character = scanner.nextLine().charAt(0);

        if (character >= 'A' && character <= 'Z') {
            System.out.println("upper-case");
        }
        else if (character >= 'a' && character <= 'z') {
            System.out.println("lower-case");
        }
    }
}
// Write a program that prints whether a given character is upper-case or lower-case.
