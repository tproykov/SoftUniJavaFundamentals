package PF06ObjectsAndClasses.E05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

        List<Vehicle> vehicles = new ArrayList<>();

        while (!(command = scanner.nextLine()).equals("End")) {

            String[] vehicleParts = command.split("\\s+");
            String vehicleType = vehicleParts[0];
            String vehicleModel = vehicleParts[1];
            String vehicleColour = vehicleParts[2];
            double vehicleHorsePower = Double.parseDouble(vehicleParts[3]);

            Vehicle vehicle = new Vehicle(vehicleType, vehicleModel, vehicleColour, vehicleHorsePower);
            vehicles.add(vehicle);
        }

        String command1;

        while (!(command1 = scanner.nextLine()).equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(command1)) {
                    System.out.println(vehicle);
                    break;
                }
            }
        }
        double sum = 0;
        int count = 0;
        double averageHorsePower = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                count++;
                sum += vehicle.getHorsePower();
            }
        }
        if (count > 0) {
            averageHorsePower = sum / count;
        }
        else {
            averageHorsePower = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageHorsePower);
        sum = 0;
        count = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("truck")) {
                count++;
                sum += vehicle.getHorsePower();
            }
        }
        if (count > 0) {
            averageHorsePower = sum / count;
        }
        else {
            averageHorsePower = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.\n", averageHorsePower);
    }
}