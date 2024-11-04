package PF06ObjectsAndClasses.E04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] studentParts = scanner.nextLine().split("\\s+");
            String firstName = studentParts[0];
            String lastName = studentParts[1];
            double grade = Double.parseDouble(studentParts[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}