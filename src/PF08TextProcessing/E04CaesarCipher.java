package PF08TextProcessing;

import java.util.Scanner;

public class E04CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String encryptedMessage = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            char encryptedChar = (char) (currentChar + 3);

            encryptedMessage += encryptedChar;
        }
        System.out.println(encryptedMessage);
    }
}