package PFE4FinalExam;

import java.util.Scanner;

public class E01GalacticCodeDecryption {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String codedMessage = scanner.nextLine();

        String command;
        while (!(command = scanner.nextLine()).equals("Finalize")) {

            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {

                case "Encrypt" -> {
                    codedMessage = new StringBuilder(codedMessage).reverse().toString();
                    System.out.println(codedMessage);
                }

                case "Decrypt" -> {

                    StringBuilder decryptedMessage = new StringBuilder(codedMessage);

                    for (int i = 0; i < codedMessage.length(); i++) {
                        char character = codedMessage.charAt(i);

                        if (Character.isLowerCase(character)) {
                            decryptedMessage.setCharAt(i, Character.toUpperCase(character));
                        }
                        else if (Character.isUpperCase(character)) {
                            decryptedMessage.setCharAt(i, Character.toLowerCase(character));
                        }
                    }

                    codedMessage = decryptedMessage.toString();
                    System.out.println(codedMessage);
                }

                case "Substitute" -> {
                    char oldChar = commandParts[1].charAt(0);
                    char newChar = commandParts[2].charAt(0);

                    if (!codedMessage.contains(oldChar + "")) {
                        System.out.println("Character not found.");
                    }
                    else {
                        codedMessage = codedMessage.replace(oldChar, newChar);
                        System.out.println(codedMessage);
                    }
                }

                case "Scramble" -> {
                    int index = Integer.parseInt(commandParts[1]);
                    char character = commandParts[2].charAt(0);

                    if (index < 0 || index >= codedMessage.length()) {
                        System.out.println("Index out of bounds.");
                    }
                    else {
                        StringBuilder scrambledMessage = new StringBuilder(codedMessage);
                        scrambledMessage.setCharAt(index, character);
                        codedMessage = scrambledMessage.toString();
                        System.out.println(codedMessage);
                    }
                }

                case "Remove" -> {
                    String substring = commandParts[1];
                    codedMessage = codedMessage.replace(substring, "");
                    System.out.println(codedMessage);
                }

                default -> {
                    System.out.println("Invalid command detected!");
                }
            }
        }
    }
}