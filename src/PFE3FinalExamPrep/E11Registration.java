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
                        case "Lower" -> username = username.toLowerCase();
                        case "Upper" -> username = username.toUpperCase();
                    }
                    System.out.println(username);
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
                    if (username.contains(substring)){
                        username = username.replace(substring, "");
                        System.out.println(username);
                    }
                    else {
                        System.out.println("The username " + username + " doesn't contain " + substring + ".");
                    }
                }

                case "Replace" -> {
                    String replaceChar = tokens[1];
                    username = username.replace(replaceChar, "-");
                    System.out.println(username);
                }

                case "IsValid" -> {
                    String isValidChar = tokens[1];
                    if (username.contains(isValidChar)){
                        System.out.println("Valid username.");
                    }
                    else {
                        System.out.println(isValidChar + " must be contained in your username.");
                    }
                }
            }
        }
    }
}