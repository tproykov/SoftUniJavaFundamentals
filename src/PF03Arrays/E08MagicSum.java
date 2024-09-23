package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
}

// Write a program that prints all unique pairs in an array of integers whose sum is equal to a given
// number.
