package PF02DataTypesAndVariables;

import java.util.Scanner;

public class E06TriplesOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + n; i++) {
            for (int j = 97; j < 97 + n; j++) {
                for (int k = 97; k < 97 + n; k++) {
                    char firstLetter = (char) i;
                    char secondLetter = (char) j;
                    char thirdLetter = (char) k;
                    System.out.print("" + firstLetter + secondLetter + thirdLetter);
                    System.out.println();
                }
            }
        }
    }
}