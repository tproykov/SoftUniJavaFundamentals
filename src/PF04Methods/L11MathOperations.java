package PF04Methods;

import java.util.Scanner;

public class L11MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(operator, n1, n2));
    }

    private static double calculate(String operator, int n1, int n2) {

        double result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = 1.0 * n1 * n2;
                break;
            case "/":
                result = 1.0 * n1 / n2;
                break;
        }
        return result;
    }
}

// Write a method that receives two numbers and an operator, calculates
// the result, and returns it. You will be given three lines of input. The
// first will be the first number, the second one will be the operator, and
// the last one will be the second number. The possible operators are: / * + -
//Print the result rounded up to the second decimal point.
