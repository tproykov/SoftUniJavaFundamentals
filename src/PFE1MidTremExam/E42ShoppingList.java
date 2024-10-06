package PFE1MidTremExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E42ShoppingList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command;
        while (!"Go Shopping!".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];
            String item = tokens[1];
            switch (commandType) {
                case "Urgent" -> {
                    if (shoppingList.contains(item)) {
                        continue;
                    }
                    else {
                        shoppingList.addFirst(item);
                    }
                }
                case "Unnecessary" -> {
                    shoppingList.remove(item);
                }
                case "Correct" -> {
                    String newItem = tokens[2];
                    if (shoppingList.contains(item)) {
                        int index = shoppingList.indexOf(item);
                        shoppingList.set(index, newItem);
                    }
                }
                case "Rearrange" -> {
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                }
            }
        }
        System.out.println(String.join(", ", shoppingList));
    }
}