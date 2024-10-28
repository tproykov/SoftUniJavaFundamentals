package PF07AssociativeArrays;

import java.util.*;

public class E09ForceBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> forceUsers = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] tokens = input.split("\\s+\\|\\s+");
                String forceSide = tokens[0];
                String forceUser = tokens[1];

                // Check if user exists on any side
                boolean userExists = false;
                for (List<String> users : forceUsers.values()) {
                    if (users.contains(forceUser)) {
                        userExists = true;
                        break;
                    }
                }

                if (!userExists) {
                    // Add user to the side
                    forceUsers.putIfAbsent(forceSide, new ArrayList<>());
                    forceUsers.get(forceSide).add(forceUser);
                }
            } else if (input.contains("->")) {
                String[] tokens = input.split("\\s+->\\s+");
                String forceUser = tokens[0];
                String forceSide = tokens[1];

                // Remove user from current side if exists
                for (List<String> users : forceUsers.values()) {
                    users.remove(forceUser);
                }

                // Add user to new side
                forceUsers.putIfAbsent(forceSide, new ArrayList<>());
                forceUsers.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
        }

        // Print results
        forceUsers.entrySet().stream()
                .filter(entry -> !entry.getValue().isEmpty())
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",
                            entry.getKey(), entry.getValue().size());
                    entry.getValue()
                            .forEach(user -> System.out.println("! " + user));
                });
    }
}