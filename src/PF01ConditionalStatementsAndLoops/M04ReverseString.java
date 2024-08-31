package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class M04ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
// Write a program that reverses a string and prints it on the console.