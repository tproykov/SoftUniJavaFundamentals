package PF09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M02RageQuit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "[^0-9]+[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> stringNumberSequences = new ArrayList<>();

        while (matcher.find()) {
            stringNumberSequences.add(matcher.group());
        }

        String regexStrings = "[^0-9]+";
        Pattern patternStrings = Pattern.compile(regexStrings);
        Matcher matcherStrings = patternStrings.matcher(input);

        List<String> stringSequences = new ArrayList<>();
        while (matcherStrings.find()) {
            stringSequences.add(matcherStrings.group());
        }

        StringBuilder uniqueSymbols = new StringBuilder();

        for (String stringSequence : stringSequences) {

            for (int i = 0; i < stringSequence.length(); i++) {

                String symbol = stringSequence.charAt(i) + "";
                String symbolUpperCase = symbol.toUpperCase();

                if (uniqueSymbols.indexOf(symbolUpperCase) == -1) {
                    uniqueSymbols.append(symbolUpperCase);
                }
            }
        }

        String regexNumbers = "\\d+";
        Pattern patternNumbers = Pattern.compile(regexNumbers);
        Matcher matcherNumbers = patternNumbers.matcher(input);

        List<Integer> numberSequences = new ArrayList<>();
        while (matcherNumbers.find()) {
            numberSequences.add(Integer.parseInt(matcherNumbers.group()));
        }

        System.out.println("Unique symbols used: " + uniqueSymbols.length());

        for (int i = 0; i < stringNumberSequences.size(); i++) {

            String sequenceToPrint = stringSequences.get(i).toUpperCase();
            System.out.print(sequenceToPrint.repeat(numberSequences.get(i)));
        }
    }
}