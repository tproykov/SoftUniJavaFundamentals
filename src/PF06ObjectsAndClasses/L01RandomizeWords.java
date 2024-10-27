package PF06ObjectsAndClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class L01RandomizeWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Collections.shuffle(words);

        for (String word : words) {
            System.out.println(word);
        }
    }
}