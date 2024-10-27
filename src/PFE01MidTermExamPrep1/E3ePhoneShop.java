package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E3ePhoneShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command;
        while (!(command = scanner.nextLine()).equals("End")) {

            String[] commandArgs = command.split(" - ");
            String commandType = commandArgs[0];
            String phone = commandArgs[1];
            switch (commandType) {
                case "Add" -> {
                    if (!phones.contains(phone)) {
                        phones.add(phone);
                    }
                }
                case "Remove" -> {
                    phones.remove(phone);
                }
                case "Bonus phone" -> {
                    String[] phoneParts = phone.split(":");
                    String oldPhone = phoneParts[0];
                    String newPhone = phoneParts[1];
                    if (phones.contains(oldPhone)) {
                        int index = phones.indexOf(oldPhone);
                        phones.add(index + 1, newPhone);
                    }
                }
                case "Last" -> {
                    if (phones.contains(phone)) {
                        phones.remove(phone);
                        phones.add(phone);
                    }
                }
            }
        }
        System.out.println(String.join(", ", phones));
    }
}