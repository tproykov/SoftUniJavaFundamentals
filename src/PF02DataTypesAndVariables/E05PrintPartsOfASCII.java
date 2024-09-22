package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E05PrintPartsOfASCII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= lastIndex; i++) {

            char character = (char) i;

            System.out.print(character + " ");
        }
    }
}