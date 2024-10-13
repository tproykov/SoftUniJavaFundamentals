package PFE1MidTremExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E13MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command;
        int numberOfMoves = 0;
        boolean gameWon = false;
        while (!"end".equals(command = scanner.nextLine())) {

            numberOfMoves++;

            String[] tokens = command.split(" ");
            int index1 = Integer.parseInt(tokens[0]);
            int index2 = Integer.parseInt(tokens[1]);

            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 >= sequence.size()
                    || index2 >= sequence.size()) {

                int addIndex = sequence.size() / 2;
                String elementToAdd = "-" + numberOfMoves + "a";
                sequence.add(addIndex, elementToAdd);
                sequence.add(addIndex, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else if (sequence.get(index1).equals(sequence.get(index2))) {
                String matchingElement = sequence.get(index1);
                if (index1 < index2) {
                    sequence.remove(index1);
                    sequence.remove(index2 - 1);
                }
                else {
                    sequence.remove(index1);
                    sequence.remove(index2);
                }
                System.out.println("Congrats! You have found matching elements - " + matchingElement + "!");
            }
            else {
                System.out.println("Try again!");
            }

            if (sequence.isEmpty()) {
                gameWon = true;
                System.out.println("You have won in " + numberOfMoves + " turns!");
                break;
            }
        }
        if (!gameWon) {
            System.out.println("Sorry you lose :(");
            for (String string : sequence) {
                System.out.print(string + " ");
            }
        }
    }
}