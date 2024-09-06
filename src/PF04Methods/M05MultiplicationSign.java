package PF04Methods;

import java.util.Scanner;

public class M05MultiplicationSign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(signOfProduct(num1, num2, num3));
    }
    private static String signOfProduct(int num1, int num2, int num3) {

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return "zero";
        }
        boolean isPositive = true;
        int countNegativeNumbers = 0;
        if (num1 < 0) {
            countNegativeNumbers++;
        }
        if (num2 < 0) {
            countNegativeNumbers++;
        }
        if (num3 < 0) {
            countNegativeNumbers++;
        }
        if (countNegativeNumbers % 2 != 0) {
            isPositive = false;
        }
        if (isPositive) {
            return "positive";
        }
        return "negative";
    }
}

// You are given a number num1, num2, and num3. Write a program that finds
// if num1 * num2 * num3 (the product) is negative, positive, or zero.
// Try to do this WITHOUT multiplying the 3 numbers.
