package PFE2MidTermExam;

import java.util.*;
import java.util.stream.Collectors;

public class E03MagicCards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> originalHandOfCards = Arrays.stream(scanner.nextLine().split(":"))
                .collect(Collectors.toList());

        List<String> newHandOfCards = new ArrayList<>();

        String command;
        while (!(command = scanner.nextLine()).equals("Ready")) {

            String[] commandParts = command.split(" ");

            String commandType = commandParts[0];
            String cardName = commandParts[1];

            switch (commandType) {
                case "Add" -> {
                    if (originalHandOfCards.contains(cardName)) {
                        newHandOfCards.add(cardName);
                    }
                    else {
                        System.out.println("Card not found.");
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(commandParts[2]);
                    if (originalHandOfCards.contains(cardName) && index >= 0 && index < newHandOfCards.size()) {
                        newHandOfCards.add(index, cardName);
                    }
                    else {
                        System.out.println("Error!");
                    }
                }
                case "Remove" -> {
                    if (newHandOfCards.contains(cardName)) {
                        newHandOfCards.remove(cardName);
                    }
                    else {
                        System.out.println("Card not found.");
                    }
                }
                case "Swap" -> {
                    String cardName2 = commandParts[2];
                    int index1 = newHandOfCards.indexOf(cardName);
                    int index2 = newHandOfCards.indexOf(cardName2);
                    newHandOfCards.set(index1, cardName2);
                    newHandOfCards.set(index2, cardName);
                }
                case "Shuffle" -> Collections.reverse(newHandOfCards);
            }
        }
        System.out.println(String.join(" ", newHandOfCards));
    }
}