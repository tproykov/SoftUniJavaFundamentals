package PF07AssociativeArrays;

import java.util.*;

public class E03Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, Double> productNamePrice = new LinkedHashMap<>();
        Map<String, Integer> productNameQuantity = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("buy")) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            double totalPrice = price * quantity;

            productNamePrice.put(name, price);

            if (!productNameQuantity.containsKey(name)) {
                productNameQuantity.put(name, quantity);
            }
            else {
                productNameQuantity.put(name, productNameQuantity.get(name) + quantity);
            }
        }

        for (String name : productNamePrice.keySet()) {

            Double totalPrice = productNamePrice.get(name) * productNameQuantity.get(name);

            System.out.printf("%s -> %.2f\n", name, totalPrice);
        }
    }
}