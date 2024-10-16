package PF06ObjectsAndClasses.L06Students20;

import PF06ObjectsAndClasses.L05Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command;
        while (!"end".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

            Student student = new PF06ObjectsAndClasses.L05Students.Student(firstName, lastName, age, homeTown);
            students.add(student);

        }

        String selectHomeTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(selectHomeTown)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

}
