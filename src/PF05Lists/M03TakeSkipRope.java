package PF05Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M03TakeSkipRope {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numberList = new ArrayList<>();
        List<Character> nonNumberList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                numberList.add(Integer.parseInt(String.valueOf(symbol)));
            } else {
                nonNumberList.add(symbol);
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numberList.get(i));
            }
            else {
                skipList.add(numberList.get(i));
            }
        }
        String output = "";
        for (int i = 0; i < takeList.size(); i++) {
            for (int j = 1; j <= takeList.get(i); j++) {
                if (nonNumberList.isEmpty()) {
                    break;
                }
                else {
                    output += nonNumberList.getFirst();
                    nonNumberList.removeFirst();
                }
            }
            for (int j = 1; j <= skipList.get(i); j++) {
                if (nonNumberList.isEmpty()) {
                    break;
                }
                else {
                    nonNumberList.removeFirst();
                }
            }
        }
        System.out.println(output);
    }
}

// Write a program that reads a string and skips through it, extracting a
// hidden message. The algorithm you have to implement is as follows:
//Let's take the string "skipTest_String044170" as an example.
//Take every digit from the string and store it somewhere. After that, remove
// all the digits from the string. After this operation, you should have two
// lists of items: the numbers list and the non-numbers list:
//•	Numbers list: [0, 4, 4, 1, 7, 0]
//•	Non-numbers: [s, k, i, p, T, e, s, t, _, S, t, r, i, n, g]
//After that, take every digit in the numbers list and split it up into a take
// list and a skip list, depending on whether the digit is in an even or an
// odd index:
//•	Numbers list: [0, 4, 4, 1, 7, 0]
//•	Take list: [0, 4, 7]
//•	Skip list: [4, 1, 0]
//Afterward, iterate over both of the lists and skip {skipCount} characters
// from the non-numbers list, then take {takeCount} characters and store it in
// a result string. Note that the skipped characters are summed up as they go.
// The process would look like this on the aforementioned non-numbers list:
//Example: "skipTest_String"
//1.	Take 0 characters -> Taken: "", skip 4 characters  Skipped: "skip" ->
// Result: ""
//2.	Take 4 characters -> Taken: "Test", skip 1 character  Skipped: "_" ->
// Result: "Test"
//3.	Take 7 characters -> Taken: "String", skip 0 characters  Skipped: ""
// -> Result: "TestString"
//After that, just print the result string on the console.
//Input
//The encrypted message is a string.
//Output
//The decrypted message is a string.
//Constraints
//•	The count of digits in the input string will always be even.
//•	The encrypted message will contain any printable ASCII character.
