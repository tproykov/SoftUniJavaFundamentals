package PF02DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class L03ExactSumOfRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            BigDecimal number = new BigDecimal(input);
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
// Write a program to enter n numbers and calculate and print their exact sum (without rounding).
