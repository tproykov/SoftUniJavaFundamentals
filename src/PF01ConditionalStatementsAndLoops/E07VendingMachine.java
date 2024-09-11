package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E07VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command1 = scanner.nextLine();

        double sum = 0.0;
        while (!command1.equals("Start")) {

            double coin = Double.parseDouble(command1);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
            command1 = scanner.nextLine();
        }

        String command2 = scanner.nextLine();

        while (!command2.equals("End")) {

            boolean isValid = true;
            double productPrice = 0;
            switch (command2) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = false;
                    break;
            }
            if (isValid) {
                if (productPrice > sum) {
                    System.out.println("Sorry, not enough money");
                }
                else {
                    sum -= productPrice;
                    System.out.println("Purchased " + command2);
                }
            }
            command2 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}

// Your task is to calculate the total purchase price from a vending machine.
// Until you receive "Start" you will be given different coins that are being inserted
// into the machine. You have to sum them to have the total money inserted. There is
// a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2
// coins. If someone tries to insert some other coins, you have to display "Cannot
// accept {money}", where the value is formatted to the second digit after the decimal
// point and not add it to the total money. On the next few lines until you receive
// "End" you will be given products to purchase. Your machine has, however, only "Nuts",
// "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
// respectively. If the person tries to purchase a not existing product, print
// "Invalid product". Be careful that the person may try to purchase a product for
// which he doesn't have money. In that case, print "Sorry, not enough money". If
// the person purchases a product successfully print "Purchased {product name}".
// After the "End" command, print the money that is left formatted to the second
// decimal point in the format "Change: {money left}".
