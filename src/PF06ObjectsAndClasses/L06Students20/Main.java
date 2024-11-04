package PF06ObjectsAndClasses.L06Students20;

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

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            }
            else{
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }
        }

        String selectHomeTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(selectHomeTown)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}