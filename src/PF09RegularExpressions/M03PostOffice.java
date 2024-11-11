package PF09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M03PostOffice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputParts = scanner.nextLine().split("\\|");

        String capitalLettersString = inputParts[0];
        String startLetterAndLength = inputParts[1];
        String wordsString = inputParts[2];

        String regexCapitalLetters = "([#$%*&])[A-Z]+\\1";
        Pattern patternCapitalLetters = Pattern.compile(regexCapitalLetters);
        Matcher matcherCapitalLetters = patternCapitalLetters.matcher(capitalLettersString);
        String capitalLetters = matcherCapitalLetters.group();
        List<String> capitalLettersList = new ArrayList<>();
        for (int i = 0; i < capitalLetters.length(); i++) {
            capitalLettersList.add(capitalLetters.charAt(i) + "");
        }

        String regexStartLetterAndLength = "\\d{2}:\\d{2}";
        Pattern patternStartLetterAndLength = Pattern.compile(regexStartLetterAndLength);
        Matcher matcherStartLetterAndLength = patternStartLetterAndLength.matcher(capitalLetters);
        List<String> startLetterAndLengthList = new ArrayList<>();
        while (matcherStartLetterAndLength.find()) {
            startLetterAndLengthList.add(matcherStartLetterAndLength.group());
        }
        for (int i = 0; i < capitalLettersList.size(); i++) {

            

        }




    }


}
