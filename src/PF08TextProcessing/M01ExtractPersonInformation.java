package PF08TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class M01ExtractPersonInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] nameParts1 = input.split("@");
            String[] nameParts2 = nameParts1[1].split("\\|");
            String name = nameParts2[0];

            String[] ageParts1 = input.split("#");
            String[] ageParts2 = ageParts1[1].split("\\*");
            int age = Integer.parseInt(ageParts2[0]);

            System.out.println(name + " is " + age + " years old.");
        }
    }
}