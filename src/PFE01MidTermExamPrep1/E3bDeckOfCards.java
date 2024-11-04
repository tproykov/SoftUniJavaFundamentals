package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E3bDeckOfCards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split(", ");

            switch (tokens[0]) {
                case "Add" -> {
                    String cardToAdd = tokens[1];
                    if (!cards.contains(cardToAdd)) {
                        cards.add(cardToAdd);
                        System.out.println("Card successfully added");
                    }
                    else {
                        System.out.println("Card is already in the deck");
                    }
                }
                case "Remove" -> {
                    String cardToRemove = tokens[1];
                    if (cards.contains(cardToRemove)) {
                        cards.remove(cardToRemove);
                        System.out.println("Card successfully removed");
                    }
                    else {
                        System.out.println("Card not found");
                    }
                }
                case "Remove At" -> {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < cards.size()) {
                        cards.remove(index);
                        System.out.println("Card successfully removed");
                    }
                    else {
                        System.out.println("Index out of range");
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(tokens[1]);
                    String cardToInsert = tokens[2];
                    if (index < 0 || index >= cards.size()) {
                        System.out.println("Index out of range");
                    }
                    else {
                        if (cards.contains(cardToInsert)) {
                            System.out.println("Card is already added");
                        }
                        else {
                            cards.add(index, cardToInsert);
                            System.out.println("Card successfully added");
                        }
                    }
                }
            }
        }
        System.out.println(String.join(", ", cards));
    }
}