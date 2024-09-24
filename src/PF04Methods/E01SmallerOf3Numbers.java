package PF04Methods;

import java.util.Scanner;

public class E01SmallerOf3Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
// Write a method to print the smallest of three integer numbers. Use an appropriate name
// for the method.

// Me - no point using a method there