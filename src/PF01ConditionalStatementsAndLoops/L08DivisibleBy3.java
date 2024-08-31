package PF01ConditionalStatementsAndLoops;

public class L08DivisibleBy3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

// Write a program that prints all the numbers from 1 to 100, which are divisible by 3.
// You have to use a single for loop. The program should not receive input.
