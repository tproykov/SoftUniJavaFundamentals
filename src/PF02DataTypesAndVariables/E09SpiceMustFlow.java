package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E09SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        int totalYield = 0;

        while (true) {

            if (startingYield < 100) {
                totalYield -= 26;
                break;
            }
            else {
                totalYield += (startingYield - 26);
                countDays++;
                startingYield -= 10;
            }
        }
        if (totalYield < 0) {
            totalYield = 0;
        }
        System.out.println(countDays);
        System.out.println(totalYield);
    }
}