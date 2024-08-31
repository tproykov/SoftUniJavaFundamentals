package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L01StudentInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String student_name = scanner.nextLine();
        int student_age = Integer.parseInt(scanner.nextLine());
        double student_grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", student_name, student_age,
                student_grade);
    }
}

// Write a program that:
//•	Reads 3 lines of input – student name, age and average grade
//•	Print all the info about the student in the following format:
//"Name: {student name}, Age: {student age}, Grade: {student grade}".