package PFE3FinalExamPrep;

import java.util.Scanner;

public class E11Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String command;
        while(!(command = scanner.nextLine()).equals("Registration")){

            String[] tokens = command.split(" ");
            String commandType = tokens[0];
            switch (commandType){

                case "Letters" -> {
                    String letterCase = tokens[1];
                    switch (letterCase){
                        case "Lower" -> {
                            username = username.toLowerCase();
                        }
                        case "Upper" -> {
                            username = username.toUpperCase();
                        }
                    }
                }

                case "Reverse" -> {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && endIndex >= 0 && startIndex < username.length()
                            && endIndex < username.length()){
                        String substring = username.substring(startIndex, endIndex + 1);
                        StringBuilder reversedSubstring = new StringBuilder(substring).reverse();
                        System.out.println(reversedSubstring);
                    }
                }

                case "Substring" -> {
                    String substring = tokens[1];
                }

                case "Replace" -> {
                    char replaceChar = tokens[1].charAt(0);
                }

                case "IsValid" -> {
                    char isValidChar = tokens[1].charAt(0);
                }
            }
        }
    }
}