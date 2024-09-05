package PF04Methods;

import java.util.Scanner;

public class L06CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", rectangleArea(width, length));
    }
    private static double rectangleArea(double width, double length) {
        return width * length;
    }
}

// Create a method that calculates and returns the area of a rectangle by
// given width and length.
