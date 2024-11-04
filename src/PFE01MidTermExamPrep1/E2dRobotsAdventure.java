package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E2dRobotsAdventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split("\\|")).map(Integer::parseInt).collect(Collectors.toList());

        String command;
        int totalItems = 0;
        while (!"Adventure over".equals(command = scanner.nextLine())) {

            String[] commandParts = command.split("\\s+");
            String commandType = commandParts[0];

            switch (commandType) {

                case "Step" -> {
                    String[] directionParts = commandParts[1].split("\\$");
                    String direction = directionParts[0];
                    int startIndex = Integer.parseInt(directionParts[1]);
                    int steps = (Integer.parseInt(directionParts[2]) % items.size());

                    int step;
                    if (startIndex >= 0 && startIndex < items.size()) {

                        switch (direction) {
                            case "Backward" -> {

                                if (startIndex >= steps) {
                                    step = startIndex - steps;
                                    totalItems += items.get(step);
                                    items.set(step, 0);
                                }
                                else {
                                    step = items.size() - (steps - startIndex);
                                    totalItems += items.get(step);
                                    items.set(step, 0);
                                }
                            }
                            case "Forward" -> {

                                if (startIndex + steps <= items.size()) {
                                    step = startIndex + steps;
                                    totalItems += items.get(step);
                                    items.set(step, 0);
                                }
                                else {
                                    step = startIndex + steps - items.size();
                                    totalItems += items.get(step);
                                    items.set(step, 0);
                                }
                            }
                        }
                    }
                }
                case "Double" -> {
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < items.size()) {
                        items.set(index, items.get(index) * 2);
                    }
                }
                case "Switch" -> Collections.reverse(items);
            }
        }
        System.out.println(items.stream().map(Object::toString).collect(Collectors.joining(" - ")));
        System.out.println("Robo finished the adventure with " + totalItems + " items!");
    }
}