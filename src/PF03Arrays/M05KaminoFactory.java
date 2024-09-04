package PF03Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class M05KaminoFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());    // length of the DNA sequence

        String command = scanner.nextLine();

        int[] bestDna = new int[dnaLength];    // similar to maxValue
        int bestLength = 0;
        int bestSum = 0;
        int bestStartIndex = dnaLength;
        int sampleIndex = 0;                   // computes the number of calculation
        int bestSequenceIndex = 0;
        while (!command.equals("Clone them!")) {

            sampleIndex++;

            // read the DNA input and transform it into an array of integers
            int[] dnaCode = Arrays.stream(command.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();

            // find the longest subsequence of 1s
            int length = 0;
            int maxLength = 0;
            int startIndex = 0;
            int sum = 0;
            for (int i = 0; i < dnaCode.length; i++) {
                if (dnaCode[i] == 1) {
                    length++;
                    sum++;
                    if (length > maxLength) {
                        maxLength = length;
                        startIndex = i - length + 1;
                    }
                } else {
                    length = 0;
                }
            }
            // Update the best DNA sequence based on the criteria
            if (maxLength > bestLength
                    || (maxLength == bestLength && startIndex < bestStartIndex)
                    || (maxLength == bestLength && startIndex == bestStartIndex && sum > bestSum)) {
                bestDna = dnaCode;
                bestLength = maxLength;
                bestSum = sum;
                bestStartIndex = startIndex;
                bestSequenceIndex = sampleIndex;
            }
            command = scanner.nextLine();
        }
        System.out.println("Best DNA sample " + bestSequenceIndex
                + " with sum: " + bestSum + ".");
        for (int digit : bestDna) {
            System.out.print(digit + " ");
        }
    }
}
// The clone factory in Kamino got another order to clone troops. But this time, you are tasked to find
// the best DNA sequence to use in the production.
//You will receive the DNA length, and until you receive the command "Clone them!" you will be receiving
// DNA sequences of ones and zeroes, split by "!" (one or several).
//You should select the sequence with the longest subsequence of ones. If there are several sequences
// with the same length of a subsequence of ones, print the one with the leftmost starting index, if
// there are several sequences with the same length and starting index, select the sequence with the
// greater sum of its elements.
//After you receive the last command "Clone them!", you should print the collected information in the
// following format:
//"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
//"{DNA sequence, joined by space}"
//Input / Constraints
//•	The first line holds the length of the sequences – integer in the range [1…100].
//•	On the next lines, until you receive "Clone them!" you will be receiving sequences (at least one)
// of ones and zeroes, split by "!" (one or several).
// Output
//The output should be printed on the console and consists of two lines in the following format:
//"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
//"{DNA sequence, joined by space}"
