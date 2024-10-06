package PFE1MidTremExam;

import java.util.Scanner;

public class E31CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command;
        int battlesWon = 0;
        while (!"End of battle".equals(command = scanner.nextLine())) {

            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                battlesWon++;
                if (battlesWon % 3 == 0) {
                    initialEnergy += battlesWon;
                }
                initialEnergy -= distance;
            }
            else {
                System.out.println("Not enough energy! Game ends with " + battlesWon
                        + " won battles and " + initialEnergy + " energy");
                return;
            }
        }
        System.out.println("Won battles: " + battlesWon + ". Energy left: " + initialEnergy);
    }
}