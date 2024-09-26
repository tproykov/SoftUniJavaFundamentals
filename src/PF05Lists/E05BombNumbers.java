package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        String[] commands = command.split(" ");
        int bombNumber = Integer.parseInt(commands[0]);
        int bombPower = Integer.parseInt(commands[1]);

        while (numbers.contains(bombNumber)) {

            int startIndex = numbers.indexOf(bombNumber) - bombPower;
            if (startIndex < 0) {
                startIndex = 0;
            }
            int endIndex = numbers.indexOf(bombNumber) + bombPower;
            if (endIndex >= numbers.size()) {
                endIndex = numbers.size() - 1;
            }
            for (int i = endIndex; i >= startIndex; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

// Write a program that reads a sequence of numbers and a special bomb number with a certain power.
// Your task is to detonate every occurrence of the special bomb number and according to its power -
// his neighbors from left and right. Detonations are performed from left to right, and all detonated
// numbers disappear. Finally, print the sum of the remaining elements in the sequence.
