package PF06ObjectsAndClasses.M01CompanyRoster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email = input.length > 4 ? input[4] : "n/a";
            int age = input.length > 5 ? Integer.parseInt(input[5]) : -1;

            Employee employee = new Employee(name, salary, position, department, email, age);



        }
    }
}