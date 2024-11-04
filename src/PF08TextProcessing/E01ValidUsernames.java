package PF08TextProcessing;

import java.util.Scanner;

public class E01ValidUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String string : input) {

            if (string.length() >= 3 && string.length() <= 16) {

                boolean isValid = true;

                for (int i = 0; i < string.length(); i++) {

                    char character = string.charAt(i);

                    if (!Character.isLetterOrDigit(character) && character != '_'
                            && character != '-') {
                        isValid = false;
                    }
                }
                if (isValid) {
                    System.out.println(string);
                }
            }
        }
    }
}