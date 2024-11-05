package PF08TextProcessing;

import java.util.Scanner;

public class M04MorseCodeTranslator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+\\|\\s+");

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String[] letters = words[i].split(" ");

            for (int j = 0; j < letters.length; j++) {

                String letter = letters[j];

                switch (letter) {
                    case ".-" -> message.append("A");
                    case "-..." -> message.append("B");
                    case "-.-." -> message.append("C");
                    case "-.." -> message.append("D");
                    case "." -> message.append("E");
                    case "..-." -> message.append("F");
                    case "--." -> message.append("G");
                    case "...." -> message.append("H");
                    case ".." -> message.append("I");
                    case ".---" -> message.append("J");
                    case "-.-" -> message.append("K");
                    case ".-.." -> message.append("L");
                    case "--" -> message.append("M");
                    case "-." -> message.append("N");
                    case "---" -> message.append("O");
                    case ".--." -> message.append("P");
                    case "--.-" -> message.append("Q");
                    case ".-." -> message.append("R");
                    case "..." -> message.append("S");
                    case "-" -> message.append("T");
                    case "..-" -> message.append("U");
                    case "...-" -> message.append("V");
                    case ".--" -> message.append("W");
                    case "-..-" -> message.append("X");
                    case "-.--" -> message.append("Y");
                    case "--.." -> message.append("Z");
                }
            }
            message.append(" ");
        }
        System.out.println(message);
    }
}