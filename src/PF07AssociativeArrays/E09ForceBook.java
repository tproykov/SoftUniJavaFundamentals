package PF07AssociativeArrays;

import java.util.*;

public class E09ForceBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceUsers = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Lumpawaroo")) {

            String[] tokens = input.split("\\s+");

            String commandType = tokens[1];

            switch (commandType) {
                case "|" -> {
                    String forceSide = tokens[0];
                    String forceUser = tokens[2];
                    if (!forceUsers.containsKey(forceSide)) {
                        forceUsers.put(forceSide, new ArrayList<>());
                        forceUsers.get(forceSide).add(forceUser);
                    }
                    else {
                        boolean userTakenSide = false;
                        for (String side : forceUsers.keySet()) {
                            for (String user : forceUsers.get(side)) {
                                if (user.equals(forceUser)) {
                                    userTakenSide = true;
                                }
                            }
                        }
                        if (!userTakenSide) {
                            forceUsers.get(forceSide).add(forceUser);
                        }
                    }
                }
                case "->" -> {
                    String forceUser = tokens[0];
                    String forceSide = tokens[2];
                    if (!forceUsers.containsKey(forceSide)) {
                        forceUsers.put(forceSide, new ArrayList<>());
                        forceUsers.get(forceSide).add(forceUser);
                    }
                    else {




                    }




                }
            }





        }



    }

}
