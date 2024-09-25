package PF04Methods;

import java.util.Scanner;

public class E05AddAndSubstract {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(sum(n1, n2), n3));
    }
    private static int sum(int n1, int n2) {
        return n1 + n2;
    }
    private static int subtract(int n1, int n2) {
        return n1 - n2;
    }
}

// You will receive 3 integers. Write a method sum to get the sum of the first two integers and
// subtract the method that subtracts the third integer from the result from the sum method.
