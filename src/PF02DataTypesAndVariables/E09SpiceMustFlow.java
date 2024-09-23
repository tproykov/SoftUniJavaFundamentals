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

// Spice is Love, Spice is Life. And most importantly, Spice must flow. It must be extracted from the
// scorching sands of Arrakis, under the constant threat of giant sandworms. The Duke has tasked you with
// creating management software to make the work as efficient as possible.
//Write a program that calculates the total amount of spice extracted from a source.
//The source has a starting yield, which indicates how much spice can be mined on the first day. After it
// has been mined for a day, the yield drops by 10, meaning on the second day, it'll produce 10 less spice
// than on the first, on the third day 10 less than on the second, and so on (see examples).
//A source is considered profitable only while its yield is at least 100 – when less than 100 spices are
// expected in a day, abandon the source.
//The mining crew consumes 26 spices every day at the end of their shift and an additional 26 after the
// mine has been exhausted. Note that the workers cannot consume more spice than there is in storage.
//When the operation is complete, print on the console on two separate lines how many days the mine has
// operated and the total amount of spice extracted.
//Input
//You will receive a number representing the starting yield of the source.
//Output
//Print on the console on two separate lines how many days the mine has operated and the total amount of
// spice extracted.
// Constraints
//•	The starting yield will be a positive integer within the range [0 … 2 147 483 647].