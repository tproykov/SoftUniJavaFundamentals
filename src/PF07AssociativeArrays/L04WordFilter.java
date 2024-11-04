package PF07AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L04WordFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = Arrays.stream(scanner.nextLine().split(" "))
                .filter(s -> s.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), strings));
    }
}