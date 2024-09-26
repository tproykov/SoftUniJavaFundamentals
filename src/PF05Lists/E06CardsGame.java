package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06CardsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> hand1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> hand2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!hand1.isEmpty() && !hand2.isEmpty()) {

            if (hand1.getFirst() > hand2.getFirst()) {
                hand1.addLast(hand1.getFirst());
                hand1.addLast(hand2.getFirst());
                hand1.removeFirst();
                hand2.removeFirst();
            }
            else if (hand2.getFirst() > hand1.getFirst()) {
                hand2.addLast(hand2.getFirst());
                hand2.addLast(hand1.getFirst());
                hand2.removeFirst();
                hand1.removeFirst();
            }
            else {
                hand1.removeFirst();
                hand2.removeFirst();
            }
        }
        if (hand2.isEmpty()) {
            int sum = 0;
            for (Integer card : hand1) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);

        }
        else {
            int sum = 0;
            for (Integer card : hand2) {
                sum += card;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}

// You will be given two hands of cards, which will be integer numbers. Assume that you have two players.
// You must find the winning deck and, respectively, the winner.
//You start from the beginning of both hands. Compare the cards from the first deck to those from the
// second. The player, who has a bigger card, takes both cards and puts them on the back of his hand -
// the second player's card is last, and the first person's card (the winning one) is before it (second
// to last), and the player with the smaller card must remove the card from his deck. If both players'
// cards have the same values - no one wins, and the two cards must be removed from the decks. The game
// is over when one of the decks is left without any cards. You have to print the winner on the console
// and the sum of the left cards: "{First/Second} player wins! Sum: {sum}".
