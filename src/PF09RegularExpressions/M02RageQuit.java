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

        String regex = "[^0-9]+[0-9]+";
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

        String regexNumbers = "\\d+";
        Pattern patternNumbers = Pattern.compile(regexNumbers);
        Matcher matcherNumbers = patternNumbers.matcher(input);

        List<Integer> numberSequences = new ArrayList<>();
        while (matcherNumbers.find()) {
            numberSequences.add(Integer.parseInt(matcherNumbers.group()));
        }

        StringBuilder rageMessage = new StringBuilder();

        for (int i = 0; i < stringNumberSequences.size(); i++) {
            int repeatCount = numberSequences.get(i);
            if (repeatCount > 0) {
                String sequenceToPrint = stringSequences.get(i).toUpperCase();
                rageMessage.append(sequenceToPrint.repeat(repeatCount));
            }
        }

        // Calculate unique symbols used
        StringBuilder uniqueSymbols = new StringBuilder();
        for (int i = 0; i < rageMessage.length(); i++) {
            String symbol = String.valueOf(rageMessage.charAt(i));
            if (uniqueSymbols.indexOf(symbol) == -1) {
                uniqueSymbols.append(symbol);
            }
        }

        // Print the results
        System.out.println("Unique symbols used: " + uniqueSymbols.length());
        System.out.println(rageMessage);
    }
}