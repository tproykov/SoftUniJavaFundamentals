package PF07AssociativeArrays;

import java.util.*;

public class M02Judge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        Map<String, Integer> individualScores = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            contests.putIfAbsent(contest, new HashMap<>());

            contests.get(contest).putIfAbsent(username, 0);
            if (contests.get(contest).get(username) < points) {
                int previousPoints = contests.get(contest).get(username);
                contests.get(contest).put(username, points);

                individualScores.put(username, individualScores.getOrDefault(username, 0) - previousPoints + points);
            }
        }

        for (String contest : contests.keySet()) {
            System.out.println(contest + ": " + contests.get(contest).size() + " participants");
            Map<String, Integer> participants = contests.get(contest);

            List<Map.Entry<String, Integer>> sortedParticipants = new ArrayList<>(participants.entrySet());
            sortedParticipants.sort((a, b) -> b.getValue().equals(a.getValue())
                    ? a.getKey().compareTo(b.getKey())
                    : b.getValue() - a.getValue());

            int rank = 1;
            for (Map.Entry<String, Integer> entry : sortedParticipants) {
                System.out.printf("%d. %s <::> %d%n", rank++, entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Individual standings:");
        List<Map.Entry<String, Integer>> sortedUsers = new ArrayList<>(individualScores.entrySet());
        sortedUsers.sort((a, b) -> b.getValue().equals(a.getValue())
                ? a.getKey().compareTo(b.getKey())
                : b.getValue() - a.getValue());

        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedUsers) {
            System.out.printf("%d. %s -> %d%n", rank++, entry.getKey(), entry.getValue());
        }
    }
}