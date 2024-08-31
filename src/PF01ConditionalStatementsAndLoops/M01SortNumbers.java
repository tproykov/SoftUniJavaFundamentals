package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class M01SortNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int middle = 0;
        int min = 0;

        if (n1 > n2 && n1 > n3) {
            max = n1;
            if (n2 > n3) {
                middle = n2;
                min = n3;
            }
            else {
                middle = n3;
                min = n2;
            }
        }
        else if (n2 > n1 && n2 > n3) {
            max = n2;
            if (n1 > n3) {
                middle = n1;
                min = n3;
            }
            else {
                middle = n3;
                min = n1;
            }
        }
        else {
            max = n3;
            if (n1 > n2) {
                middle = n1;
                min = n2;
            }
            else {
                middle = n2;
                min = n1;
            }
        }
        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);
    }
}

// Read three real numbers and sort them in descending order.
// Print each number on a new line.
