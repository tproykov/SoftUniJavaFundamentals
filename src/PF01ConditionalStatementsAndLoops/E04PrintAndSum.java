package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E04PrintAndSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}

// Write a program to display numbers from given start to given end and their sum.
// All the numbers will be integers. On the first line, you will receive the start
// number, on the second the end number.
