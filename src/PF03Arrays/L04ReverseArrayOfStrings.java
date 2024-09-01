package PF03Arrays;

import java.util.Scanner;

public class L04ReverseArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = input.length - 1; i >= 0; i--) {

            System.out.print(input[i] + " ");
        }
    }
}

// Write a program to read an array of strings, reverse it and print its elements. The input consists of
// a sequence of space-separated strings. Print the output on a single line (space separated).
// •	Read the array of strings.
//•	Exchange the first element (at index 0) with the last element (at index n-1).
//•	Exchange the second element (at index 1) with the element before the last (at index n-2).
//•	Continue the same way until the middle of the array is reached.
