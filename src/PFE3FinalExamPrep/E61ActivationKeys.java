package PFE3FinalExamPrep;

import java.util.Scanner;

public class E61ActivationKeys {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();

        String command;
        while (!(command = scanner.nextLine()).equals("Generate")) {

            String[] commandArgs = command.split(">>>");

            switch (commandArgs[0]) {

                case "Contains" -> {
                    String substring = commandArgs[1];

                    if (rawActivationKey.contains(substring)) {
                        System.out.println(rawActivationKey + " contains " + substring);
                    }
                    else {
                        System.out.println("Substring not found!");
                    }
                }

                case "Flip" -> {
                    String direction = commandArgs[1];
                    int startIndex = Integer.parseInt(commandArgs[2]);
                    int endIndex = Integer.parseInt(commandArgs[3]);

                    String substring = rawActivationKey.substring(startIndex, endIndex);

                    if (direction.equals("Upper")) {
                        rawActivationKey = rawActivationKey.replace(substring, substring.toUpperCase());
                    }
                    else if (direction.equals("Lower")) {
                        rawActivationKey = rawActivationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(rawActivationKey);
                }

                case "Slice" -> {
                    int startIndex = Integer.parseInt(commandArgs[1]);
                    int endIndex = Integer.parseInt(commandArgs[2]);

                    String substring = rawActivationKey.substring(startIndex, endIndex);
                    rawActivationKey = rawActivationKey.replace(substring, "");
                    System.out.println(rawActivationKey);
                }
            }
        }
        System.out.println("Your activation key is: " + rawActivationKey);
    }
}