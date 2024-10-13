package PFE1MidTremExam;

import java.util.*;
import java.util.stream.Collectors;

public class E62TreasureHunt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command;

        while (!"Yohoho!".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];
            switch (commandType) {
                case "Loot" -> {
                    for (int i = 1; i < tokens.length; i++) {
                        String lootItem = tokens[i];
                        if (!treasureChest.contains(lootItem)) {
                            treasureChest.addFirst(lootItem);
                        }
                    }
                }
                case "Drop" -> {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String itemToDrop = treasureChest.get(index);
                        treasureChest.remove(index);
                        treasureChest.add(itemToDrop);
                    }
                }
                case "Steal" -> {
                    int count = Integer.parseInt(tokens[1]);
                    if (treasureChest.size() < count) {
                        count = treasureChest.size();
                    }
                    List<String> stolenItems = new ArrayList<>();
                    int chestSize = treasureChest.size();
                    for (int i = chestSize - 1; i >= chestSize - count; i--) {
                        stolenItems.add(treasureChest.get(i));
                        treasureChest.remove(i);
                    }
                    Collections.reverse(stolenItems);
                    System.out.println(String.join(", ", stolenItems));
                }
            }
        }
        if (!treasureChest.isEmpty()) {
            int treasureGain = 0;
            for (String string : treasureChest) {
                treasureGain += string.length();
            }
            double averageTreasureGain = 1.0 * treasureGain / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", averageTreasureGain);
        }
        else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

// Create a program that manages the state of the treasure chest along the way. On the first line,
// you will receive the initial loot of the treasure chest, which is a string of items separated by
// a "|".
//"{loot1}|{loot2}|{loot3} … {lootn}"
//The following lines represent commands until "Yohoho!" which ends the treasure hunt:
//•	"Loot {item1} {item2}…{itemn}":
//o	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
//o	If an item is already contained, don't insert it.
//•	"Drop {index}":
//o	Remove the loot at the given position and add it at the end of the treasure chest.
//o	If the index is invalid, skip the command.
//•	"Steal {count}":
//o	Someone steals the last count of loot items. If there are fewer items than the given count, remove
// as many as there are.
//o	Print the stolen items separated by ", ":
//"{item1}, {item2}, {item3} … {itemn}"
//In the end, output the average treasure gain, which is the sum of all treasure items' length divided
// by the count of all items inside the chest formatted to the second decimal point:
//"Average treasure gain: {averageGain} pirate credits."
//If the chest is empty, print the following message:
//"Failed treasure hunt."
//Input
//•	On the 1st line, you are going to receive the initial treasure chest (loot separated by "|").
//•	On the following lines, until "Yohoho!", you will be receiving commands.
//Output
//•	Print the output in the format described above.
//Constraints
//•	The loot items will be strings containing any ASCII code.
//•	The indexes will be integers in the range [-200…200]
//•	The count will be an integer in the range [1….100]
