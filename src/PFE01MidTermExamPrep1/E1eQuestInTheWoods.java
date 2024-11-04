package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1eQuestInTheWoods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int adventureDays = Integer.parseInt(scanner.nextLine());
        int countParticipants = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double dailyWaterPerPerson = Double.parseDouble(scanner.nextLine());
        double dailyFoodPerPerson = Double.parseDouble(scanner.nextLine());


        double waterSupply = adventureDays * dailyWaterPerPerson * countParticipants;
        double foodSupply = adventureDays * dailyFoodPerPerson * countParticipants;
        for (int day = 1; day <= adventureDays; day++) {

            double dailyEnergyLoss = Double.parseDouble(scanner.nextLine());

            groupEnergy -= dailyEnergyLoss;

            if (groupEnergy <= 0) {
                System.out.printf("You will run out of energy.You will be left with %.2f food and %.2f water",
                        foodSupply, waterSupply);
                return;
            }
            if (day % 2 ==0) {
                groupEnergy *= 1.05;
                waterSupply *= 0.70;
            }
            if (day % 3 == 0) {
                groupEnergy *= 1.10;
                foodSupply -= (foodSupply / countParticipants);
            }
        }
        System.out.printf("You are ready for the quest. You will be left with %.2f energy!", groupEnergy);
    }
}