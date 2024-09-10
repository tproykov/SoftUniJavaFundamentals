package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04ListManipulationAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Contains":
                    int containsNumber = Integer.parseInt(tokens[1]);
                    if (list.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        for (Integer integer : list) {
                            if (integer % 2 == 0) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                    } else if (evenOrOdd.equals("odd")) {
                        for (Integer integer : list) {
                            if (integer % 2 != 0) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer integer : list) {
                        sum += integer;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    switch (condition) {
                        case "<":
                            for (Integer integer : list) {
                                if (integer < number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer integer : list) {
                                if (integer > number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer integer : list) {
                                if (integer >= number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer integer : list) {
                                if (integer <= number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

// Now we will implement more complicated list commands. Again, read a list,
// and until you receive "end" read commands:
//•	Contains {number} – check if the list contains the number. If yes, print
// "Yes", otherwise, print "No such number"
//•	Print even – print all the numbers that are even separated by a space
//•	Print odd – print all the numbers that are oddly separated by a space
//•	Get sum – print the sum of all the numbers
//•	Filter {condition} {number} – print all the numbers that fulfill that
// condition. The condition will be either '<', '>', ">=", "<="