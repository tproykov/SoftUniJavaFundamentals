package PFE3FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E22AdAstra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([\\|#])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        while (matcher.find()) {
            totalCalories += Integer.parseInt(matcher.group("calories"));
        }

        int daysWithFood = totalCalories / 2000;
        System.out.println("You have food to last you for: " + daysWithFood + " days!");

        matcher.reset(input);

        while (matcher.find()) {
            System.out.println("Item: " + matcher.group("itemName")
                    + ", Best before: " + matcher.group("expirationDate")
                    + ", Nutrition: " + matcher.group("calories"));
        }
    }
}