package PFE1MidTremExam;

import java.util.*;
import java.util.stream.Collectors;

public class E23Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer integer : sequence) {
            sum += integer;
        }

        double average = 1.0 * sum / sequence.size();

        List<Integer> aboveAverage = new ArrayList<>();
        for (Integer integer : sequence) {
            if (integer > average) {
                aboveAverage.add(integer);
            }
        }

        Collections.sort(aboveAverage);
        Collections.reverse(aboveAverage);

        if (aboveAverage.isEmpty()) {
            System.out.println("No");
        }
        else if (aboveAverage.size() < 5) {
            for (Integer integer : aboveAverage) {
                System.out.print(integer + " ");
            }
        }
        else {
            for (int i = 0; i < 5; i++) {
                System.out.print(aboveAverage.get(i) + " ");
            }
        }
    }
}

// Write a program to read a sequence of integers and find and print the top 5 numbers greater than
// the average value in the sequence, sorted in descending order.
//Input
//•	Read from the console a single line holding space-separated integers.
//Output
//•	Print the above-described numbers on a single line, space-separated.
//•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
//•	Print "No" if no numbers hold the above property.
//Constraints
//•	All input numbers are integers in the range [-1 000 000 … 1 000 000].
//•	The count of numbers is in the range [1…10 000].