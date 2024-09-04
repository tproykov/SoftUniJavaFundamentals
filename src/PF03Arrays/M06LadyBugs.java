package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class M06LadyBugs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        int[] ladybugIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // populate the ladybug field
        int[] ladybugField = new int[fieldSize];
        for (int i : ladybugField) {
            i = 0;                          // initiate the field array with zeroes
        }
        for (int index : ladybugIndexes) {
            if (index >= 0 && index < ladybugField.length) {
                ladybugField[index] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            // break down the ladybug command into parts
            String[] commandParts = command.split(" ");
            int ladybugIndex = Integer.parseInt(commandParts[0]);
            String ladybugDirection = commandParts[1];
            int flyLength = Integer.parseInt(commandParts[2]);

            if (ladybugIndex < 0 || ladybugIndex >= fieldSize) {
                continue;
            } else if (ladybugField[ladybugIndex] == 0) {
                continue;
            } else {
                ladybugField[ladybugIndex] = 0;
                switch (ladybugDirection) {
                    case "left":
                        if (ladybugIndex - flyLength >= 0) {
                            if (ladybugField[ladybugIndex - flyLength] == 0) {
                                ladybugField[ladybugIndex - flyLength] = 1;
                            }
                        }
                        else {
                            int currentIndex = ladybugIndex - flyLength;
                            while (currentIndex >= 0) {
                                if (ladybugField[currentIndex] == 1) {
                                    currentIndex -= flyLength;
                                }
                            }
                            if (currentIndex >= 0) {
                                ladybugField[currentIndex] = 1;
                            }
                        }
                        break;
                    case "right":
                        if (ladybugIndex + flyLength < fieldSize) {
                            if   (ladybugField[ladybugIndex + flyLength] == 0) {
                                ladybugField[ladybugIndex + flyLength] = 1;
                            }
                        }
                        else {
                            int currentIndex = ladybugIndex + flyLength;
                            while (currentIndex < fieldSize) {
                                if (ladybugField[currentIndex] == 1) {
                                    currentIndex += flyLength;
                                }
                            }
                            if (currentIndex < fieldSize) {
                                ladybugField[currentIndex] = 1;
                            }
                        }
                        break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(ladybugField));
    }
}

// You are given a field size and the indexes of ladybugs inside the field. After that, on every new line
// until the "end" command is given, a ladybug changes its position to its left or right by a given fly
// length.
//A command to a ladybug looks like this: "0 right 1". This means that the little insect placed on index 0
// should fly one index to its right. If the ladybug lands on a fellow ladybug, it continues to fly in
// the same direction by the same fly length. If the ladybug flies out of the field, it is gone.
//For example, imagine you are given a field with size 3 and ladybugs on indexes 0 and 1. If the ladybug
// on index 0 needs to fly to its right by the length of 1 (0 right 1) it will attempt to land on index 1,
// but as there is another ladybug there, it will continue further to the right by an additional length
// of 1, landing on index 2. After that, if the same ladybug needs to fly to its right by the length of 1
// (2 right 1), it will land somewhere outside of the field, so it flies away:
//
//If you are given a ladybug index that does not have a ladybug there, nothing happens. If you are given
// a ladybug index that is outside the field, nothing happens.
//Your job is to create the program, simulating the ladybugs flying around doing nothing. In the end, print
// all cells in the field separated by blank spaces. For each cell that has a ladybug on it print '1' and
// for each empty cell print '0'. For the example above, the output should be '0 1 0'.
//Input
//•	On the first line, you will receive an integer - the size of the field.
//•	On the second line, you will receive the initial indexes of all ladybugs separated by a blank space.
// The given indexes may or may not be inside the field range.
//•	On the next lines, until you get the "end" command you will receive commands in the format: "{ladybug
// index} {direction} {fly length}".
//Output
//•	Print the all cells within the field in format: "{cell} {cell} … {cell}"
//o	If a cell has a ladybug in it, print '1'.
//o	If a cell is empty, print '0' .
//Constraints
//•	The size of the field and number of commands will be in the range [0 … 1000].
//•	The ladybug indexes and fly length will be in the range [-2,147,483,647 … 2,147,483,647].
