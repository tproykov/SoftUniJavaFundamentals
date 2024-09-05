package PF04Methods;

import java.util.Scanner;

public class L05Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        calculateOrder(product, count);
    }

    private static void calculateOrder(String product, int count) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", count * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", count * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f", count * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", count * 2.00);
                break;
        }
    }
}

// Write a method that calculates the total price of an order and prints it on the console. The method should receive one of the following products: coffee, water, coke, snacks, and a quantity of the product. The prices for a single piece of each product are:
//•	"coffee" – 1.50
//•	"water" – 1.00
//•	"coke" – 1.40
//•	"snacks" – 2.00
//Print the result rounded to the second decimal place.
