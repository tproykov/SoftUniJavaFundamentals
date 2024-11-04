package PF06ObjectsAndClasses.M02RawData;

public class Car {

    private final String model;
    private final Engine engine;
    private final Cargo cargo;
    private final Tire[] tires;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double[] tirePressures, int[] tireAges) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new Tire[4];
        for (int i = 0; i < 4; i++) {
            this.tires[i] = new Tire(tirePressures[i], tireAges[i]);
        }
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }

    public boolean hasLowPressureTire() {
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }
}
