package PF05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02GaussTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size() / 2; i++) {
                result.add(list.get(i) + list.get(list.size() - 1 - i));
            }
        }
        else {
            for (int i = 0; i < list.size() / 2; i++) {
                result.add(list.get(i) + list.get(list.size() - 1 - i));
            }
            result.add(list.get(list.size() /2));
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}

// Write a program that sum all numbers in a list in the following order:
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n,
// last - n.