import java.util.*;

public class temp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map to store contests and participants with their scores
        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        // Map to store each user's total score across all contests
        Map<String, Integer> individualScores = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            // Add contest if it does not exist
            contests.putIfAbsent(contest, new HashMap<>());

            // Update user points in contest if necessary
            contests.get(contest).putIfAbsent(username, 0);
            if (contests.get(contest).get(username) < points) {
                int previousPoints = contests.get(contest).get(username);
                contests.get(contest).put(username, points);

                // Update user's total points in individualScores
                individualScores.put(username, individualScores.getOrDefault(username, 0) - previousPoints + points);
            }
        }

        // Print each contest with participants sorted by points and then by name
        for (String contest : contests.keySet()) {
            System.out.println(contest + ": " + contests.get(contest).size() + " participants");
            Map<String, Integer> participants = contests.get(contest);

            // Sort participants and use a rank counter
            List<Map.Entry<String, Integer>> sortedParticipants = new ArrayList<>(participants.entrySet());
            sortedParticipants.sort((a, b) -> b.getValue().equals(a.getValue())
                    ? a.getKey().compareTo(b.getKey())
                    : b.getValue() - a.getValue());

            int rank = 1;
            for (Map.Entry<String, Integer> entry : sortedParticipants) {
                System.out.printf("%d. %s <::> %d%n", rank++, entry.getKey(), entry.getValue());
            }
        }

        // Print individual standings sorted by total points and then by name
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

