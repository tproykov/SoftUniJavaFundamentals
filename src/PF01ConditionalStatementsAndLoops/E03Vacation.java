package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double pricePerPerson = 0;
        switch (weekDay) {
            case "Friday":
                switch (groupType) {
                    case "Students":
                        pricePerPerson = 8.45;
                        break;
                    case "Business":
                        pricePerPerson = 10.90;
                        break;
                    case "Regular":
                        pricePerPerson = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType) {
                    case "Students":
                        pricePerPerson = 9.80;
                        break;
                    case "Business":
                        pricePerPerson = 15.60;
                        break;
                    case "Regular":
                        pricePerPerson = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType) {
                    case "Students":
                        pricePerPerson = 10.46;
                        break;
                    case "Business":
                        pricePerPerson = 16;
                        break;
                    case "Regular":
                        pricePerPerson = 22.50;
                        break;
                }

                break;
        }
        double totalPrice = pricePerPerson * countPeople;
        if (groupType.equals("Students") && countPeople >= 30) {
            totalPrice = totalPrice * 0.85;
        }
        if (groupType.equals("Business") && countPeople >= 100) {
            totalPrice = totalPrice - pricePerPerson * 10;
        }
        if (groupType.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

// You are given a group of people, type of the group, on which day of the week
// they will stay. Based on that information, calculate how much they must pay
// and print that price on the console. Use the table below. In each cell is the
// price for a single person. The output should look like that: "Total price: {price}".
// The price should be formatted to the second decimal point.
