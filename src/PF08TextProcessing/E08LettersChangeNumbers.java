package PF08TextProcessing;

import java.util.Scanner;

public class E08LettersChangeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] sequence = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (int i = 0; i < sequence.length; i++) {

            String string = sequence[i];

            char characterStart = string.charAt(0);
            char characterEnd = string.charAt(string.length() - 1);

            double number = Double.parseDouble(string.substring(1, string.length() - 1));

            int positionStartCharacter;
            if (Character.isUpperCase(characterStart)) {
                positionStartCharacter = characterStart - 40;

                number /= positionStartCharacter;
            }
            else if (Character.isLowerCase(characterStart)) {
                positionStartCharacter = characterStart - 60;

                number *= positionStartCharacter;
            }

            int positionEndCharacter;
            if (Character.isUpperCase(characterEnd)) {
                positionEndCharacter = characterEnd - 40;

                number -= positionEndCharacter;
            }
            else if (Character.isLowerCase(characterEnd)) {
                positionEndCharacter = characterEnd - 60;
                number += positionEndCharacter;
            }

            totalSum += number;
        }
        System.out.printf("%.2f", totalSum);
    }
}