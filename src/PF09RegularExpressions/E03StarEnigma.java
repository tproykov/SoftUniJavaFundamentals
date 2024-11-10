package PF09RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03StarEnigma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<planetName>[A-Z][a-z]+)[^@\\-!:>]*:(?<planetPopulation>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            int decryptionKey = 0;
            for (int j = 0; j < input.length(); j++) {

                char ch = input.charAt(j);

                if (ch == 's' || ch == 't' || ch == 'a' || ch == 'r'
                        || ch == 'S' || ch == 'T' || ch == 'A' || ch == 'R') {

                    decryptionKey++;
                }
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {

                char ch = (char) (input.charAt(j) - decryptionKey);

                decryptedMessage.append(ch);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);

            while (matcher.find()) {

                String planetName = matcher.group("planetName");
                int planetPopulation = Integer.parseInt(matcher.group("planetPopulation"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                }
                else if (attackType.equals("D")) {
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        if (!attackedPlanets.isEmpty()) {
            Collections.sort(attackedPlanets);
            for (String attackedPlanet : attackedPlanets) {
                System.out.println("-> " + attackedPlanet);
            }
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        if (!destroyedPlanets.isEmpty()) {
            Collections.sort(destroyedPlanets);
            for (String destroyedPlanet : destroyedPlanets) {
                System.out.println("-> " + destroyedPlanet);
            }
        }
    }
}