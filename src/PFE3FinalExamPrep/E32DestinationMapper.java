package PFE3FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E32DestinationMapper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=\\/])(?<location>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> locations = new ArrayList<>();

        while (matcher.find()) {
            locations.add(matcher.group("location"));
        }

        int travelPoints = 0;
        for (String location : locations) {
            travelPoints += location.length();
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", locations));
        System.out.println("Travel Points: " + travelPoints);
    }
}