package PF06ObjectsAndClasses.M01CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private final String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double getAverageSalary() {
        double salary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary / employees.size();
    }

    public List<Employee> getEmployeesSortedBySalaryDescending() {
        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        return sortedEmployees;
    }
}