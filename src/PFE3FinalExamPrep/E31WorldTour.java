package PFE3FinalExamPrep;

import java.util.Scanner;

public class E31WorldTour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder destinations = new StringBuilder(input);

        String command;
        while (!(command = scanner.nextLine()).equals("Travel")) {

            String[] commandParts = command.split(":");

            switch (commandParts[0]) {

                case "Add Stop" -> {
                    int index = Integer.parseInt(commandParts[1]);
                    String string = commandParts[2];
                    if (index >= 0 && index < destinations.length()) {
                        destinations.insert(index, string);
                    }
                }

                case "Remove Stop" -> {
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (startIndex >= 0 && startIndex < destinations.length()
                            && endIndex >= 0 && endIndex < destinations.length()) {
                        destinations.delete(startIndex, endIndex + 1);
                    }
                }

                case "Switch" -> {
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    boolean containsOldString = destinations.indexOf(oldString) != -1;
                    if (containsOldString) {
                        int index = destinations.indexOf(oldString);
                        destinations.delete(index, index + oldString.length());
                        destinations.insert(index, newString);
                    }
                }
            }
            System.out.println(destinations);
        }
        System.out.println("Ready for world tour! Planned stops: " + destinations);
    }
}