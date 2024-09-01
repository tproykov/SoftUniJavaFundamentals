package PF02DataTypesAndVariables;

import java.util.Scanner;

public class M06BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isOpen = false;
        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            if (input.equals("(") && !isOpen) {
                isOpen = true;
            }
            else if (input.equals("(")) {
                System.out.println("UNBALANCED");
                return;
            }
            if (input.equals(")") && isOpen) {
                isOpen = false;
            }
            else if (input.equals(")")) {
                System.out.println("UNBALANCED");
                return;
            }
        }
        if (isOpen) {
            System.out.println("UNBALANCED");
        }
        else {
            System.out.println("BALANCED");
        }
    }
}

// You will receive n lines. On those lines, you will receive one of the following:
//•	Opening bracket – "("
//•	Closing bracket – ")"
//•	Random string
//Your task is to find out if the brackets are balanced. That means after every closing bracket should follow an opening one. Nested parentheses are not valid, and if two consecutive opening brackets exist, the expression should be marked as unbalanced.
//Input
//•	On the first line, you will receive n – the number of lines that will follow.
//•	On the next n lines, you will receive "(", ")" or another string.
//Output
//You must print "BALANCED" if the parentheses are balanced and "UNBALANCED" otherwise.
//Constraints
//•	n will be in the interval [1…20].
//•	The length of the stings will be between [1…100] characters.
