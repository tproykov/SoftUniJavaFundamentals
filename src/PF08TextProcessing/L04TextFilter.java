package PF08TextProcessing;

import java.util.Scanner;

public class L04TextFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String word : bannedWords) {

            String substitute = "*".repeat(word.length());

            while(text.contains(word)) {

                text = text.replace(word, substitute);
            }
        }
        System.out.println(text);
    }
}