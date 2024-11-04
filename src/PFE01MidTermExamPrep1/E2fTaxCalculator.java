package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E2fTaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] vehicles = input.split(">>");

        double totalTaxCollected = 0;
        for (String vehicle : vehicles) {

            String[] vehicleAttributes = vehicle.split(" ");

            String vehicleType = vehicleAttributes[0];
            int years = Integer.parseInt(vehicleAttributes[1]);
            int kilometers = Integer.parseInt(vehicleAttributes[2]);

            double taxDue = 0;
            int taxIncrease = 0;
            switch (vehicleType) {
                case "family" -> {
                    taxIncrease = (kilometers / 3000) * 12;
                    taxDue = 50 - years * 5 + taxIncrease;
                    totalTaxCollected += taxDue;
                }
                case "heavyDuty" -> {
                    taxIncrease = (kilometers / 9000) * 14;
                    taxDue = 80 - years * 8 + taxIncrease;
                    totalTaxCollected += taxDue;
                }
                case "sports" -> {
                    taxIncrease = (kilometers / 2000) * 18;
                    taxDue = 100 - years * 9 + taxIncrease;
                    totalTaxCollected += taxDue;
                }
                default -> {
                    System.out.println("Invalid car type.");
                    continue;
                }
            }
            System.out.printf("A %s car will pay %.2f euros in taxes.\n", vehicleType, taxDue);
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes", totalTaxCollected);
    }
}