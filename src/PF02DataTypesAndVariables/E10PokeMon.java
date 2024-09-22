package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E10PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialPokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int currentPokePower = initialPokePower;
        int countPokes = 0;
        while (true) {

            if (currentPokePower == initialPokePower * 0.5 && exhaustionFactor != 0) {
                currentPokePower = currentPokePower / exhaustionFactor;
            }

            if (currentPokePower < distance) {
                break;
            }
            else {
                currentPokePower -= distance;
                countPokes++;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(countPokes);
    }
}