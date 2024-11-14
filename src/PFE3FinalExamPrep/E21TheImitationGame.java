package PFE3FinalExamPrep;

import java.util.Scanner;

public class E21TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command;

        while (!(command = scanner.nextLine()).equals("Decode")) {
            String[] tokens = command.split("\\|");
            String commandType = tokens[0];

            switch (commandType) {
                case "Move" -> {
                    int numberOfLetters = Integer.parseInt(tokens[1]);
                    if (numberOfLetters > 0 && numberOfLetters <= input.length()) {
                        String substringToMove = input.substring(0, numberOfLetters);
                        String remainingPart = input.substring(numberOfLetters);
                        input = remainingPart + substringToMove;
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    if (index >= 0 && index <= input.length() && value != null) {
                        StringBuilder stringBuilder = new StringBuilder(input);
                        stringBuilder.insert(index, value);
                        input = stringBuilder.toString();
                    }
                }
                case "ChangeAll" -> {
                    String substringToChange = tokens[1];
                    String replacement = tokens[2];
                    input = input.replace(substringToChange, replacement);
                }
            }
        }

        System.out.println("The decrypted message is: " + input);
    }
}