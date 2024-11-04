package PF07AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E10SoftUniExamResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userPoints = new LinkedHashMap<>();

        Map<String, Integer> languageSubmissions = new LinkedHashMap<>();

        String input;

        while (!(input = scanner.nextLine()).equals("exam finished")) {

            String[] tokens = input.split("-");

            if (tokens.length == 2 && tokens[1].equals("banned")) {
                userPoints.remove(tokens[0]);
            } else if (tokens.length == 3) {
                String username = tokens[0];
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                userPoints.merge(username, points, Math::max);

                languageSubmissions.merge(language, 1, Integer::sum);
            }
        }

        System.out.println("Results:");
        userPoints.forEach((username, points) ->
                System.out.println(username + " | " + points));

        System.out.println("Submissions:");
        languageSubmissions.forEach((language, count) ->
                System.out.println(language + " - " + count));
    }
}