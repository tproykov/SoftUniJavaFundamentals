package PF06ObjectsAndClasses.M03CarSalesman;

public class Engine {

    private final String model;
    private final int power;
    private final String displacement;
    private final String efficiency;

    public Engine(String model, int power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%n    Power: %d%n    Displacement: %s%n    Efficiency: %s",
                model, power, displacement, efficiency);
    }
}