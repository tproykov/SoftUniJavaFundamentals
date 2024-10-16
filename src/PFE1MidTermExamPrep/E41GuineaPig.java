package PFE1MidTermExamPrep;

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

// On the first three lines, you will receive the quantity of food, hay, and cover, which Merry buys
// for a month (30 days). On the fourth line, you will receive the guinea pig's weight.
//Every day Puppy eats 300 gr of food. Every second day Merry first feeds the pet, then gives it a
// certain amount of hay equal to 5% of the rest of the food. On every third day, Merry puts Puppy
// cover with a quantity of 1/3 of its weight.
//Calculate whether the quantity of food, hay, and cover, will be enough for a month.
//If Merry runs out of food, hay, or cover, stop the program!
//Input
//•	On the first line – quantity food in kilograms - a floating-point number in the range
// [0.0 – 10000.0].
//•	On the second line – quantity hay in kilograms - a floating-point number in the range
// [0.0 – 10000.0].
//•	On the third line – quantity cover in kilograms - a floating-point number in the range
// [0.0 – 10000.0].
//•	On the fourth line – guinea's weight in kilograms - a floating-point number in the range
// [0.0 – 10000.0].
//Output
//•	If the food, the hay, and the cover are enough, print:
//o	"Everything is fine! Puppy is happy! Food: {excessFood}, Hay: {excessHay}, Cover: {excessCover}."
//•	If one of the things is not enough, print:
//o	"Merry must go to the pet store!"
//The output values must be formatted to the second decimal place!