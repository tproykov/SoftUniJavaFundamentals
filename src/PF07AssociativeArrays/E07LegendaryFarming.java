package PF07AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E07LegendaryFarming {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Integer> keyMaterials = new HashMap<>();

        for (int i = 1; i < input.length; i += 2) {

            String material = input[i];
            int quantity = Integer.parseInt(input[i - 1]);

            if (!keyMaterials.containsKey(material)) {
                keyMaterials.put(material, quantity);
            }
            else {
                keyMaterials.put(material, keyMaterials.get(material) + quantity);
            }



        }




    }

}
