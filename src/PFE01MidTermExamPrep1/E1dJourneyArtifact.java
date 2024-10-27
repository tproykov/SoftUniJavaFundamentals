package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1dJourneyArtifact {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double initialEnergy = Double.parseDouble(scanner.nextLine());

        String command;
        int artifactParts = 0;
        int countMountains = 0;
        while (!"Journey ends here!".equals(command = scanner.nextLine())) {

            switch (command) {
                case "mountain" -> {
                    initialEnergy -= 10;
                    countMountains++;
                    if (countMountains % 3 ==0) artifactParts++;
                }
                case "desert" -> {
                    initialEnergy -= 15;
                }
                case "forest" -> {
                    initialEnergy += 7;
                }
            }
            if (initialEnergy <= 0) {
                System.out.println("The character is too exhausted to carry on with the journey.");
                return;
            }

            if (artifactParts == 3) {
                System.out.printf("The character reached legendary artifact with %.2f energy left.", initialEnergy);
                return;
            }
        }
        System.out.println("The character could not find all the pieces and needs " + (3 - artifactParts)
                + " more to complete the legendary artifact.");
    }
}