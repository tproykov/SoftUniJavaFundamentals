package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L02PoundsToDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}

// Write a program that:
//•	Reads an floating-point number that represents quantity of British pounds for conversion
//•	Convert pounds to dollars (1 British Pound = 1.36 Dollars)
//•	Print the resulted dollars, formatted to the third decimal point
