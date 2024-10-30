import java.util.*;

public class temp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map to store valid contests and their passwords
        Map<String, String> contestsPasswords = new HashMap<>();

        String input1;
        while (!(input1 = scanner.nextLine()).equals("end of contests")) {
            String[] tokens = input1.split(":");
            String contestName = tokens[0];
            String contestPassword = tokens[1];
            contestsPasswords.put(contestName, contestPassword);
        }

        // Map to store users and their total points
        Map<String, Integer> userTotalPoints = new HashMap<>();

        // Map to store each user's points in specific contests
        Map<String, List<String>> userContests = new HashMap<>();
        Map<String, List<Integer>> userPoints = new HashMap<>();

        String input2;
        while (!(input2 = scanner.nextLine()).equals("end of submissions")) {
            String[] tokens = input2.split("=>");
            String contestName = tokens[0];
            String contestPassword = tokens[1];
            String username = tokens[2];
            int currentPoints = Integer.parseInt(tokens[3]);

            // Validate contest and password
            if (contestsPasswords.containsKey(contestName) && contestsPasswords.get(contestName).equals(contestPassword)) {
                // Initialize lists for contests and points if this user is new
                userContests.putIfAbsent(username, new ArrayList<>());
                userPoints.putIfAbsent(username, new ArrayList<>());

                List<String> contests = userContests.get(username);
                List<Integer> points = userPoints.get(username);

                // Check if the user already has points for this contest
                int index = contests.indexOf(contestName);
                if (index == -1) {
                    // New contest for this user
                    contests.add(contestName);
                    points.add(currentPoints);
                } else {
                    // Update the points if current points are higher
                    if (points.get(index) < currentPoints) {
                        // Update total points accordingly
                        int diff = currentPoints - points.get(index);
                        points.set(index, currentPoints);
                        userTotalPoints.put(username, userTotalPoints.getOrDefault(username, 0) + diff);
                    }
                }

                // Update user's total points if they are new or adding new points
                if (!userTotalPoints.containsKey(username)) {
                    userTotalPoints.put(username, currentPoints);
                } else if (index == -1) {
                    userTotalPoints.put(username, userTotalPoints.get(username) + currentPoints);
                }
            }
        }

        // Determine the best candidate
        String bestCandidate = "";
        int bestTotalPoints = 0;
        for (Map.Entry<String, Integer> entry : userTotalPoints.entrySet()) {
            if (entry.getValue() > bestTotalPoints) {
                bestTotalPoints = entry.getValue();
                bestCandidate = entry.getKey();
            }
        }

        // Output the best candidate
        System.out.println("Best candidate is " + bestCandidate + " with total " + bestTotalPoints + " points.");

        // Output all users and their contests with points
        System.out.println("Ranking:");
        userContests.keySet().stream().sorted().forEach(user -> {
            System.out.println(user);
            List<String> contests = userContests.get(user);
            List<Integer> points = userPoints.get(user);

            // Sort contests by points in descending order and print
            List<String> sortedContests = new ArrayList<>(contests);
            sortedContests.sort((a, b) -> Integer.compare(points.get(contests.indexOf(b)), points.get(contests.indexOf(a))));

            for (String contest : sortedContests) {
                System.out.println("#  " + contest + " -> " + points.get(contests.indexOf(contest)));
            }
        });
    }
}