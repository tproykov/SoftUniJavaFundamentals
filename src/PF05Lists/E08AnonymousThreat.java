package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08AnonymousThreat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        // String command = scanner.nextLine();

        // while (!command.equals("3:1")) {
        String command;
        while (!(command = scanner.nextLine()).equals("3:1")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "merge" -> {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > strings.size() - 1) {
                        endIndex = strings.size() - 1;
                    }
                    if (startIndex <= strings.size() - 1 && endIndex >= 0 && endIndex <= strings.size() - 1) {
                        String mergedString = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            String current = strings.get(i);
                            mergedString += current;
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            strings.remove(startIndex);
                        }
                        strings.add(startIndex, mergedString);
                    }
                }
                case "divide" -> {
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);

                    String stringToDivide = strings.get(index);
                    int partitionLength = stringToDivide.length() / partitions;
                    strings.remove(index);

                    int startIndex = 0;
                    for (int i = 1; i < partitions; i++) {
                        String partition = stringToDivide.substring(startIndex, startIndex
                                + partitionLength);
                        strings.add(index, partition);
                        index++;
                        startIndex += partitionLength;
                    }
                    String lastPartition = stringToDivide.substring(startIndex, stringToDivide.length());
                    strings.add(index, lastPartition);
                }

            }
            // command = scanner.nextLine();
        }
        System.out.println(String.join(" ", strings));
    }
}

// Anonymous has created a cyber-hyper virus that steals data from the CIA. As the lead security developer
// in the CIA, you have been tasked to analyze the software of the virus and observe its actions on the
// data. The virus is known for its innovative and unbelievably clever technique of merging and dividing
// data into partitions.
//You will receive a single input line containing STRINGS separated by spaces.
//The strings may contain any ASCII character except whitespace.
//You will then begin receiving commands in one of the following formats:
//•	merge {startIndex} {endIndex}
//•	divide {index} {partitions}
//Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex.
// In other words, you should concatenate them.
//Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
//If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array
// and merge it.
//Every time you receive the divide command, you must DIVIDE the element at the given index into several
// small substrings with equal length. The count of the substrings should be equal to the given partitions.
//Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
//If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST
// with EQUAL LENGTHS, and make the LAST one – the LONGEST.
//Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
//The input ends when you receive the command "3:1". At that point, you must print the resulting elements,
// joined by a space.
//Input
//•	The first input line will contain the array of data.
//•	On the next several input lines, you will receive commands in the format specified above.
//•	The input ends when you receive the command "3:1".
//Output
//•	As output, you must print a single line containing the array elements, joined by a space.
//Constrains
//•	The strings in the array may contain any ASCII character except whitespace.
//•	The startIndex and the endIndex will be in the range [-1000, 1000].
//•	The endIndex will ALWAYS be GREATER than the startIndex.
//•	The index in the divide command will ALWAYS be INSIDE the array.
//•	The partitions will be in the range [0, 100].
//•	Allowed working time/memory: 100ms / 16MB.