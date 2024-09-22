package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E07WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int filled = 0;
        for (int i = 1; i <= n; i++) {

            int water = Integer.parseInt(scanner.nextLine());

            if (water > capacity) {
                System.out.println("Insufficient capacity!");
            }
            else {
                filled += water;
                capacity -= water;
            }
        }
        System.out.println(filled);
    }
}