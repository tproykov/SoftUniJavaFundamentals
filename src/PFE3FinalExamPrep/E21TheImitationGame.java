package PFE3FinalExamPrep;

import java.util.Scanner;

public class E21TheImitationGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command;

        while(!(command = scanner.nextLine()).equals("Decode")){

            String[] tokens = input.split("\\|");
            String commandType = tokens[0];

            switch (commandType){
                case "Move" -> {
                    int numberOfLetters = Integer.parseInt(tokens[1]);

                }
                case "Insert" -> {}
                case "ChangeAll" -> {}
            }








        }



    }

}
