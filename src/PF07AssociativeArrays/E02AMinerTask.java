package PF07AssociativeArrays;

import java.util.*;

public class E02AMinerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> tasks = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();

        String input;
        int counter = 0;
        while (!(input = scanner.nextLine()).equals("stop")) {
            counter++;
            if (counter % 2 != 0) {
                tasks.add(input);
            }
            else {
                quantities.add(Integer.parseInt(input));
            }
        }

        Map<String, Integer> tasksQuantities = new LinkedHashMap<>();
        for ( int i = 0; i < tasks.size(); i++ ) {
            tasksQuantities.putIfAbsent(tasks.get(i), 0);
            tasksQuantities.put(tasks.get(i), tasksQuantities.get(tasks.get(i)) + quantities.get(i));
        }
        for (String task: tasksQuantities.keySet()) {

            System.out.println(task + " -> " + tasksQuantities.get(task));
        }
    }
}