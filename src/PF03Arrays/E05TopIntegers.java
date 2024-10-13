package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {

            int number = array[i];

            boolean isTopInteger = true;
            for (int j = i + 1; j < array.length; j++) {
                if (number <= array[j]) {
                    isTopInteger = false;
                }
            }
            if (isTopInteger) {
                System.out.print(number + " ");
            }
        }
    }
}

// Write a program to find all the top integers in an array. A top integer is an integer that is bigger
// than all the elements to its right.