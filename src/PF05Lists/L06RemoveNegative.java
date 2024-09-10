package PF05Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L06RemoveNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println("empty");
        }
        else {
            Collections.reverse(list);
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }
    }
}

// Read a list of integers, remove all negative numbers from it and print
// the remaining elements in reversed order. In case of no elements left
// in the list, print "empty".
