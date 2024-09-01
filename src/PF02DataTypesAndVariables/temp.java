package PF02DataTypesAndVariables;

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int startIndex = 0;
        if (word.charAt(0) == '-')
            startIndex = 1;

        int sum = 0;
        for (int i = startIndex; i < word.length(); i++) {
            char character = word.charAt(i);
            int digit = Integer.parseInt(character + "");
            sum += digit;
        }
        System.out.println(sum);
    }
}
