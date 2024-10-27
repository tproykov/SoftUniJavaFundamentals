package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E2aCoffeeLover {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> coffeeNames = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();
            String[] commandArgs = command.split(" ");

            switch (commandArgs[0]) {
                case "Include" -> {
                    String coffeeName = commandArgs[1];
                    coffeeNames.add(coffeeName);
                }
                case "Remove" -> {
                    String direction = commandArgs[1];
                    int countOfCoffees = Integer.parseInt(commandArgs[2]);

                    if (coffeeNames.size() >= countOfCoffees) {
                        switch (direction) {
                            case "first" -> {
                                for (int j = 1; j <= countOfCoffees; j++) {
                                    coffeeNames.removeFirst();
                                }

                            }
                            case "last" -> {
                                for (int k = 1; k <= countOfCoffees; k++) {
                                    coffeeNames.removeLast();
                                }
                            }
                        }
                    }
                }
                case "Prefer" -> {
                    int coffeeIndex1 = Integer.parseInt(commandArgs[1]);
                    int coffeeIndex2 = Integer.parseInt(commandArgs[2]);

                    if (coffeeIndex1 >= 0 && coffeeIndex2 >= 0 && coffeeIndex1 <= coffeeNames.size() - 1
                            && coffeeIndex2 <= coffeeNames.size() - 1) {
                        String temp = coffeeNames.get(coffeeIndex1);
                        coffeeNames.set(coffeeIndex1, coffeeNames.get(coffeeIndex2));
                        coffeeNames.set(coffeeIndex2, temp);
                    }
                }
                case "Reverse" -> Collections.reverse(coffeeNames);
            }
        }
        System.out.println("Coffees: ");
        System.out.println(String.join(" ", coffeeNames));
    }
}