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