package PFE1MidTremExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E53Inventory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command;
        while (!"Craft!".equals(command = scanner.nextLine())) {

            String[] commandParts = command.split(" - ");
            String commandType = commandParts[0];
            String item = commandParts[1];
            switch (commandType) {
                case "Collect" -> {
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                }
                case "Drop" -> {
                    inventory.remove(item);
                }
                case "Combine Items" -> {
                    String[] itemParts = item.split(":");
                    String oldItem = itemParts[0];
                    String newItem = itemParts[1];
                    if (inventory.contains(oldItem)) {
                        int index = inventory.indexOf(oldItem);
                        inventory.add(index + 1, newItem);
                    }
                }
                case "Renew" -> {
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                }
            }
        }
        System.out.println(String.join(", ", inventory));
    }
}

// Input / Constraints
//You will receive a journal with some collecting items, separated with a comma and a space (", ").
// After that, until receiving "Craft!" you will be receiving different commands split by " - ":
//•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists,
// you should skip this line.
//•	"Drop - {item}" - you should remove the item from your inventory if it exists.
//•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists. If so, add the
// new item after the old one. Otherwise, ignore the command.
//•	"Renew – {item}" – if the given item exists, you should change its position and put it last in
// your inventory.
//Output
//After receiving "Craft!" print the items in your inventory, separated by ", ".