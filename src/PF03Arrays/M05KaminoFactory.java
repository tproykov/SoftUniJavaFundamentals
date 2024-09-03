package PF03Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class M05KaminoFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        List<Integer> longest = new ArrayList<>();
        List<Integer> last = new ArrayList<>();

        while (!command.equals("Clone them!")) {

            // read the sequence from the console and turn it into a digits array
            int[] dnaSequence = Arrays.stream(command.split("!")).mapToInt(Integer::parseInt)
                    .toArray();

            // initialise the array of longest sequence of ones ending at index i
            int[] len = new int[dnaSequence.length];
            if (dnaSequence[0] == 0) {
                len[0] = 0;
            } else {
                len[0] = 1;
            }
            for (int i = 1; i < dnaSequence.length; i++) {
                if (dnaSequence[i] == 1) {
                    len[i] = len[i - 1] + 1;
                } else {
                    len[i] = 0;
                }
            }
            int maxLength = 0;
            int lastIndex = 0;
            for (int i = 1; i < len.length; i++) {

                if (len[i] > maxLength) {
                    maxLength = len[i];
                    lastIndex = i;
                }
            }
            longest.add(maxLength);
            last.add(lastIndex);
            command = scanner.nextLine();
        }

        int maxSequenceLength = 0;
        for (Integer i : longest) {
            if (i > maxSequenceLength) {
                maxSequenceLength = i;
            }
        }
        for (Integer i : longest) {
            if (i == maxSequenceLength) {
                int minIndex = Integer.MAX_VALUE;
                for (Integer integer : last) {
                    if (integer < minIndex) {
                        minIndex = integer;
                    }
                    
                }
            }

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
