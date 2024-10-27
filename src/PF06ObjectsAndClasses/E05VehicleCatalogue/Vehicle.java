package PF06ObjectsAndClasses.E05VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private double horsePower;

    public Vehicle(String type, String model, String color, double horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        String formattedType = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f", formattedType, model, color, horsePower);
    }
}