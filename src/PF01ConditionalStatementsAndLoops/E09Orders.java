package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E09Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 0; i < countOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double price = days * capsuleCount * pricePerCapsule;
            sum += price;

            System.out.printf("The price for the coffee is: $%.2f\n", price);
        }
        System.out.printf("Total: $%.2f", sum);
    }
}

// •	On the first line, you will receive integer N – the count of orders the shop
// will receive.
//•	For each order, you will receive the following information:
//o	Price per capsule - floating-point number in the range [0.00…5000.00].
//o	Days – integer in the range [1…31].
//o	Capsules count - integer in the range [0…7000000].
//The input will be in the described format, there is no need to check it explicitly.
//Output
//The output should consist of N + 1 line. For each order, you must print a single
// line in the following format:
//•	"The price for the coffee is: ${price}"
//On the last line, you need to print the total price in the following format:
//•	 "Total: ${totalPrice}"
//The price must be formatted to 2 decimal places.
