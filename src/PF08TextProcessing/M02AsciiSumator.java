package PF08TextProcessing;

import java.util.Scanner;

public class M02AsciiSumator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.next().charAt(0);
        char character2 = scanner.next().charAt(0);
        String string = scanner.nextLine();

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == character1) {
                index1 = i;
            }
            if (string.charAt(i) == character2) {
                index2 = i;
            }
        }

        int sum = 0;
        if (index1 < index2) {

            



        }


    }

}
