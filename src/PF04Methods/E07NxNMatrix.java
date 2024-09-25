package PF04Methods;

import java.util.Scanner;

public class E07NxNMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        nxnMatrix(n);
    }
    private static void nxnMatrix(int n) {
        // int[][] matrix = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

// Write a method that receives a single integer n and prints an nxn matrix with that number.