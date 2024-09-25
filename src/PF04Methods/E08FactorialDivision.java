package PF04Methods;

import java.util.Scanner;

public class E08FactorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double result = (factorial(n1) / factorial(n2));
        System.out.printf("%.2f", result);
    }
    private static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Read two integer numbers. Calculate the factorial of each number. Divide the first result by the
// second and print the division formatted to the second decimal point.