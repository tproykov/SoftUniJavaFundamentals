package PF07AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04SoftUniParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carPark = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            String commandType = command[0];
            String name = command[1];

            switch (commandType) {
                case "register" -> {
                    String licensePlateNumber = command[2];
                    if (carPark.containsKey(name)) {
                        System.out.println("ERROR: already registered with plate number "
                                + carPark.get(name));
                    }
                    else {
                        carPark.put(name, licensePlateNumber);
                        System.out.println(name + " registered " + licensePlateNumber + " successfully");
                    }
                }
                case "unregister" -> {
                    if (!carPark.containsKey(name)) {
                        System.out.println("ERROR: user " + name + " not found");
                    }
                    else {
                        carPark.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                }
            }
        }
        for (String name : carPark.keySet()) {

            System.out.println(name + " => " + carPark.get(name));
        }
    }
}