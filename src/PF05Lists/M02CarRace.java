package PF05Lists;

import java.util.Arrays;
import java.util.Scanner;

public class M02CarRace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        double sumLeft = 0;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == 0) {
                sumLeft *= 0.8;
            }
            else {
                sumLeft += array[i];
            }
        }
        double sumRight = 0;
        for (int i = array.length - 1; i > array.length / 2; i--) {
            if (array[i] == 0) {
                sumRight *= 0.8;
            }
            else {
                sumRight += array[i];
            }
        }
        String winner = "";
        double winTime = 0;
        if (sumLeft < sumRight) {
            winner = "left";
            winTime = sumLeft;
        }
        else if (sumLeft > sumRight) {
            winner = "right";
            winTime = sumRight;
        }
        System.out.printf("The winner is %s with total time: %.1f", winner, winTime);
    }
}

// Write a program to calculate the winner of a car race. You will receive an
// array of numbers. Each array element represents the time needed to pass
// through that step (the index). There are going to be two cars. One of them
// starts from the left side, and the other one starts from the right side.
// The middle index of the array is the finish line. (The number of elements
// of the array will always be odd). Calculate the total time for each racer
// to reach the finish (the middle of the array) and print the winner with his
// total time. (The racer with less time). If you have a zero in the array, you
// must reduce the racer's time that reached it by 20% (from the time so far).
//Print the result in the following format "The winner is {left/right} with
// total time: {total time}", formatted with one digit after the decimal point.
