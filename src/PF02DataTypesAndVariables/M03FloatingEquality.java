package PF02DataTypesAndVariables;

import java.util.Scanner;

public class M03FloatingEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double diff = Math.abs(num1 - num2);

        if (diff >= 0.000001) {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}

// Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001.
// Note that we cannot directly compare two floating-point numbers a and b by a==b because of the nature
// of the floating-point arithmetic. Therefore, we assume two numbers are equal if they are closer to each
// other than some fixed constant eps.
//You will receive two lines, each containing a floating-point number. Your task is to compare the values
// of the two numbers.
