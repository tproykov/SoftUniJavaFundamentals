package PFE1MidTremExam;

import java.util.Arrays;
import java.util.Scanner;

public class E22ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command;
        int index1;
        int index2;
        while (!"end".equals(command = scanner.nextLine())) {

            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "swap":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    int product = array[index1] * array[index2];
                    array[index1] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                    break;
            }
        }
        String result = Arrays.toString(array)
                .replace("[", "")  // Remove the opening bracket
                .replace("]", "");  // Remove the closing bracket
        //.replace(", ", ", ");  // Add a comma and space
        System.out.println(result);
    }
}

// You are given an array with integers. Write a program to modify the elements after receiving the
// following commands:
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes element at the 1st index and multiply it with the element at
// 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1.
//Input
//On the first input line, you will be given the initial array values separated by a single space.
//On the next lines, you will receive commands until you receive the command "end". The commands are
// as follows:
//•	"swap {index1} {index2}"
//•	"multiply {index1} {index2}"
//•	"decrease"
//Output
//The output should be printed on the console and consist of elements of the modified array –
// separated by a comma and a single space ", ".
//Constraints
//•	Elements of the array will be integer numbers in the range [-231...231].
//•	Count of the array elements will be in the range [2...100].
//•	Indexes will be always in the range of the array.