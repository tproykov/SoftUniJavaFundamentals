package PFE1MidTremExam;

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input
        int days = Integer.parseInt(scanner.nextLine()); // Number of days the pirating lasts
        int dailyPlunder = Integer.parseInt(scanner.nextLine()); // How much pirates plunder per day
        double expectedPlunder = Double.parseDouble(scanner.nextLine()); // The expected total plunder

        double totalPlunder = 0; // Initialize total plunder

        for (int day = 1; day <= days; day++) {
            // Add daily plunder to total
            totalPlunder += dailyPlunder;

            // Every 3rd day, the pirates plunder an additional 50% of the daily plunder
            if (day % 3 == 0) {
                totalPlunder += dailyPlunder * 0.5;
            }

            // Every 5th day, the pirates lose 30% of their total plunder due to a warship
            if (day % 5 == 0) {
                totalPlunder *= 0.7;
            }
        }

        // Check if the total plunder is greater than or equal to the expected plunder
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.%n", totalPlunder);
        } else {
            double percentage = (totalPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.%n", percentage);
        }
    }
}













