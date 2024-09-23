package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E05PrintPartsOfASCII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= lastIndex; i++) {

            char character = (char) i;

            System.out.print(character + " ");
        }
    }
}

// Find online more information about ASCII (American Standard Code for Information Interchange) and write
// a program that prints part of the ASCII table of characters at the console.
//On the first line of input, you will receive the char index you should start with, and on the second
// line - the index of the last character you should print.