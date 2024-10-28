package PF06ObjectsAndClasses.M02RawData;

public class Cargo {

    private final String type;

    public Cargo(int weight, String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
