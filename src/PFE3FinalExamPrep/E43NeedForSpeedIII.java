package PFE3FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E43NeedForSpeedIII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] carParts = scanner.nextLine().split("\\|");
            String car = carParts[0];
            int mileage = Integer.parseInt(carParts[1]);
            int fuel = Integer.parseInt(carParts[2]);

            carMileage.put(car, mileage);
            carFuel.put(car, fuel);
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Stop")) {

            String[] commandParts = command.split(" : ");

            String commandType = commandParts[0];
            String car = commandParts[1];

            switch (commandType) {

                case "Drive"-> {
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuel = Integer.parseInt(commandParts[3]);

                    if (fuel <= carFuel.get(car)) {
                        carFuel.put(car, carFuel.get(car) - fuel);
                        carMileage.put(car, carMileage.get(car) + distance);
                        System.out.println(car + " driven for " + distance + " kilometers. "
                                + fuel + " liters of fuel consumed.");
                    }
                    else {
                        System.out.println("Not enough fuel to make that ride");
                        continue;
                    }

                    if (carMileage.get(car) >= 100000) {
                        System.out.println("Time to sell the " + car + "!");
                        carMileage.remove(car);
                        carFuel.remove(car);
                    }
                }

                case "Refuel"-> {
                    int fuel = Integer.parseInt(commandParts[2]);
                    if (carFuel.get(car) + fuel <= 75) {
                        carFuel.put(car, carFuel.get(car) + fuel);
                    }
                    else {
                        fuel = 75 - carFuel.get(car);
                        carFuel.put(car, 75);
                    }
                    System.out.println(car + " refueled with " + fuel + " liters");
                }

                case "Revert"-> {
                    int kilometers = Integer.parseInt(commandParts[2]);
                    int decreasedMileage = carMileage.get(car) - kilometers;

                    if (decreasedMileage < 10000) {
                        carMileage.put(car, 10000);
                    }
                    else {
                        carMileage.put(car, decreasedMileage);
                        System.out.println(car + " mileage decreased by " + kilometers + " kilometers");
                    }
                }
            }
        }
        for (String car : carMileage.keySet()) {
            int mileage = carMileage.get(car);
            int fuel = carFuel.get(car);
            System.out.println(car + " -> Mileage: " + mileage + " kms, Fuel in the tank: " + fuel + " lt.");
        }
    }
}