package PF07AssociativeArrays;

import java.util.*;

public class E08CompanyUsers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("End")) {

            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employeeId = tokens[1];

            if (!companyEmployees.containsKey(company)) {
                companyEmployees.put(company, new ArrayList<>());
                companyEmployees.get(company).add(employeeId);
            } else {
                if (!companyEmployees.get(company).contains(employeeId)) {
                    companyEmployees.get(company).add(employeeId);
                }
            }
        }
        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {

            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.println("-- " + employee);
            }
        }
    }
}