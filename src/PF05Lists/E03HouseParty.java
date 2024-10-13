package PF05Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HouseParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> partyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandArgs = command.split(" ");
            String name = commandArgs[0];
            if (!command.contains("not")) {
                if (partyList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                }
                else {
                    partyList.add(name);
                }
            }
            else {
                if (partyList.contains(name)) {
                    partyList.remove(name);
                }
                else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : partyList) {
            System.out.println(name);
        }
    }
}

// Write a program that keeps track of guests going to a house party.
//On the first input line, you are going to receive how many commands you are going to have. On the
// next lines you are going to receive some of the following inputs:
//•	"{name} is going!"
//•	"{name} is not going!"
//If you receive the first type of input, you have to add the person if he/she is not on the list.
// If he/she is in the list, print on the console: "{name} is already in the list!". If you receive
// the second type of input, you must remove the person if he/she is on the list. If not, print: "{name}
// is not in the list!". In the end, print all guests.