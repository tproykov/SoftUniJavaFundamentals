package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.Scanner;

public class E2eSpaceTravel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String route = scanner.nextLine();
        int startingFuel = Integer.parseInt(scanner.nextLine());
        int startingAmmunition = Integer.parseInt(scanner.nextLine());

        String[] commands = route.split("\\|\\|");

        for (String command : commands) {

            String[] commandParts = command.split(" ");

            String commandType = commandParts[0];

            switch (commandType) {

                case "Travel" -> {
                    int lightYears = Integer.parseInt(commandParts[1]);
                    startingFuel -= lightYears;
                    if (startingFuel >= 0) {
                        System.out.println("The spaceship travelled " + lightYears + " light-years.");
                    }
                    else {
                        System.out.println("Mission failed.");
                        return;
                    }
                }

                case "Enemy" -> {
                    int enemysArmour = Integer.parseInt(commandParts[1]);
                    if (startingAmmunition >= enemysArmour) {
                        startingAmmunition -= enemysArmour;
                        System.out.println("An enemy with " + enemysArmour + " armour is defeated.");
                    }
                    else {
                        startingFuel -= enemysArmour * 2;
                        if (startingFuel >= 0) {
                            System.out.println("An enemy with " + enemysArmour + " armour is outmaneuvered.");
                        }
                        else {
                            System.out.println("Mission failed.");
                            return;
                        }
                    }
                }

                case "Repair" -> {
                    int ammunitionFuelAdded = Integer.parseInt(commandParts[1]);
                    startingAmmunition += ammunitionFuelAdded * 2;
                    System.out.println("Ammunitions added: " + ammunitionFuelAdded * 2 + ".");
                    startingFuel += ammunitionFuelAdded;
                    System.out.println("Fuel added: " + ammunitionFuelAdded + ".");
                }

                case "Titan" -> {
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;
                }
            }
        }
    }
}