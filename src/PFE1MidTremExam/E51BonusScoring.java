package PFE1MidTremExam;

import java.util.Scanner;

public class E51BonusScoring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendance = 0;
        for (int i = 1; i <= studentsCount; i++) {

            int attendance = Integer.parseInt(scanner.nextLine());
            double bonus = 1.0 * attendance / lecturesCount * (5 + additionalBonus);

            if (bonus > maxBonus) {
                maxBonus = bonus;
                maxAttendance = attendance;
            }
        }
        double finalBonus = Math.ceil(maxBonus);
        System.out.printf("Max Bonus: %.0f.\n", finalBonus);
        System.out.println("The student has attended " + maxAttendance + " lectures.");
    }
}