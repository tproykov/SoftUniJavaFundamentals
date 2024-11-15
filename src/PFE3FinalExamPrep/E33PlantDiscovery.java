package PFE3FinalExamPrep;

import java.util.*;

public class E33PlantDiscovery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRatings = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantParts = scanner.nextLine().split("<->");
            String plantName = plantParts[0];
            int rarity = Integer.parseInt(plantParts[1]);
            plantsRarity.put(plantName, rarity);
            plantsRatings.put(plantName, new ArrayList<>());
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Exhibition")) {

            String[] commandParts = command.split(": ");
            String commandType = commandParts[0];

            switch (commandType) {

                case "Rate" -> {
                    String[] plantRating = commandParts[1].split(" - ");
                    String plantName = plantRating[0];
                    int rating = Integer.parseInt(plantRating[1]);
                    if (plantsRarity.containsKey(plantName)) {
                        plantsRatings.get(plantName).add(rating);
                    } else {
                        System.out.println("error");
                    }
                }

                case "Update" -> {
                    String[] plantNewRarity = commandParts[1].split(" - ");
                    String plantName = plantNewRarity[0];
                    int newRarity = Integer.parseInt(plantNewRarity[1]);
                    if (plantsRarity.containsKey(plantName)) {
                        plantsRarity.put(plantName, newRarity);
                    } else {
                        System.out.println("error");
                    }
                }

                case "Reset" -> {
                    String plantName = commandParts[1];
                    if (plantsRarity.containsKey(plantName)) {
                        plantsRatings.put(plantName, new ArrayList<>());
                    } else {
                        System.out.println("error");
                    }
                }

                default -> System.out.println("error");
            }
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : plantsRarity.entrySet()) {
            String plantName = entry.getKey();
            int rarity = entry.getValue();

            List<Integer> ratings = plantsRatings.getOrDefault(plantName, new ArrayList<>());
            double averageRating = 0.0;

            if (!ratings.isEmpty()) {
                int totalRating = ratings.stream().mapToInt(Integer::intValue).sum();
                averageRating = 1.0 * totalRating / ratings.size();
            }

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        }
    }
}