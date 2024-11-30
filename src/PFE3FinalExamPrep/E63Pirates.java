package PFE3FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E63Pirates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> townsPopulation = new LinkedHashMap<>();
        Map<String, Integer> townsGold = new LinkedHashMap<>();

        String command1;
        while (!(command1 = scanner.nextLine()).equals("Sail")) {

            String[] townParts = command1.split("\\|\\|");

            String townName = townParts[0];
            int population = Integer.parseInt(townParts[1]);
            int gold = Integer.parseInt(townParts[2]);

            if (!townsPopulation.containsKey(townName)) {
                townsPopulation.put(townName, population);
                townsGold.put(townName, gold);
            }
            else {
                townsPopulation.put(townName, townsPopulation.get(townName) + population);
                townsGold.put(townName, townsGold.get(townName) + gold);
            }
        }

        String command2;
        while (!(command2 = scanner.nextLine()).equals("End")) {

            String[] commandParts = command2.split("=>");
            String commandName = commandParts[0];
            String townName = commandParts[1];

            switch (commandName) {

                case "Plunder" -> {
                    int people = Integer.parseInt(commandParts[2]);
                    int gold = Integer.parseInt(commandParts[3]);

                    townsPopulation.put(townName, townsPopulation.get(townName) - people);
                    townsGold.put(townName, townsGold.get(townName) - gold);

                    System.out.println(townName + " plundered! " + gold + " gold stolen, " + people
                            + " citizens killed.");

                    if (townsPopulation.get(townName) <= 0 || townsGold.get(townName) <= 0) {

                        townsPopulation.remove(townName);
                        townsGold.remove(townName);
                        System.out.println(townName + " has been wiped off the map!");
                    }
                }

                case "Prosper" -> {
                    int gold = Integer.parseInt(commandParts[2]);

                    if (gold >= 0) {
                        townsGold.put(townName, townsGold.get(townName) + gold);
                        System.out.println(gold + " gold added to the city treasury. " + townName
                                + " now has " + townsGold.get(townName) + " gold.");
                    }
                    else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                }
            }
        }
        if (!townsPopulation.isEmpty()) {
            System.out.println("Ahoy, Captain! There are " + townsPopulation.size() + " wealthy settlements to go to:");

            for (Map.Entry<String, Integer> entry : townsPopulation.entrySet()) {

                System.out.println(entry.getKey() + " -> Population: " + entry.getValue() + " citizens, Gold: "
                        + townsGold.get(entry.getKey()) + " kg");
            }
        }
        else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}