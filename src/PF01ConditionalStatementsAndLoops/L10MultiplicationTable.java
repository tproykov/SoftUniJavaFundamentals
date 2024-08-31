package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class L10MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}

// Print every row of the table in the following format:
//{theInteger} X {times} = {product}
//Constraints
//•	The integer will be in the interval [1…100]
//Examples
//Input	Output
//5	    5 X 1 = 5
//      5 X 2 = 10
//      5 X 3 = 15
//      5 X 4 = 20
//      5 X 5 = 25
//      5 X 6 = 30
//      5 X 7 = 35
//      5 X 8 = 40
//      5 X 9 = 45
//      5 X 10 = 50