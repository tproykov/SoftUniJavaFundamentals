package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" ");
            String commandType = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            switch (commandType) {
                case "Delete" -> {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        if (list.get(i) == element) {
                            list.remove(i);
                        }
                    }
                }
                case "Insert" -> {
                    int position = Integer.parseInt(tokens[2]);
                    list.add(position, element);
                }
            }
            command = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}