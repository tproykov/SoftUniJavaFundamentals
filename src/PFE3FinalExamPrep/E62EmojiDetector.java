package PFE3FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E62EmojiDetector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        long coolThreshold = 1;
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                coolThreshold *= digit;
            }
        }

        String regex = "([:*]{2})([A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int emojiCount = 0;
        List<String> coolEmojis = new ArrayList<>();
        List<String> coolEmojisToPrint = new ArrayList<>();
        while (matcher.find()) {
            emojiCount++;

            String emoji = matcher.group(2);
            String emojiToPrint = matcher.group();

            long emojiCoolness = 0;
            for (int i = 0; i < emoji.length(); i++) {

                char currentChar = emoji.charAt(i);
                emojiCoolness += currentChar;
            }

            if (emojiCoolness >= coolThreshold) {
                coolEmojis.add(emoji);
                coolEmojisToPrint.add(emojiToPrint);
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        if (!coolEmojis.isEmpty()) {
            System.out.println(emojiCount + "emojis found in the text. The cool ones are:");
        }
        for (String emoji : coolEmojisToPrint) {
            System.out.println(emoji);
        }
    }
}