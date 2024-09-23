package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqualSum = false;
        for (int i = 0; i < array.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                isEqualSum = true;
                System.out.print(i + " ");
            }
        }
        if (!isEqualSum) {
            System.out.println("no");
        }
    }
}

// Write a program that determines if an element exists in the array such that the sum of the elements
// on its left is equal to the sum of the elements on its right. If there are no elements to the
// left/right, their sum is considered to be 0. Print the index that satisfies the required condition
// or "no" if there is no such index.