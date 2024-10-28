package PF06ObjectsAndClasses.M02RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            double[] tirePressures = {
                    Double.parseDouble(carData[5]), Double.parseDouble(carData[7]),
                    Double.parseDouble(carData[9]), Double.parseDouble(carData[11])
            };
            int[] tireAges = {
                    Integer.parseInt(carData[6]), Integer.parseInt(carData[8]),
                    Integer.parseInt(carData[10]), Integer.parseInt(carData[12])
            };

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tirePressures, tireAges);
            cars.add(car);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals("fragile") && car.hasLowPressureTire()) {
                    System.out.println(car.getModel());
                }
            }
        } else if (command.equals("flamable")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
