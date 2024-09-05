package PF04Methods;

import java.util.Scanner;

public class L08MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", numberPower(number, power));
    }
    private static double numberPower(double number, double power) {
        return Math.pow(number, power);
    }
}

// Create a method that calculates and returns the value of a number raised
// to a given power.
