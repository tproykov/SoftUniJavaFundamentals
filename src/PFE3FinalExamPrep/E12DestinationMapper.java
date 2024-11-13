package PFE3FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E12DestinationMapper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> destinations = new ArrayList<>();

        String regex = "([=/])[A-Z][A-Za-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        int travelPoints = 0;
        for (String destination : destinations) {
            travelPoints += destination.length();
        }

        System.out.println("Destinations: ");





    }


}
