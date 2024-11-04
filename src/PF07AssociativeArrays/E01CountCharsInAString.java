package PF07AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        for (char character : input) {
            if (character != ' ') {
                charCounts.putIfAbsent(character, 0);
                charCounts.put(character, charCounts.get(character) + 1);
            }
        }
        for (Character character : charCounts.keySet()) {
            System.out.println( character + " -> " + charCounts.get(character));
        }
    }
}