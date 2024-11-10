package PF09RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02SoftUniBarIncome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.[0-9]]*(?<price>[\\d+]+[.]*[\\d]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;
        String input;
        while (!(input = scanner.nextLine()).equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalIncome += price * count;

                System.out.printf("%s: %s - %.2f\n", customer, product, count * price);
            }
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}