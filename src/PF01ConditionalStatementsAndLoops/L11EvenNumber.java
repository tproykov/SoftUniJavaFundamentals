package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L11EvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: " + Math.abs(number));
    }
}

// Take as an input an even number and print its absolute value with a message:
// "The number is: {absoluteValue}". If the number is odd, print "Please write an
// even number." and continue reading numbers.
