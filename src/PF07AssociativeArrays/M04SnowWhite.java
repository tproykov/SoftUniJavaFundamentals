package PF07AssociativeArrays;

import java.util.*;

public class M04SnowWhite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // input the dwarfs by "dwarfName dwarfHatColor" as key and dwarfPhysique as value
        Map<String, Integer> dwarfData = new LinkedHashMap<>();
        // count the number of dwarfs per hat colour
        Map<String, Integer> hatColorCount = new HashMap<>();
        while (!input.equals("Once upon a time")) {

            String[] tokens = input.split(" <:> ");
            String dwarfName = tokens[0];
            String dwarfHatColor = tokens[1];
            int dwarfPhysique = Integer.parseInt(tokens[2]);

            String dwarfNameHat = dwarfName + " " + dwarfHatColor;

            if (!dwarfData.containsKey(dwarfNameHat)) {
                dwarfData.put(dwarfNameHat, dwarfPhysique);
                hatColorCount.put(dwarfHatColor, hatColorCount.getOrDefault(dwarfHatColor, 0) + 1);
            } else {
                if (dwarfData.get(dwarfNameHat) < dwarfPhysique) {
                    dwarfData.put(dwarfNameHat, dwarfPhysique);
                }
            }
            input = scanner.nextLine();
        }
        // sort and print the dwarfs
        // convert dwarfData map entries to a list for sorting
        List<Map.Entry<String, Integer>> dwarfList = new ArrayList<>(dwarfData.entrySet());

        // sort list
        dwarfList.sort((a, b) -> {
            int physiqueA = a.getValue();
            int physiqueB = b.getValue();
            if (physiqueA != physiqueB) {
                return physiqueB - physiqueA;
            } else {
                // extract hat colors from "dwarfName dwarfHatColor" combos (keys)
                String hatColorA = a.getKey().split(" ")[1];
                String hatColorB = b.getKey().split(" ")[1];
                return hatColorCount.get(hatColorB) - hatColorCount.get(hatColorA);
            }
        });
        // output and print the sorted list
        for (Map.Entry<String, Integer> entry : dwarfList) {
            String[] tokens = entry.getKey().split(" ");
            String dwarfName = tokens[0];
            String hatColor = tokens[1];
            int dwarfPhysique = entry.getValue();
            System.out.printf("(%s) %s <-> %d\n", hatColor, dwarfName, dwarfPhysique);
        }
    }
}
