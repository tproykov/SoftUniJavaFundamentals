package PF07AssociativeArrays;

import java.util.*;

public class E05Courses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("end")) {

            String[] tokens = input.split(" : ");

            String courseName = tokens[0];
            String studentName = tokens[1];

                courses.putIfAbsent(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.println("-- " + student);
            }
        }
    }
}