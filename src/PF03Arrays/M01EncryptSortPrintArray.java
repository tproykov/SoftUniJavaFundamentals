package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class M01EncryptSortPrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] encryptedWords = new int[n];
        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();

            int sumVowels = 0;
            int sumConsonants = 0;
            for (int j = 0; j < word.length(); j++) {

                char character = word.charAt(j);

                if (character =='a' || character == 'o' || character == 'e' || character == 'i'
                        || character == 'u' || character == 'A' || character == 'O'
                        || character == 'E' || character == 'I' || character == 'U') {
                    sumVowels += character * word.length();
                }
                else {
                    sumConsonants += character / word.length();
                }
            }
            encryptedWords[i] = sumVowels + sumConsonants;
        }
        Arrays.sort(encryptedWords);
        for (int encryptedWord : encryptedWords) {
            System.out.println(encryptedWord);
        }
    }
}

// Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
//•	The code of each vowel multiplied by the string length.
//•	The code of each consonant is divided by the string length.
//Sort the number sequence in ascending order and print it on the console.
//On the first line, you will always receive the number of strings you must read.
