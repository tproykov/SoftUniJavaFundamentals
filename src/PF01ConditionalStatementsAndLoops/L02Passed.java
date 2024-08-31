package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L02Passed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00) {

            System.out.println("Passed!");
        }
    }
}

// Write a program that:
//•	Read a floating-point number, which represents a grade
//•	If the grade is equal or more than 3.00, print "Passed!"
