package PFE1MidTermExamPrep;

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

// Write a program that recreates the Memory game.
//On the first line, you will receive a sequence of elements. Each element in the sequence will have
// a twin. Until the player receives "end" from the console, you will receive strings with two
// integers separated by a space, representing the indexes of elements in the sequence.
//If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the
// equence, you should add two matching elements at the middle of the sequence in the following format:
//"-{number of moves until now}a"
//Then print this message on the console:
//"Invalid input! Adding additional elements to the board"
//Input
//•	On the first line, you will receive a sequence of elements.
//•	On the following lines, you will receive integers until the command "end".
//Output
//•	Every time the player hit two matching elements, you should remove them from the sequence and
// print on the console the following message:
//"Congrats! You have found matching elements - {element}!"
//•	If the player hit two different elements, you should print on the console the following message:
//"Try again!"
//•	If the player hit all matching elements before he receives "end" from the console, you should
// print on the console the following message:
//"You have won in {number of moves until now} turns!"
//•	If the player receives "end" before he hits all matching elements, you should print on the
// console the following message:
//"Sorry you lose :(
//{the current sequence's state}"
//Constraints
//•	All elements in the sequence will always have a matching element.