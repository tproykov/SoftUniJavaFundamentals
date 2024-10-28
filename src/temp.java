import java.util.*;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using TreeMap to store users and their points (automatically sorted by username)
        Map<String, Integer> userPoints = new LinkedHashMap<>();

        // Map to store language submission counts
        Map<String, Integer> languageSubmissions = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] tokens = input.split("-");

            if (tokens.length == 2 && tokens[1].equals("banned")) {
                // Handle ban command
                userPoints.remove(tokens[0]);
            } else if (tokens.length == 3) {
                String username = tokens[0];
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                // Update user points (keep the highest score)
                userPoints.merge(username, points, Math::max);

                // Update language submission count
                languageSubmissions.merge(language, 1, Integer::sum);
            }

            input = scanner.nextLine();
        }

        // Print Results
        System.out.println("Results:");
        userPoints.forEach((username, points) ->
                System.out.println(username + " | " + points));

        // Print Submissions
        System.out.println("Submissions:");
        languageSubmissions.forEach((language, count) ->
                System.out.println(language + " - " + count));
    }
}