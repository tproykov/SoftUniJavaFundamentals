package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.Scanner;

public class E2bFriendListMaintenance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] friendList = scanner.nextLine().split(", ");

        String command;
        int countBlacklisted = 0;
        int countLost = 0;
        while (!"Report".equals(command = scanner.nextLine())) {

            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Blacklist"-> {
                    String name = commandParts[1];

                    if (Arrays.asList(friendList).contains(name)) {
                        int blacklistedIndex = Arrays.asList(friendList).indexOf(name);
                        friendList[blacklistedIndex] = "Blacklisted";
                        countBlacklisted++;
                        System.out.println(name + " was blacklisted.");
                    }
                    else {
                        System.out.println(name + " was not found.");
                    }
                }
                case "Error"-> {
                    int errorIndex = Integer.parseInt(commandParts[1]);
                    if (errorIndex >= 0 && errorIndex <= friendList.length - 1 &&
                            !friendList[errorIndex].equals("Blacklisted") &&
                            !friendList[errorIndex].equals("Lost")) {
                        String lostName = friendList[errorIndex];
                        friendList[errorIndex] = "Lost";
                        countLost++;
                        System.out.println(lostName + " was lost due to an error.");
                    }
                }
                case "Change"-> {
                    int changeIndex = Integer.parseInt(commandParts[1]);
                    String newName = commandParts[2];
                    if (changeIndex >= 0 && changeIndex <= friendList.length - 1) {
                        String oldName = friendList[changeIndex];
                        friendList[changeIndex] = newName;
                        System.out.println(oldName + " changed his username to " + newName + ".");
                    }
                }
            }
        }
        System.out.println("Blacklisted names: " + countBlacklisted);
        System.out.println("Lost names: " + countLost);
        System.out.println(String.join(" ", friendList));
    }
}