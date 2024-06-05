class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String brand;
    private Engine engine; // Composition: Car contains an Engine

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType); // Creating Engine object within Car constructor
    }

    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engine.getType();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        // Composition example
        Car car = new Car("Toyota", "V6");
        System.out.println("Composition - Car brand: " + car.getBrand() + ", Engine type: " + car.getEngineType());
    }
}
