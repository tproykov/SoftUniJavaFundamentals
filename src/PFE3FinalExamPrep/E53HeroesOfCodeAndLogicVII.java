package PFE3FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E53HeroesOfCodeAndLogicVII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroesHitPoints = new LinkedHashMap<>();
        Map<String, Integer> heroesManaPoints = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] heroParts = scanner.nextLine().split(" ");

            String heroName = heroParts[0];
            int hitPoints = Integer.parseInt(heroParts[1]);
            int manaPoints = Integer.parseInt(heroParts[2]);

            heroesHitPoints.put(heroName, hitPoints);
            heroesManaPoints.put(heroName, manaPoints);
        }

        String command;
        while (!"End".equals(command = scanner.nextLine())) {

            String[] commandParts = command.split(" - ");

            String commandName = commandParts[0];
            String heroName = commandParts[1];

            switch (commandName) {

                case "CastSpell" -> {
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];

                    if (heroesManaPoints.containsKey(heroName)) {
                        if (heroesManaPoints.get(heroName) >= mpNeeded) {

                            heroesManaPoints.put(heroName, heroesManaPoints.get(heroName) - mpNeeded);
                            System.out.println(heroName + " has successfully cast " + spellName + " and now has "
                                    + heroesManaPoints.get(heroName) + " MP!");
                        }
                        else {
                            System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                        }
                    }
                }

                case "TakeDamage" -> {
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    heroesHitPoints.put(heroName, heroesHitPoints.get(heroName) - damage);

                    if (heroesHitPoints.get(heroName) <= 0) {
                        System.out.println(heroName + " has been killed by " + attacker + "!");
                        heroesHitPoints.remove(heroName);
                        heroesManaPoints.remove(heroName);
                    }
                    else {
                        System.out.println(heroName + " was hit for " + damage + " HP by " + attacker
                                + " and now has " + heroesHitPoints.get(heroName) + " HP left!");
                    }
                }

                case "Recharge" -> {
                    int amount = Integer.parseInt(commandParts[2]);

                    heroesManaPoints.put(heroName, heroesManaPoints.get(heroName) + amount);

                    if (heroesManaPoints.get(heroName) > 200) {
                        int recharged = amount - (heroesManaPoints.get(heroName) - 200);
                        heroesManaPoints.put(heroName, 200);
                        System.out.println(heroName + " recharged for " + recharged + " MP!");
                    }
                    else {
                        System.out.println(heroName + " recharged for " + amount + " MP!");
                    }
                }

                case "Heal" -> {
                    int amount = Integer.parseInt(commandParts[2]);

                    heroesHitPoints.put(heroName, heroesHitPoints.get(heroName) + amount);

                    if (heroesHitPoints.get(heroName) > 100) {
                        int healed = amount - (heroesHitPoints.get(heroName) - 100);
                        heroesHitPoints.put(heroName, 100);
                        System.out.println(heroName + " healed for " + healed + " HP!");
                    }
                    else {
                        System.out.println(heroName + " healed for " + amount + " HP!");
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> hero : heroesHitPoints.entrySet()) {
            System.out.println(hero.getKey());
            System.out.println("  HP: " + hero.getValue());
            System.out.println("  MP: " + heroesManaPoints.get(hero.getKey()));
        }
    }
}