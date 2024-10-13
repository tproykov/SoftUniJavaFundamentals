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