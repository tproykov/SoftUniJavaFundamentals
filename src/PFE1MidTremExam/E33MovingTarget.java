package PFE1MidTremExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E33MovingTarget {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command;
        while (!"End".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");

            String commandType = tokens[0];
            int index = Integer.parseInt(tokens[1]);

            switch (commandType) {
                case "Shoot" -> {
                    if (index <0 || index >= targets.size() ) {
                        continue;
                    }
                    int power = Integer.parseInt(tokens[2]);
                    int targetValue = targets.get(index);
                    targetValue -= power;
                    targets.set(index, targetValue);
                    if (targetValue <= 0) {
                        targets.remove(index);
                    }
                }
                case "Add" -> {
                    if (index <0 || index >= targets.size() ) {
                        System.out.println("Invalid placement!");
                        continue;
                    }
                    int value = Integer.parseInt(tokens[2]);
                    targets.add(index, value);
                }
                case "Strike" -> {
                    int radius = Integer.parseInt(tokens[2]);
                    boolean strikeMissed = false;
                    for (int i = index - radius; i <= index + radius; i++) {
                        if (i < 0 || i >= targets.size() ) {
                            System.out.println("Strike missed!");
                            strikeMissed = true;
                            break;
                        }
                    }
                    if (!strikeMissed) {
                        for (int i = index + radius; i >= index - radius; i--) {
                            targets.remove(i);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < targets.size(); i++) {
            System.out.print(targets.get(i));
            if (i < targets.size() - 1) {
                System.out.print("|");
            }
        }
    }
}