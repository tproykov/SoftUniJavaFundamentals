package PF04Methods;

import java.util.Scanner;

public class L09GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String value1 = scanner.nextLine();
        String value2 = scanner.nextLine();

        switch (type) {
            case "string":
                String string1 = value1;
                String string2 = value2;
                System.out.println(getMax(string1, string2));
                break;
            case "int":
                int integer1 = Integer.parseInt(value1);
                int integer2 = Integer.parseInt(value2);
                System.out.println(getMax(integer1, integer2));
                break;
            case "char":
                char char1 = value1.charAt(0);
                char char2 = value2.charAt(0);
                System.out.println(getMax(char1, char2));
                break;
        }
    }
    private static int getMax(int integer1, int integer2) {
        if (integer1 > integer2) {
            return integer1;
        }
        return integer2;
    }
    private static char getMax(char char1, char char2) {
        if (char1 > char2) {
            return char1;
        }
        return char2;
    }
    private static String getMax(String string1, String string2) {
        if (string1.compareTo(string2) >= 0) {
            return string1;
        }
        return string2;
    }
}

// You are given two values of the same type as input. The values can be
// of type int, char of String. Create a method getMax() that returns the
// greater of the two values:
