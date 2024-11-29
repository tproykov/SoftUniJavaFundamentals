package PFE3FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E52FancyBarcodes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            boolean isValid = false;
            while (matcher.find()) {
                isValid = true;
                String barcode = matcher.group(1);

                StringBuilder productGroup = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {

                    char character = barcode.charAt(j);

                    if (Character.isDigit(character)) {
                        productGroup.append(character);
                    }
                }

                if (productGroup.toString().isEmpty()) {
                    productGroup.append("00");
                }
                System.out.println("Product group: " + productGroup);
            }
            if (!isValid) {
                System.out.println("Invalid Barcode");
            }
        }
    }
}