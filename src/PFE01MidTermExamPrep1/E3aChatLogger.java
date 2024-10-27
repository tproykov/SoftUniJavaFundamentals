package PFE01MidTermExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E3aChatLogger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {

            String[] tokens = command.split("\\s+");

            String commandType = tokens[0];
            String message = tokens[1];

            switch (commandType) {
                case "Chat" -> chat.add(message);
                case "Delete" -> chat.remove(message);
                case "Edit" -> {
                    if (chat.contains(message)) {
                        String editedVersion = tokens[2];
                        chat.set(chat.indexOf(message), editedVersion);
                    }
                }
                case "Pin" -> {
                    if (chat.contains(message)) {
                        chat.remove(message);
                        chat.add(message);
                    }
                }
                case "Spam" -> {
                    for (int i = 1; i < tokens.length; i++) {
                        chat.add(tokens[i]);
                    }
                }
            }
        }
        for (String string : chat) {
            System.out.println(string);
        }
    }
}