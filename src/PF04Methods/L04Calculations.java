package PF04Methods;

import java.util.Scanner;

public class L04Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(n1, n2);
                break;
            case "multiply":
                multiply(n1, n2);
                break;
            case "subtract":
                subtract(n1, n2);
                break;
            case "divide":
                divide(n1, n2);
                break;
        }
    }
    private static void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
    }
    private static void multiply(int n1, int n2) {
        int product = n1 * n2;
        System.out.println(product);
    }
    private static void subtract(int n1, int n2) {
        int subtract = n1 - n2;
        System.out.println(subtract);
    }
    private static void divide(int n1, int n2) {
        int divide = n1 / n2;
        System.out.println(divide);
    }
}

// Write a program that receives a string on the first line ("add", "multiply",
// "subtract", "divide") and on the next two lines receives two numbers. Create
// four methods (for each calculation) and invoke the right one depending on
// the command. The method should also print the result (it needs to be void).
