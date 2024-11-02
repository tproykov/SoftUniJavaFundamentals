package PF08TextProcessing;

import java.util.Scanner;

public class L01ReverseStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string;
        while (!(string = scanner.nextLine()).equals("end")) {

//            String reversedString = "";
//            for (int i = string.length() - 1; i >= 0; i--) {
//                reversedString += string.charAt(i);
//            }

            String reversedString = new StringBuilder(string).reverse().toString();

            System.out.println(string + " = " + reversedString);
        }
    }
}