package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E2cNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command;
        while (!"Finish".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            switch (commandType) {
                case "Add" -> numbers.add(value);
                case "Remove" -> numbers.remove((Integer) value);
                case "Replace" -> {
                    int replacement = Integer.parseInt(tokens[2]);
                    if (numbers.contains(value)) numbers.set(numbers.indexOf(value), replacement);
                }
                case "Collapse" -> numbers.removeIf(number -> number < value);
            }
        }
        System.out.println(numbers.stream().map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}