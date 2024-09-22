package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E04SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {

            char character = scanner.nextLine().charAt(0);
            sum += character;
        }
        System.out.println("The sum equals: " + sum);
    }
}