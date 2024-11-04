package PF08TextProcessing;

import java.util.Scanner;

public class E06ReplaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();
        char lastChar = ' ';

        for (int i = 0; i < input.length(); i++) {

            char character = input.charAt(i);
            if (character != lastChar) {
                output.append(character);
            }
            lastChar = character;
        }
        System.out.println(output);
    }
}