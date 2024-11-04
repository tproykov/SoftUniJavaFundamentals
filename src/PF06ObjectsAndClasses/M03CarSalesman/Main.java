package PF06ObjectsAndClasses.M03CarSalesman;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of engines
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            String displacement = engineData.length > 2 && isInteger(engineData[2]) ? engineData[2] : "n/a";
            String efficiency = engineData.length == 4 ? engineData[3] : (displacement.equals("n/a") && engineData.length > 2 ? engineData[2] : "n/a");

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.put(model, engine);
        }

        // Read number of cars
        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            Engine engine = engines.get(carData[1]);
            String weight = carData.length > 2 && isInteger(carData[2]) ? carData[2] : "n/a";
            String color = carData.length == 4 ? carData[3] : (weight.equals("n/a") && carData.length > 2 ? carData[2] : "n/a");

            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        // Output all cars with their engine information
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // Helper method to check if a string is an integer
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
