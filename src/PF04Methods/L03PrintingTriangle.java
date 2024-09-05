package PF04Methods;

import java.util.Scanner;

public class L03PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }
    private static void printTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = n - 1; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

// Create a method for printing triangles as shown below:
//Examples
//Input	Output
//3
//1
//1 2
//1 2 3
//1 2
//1

//4
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3
//1 2
//1
