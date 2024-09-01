package PF03Arrays;

import java.util.Scanner;

public class L01DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (n < 1 || n > 7) {
            System.out.println("Invalid day!");
        }
        else {
            System.out.println(weekDays[n-1]);
        }
    }
}

// Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings.
