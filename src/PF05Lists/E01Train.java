package PF05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                String[] commandArgs = command.split(" ");
                int newWagon = Integer.parseInt(commandArgs[1]);
                train.add(newWagon);
            }
            else {
                int newPassengers = Integer.parseInt(command);
                for (int i = 0; i < train.size(); i++) {
                    int wagon = train.get(i);
                    if (maxCapacity - train.get(i) >= newPassengers) {
                        wagon += newPassengers;
                        train.set(i, wagon);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer wagon : train) {
            System.out.print(wagon + " ");
        }
    }
}

// On the first line, you will be given a list of wagons (integers). Each integer represents the number
// of passengers that are currently in each wagon. On the next line, you will get the max capacity of
// each wagon (single integer). Until you receive "end" you will be given two types of input:
//•	Add {passengers} - add a wagon to the end with the given number of passengers
//•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//In the end, print the final state of the train (all the wagons separated by a space)