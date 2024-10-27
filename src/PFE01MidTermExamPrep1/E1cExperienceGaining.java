package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1cExperienceGaining {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double experienceNeeded = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());

        double experienceGained = 0;
        int battles = 0;
        for (int battle = 1; battle <= countBattles; battle++) {

            battles++;
            double experienceInBattle = Double.parseDouble(scanner.nextLine());

            if (battle % 15 == 0) experienceGained += experienceInBattle * 1.05;
            else if (battle % 5 == 0) experienceGained += experienceInBattle * 0.90;
            else if (battle % 3 == 0) experienceGained += experienceInBattle * 1.15;
            else experienceGained += experienceInBattle;

            if (experienceGained >= experienceNeeded) {
                System.out.println("Player successfully collected his needed experience for " + battles + " battles.");
                return;
            }
        }
        double moreExperienceNeeded = experienceNeeded - experienceGained;
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",
                moreExperienceNeeded);
    }
}