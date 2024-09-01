package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L12RefactorSpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= initialNumber; i++) {

            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += (number % 10);
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }

        }
    }
}

// You are given a working code that is a solution to Problem 9. Special Numbers.
// However, the variables are improperly named, declared before they are needed, and some
// of them are used for multiple things. Without using your previous solution, modify the code
// so that it is easy to read and understand.
// Scanner scanner = new Scanner(System.in);
//int kolkko = Integer.parseInt(scanner.nextLine());
//int obshto = 0;
//int takova = 0;
//boolean toe = false;
//for (int ch = 1; ch <= kolkko; ch++) {
//    takova = ch;
//    while (ch > 0) {
//        obshto += ch % 10;
//        ch = ch / 10;
//    }
//    toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
//    System.out.printf("%d -> %b%n", takova, toe);
//    obshto = 0;
//    ch = takova;
//}
// •	Reduce the span of the variables by declaring them at the moment they receive a value,
// not before
//•	Rename your variables to represent their real purpose (example: "toe" should become
// isSpecialNum, etc.)
//•	Search for variables that have multiple purposes. If you find any, introduce a new variable
