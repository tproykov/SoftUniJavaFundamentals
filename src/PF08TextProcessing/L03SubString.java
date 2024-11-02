package PF08TextProcessing;

import java.util.Scanner;

public class L03SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String substring = scanner.nextLine();
        String string = scanner.nextLine();

        while (string.contains(substring)) {

            string = string.replace(substring, "");
        }
        System.out.println(string);
    }
}