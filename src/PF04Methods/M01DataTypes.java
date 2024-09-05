package PF04Methods;

import java.util.Scanner;

public class M01DataTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println(processDataType(number));
                break;
            case "real":
                double numberDouble = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", processDataType(numberDouble));
                break;
            case "string":
                String string = scanner.nextLine();
                System.out.println(processDataType(string));
                break;
        }
    }
    private static int processDataType(int number) {
        return number * 2;
    }
    private static double processDataType(double numberDouble) {
        return numberDouble * 1.5;
    }
    private static String processDataType(String string) {
        return "$" + string + "$";
    }
}

// Write a program that, depending on the first line of the input, reads an int, double, or string.
//•	If the data type is int, multiply the number by 2.
//•	If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
//•	If the data type is a string, surround the input with "$".
//Print the result on the console.
