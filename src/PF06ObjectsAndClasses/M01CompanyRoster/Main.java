package PF06ObjectsAndClasses.M01CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee;

            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (input.length == 5) {
                if (input[4].contains("@")) {
                    employee = new Employee(name, salary, position, department, input[4]);
                }
                else {
                    employee = new Employee(name, salary, position, department, Integer.parseInt(input[4]));
                }
            } else {
                employee = new Employee(name, salary, position, department, input[4], Integer.parseInt(input[5]));
            }

            departments.putIfAbsent(department, new Department(department));
            departments.get(department).addEmployee(employee);
        }

        Department highestAverageSalaryDepartment = departments.values().stream()
                .max(Comparator.comparingDouble(Department::getAverageSalary))
                .orElse(null);

        if (highestAverageSalaryDepartment != null) {
            System.out.printf("Highest Average Salary: %s\n", highestAverageSalaryDepartment.getName());
            highestAverageSalaryDepartment.getEmployeesSortedBySalaryDescending().forEach(System.out::println);
        }
    }
}