package PF04Methods;

import java.util.Scanner;

public class L07RepeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(string, count));
    }
    private static String repeatString(String string, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(string);
        }
        return result.toString();
    }
}

// Write a method that receives a string and a repeat count n (integer).
// The method should return a new string (the old one repeated n times).