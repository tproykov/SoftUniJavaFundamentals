package PF09RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04NetherRealms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split("\\s*,\\s*");

        String regexHealth = "[^0-9+\\-*/.]{1}";
        Pattern patternHealth = Pattern.compile(regexHealth);
        String regexDamage = "[+-]?\\d+(\\.\\d+)?";
        Pattern patternDamage = Pattern.compile(regexDamage);

        for (String demon : demons) {
            int demonHealth = getDemonHealth(demon, patternHealth);
            double demonDamage = getDemonDamage(demon, patternDamage);

            System.out.printf("%s - %d health, %.2f damage\n", demon, demonHealth, demonDamage);
        }
    }

    private static double getDemonDamage(String demon, Pattern patternDamage) {
        double demonDamage = 0;
        Matcher matcherDamage = patternDamage.matcher(demon);
        while (matcherDamage.find()) {
            double damage = Double.parseDouble(matcherDamage.group());
            demonDamage += damage;
        }

        for (int j = 0; j < demon.length(); j++) {
            char character = demon.charAt(j);
            if (character == '*') {
                demonDamage *= 2;
            }
            if (character == '/') {
                demonDamage /= 2;
            }
        }
        return demonDamage;
    }

    private static int getDemonHealth(String demon, Pattern patternHealth) {
        int demonHealth = 0;
        Matcher matcherHealth = patternHealth.matcher(demon);
        while (matcherHealth.find()) {
            char character = matcherHealth.group().charAt(0);
            demonHealth += character;
        }
        return demonHealth;
    }
}