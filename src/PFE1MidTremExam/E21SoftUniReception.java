package PFE1MidTremExam;

import java.util.Scanner;

public class E21SoftUniReception {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int efficiency1 = Integer.parseInt(scanner.nextLine());
        int efficiency2 = Integer.parseInt(scanner.nextLine());
        int efficiency3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalEfficiency = efficiency1 + efficiency2 + efficiency3;

        int netHours = studentsCount / totalEfficiency;

        if (studentsCount % totalEfficiency != 0) {
            netHours++;
        }
        int breaks = netHours / 3;

        int grossHours = 0;
        if (netHours < 3) {
            grossHours = netHours;
        }
        else {
            if (netHours % 3 != 0) {
                grossHours = netHours + breaks;
            }
            else {
                grossHours = netHours + breaks - 1;
            }
        }
        System.out.println("Time needed: " + grossHours + "h.");
    }
}