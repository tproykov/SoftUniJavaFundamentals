package PF08TextProcessing;

import java.util.Scanner;

public class E02CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String string1 = input[0];
        String string2 = input[1];

        int sum = 0;

        if (string1.length() >= string2.length()) {
            for (int i = 0; i < string2.length(); i++) {
                sum += (string1.charAt(i) * (string2.charAt(i)));
            }
            for (int i = string2.length(); i < string1.length(); i++) {
                sum += (string1.charAt(i));
            }
        }
        else {
            for (int i = 0; i < string1.length(); i++) {
                sum += (string2.charAt(i) * (string1.charAt(i)));
            }
            for (int i = string1.length(); i < string2.length(); i++) {
                sum += (string2.charAt(i));
            }
        }
        System.out.println(sum);
    }
}