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