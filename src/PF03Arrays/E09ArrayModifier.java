package PF03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E09ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArgs = command.split(" ");
            String commandType = commandArgs[0];
            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandArgs[1]);
                    int index2 = Integer.parseInt(commandArgs[2]);
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                    break;
                case "multiply":
                    int indexA = Integer.parseInt(commandArgs[1]);
                    int indexB = Integer.parseInt(commandArgs[2]);
                    int tempA = array[indexA] * array[indexB];
                    array[indexA] = tempA;
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }
}

// You are given an array with integers. Write a program to modify the elements after receiving the
// following commands:
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at
// 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1.
//Input
//On the first input line, you will be given the initial array values separated by a single space.
//On the next lines, you will receive commands until you receive the command "end". The commands are as
// follows:
//•	"swap {index1} {index2}"
//•	"multiply {index1} {index2}"
//•	"decrease"
//Output
//The output should be printed on the console and consist of elements of the modified array – separated by
// a comma and a single space ", ".
//Constraints
//•	Elements of the array will be integer numbers in the range [-231...231].
//•	The count of the array elements will be in the range [2...100].
//•	Indexes will always be in the range of the array.