package PFE3FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E42MirrorWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> words = new ArrayList<>();
        boolean foundWordPairs = false;
        int countWordPairs = 0;
        while (matcher.find()) {

            foundWordPairs = true;
            countWordPairs++;

            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            String reversedWordTwo = new StringBuilder(wordTwo).reverse().toString();

            if (wordOne.equals(reversedWordTwo)) {
                words.add(wordOne);
            }
        }

        if (!foundWordPairs) {
            System.out.println("No word pairs found!");
        }
        else {
            System.out.println(countWordPairs + " word pairs found!");
        }

        if (!words.isEmpty()) {
            System.out.println("The mirror words are:");

            for (int i = 0; i < words.size() - 1; i++) {

                String wordOne = words.get(i);
                String wordTwo = new StringBuilder(wordOne).reverse().toString();

                System.out.print(wordOne + " <=> " + wordTwo);
                System.out.print(", ");
            }

            String wordOne = words.getLast();
            String wordTwo = new StringBuilder(wordOne).reverse().toString();
            System.out.print(wordOne + " <=> " + wordTwo);
        }
        else {
            System.out.println("No mirror words!");
        }
    }
}