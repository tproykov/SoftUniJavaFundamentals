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
            contestsPasswords.put(contestName, contestPassword);
        }

        Map<String, Map<String, Integer>> usersData = new TreeMap<>();

        String input2;
        while (!(input2 = scanner.nextLine()).equals("end of submissions")) {
            String[] tokens = input2.split("=>");
            String contestName = tokens[0];
            String contestPassword = tokens[1];
            String username = tokens[2];
            int currentPoints = Integer.parseInt(tokens[3]);

            if (contestsPasswords.containsKey(contestName) && contestsPasswords.get(contestName).equals(contestPassword)) {
                usersData.putIfAbsent(username, new HashMap<>());
                Map<String, Integer> userContests = usersData.get(username);

                userContests.put(contestName, Math.max(userContests.getOrDefault(contestName, 0), currentPoints));
            }
        }

        String bestCandidate = "";
        int bestTotalPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : usersData.entrySet()) {
            String user = entry.getKey();
            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();

            if (totalPoints > bestTotalPoints) {
                bestTotalPoints = totalPoints;
                bestCandidate = user;
            }
        }

        System.out.println("Best candidate is " + bestCandidate + " with total " + bestTotalPoints + " points.");

        System.out.println("Ranking:");
        for (Map.Entry<String, Map<String, Integer>> entry : usersData.entrySet()) {
            String user = entry.getKey();
            System.out.println(user);

            entry.getValue().entrySet().stream()
                    .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                    .forEach(contestEntry ->
                            System.out.println("#  " + contestEntry.getKey() + " -> " + contestEntry.getValue())
                    );
        }
    }
}