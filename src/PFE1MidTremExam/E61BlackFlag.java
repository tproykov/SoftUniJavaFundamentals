package PFE1MidTremExam;

import java.util.Scanner;

public class E61BlackFlag {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        for (int i = 1; i <= daysOfPlunder; i++) {

            totalPlunder += dailyPlunder;

            if (i % 3 == 0) {
                totalPlunder += 0.5 * dailyPlunder;
            }
            if (i % 5 == 0) {
                totalPlunder *= 0.70;
            }
        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        }
        else {
            double percentOfTarget = totalPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfTarget);
        }
    }
}

// Create a program that checks if target plunder is reached. First, you will receive how many days
// the pirating lasts. Then you will receive how much the pirates plunder for a day. Last you will
// receive the expected plunder at the end.
//Calculate how much plunder the pirates manage to gather. Each day they gather the plunder. Keep in
// mind that they attack more ships every third day and add additional plunder to their total gain,
// which is 50% of the daily plunder. Every fifth day the pirates encounter a warship, and after the
// battle, they lose 30% of their total plunder.
//If the gained plunder is more or equal to the target, print the following:
//"Ahoy! {totalPlunder} plunder gained."
//If the gained plunder is less than the target. Calculate the percentage left and print the following:
//"Collected only {percentage}% of the plunder."
//Both numbers should be formatted to the 2nd decimal place.
//Input
//•	On the 1st line, you will receive the days of the plunder – an integer number in the range
// [0…100000].
//•	On the 2nd line, you will receive the daily plunder – an integer number in the range [0…50].
//•	On the 3rd line, you will receive the expected plunder – a real number in the range [0.0…10000.0].
//Output
//•	 In the end, print whether the plunder was successful or not, following the format described above.
