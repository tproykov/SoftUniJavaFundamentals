package PFE1MidTremExam;

import java.util.Scanner;

public class E11ComputerStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double netPrice = 0;
        boolean isSpecial = false;
        while (true) {
            if (command.equals("special")) {
                isSpecial = true;
                break;
            }
            else if (command.equals("regular")) {
                break;
            }
            else {
                double itemPrice = Double.parseDouble(command);
                if (itemPrice <= 0) {
                    System.out.println("Invalid price!");
                    command = scanner.nextLine();
                    continue;
                }
                netPrice += itemPrice;
            }
            command = scanner.nextLine();
        }
        if (netPrice == 0) {
            System.out.println("Invalid order!");
        }
        else {
            double tax = netPrice * 0.20;
            double totalPrice = netPrice + tax;
            if (isSpecial) {
                totalPrice *= 0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", netPrice);
            System.out.printf("Taxes: %.2f$\n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$\n", totalPrice);
        }
    }
}

// Write a program that prints you a receipt for your new computer. You will receive the parts'
// prices (without tax) until you receive what type of customer this is - special or regular. Once
// you receive the type of customer you should print the receipt.
//The taxes are 20% of each part's price you receive.
//If the customer is special, he has a 10% discount on the total price with taxes.
//If a given price is not a positive number, you should print "Invalid price!" on the console and
// continue with the next price.
//If the total price is equal to zero, you should print "Invalid order!" on the console.
//Input
//•	You will receive numbers representing prices (without tax) until the command "special" or
// "regular":
//Output
//•	The receipt should be in the following format:
//"Congratulations you've just bought a new computer!
//Price without taxes: {total price without taxes}$
//Taxes: {total amount of taxes}$
//-----------
//Total price: {total price with taxes}$"
//Note: All prices should be displayed to the second digit after the decimal point! The discount
// is applied only on the total price. Discount is only applicable to the final price!