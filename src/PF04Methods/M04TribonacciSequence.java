package PF04Methods;

import java.util.Scanner;

public class M04TribonacciSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        getTribonacci(n);
    }
    private static void getTribonacci(int n) {

        long num1 = 1;
        long num2 = 1;
        long num3 = 2;

        long tribonacci = 0;
        for (int i = 1; i <= n; i++) {

            tribonacci = num1;
            long num4 = num3 + num2 + num1;
            num1 = num2;
            num2 = num3;
            num3 = num4;
            System.out.print(tribonacci + " ");
        }
    }
}

// In the "Tribonacci" sequence, every number is formed by the sum of the
// previous 3.
//You are given a number num. Write a program that prints num numbers from
// the Tribonacci sequence, each on a new line, starting from 1. The input
// comes as a parameter named num. The value num will always be a positive
// integer.
