package PF08TextProcessing;

import java.util.Scanner;

public class L02RepeatStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        String output = "";

        for (String string : strings) {

            for (int i = 0; i < string.length(); i++) {

                output += string;
            }
        }
        System.out.println(output);
    }
}