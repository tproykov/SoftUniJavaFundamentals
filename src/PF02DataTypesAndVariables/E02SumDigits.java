package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E02SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}

// You will be given a single integer. Your task is to find the sum of its digits.