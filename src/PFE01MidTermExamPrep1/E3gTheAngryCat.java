package PFE01MidTermExamPrep1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E3gTheAngryCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] items = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();

        List<Integer> leftItems = new ArrayList<>();
        List<Integer> rightItems = new ArrayList<>();

        switch (typeOfItems) {
            case "cheap" -> {
                for (int i = 0; i < entryPoint; i++) {
                    if (items[i] < items[entryPoint]) {
                        leftItems.add(items[i]);
                    }
                }
                for (int i = entryPoint + 1; i < items.length; i++) {
                    if (items[i] < items[entryPoint]) {
                        rightItems.add(items[i]);
                    }
                }
            }
            case "expensive" -> {
                for (int i = 0; i < entryPoint; i++) {
                    if (items[i] >= items[entryPoint]) {
                        leftItems.add(items[i]);
                    }
                }
                for (int i = entryPoint + 1; i < items.length; i++) {
                    if (items[i] >= items[entryPoint]) {
                        rightItems.add(items[i]);
                    }
                }
            }

        }

        if (!leftItems.isEmpty()) {
            int sum = 0;
            for (Integer item : leftItems) {
                sum += item;
            }
            System.out.println("Left - " + sum);
        }
        else {
            int sum = 0;
            for (Integer item : rightItems) {
                sum += item;
            }
            System.out.println("Right - " + sum);
        }
    }
}