package PF08TextProcessing;

import java.util.Scanner;

public class E07StringExplosion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        int explosionPower = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '>') {
                output.append(currentChar);
                explosionPower += Integer.parseInt(input.charAt(i + 1) + "");
        // alternatively, explosionPower += Character.getNumericValue(input.charAt(i + 1));

            } else if (explosionPower > 0) {
                explosionPower--;

            } else {
                output.append(currentChar);

            }
        }
        System.out.println(output);
    }
}