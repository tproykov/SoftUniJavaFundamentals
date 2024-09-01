package PF02DataTypesAndVariables;

import java.util.Scanner;

public class M01DataTypeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String dataType = determineDataType(input);
            System.out.println(input + " is " + dataType + " type");

            input = scanner.nextLine();
        }
    }
    private static String determineDataType(String input) {
        if (isBoolean(input)) {
            return "boolean";
        }
        if (isInteger(input)) {
            return "integer";
        }
        if (isFloatingPoint(input)) {
            return "floating point";
        }
        if (input.length() == 1) {
            return "character";
        }
        return "string";
    }
    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }
    private static boolean isInteger(String input) {
        // return input.matches("[-+]?\\d*");  ----------- use regex to solve it!!!! ----------------
        if (input.isEmpty()) {
            return false;
        }
        int startIndex = 0;
        if (input.charAt(0) == '-' || input.charAt(0) == '+') {
            startIndex = 1;
        }
        if (input.length() == startIndex) {
            return false;
        }
        for (int i = startIndex; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private static boolean isFloatingPoint(String input) {
        // return input.matches("[-+]?\\d*\\.?\\d+"); ---- use regex to solve it!!!! -------------
        if (input.isEmpty()) {
            return false;
        }
        int startIndex = 0;
        if (input.charAt(0) == '-' || input.charAt(0) == '+') {
            startIndex = 1;
        }
        if (input.length() == startIndex) {
            return false;
        }
        boolean decimalPointFound = false;
        for (int i = startIndex; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character == '.') {
                if (decimalPointFound) {
                    return false;
                }
                decimalPointFound = true;
            }
            else if (!Character.isDigit(character)) {
                return false;
            }
        }
        return decimalPointFound;
    }
}

// You will receive input until you receive "END". Find what data type is the input. Possible data types are:
//•	Integer
//•	Floating point
//•	Characters
//•	Boolean
//•	Strings
//Print the result in the following format: "{input} is {data type} type".
