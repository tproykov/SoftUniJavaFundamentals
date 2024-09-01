package PF03Arrays;

import java.util.Scanner;

public class M02PascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print(1);

            }
            System.out.println();




        }




    }

}

// The triangle may be constructed in the following manner: In row 0 (the topmost row), there is a
// unique nonzero entry 1. Each entry of each subsequent row is constructed by adding the number above
// and to the left with the number above and to the right, treating blank entries as 0. For example,
// the initial number in the first (or any other) row is 1 (the sum of 0 and 1), whereas the numbers
// 1 and 3 in the third row are added to produce the number 4 in the fourth row.
//If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle
//Print each row element, separated with whitespace.
// •	The input number n will be 1 <= n <= 60.
//•	Think about the proper type for elements in an array.
//•	Don't be scared to use more and more arrays.
