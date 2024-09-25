package PF04Methods;

import java.util.Scanner;

public class E10TopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printIfTopNumber(i);
        }
    }
    private static void printIfTopNumber(int n) {
        int sumOfDigits = 0;
        int oddDigits = 0;
        int currentNumber = n;
        while (currentNumber > 0) {
            int digit = currentNumber % 10;
            sumOfDigits += digit;
            if (digit % 2 != 0) {
                oddDigits++;
            }
            currentNumber /= 10;
        }
        if (oddDigits >= 1 && sumOfDigits % 8 == 0) {
            System.out.println(n);
        }
    }
}

// Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
// A top number holds the following properties:
//•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//•	Holds at least one odd digit, e.g. 232, 707, 87578.
