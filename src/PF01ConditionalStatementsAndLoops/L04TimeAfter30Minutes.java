package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L04TimeAfter30Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentHours = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = currentHours * 60 + currentMinutes;
        int totalMinutesAfter30Minutes = totalMinutes + 30;

        int hoursAfter30Minutes = totalMinutesAfter30Minutes / 60;
        int minutesAfter30Minutes = totalMinutesAfter30Minutes % 60;

        if (hoursAfter30Minutes >= 24) {
            hoursAfter30Minutes = hoursAfter30Minutes - 24;
        }
        System.out.printf("%d:%02d", hoursAfter30Minutes, minutesAfter30Minutes);
    }
}

// Write a program that:
//•	Reads two integer numbers: current hours and current minutes
//•	Calculate time after 30 minutes
//•	Print on the console calculated time in the format "hh:mm"
//Note: The hours have one or two digits, and the minutes always have two digits (with leading zero).
//Constraints
//•	The current hours will be between 0 and 23.
//•	The current minutes will be between 0 and 59.
