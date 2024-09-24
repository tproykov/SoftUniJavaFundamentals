package PF04Methods;

import java.util.Scanner;

public class E03CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.next().charAt(0);
        char character2 = scanner.next().charAt(0);

        charactersInRange(character1, character2);
    }
    private static void charactersInRange(char character1, char character2) {

        if (character1 < character2) {
            for (int i = character1 + 1; i < character2; i++) {
                System.out.print((char) i + " ");
            }
        }
        else if (character1 > character2) {
            for (int i = character2 + 1; i < character1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}