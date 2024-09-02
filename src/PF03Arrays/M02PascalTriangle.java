package PF03Arrays;

import java.util.Scanner;

public class M02PascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read the size of the triangle from the console
        int n = Integer.parseInt(scanner.nextLine());

        // initialise the initial state of the 'previous row'
        int[] previousRow = {1};

        // print out the 'previous row' - initially first row
        for (int element : previousRow) {
            System.out.println(element);
        }

        // create the triangle - starting from the second row - row by row
        for (int i = 1; i < n; i++) {           // rows: one row shorter because row 1
            int[] currentRow = new int[i + 1];                         // already printed
            currentRow[0] = 1;                 // assigning 1 to first element of the row
            currentRow[i] = 1;                 // assigning 1 to the last element of the row

            // continue building the row
            for (int j = 1; j < i; j++) {      // middle elements of the row: sum of the two
                currentRow[j] = previousRow[j - 1] + previousRow[j]; // values from the row above
            }
            // print out the constructed row
            for (int element : currentRow) {
                System.out.print(element + " ");
            }
            System.out.println();          // printer caret to the new row

            previousRow = currentRow;       // assign the current row as a 'previous row'
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
