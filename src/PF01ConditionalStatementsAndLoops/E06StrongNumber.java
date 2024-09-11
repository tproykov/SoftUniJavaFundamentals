package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E06StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(isStrong(n));
    }
    private static String isStrong(int n) {
        int sum = 0;
        int currentNumber = n;
        while (currentNumber > 0) {
            sum += factorial(currentNumber % 10);
            currentNumber /= 10;
        }
        if (sum == n) {
            return "yes";
        }
        return "no";
    }
    private static int factorial(int n) {
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

// Write a program to check whether or not a given number is strong. A number is
// strong if the sum of the Factorial of each digit is equal to the number. For
// example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes" if the
// number is strong and "no" if the number is not strong.

