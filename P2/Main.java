
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String fuelType = "Petrol";

    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("Brand: " + c.brand);
        System.out.println("Fuel Type: " + c.fuelType);

        c.start();
        c.drive();
    }
}

