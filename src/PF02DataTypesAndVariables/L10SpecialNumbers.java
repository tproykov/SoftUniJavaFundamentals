package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L10SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int sum = 0;
            int number = i;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            }
            else {
                System.out.println(i + " -> False");
            }
        }
    }
}

// A number is special when its sum of digits is 5, 7, or 11.
//Write a program to read an integer n and for all numbers in the range 1…n to print the number
// and if it is special or not (True / False).
