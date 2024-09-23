package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E07CondenseArrayToNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                array[j] = array[j] + array[j + 1];
            }
        }
        System.out.println(array[0]);
    }
}

// Write a program to read an array of integers and condense them by summing adjacent couples of elements
// until a single integer is obtained. For example, if we have 3 elements {2, 10, 3}, we sum the first two
// and the second two elements and obtain {2+10, 10+3} = {12, 13}, then we sum again all adjacent elements
// and obtain {12+13} = {25}.