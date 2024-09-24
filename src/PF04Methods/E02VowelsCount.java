package PF04Methods;

import java.util.Scanner;

public class E02VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        vowelsCounter(string);
    }
    private static void vowelsCounter(String string) {

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);
            if (character == 'a' || character == 'o' || character == 'e' || character == 'i'
                    || character == 'u' || character == 'A' || character == 'O' || character == 'E'
                    || character == 'I' || character == 'U') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

// Write a method that receives a single string and prints the count of the vowels. Use an appropriate
// name for the method.
