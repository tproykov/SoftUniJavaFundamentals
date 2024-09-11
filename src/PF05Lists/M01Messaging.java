package PF05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class M01Messaging {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        List<Character> string = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            string.add(c);
        }
        for (int currentNumber : list) {
            int sum = 0;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber /= 10;
            }
            int index = sum % string.size();
            System.out.print(string.get(index));
            string.remove(index);
        }
    }
}

// You will be given a list of numbers and a string. For each element of the
// list, you have to take the sum of its digits and take the element
// corresponding to that index from the text. If the index is greater than the
// length of the text, start counting from the beginning (so that you always
// have a valid index). After getting the element from the text, you must
// remove the character you have taken from it (so for the next index, the
// text will be with one characterless).