package PFE1MidTremExam;

import java.util.Scanner;

public class E41GuineaPig {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double guineaWeightKg = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodKg * 1000;
        double hayInGrams = hayKg * 1000;
        double coverInGrams = coverKg * 1000;
        double guineaWeightInGrams = guineaWeightKg * 1000;

        for (int i = 1; i <= 30; i++) {

            foodInGrams -= 300;
            if (i % 2 == 0) {
                hayInGrams -= 0.05 * foodInGrams;
            }
            if (i % 3 == 0) {
                coverInGrams -= (1.0 / 3.0 * guineaWeightInGrams);
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
    }
}