package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L06EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        if (numbers1.length == numbers2.length) {
            for (int i = 0; i < numbers1.length; i++) {

                if (numbers1[i] == numbers2[i]) {
                    sum += numbers1[i];
                }
                else{
                    System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                    return;
                }
            }
        }
        else {
            System.out.print("Arrays are not identical. ");
            if (numbers1.length > numbers2.length) {
                System.out.println("Found difference at " + numbers2.length + " index.");
            }
            else {
                System.out.println("Found difference at " + numbers1.length + " index.");
            }
            return;
        }
        System.out.println("Arrays are identical. Sum: " + sum);
    }
}

// Read two arrays and print on the console whether they are identical or not. Arrays are identical if
// their elements are equal. If the arrays are identical, find the sum of the first one and print on the
// console the following message: "Arrays are identical. Sum: {sum}", otherwise find the first index where
// the arrays differ and print on the console following message: "Arrays are not identical. Found
// difference at {index} index."
