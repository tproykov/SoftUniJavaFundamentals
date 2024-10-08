package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E01IntegerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        System.out.println(((n1 + n2) / n3) * n4);
    }
}

// Read four integer numbers. Add the first to the second, divide (integer) the sum by the third number,
// and multiply the result by the fourth number. Print the result.
//Constraints
//•	The four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].
