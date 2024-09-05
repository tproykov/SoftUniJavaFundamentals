package PF04Methods;

import java.util.Scanner;

public class L01SignOfIntegerNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(signOfInteger(n));
    }
    private static void signOfInteger(int n) {
        if (n > 0) {
            System.out.println("The number " + n + " is positive.");
        } else if (n < 0) {
            System.out.println("The number " + n + " is negative.");
        }
        else {
            System.out.println("The number " + n + " is zero.");
        }
    }
}
