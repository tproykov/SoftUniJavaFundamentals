package PFE1MidTremExam;

import java.util.Arrays;
import java.util.Scanner;

public class E12TheLift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < lift.length; i++) {

            if (peopleWaiting == 0) {
                break;
            }
            if (peopleWaiting >= 4 - lift[i]) {
                peopleWaiting = peopleWaiting - (4 - lift[i]);
                lift[i] = 4;
            } else {
                lift[i] += peopleWaiting;
                peopleWaiting = 0;
            }
        }

        boolean emptySpots = false;
        for (int wagon : lift) {
            if (wagon < 4) {
                emptySpots = true;
                break;
            }
        }
        if (peopleWaiting > 0) {
            System.out.println("There isn't enough space! " + peopleWaiting + " people in a queue!");
            for (int wagon : lift) {
                System.out.print(wagon + " ");
            }
        }
        else if (peopleWaiting == 0 && emptySpots) {
            System.out.println("The lift has empty spots!");
            for (int wagon : lift) {
                System.out.print(wagon + " ");
            }
        }
        else {
            for (int wagon : lift) {
                System.out.print(wagon + " ");
            }
        }
    }
}