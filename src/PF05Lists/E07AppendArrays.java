package PF05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E07AppendArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split("\\|");

        List<Integer> finalList = new ArrayList<>();
        for (int i = inputArray.length - 1; i >= 0; i--) {

            String array = inputArray[i];
            String[] characters = array.split("\\s+");
            for (String character : characters) {
                if (!character.isEmpty()) {
                    finalList.add(Integer.parseInt(character));
                }
            }
        }
        for (Integer integer : finalList) {
            System.out.print(integer + " ");
        }
    }
}

// Write a program to append several arrays of numbers.
//	Arrays are separated by "|".
//	Values are separated by spaces (" ", one or several).
//	Order the arrays from the last to the first and their values from left to right.