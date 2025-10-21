// Base class
class Vehicle {

    public void drive() {
        System.out.println("Driving a vehicle");
    }
}


class Car extends Vehicle {

    public void drive() {
        System.out.println("Repairing a car"); // Overridden message
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.drive();

        Car myCar = new Car();
        myCar.drive();
    }
}
