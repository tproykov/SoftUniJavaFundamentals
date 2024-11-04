package PFE2MidTermExam;

import java.util.Scanner;

public class E01SpringVacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfTrip = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        double fuelPricePerKm = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPerson = Double.parseDouble(scanner.nextLine());
        double roomPricePerNightPerPerson = Double.parseDouble(scanner.nextLine());

        double totalFoodAndAccommodation = 0;
        if (countOfPeople <= 10) {
            totalFoodAndAccommodation = countOfPeople * daysOfTrip *
                    (roomPricePerNightPerPerson + foodExpensesPerPerson);
        }
        else {
            totalFoodAndAccommodation = countOfPeople * (daysOfTrip) *
                    (roomPricePerNightPerPerson * 0.75 + foodExpensesPerPerson);
        }

        double travelExpenses = totalFoodAndAccommodation;
        for (int day = 1; day <= daysOfTrip; day++) {

            double kmDistanceDaily = Double.parseDouble(scanner.nextLine());

            travelExpenses += fuelPricePerKm * kmDistanceDaily;

            if (day % 3 == 0 || day % 5 == 0) {
                travelExpenses *= 1.4;
            }
            if (day % 7 == 0) {
                travelExpenses -= travelExpenses / countOfPeople;
            }

            if (travelExpenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",
                        travelExpenses - budget);
                return;
            }
        }
        System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - travelExpenses);
    }
}