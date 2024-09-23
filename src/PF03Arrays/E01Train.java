package PF03Arrays;

import java.util.Scanner;

public class E01Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {

            int wagon = Integer.parseInt(scanner.nextLine());
            train[i] = wagon;
            sum += wagon;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(train[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

// You will be given a count of wagons in a train n. On the next n lines, you will receive how many people
// will get on that wagon. In the end, print the whole train and the sum of the people on the train.