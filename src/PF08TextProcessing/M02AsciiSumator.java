package PF08TextProcessing;

import java.util.Scanner;

public class M02AsciiSumator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.next().charAt(0);
        char character2 = scanner.next().charAt(0);
        scanner.nextLine();
        String string = scanner.nextLine();

        int sum = 0;

        if (character1 < character2) {

            for (int i = 0; i < string.length(); i++) {

                char character = string.charAt(i);

                if (character > character1 && character < character2) {

                    sum += character;
                }
            }
        }
        else {

            for (int i = 0; i < string.length(); i++) {

                char character = string.charAt(i);

                if (character > character2 && character < character1) {

                    sum += character;
                }
            }
        }
        System.out.println(sum);
    }
}