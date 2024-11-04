package PFE1MidTermExamPrep;

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

// Input
//You will receive an initial list with groceries separated by an exclamation mark "!".
//After that, you will be receiving 4 types of commands until you receive "Go Shopping!".
//•	"Urgent {item}" - add the item at the start of the list.  If the item already exists, skip this
// command.
//•	"Unnecessary {item}" - remove the item with the given name, only if it exists in the list.
// Otherwise, skip this command.
//•	"Correct {oldItem} {newItem}" - if the item with the given old name exists, change its name with
// the new one. Otherwise, skip this command.
//•	"Rearrange {item}" - if the grocery exists in the list, remove it from its current position and
// add it at the end of the list. Otherwise, skip this command.
//Constraints
//•	There won't be any duplicate items in the initial list.
//Output
//•	Print the list with all the groceries, joined by ", ":
//"{firstGrocery}, {secondGrocery}, … {nthGrocery}"