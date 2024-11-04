package PF07AssociativeArrays;

import java.util.*;

public class E06StudentAcademy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            studentGrades.putIfAbsent(studentName, new ArrayList<>());
            studentGrades.get(studentName).add(studentGrade);
        }
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {

            double sum = 0;
            for (double grade : entry.getValue()) {
                sum += grade;
            }
            double averageGrade = sum / entry.getValue().size();

            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), averageGrade);
            }
        }
    }
}