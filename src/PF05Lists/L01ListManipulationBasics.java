package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split("\\s+");

            String commandType = tokens[0];
            switch (commandType) {
                case "Add":
                    int numberAdd = Integer.parseInt(tokens[1]);
                    list.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(tokens[1]);
                    list.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(tokens[1]);
                    list.remove(index);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    list.add(indexToInsert, numberInsert);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

// Write a program that reads a list of integers. Then until you receive "end",
// you will be given different commands:
//•	Add {number} – add a number to the end of the list
//•	Remove {number} – remove a number from the list
//•	RemoveAt {index} – remove a number at a given index
//•	Insert {number} {index} – insert a number at a given index
//Note: All the indices will be valid!
//When you receive the "end" command, print the final state of the list
// (separated by spaces).
