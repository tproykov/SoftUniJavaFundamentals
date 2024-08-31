package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class M05Messages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String message = "";
        for (int i = 0; i < n; i++) {

            String line = scanner.nextLine();

            if (line.equals("0")) {
                message += " ";
            }
            else {
                char character = line.charAt(0);
                int mainDigit = Integer.parseInt(character + "");
                int digitLength = line.length();

                int offset = 0;
                if (line.contains("8") || line.contains("9")) {
                    offset = ((mainDigit - 2) * 3) + 1;
                }
                else {
                    offset = (mainDigit - 2) * 3;
                }
                int letterIndex = offset + digitLength -1;

                char letter = (char) (97 + letterIndex);

                message += letter;
            }
        }
        System.out.println(message);
    }
}

// Write a program that emulates typing an SMS, following this guide:
//
//1	2
//abc	3
//def
//4
//ghi	5
//jkl	6
//mno
//7
//pqrs	8
//tuv	9
//wxyz
//	0
//space
//Following the guide, 2 becomes "a", 22 becomes "b" and so on.
