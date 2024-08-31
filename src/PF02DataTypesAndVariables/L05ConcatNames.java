package PF02DataTypesAndVariables;

import java.util.Scanner;

public class L05ConcatNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstName.concat(delimiter).concat(lastName));
    }
}
// Read two names and a delimiter. Print the names joined by the delimiter.
