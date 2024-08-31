package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L01ConvertMetersToKilometers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = 1.0 * meters / 1000;
        System.out.printf("%.2f", kilometers);
    }
}

// Write a program that:
//•	Reads an integer number that represents meters for conversion
//•	Convert meters to kilometers (1000 meters = 1 kilometer)
//•	Print the resulted kilometers, formatted to the second decimal point
