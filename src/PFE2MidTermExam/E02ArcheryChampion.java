package PFE2MidTermExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command;
        int totalPoints = 0;
        while (!(command = scanner.nextLine()).equals("Game over")) {

            String[] tokens = command.split("\\s+");

            String commandType = tokens[0];

            switch (commandType) {
                case "Shoot" -> {
                    String[] tokens2 = tokens[1].split("@");
                    String direction = tokens2[0];
                    int startIndex = Integer.parseInt(tokens2[1]);
                    int length = Integer.parseInt(tokens2[2]);
                    if (startIndex >= 0 && startIndex < targets.size()) {

                        int targetIndex = 0;
                        switch (direction) {
                            case "Left" -> {
                                targetIndex = (startIndex - length) % targets.size();
                                if (targetIndex < 0) {
                                    targetIndex += targets.size();
                                }
                            }
                            case "Right" -> targetIndex = (startIndex + length) % targets.size();
                        }

                        if (targets.get(targetIndex) >= 5) {
                            totalPoints += 5;
                            targets.set(targetIndex, targets.get(targetIndex) - 5);
                        }
                        else {
                            totalPoints += targets.get(targetIndex);
                            targets.set(targetIndex, 0);
                        }
                    }
                }
                case "Reverse" -> Collections.reverse(targets);
            }
        }
        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.print(targets.get(i) + " - ");
        }
        System.out.println(targets.getLast());
        System.out.println("John finished the archery tournament with " + totalPoints + " points!");
    }
}