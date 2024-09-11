package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E01Ages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        System.out.println(determineAge(age));
    }
    private static String determineAge(int age) {
        if (age >= 0 && age <= 2) {
            return "baby";
        }
        else if (age >= 3 && age <= 13) {
            return "child";
        }
        else if (age >= 14 && age <= 19) {
            return "teenager";
        }
        else if (age >= 20 && age <= 65) {
            return "adult";
        }
        return "elder";
    }
}

// Write a program that determines whether a person is based on the given age:
// baby, child, teenager, adult, or elder. The bounders are:
//•	0-2 – baby;
//•	3-13 – child;
//•	14-19 – teenager;
//•	20-65 – adult;
//•	>=66 – elder;
//•	All the values are inclusive.
