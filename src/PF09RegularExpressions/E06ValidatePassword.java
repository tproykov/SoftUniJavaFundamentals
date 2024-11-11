package PF09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06ValidatePassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+";
        Pattern pattern = Pattern.compile(regex);

        List<String> validPasswords = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String password = matcher.group();

                String group = "";
                for (int j = 0; j < password.length(); j++) {
                    if (Character.isDigit(password.charAt(j))) {
                        group += password.charAt(j);
                    }
                }

                if (group.isEmpty()) {
                    System.out.println("Group: default");
                }
                else {
                    System.out.println("Group: " + group);
                }
            }
            else {
                System.out.println("Invalid pass!");
            }

            // matcher.reset();
        }
    }
}