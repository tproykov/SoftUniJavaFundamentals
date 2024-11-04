package PF08TextProcessing;

import java.util.Scanner;

public class L05DigitsLettersOthers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String digits = "";
        String letters = "";
        String others = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                digits += currentChar;
            }
            else if (Character.isLetter(currentChar)) {
                letters += currentChar;
            }
            else {
                others += currentChar;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}