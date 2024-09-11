package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E08TriangleOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {

                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}

// Write a program that receives a number – n and prints a triangle from 1 to n as
// in the examples.
