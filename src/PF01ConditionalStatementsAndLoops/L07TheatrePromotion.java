package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L07TheatrePromotion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean validAge = true;
        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 18;
                    break;
                case "Weekend":
                    ticketPrice = 20;
                    break;
                case "Holiday":
                    ticketPrice = 12;
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 10;
                    break;
            }
        } else {
            validAge = false;
        }
        if (validAge) {
            System.out.println(ticketPrice + "$");
        }
        else {
            System.out.println("Error!");
        }
    }
}

// A theatre is having a ticket sale, but they need a program to calculate the price of a
// single ticket. If the given age does not fit one of the categories, you should print "Error!". You can see the prices in the table below:
//Day / Age	    0 <= age <= 18	    18 < age <= 64	    64 < age <= 122
//Weekday	    12$	                18$	                12$
//Weekend	    15$	                20$	                15$
//Holiday	    5$	                12$                 10$
//Input
//The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
//Output
//Print the ticket price according to the table, or "Error!" if the age is not in the table.
//Constraints
//•	The age will be in the interval [-1000…1000].
//•	The type of day will always be valid.