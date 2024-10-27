package PFE01MidTermExamPrep1;

import java.util.Scanner;

public class E1aBurgerBus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCities = Integer.parseInt(scanner.nextLine());


        double totalProfit = 0;
        for (int city = 1; city <= countCities; city++) {

            String cityName = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if (city % 3 == 0 && city % 5 != 0) ownerExpenses *= 1.5;
            if (city % 5 == 0) ownerIncome *= 0.9;

            double cityIncome = ownerIncome - ownerExpenses;
            totalProfit += cityIncome;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityName, cityIncome);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.\n", totalProfit);
    }
}