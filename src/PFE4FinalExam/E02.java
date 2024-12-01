package PFE4FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            String regex = "(.+)>([0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[^<>]{3})<\\1";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            boolean isValid = false;
            StringBuilder password = new StringBuilder();
            while (matcher.find()) {
                isValid = true;

                String[] rawPasswordParts = matcher.group(2).split("\\|");

                for (String rawPasswordPart : rawPasswordParts) {

                    for (int j = 0; j < rawPasswordPart.length(); j++) {

                        char character = rawPasswordPart.charAt(j);
                        password.append(character);
                    }
                }
            }

            if (!isValid) {
                System.out.println("Try another password!");
            }
            else {
                System.out.println("Password: " + password);
            }
        }
    }
}