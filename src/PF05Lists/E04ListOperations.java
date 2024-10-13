package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];
            int number = 0;
            int index = 0;
            int count = 0;
            switch (commandType) {
                case "Add" -> {
                    number = Integer.parseInt(tokens[1]);
                    list.add(number);
                }
                case "Insert" -> {
                    number = Integer.parseInt(tokens[1]);
                    index = Integer.parseInt(tokens[2]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        command = scanner.nextLine();
                        continue;
                    }
                    list.add(index, number);
                }
                case "Remove" -> {
                    index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        command = scanner.nextLine();
                        continue;
                    }
                    list.remove(index);
                }
                case "Shift" -> {
                    count = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            number = list.getFirst();
                            list.add(number);
                            list.removeFirst();
                        }
                    }
                    else if (tokens[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            number = list.getLast();
                            list.addFirst(number);
                            list.removeLast();
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

// You will be given numbers (a list of integers) on the first input line. Until you receive "End"
// you will be given operations you must apply on the list. The possible commands are:
//•	Add {number} - add number at the end
//•	Insert {number} {index} - insert number at given index
//•	Remove {index} - remove that index
//•	Shift left {count} - first number becomes last 'count' times
//•	Shift right {count} - last number becomes first 'count' times
//Note: The index given may be outside the array's bounds. In that case, print "Invalid index".
