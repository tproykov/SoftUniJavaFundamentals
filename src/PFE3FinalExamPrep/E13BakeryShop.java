package PFE3FinalExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E13BakeryShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> foodQuantity = new HashMap<>();
        int foodQuantitySold = 0;

        String command;
        while (!(command = scanner.nextLine()).equals("Complete")) {

            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];
            int quantity = Integer.parseInt(tokens[1]);
            String productName = tokens[2];

            switch (commandType) {

                case "Receive" -> {
                    if (quantity > 0) {
                        if (!foodQuantity.containsKey(productName)) {
                            foodQuantity.put(productName, quantity);
                        }
                        else {
                            foodQuantity.put(productName, foodQuantity.get(productName) + quantity);
                        }
                    }
                }

                case "Sell" -> {
                    if (!foodQuantity.containsKey(productName)) {
                        System.out.println("You do not have any " + productName + ".");
                    }
                    else {
                        if (foodQuantity.get(productName) < quantity) {
                            foodQuantitySold += foodQuantity.get(productName);
                            System.out.println("There aren't enough " + productName + ". You sold the last "
                                    + foodQuantity.get(productName) + " of them.");
                            foodQuantity.remove(productName);
                        }
                        else if (foodQuantity.get(productName) == quantity) {
                            foodQuantitySold += quantity;
                            System.out.println("You sold " + quantity + " " + productName + ".");
                            foodQuantity.remove(productName);
                        }
                        else {
                            foodQuantity.put(productName, foodQuantity.get(productName) - quantity);
                            foodQuantitySold += quantity;
                        }
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : foodQuantity.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("All sold: " + foodQuantitySold + " good");
    }
}