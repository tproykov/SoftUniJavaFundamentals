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