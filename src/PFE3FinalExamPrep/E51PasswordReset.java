package PFE3FinalExamPrep;

import java.util.Scanner;

public class E51PasswordReset {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command;

        while (!(command = scanner.nextLine()).equals("Done")) {

            String[] tokens = command.split("\\s+");

            String commandName = tokens[0];

            switch (commandName) {

                case "TakeOdd" -> {
                    StringBuilder password = new StringBuilder();

                    for (int i = 0; i < input.length(); i++) {

                        if (i % 2 != 0) {
                            password.append(input.charAt(i));
                        }
                    }

                    input = password.toString();
                    System.out.println(input);
                }

                case "Cut" -> {
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String substring = input.substring(index, index + length);
                    input = input.replaceFirst(substring, "");
                    System.out.println(input);
                }

                case "Substitute" -> {
                    String substring = tokens[1];
                    String substitute = tokens[2];

                    if (input.contains(substring)) {
                        input = input.replaceAll(substring, substitute);
                        System.out.println(input);
                    }
                    else {
                        System.out.println("Nothing to replace!");
                    }
                }
            }
        }
        System.out.println("Your password is: " + input);
    }
}