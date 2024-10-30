package PF07AssociativeArrays;

import java.util.*;

public class M01Ranking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestsPasswords = new HashMap<>();

        String input1;
        while (!(input1 = scanner.nextLine()).equals("end of contests")) {

            String[] tokens = input1.split(":");

            String contestName = tokens[0];
            String contestPassword = tokens[1];

            if (!contestsPasswords.containsKey(contestName)) {
                contestsPasswords.put(contestName, contestPassword);
            }
        }

        Map<String, List<String>> contestsUsers = new LinkedHashMap<>();
        Map<String,List<Integer>> contestsPoints = new LinkedHashMap<>();

        String input2;
        while (!(input2 = scanner.nextLine()).equals("end of submissions")) {

            String[] tokens = input2.split(":");
            String contestName = tokens[0];
            String contestPassword = tokens[1];
            String username = tokens[2];
            int currentPoints = Integer.parseInt(tokens[3]);

            if (contestsPasswords.containsKey(contestName)) {
                if (!contestsPasswords.get(contestName).equals(contestPassword)) {

                    if (!contestsUsers.containsKey(contestName)) {
                        contestsUsers.put(contestName, new ArrayList<>());
                        contestsUsers.get(contestName).add(username);
                    }
                    else {

                        List<String> users = contestsUsers.get(contestName);
                        List<Integer> points = contestsPoints.get(contestName);

                        int index = users.indexOf(username);

                        if (points.get(index) < currentPoints) {
                            points.set(index, currentPoints);
                        }

                        contestsPoints.put(contestName, points);
                    }
                }
            }
        }
    }
}