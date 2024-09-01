package PF02DataTypesAndVariables;

import java.math.BigInteger;
import java.util.Scanner;

public class M02FromLeftToRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String line = scanner.nextLine();

            String firstWord = "";
            int indexSpace = 0;
            for (int j = 0; j < line.length(); j++) {

                char character = line.charAt(j);

                if (character == ' ') {
                    indexSpace = j + 1;
                    break;
                }
                firstWord += character;
            }
            String secondWord = "";
            for (int j = indexSpace; j < line.length(); j++) {
                char character = line.charAt(j);
                secondWord += character;
            }
            BigInteger firstNumber = new BigInteger(firstWord);
            BigInteger secondNumber = new BigInteger(secondWord);
            int compareNumbers = firstNumber.compareTo(secondNumber);

            if (compareNumbers > 0) {
                System.out.println(countSumOfDigits(firstWord));
            } else {
                System.out.println(countSumOfDigits(secondWord));
            }
        }
    }
    private static int countSumOfDigits(String word) {
        // --------- a clever way to count the digits in a negative integer!!! -------------
        int startIndex = 0;
        if (word.charAt(0) == '-')
            startIndex = 1;

        int sum = 0;
        for (int i = startIndex; i < word.length(); i++) {
            char character = word.charAt(i);
            int digit = Integer.parseInt(character + "");
            sum += digit;
        }
        return sum;
    }
}

// You will receive a number representing how many lines we will get as input. On the next N lines,
// you will receive a string with 2 numbers separated by a single space. You need to compare them.
// If the left number is greater than the right number, you need to print the sum of all digits in the
// left number, otherwise, print the sum of all digits in the right number.
