package PF03Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class M03RecursiveFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 1 || n > 50) {
            System.out.println("Please enter a number between 1 and 50.");
            return;
        }
        System.out.println(getFibonacci(n));
    }
    public static long getFibonacci(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return 1;
        }
        // Memoization map to store previously calculated Fibonacci numbers
        HashMap<Integer, Long> memo = new HashMap<>();
        // Check if the value has already been computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // Recursive calculation of current Fibonacci number
        long result = getFibonacci(n - 1) + getFibonacci(n - 2);

        // Store the result in memoization map
        memo.put(n, result);

        return result;
    }
}

// The Fibonacci sequence is quite a famous sequence of numbers. Each sequence member is calculated from the sum of the two previous elements. The first two elements are 1, 1. Therefore the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…
//The following sequence can be generated with an array, but that's easy, so your task is to implement it recursively.
//So if the function GetFibonacci(n) returns the n’th Fibonacci number we can express it using GetFibonacci(n) = GetFibonacci(n-1) + GetFibonacci(n-2).
//However, this will never end and in a few seconds, a StackOverflow Exception is thrown. For the recursion to stop, it has to have a "bottom". At the bottom of the recursion is GetFibonacci(2) should return 1, and GetFibonacci(1) should return 1.
//Input
//•	The user should enter the wanted Fibonacci number on the only line in the input.
//Output
//•	The output should be the n'th Fibonacci number counting from 1.
//Constraints
//•	1 ≤ N ≤ 50

// -----------------------------------------------------------------------------------
// ALTERNATIVE - A NON-RECURSIVE SOLUTION OF THE SAME EXERCISE - WORKS MUCH FASTER!!!
// -----------------------------------------------------------------------------------
//
// package MoreExercises;
//
//import java.util.Scanner;
//
//public class M03RecursiveFibonacci {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        long num1 = 1;
//        long num2 = 1;
//
//        long fibonacci = 0;
//        for (int i = 0; i < n; i++) {
//            // Print the number
//            // System.out.print(num1 + " ");
//            // Swap
//            fibonacci = num1;
//            long num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//        }
//        System.out.println(fibonacci);
//    }
//}