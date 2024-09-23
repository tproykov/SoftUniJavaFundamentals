package PF03Arrays;

import java.util.Scanner;

public class E03ZigZagArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                array1[i] = scanner.nextInt();
                array2[i] = scanner.nextInt();
            }
            else {
                array2[i] = scanner.nextInt();
                array1[i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}

// Write a program that creates 2 arrays. You will be given an integer n. On the next n lines, you get
// 2 integers. Form 2 arrays as shown below.