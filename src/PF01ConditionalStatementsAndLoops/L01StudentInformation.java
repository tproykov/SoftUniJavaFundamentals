package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L01StudentInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int studentAge = Integer.parseInt(scanner.nextLine());
        double studentGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, studentAge,
                studentGrade);
    }
}

// Write a program that:
//•	Reads 3 lines of input – student name, age and average grade
//•	Print all the info about the student in the following format:
//"Name: {student name}, Age: {student age}, Grade: {student grade}".