package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L09CenturiesToMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hours, minutes);
    }
}
// Write a program to enter an integer number of centuries and convert it to years, days, hours,
// and minutes.
// •	Use appropriate data types to fit the result after each data conversion.
//•	Assume that a year has 365.2422 days on average (the Tropical year).
// 1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes