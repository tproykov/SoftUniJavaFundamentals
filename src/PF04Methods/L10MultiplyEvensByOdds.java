package PF04Methods;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipliedEvensOdds(n));
    }
    private static int getMultipliedEvensOdds(int n) {
        int evenSum = 0;
        int oddSum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            else {
                oddSum += digit;
            }
            n = n / 10;
        }
        return evenSum * oddSum;
    }
}

// Create a program that reads an integer number and multiplies the sum of
// all its even digits by the sum of all its odd digits:
