package PF06ObjectsAndClasses.M03CarSalesman;

public class Car {

    private final String model;
    private final Engine engine;
    private final String weight;
    private final String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n  %s%n  Weight: %s%n  Color: %s",
                model, engine, weight, color);
    }
}
