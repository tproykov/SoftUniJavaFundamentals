package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1bCookingMasterClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        double totalEggs = students * priceEgg * 10;
        double extraAprons = Math.ceil(1.0 * students / 5);
        double totalApron = priceApron * (students + extraAprons);
        int freePackFlower = students / 5;
        double totalFlour = priceFlour * (students - freePackFlower);

        double totalCost = totalEggs + totalApron + totalFlour;

        if (totalCost <= budget) System.out.printf("Items purchased for %.2f$.", totalCost);
        else System.out.printf("%.2f$ more needed.", totalCost - budget);
    }
}