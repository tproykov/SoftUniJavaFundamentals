package PF07AssociativeArrays;

import java.util.*;

public class L03OddOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String string : input) {
            String occurrence = string.toLowerCase();
            occurrences.putIfAbsent(occurrence, 0);
            occurrences.put(occurrence, occurrences.get(occurrence) + 1);
        }
        List<String> results = new ArrayList<>();
        for (String occurrence : occurrences.keySet()) {
            if (occurrences.get(occurrence) % 2 != 0) {
                results.add(occurrence);
            }
        }
        System.out.println(String.join(", ", results));
    }
}