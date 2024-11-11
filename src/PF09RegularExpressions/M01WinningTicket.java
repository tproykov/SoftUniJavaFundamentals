package PF09RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M01WinningTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split("\\s*,\\s*");

        String regex = "([@#$^])\\1{5,}";
        Pattern pattern = Pattern.compile(regex);

        for (String ticket : tickets) {

            ticket = ticket.trim();

            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            String leftHalf = ticket.substring(0, 10);
            String rightHalf = ticket.substring(10, 20);

            Matcher matcherLeft = pattern.matcher(leftHalf);
            Matcher matcherRight = pattern.matcher(rightHalf);

            if (matcherLeft.find() && matcherRight.find()) {
                String leftWinningSequence = matcherLeft.group();
                String rightWinningSequence = matcherRight.group();

                if (leftWinningSequence.charAt(0) == rightWinningSequence.charAt(0)) {
                    String winningSymbol = leftWinningSequence.charAt(0) + "";
                    int matchLength = Math.min(leftWinningSequence.length(),
                            rightWinningSequence.length());

                    if (matchLength == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!\n",
                                ticket, matchLength, winningSymbol);
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s\n", ticket, matchLength,
                                winningSymbol);
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match\n", ticket);
                }
            } else {
                System.out.printf("ticket \"%s\" - no match\n", ticket);
            }
        }
    }
}