package PF09RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M03PostOffice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputParts = scanner.nextLine().split("\\|");

        String capitalLettersString = inputParts[0];
        String startLetterAndLength = inputParts[1];
        String wordsString = inputParts[2];

        String regexCapitalLetters = "([#$%*&])([A-Z]+)\\1";
        Pattern patternCapitalLetters = Pattern.compile(regexCapitalLetters);
        Matcher matcherCapitalLetters = patternCapitalLetters.matcher(capitalLettersString);
        
        String capitalLetters = "";
        while (matcherCapitalLetters.find()) {
            capitalLetters = matcherCapitalLetters.group(2);
        }

        List<String> capitalLettersList = new ArrayList<>();
        for (int i = 0; i < capitalLetters.length(); i++) {
            capitalLettersList.add(capitalLetters.charAt(i) + "");
        }

        String regexStartLetterAndLength = "\\d{2}:\\d{2}";
        Pattern patternStartLetterAndLength = Pattern.compile(regexStartLetterAndLength);
        Matcher matcherStartLetterAndLength = patternStartLetterAndLength.matcher(startLetterAndLength);
        List<String> startLetterAndLengthList = new ArrayList<>();
        while (matcherStartLetterAndLength.find()) {
            startLetterAndLengthList.add(matcherStartLetterAndLength.group());
        }

        Map<Character, Integer> capitalsStartAndLength = new LinkedHashMap<>();
        for (String s : capitalLettersList) {
            for (String string : startLetterAndLengthList) {

                char character = s.charAt(0);
                String[] startingLetters = string.split(":");
                int startingLetter = Integer.parseInt(startingLetters[0]);
                int wordLength = Integer.parseInt(startingLetters[1]);

                if (character == startingLetter) {
                    capitalsStartAndLength.put(character, wordLength);
                }
            }
        }

        String[] words = wordsString.split("\\s+");
        for (String word : words) {

            char startingLetter = word.charAt(0);

            for (Character capitalLetter : capitalsStartAndLength.keySet()) {

                if (capitalLetter == startingLetter && (word.length() - 1) == capitalsStartAndLength.get(capitalLetter)) {

                    System.out.println(word);
                }
            }
        }
    }
}