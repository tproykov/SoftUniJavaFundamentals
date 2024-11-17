package PFE3FinalExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class E41SecretChat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder message = new StringBuilder(input);

        String command;
        while (!(command = scanner.nextLine()).equals("Reveal")) {

            String[] tokens = command.split(":\\|:");

            switch (tokens[0]) {

                case "InsertSpace"-> {
                    int index = Integer.parseInt(tokens[1]);
                    message.insert(index, ' ');
                }

                case "Reverse"-> {
                    String substring = tokens[1];
                    int index = message.indexOf(substring);
                    if (index != -1) {
                        StringBuilder sb = new StringBuilder(substring);
                        sb.reverse();
                        message.delete(index, message.length());
                        message.append(sb);
                    }
                    else {
                        System.out.println("error");
                        continue;
                    }
                }

                case "ChangeAll"-> {
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    int index = message.indexOf(substring);
                    while (index != -1) {
                        message.replace(index, index + substring.length(), replacement);
                        index = message.indexOf(substring);
                    }
                }
            }
            System.out.println(message);
        }
        System.out.println("You have a new text message: " + message);
    }
}