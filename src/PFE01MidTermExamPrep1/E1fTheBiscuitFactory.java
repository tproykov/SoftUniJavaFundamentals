package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1fTheBiscuitFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int biscuitsPerWorkerPerDay = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int monthlyBiscuitsCompetition = Integer.parseInt(scanner.nextLine());

        int totalBiscuitsNormalDays = biscuitsPerWorkerPerDay * countWorkers;
        int totalBiscuitsReducedDays = totalBiscuitsNormalDays * 3 / 4;

        int totalBiscuits = totalBiscuitsNormalDays * 20 + totalBiscuitsReducedDays * 10;

        System.out.println("You have produced " + totalBiscuits + " biscuits for the past month.");

        if (totalBiscuits > monthlyBiscuitsCompetition) {
            double percentMore = 100.0 * (totalBiscuits - monthlyBiscuitsCompetition) / monthlyBiscuitsCompetition;
            System.out.printf("You produce %.2f percent more biscuits.\n", percentMore);
        }
        else {
            double percentLess = 100.0 * (monthlyBiscuitsCompetition - totalBiscuits) / monthlyBiscuitsCompetition;
            System.out.printf("You produce %.2f percent less biscuits.\n", percentLess);
        }
    }
}