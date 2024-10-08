package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L05MonthPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int monthNumber = Integer.parseInt(scanner.nextLine());

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error!");
        }
    }
}

// Write a program that:
//•	Reads an integer from the console
//•	Print the corresponding month:
//o	1 -> "January"
//o	2 -> "February"
//o	3 -> "March"
//o	4 -> "April"
//o	5 -> "May"
//o	6 -> "June"
//o	7 -> "July"
//o	8 -> "August"
//o	9 -> "September"
//o	10 -> "October"
//o	11 -> "November"
//o	12 -> "December"
//•	Print "Error!", if the number is more than 12 or less than 1
