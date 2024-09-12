package PF01ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E11RageExpenses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetsToReplace = lostGamesCount / 2;
        int mousesToReplace = lostGamesCount / 3;
        int keyboardsToReplace = lostGamesCount / 6;
        int displaysToReplace = lostGamesCount / 12;

        double rageExpenses =
                headsetPrice * headsetsToReplace
                        + mousePrice * mousesToReplace
                        + keyboardPrice * keyboardsToReplace
                        + displayPrice * displaysToReplace;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}

// As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses
// a game and rage quits. His gaming setup consists of a headset, mouse, keyboard, and
// display. You will receive Peter's lost games count.
//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes
// his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.
//You will receive the price of each item in his gaming setup. Calculate his rage expenses
// for renewing his gaming equipment.
//Input / Constraints
//•	On the first input line - lost games count – integer in the range [0, 1000].
//•	On the second line – headset price - the floating-point number in the range [0, 1000].
//•	On the third line – mouse price - the floating-point number in the range [0, 1000].
//•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
//•	On the fifth line – display price - the floating-point number in the range [0, 1000].
//Output
//•	As output you must print Peter's total expenses: "Rage expenses: {expenses} lv."
//•	Allowed working time / memory: 100ms / 16MB.
