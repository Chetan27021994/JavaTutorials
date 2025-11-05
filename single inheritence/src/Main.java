
class Appliance {
    private String brand;
    private double power; // in watts

    public Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    public void turnOn() {
        System.out.println(brand + " appliance is now ON.");
    }

    public void turnOff() {
        System.out.println(brand + " appliance is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
    }
}


class WashingMachine extends Appliance {
    private double capacity; // in kg

    public WashingMachine(String brand, double power, double capacity) {
        super(brand, power);
        this.capacity = capacity;
    }


    public void turnOn() {
        System.out.println("Washing machine starting cycle...");
    }

    public void wash() {
        System.out.println("Washing clothes (" + capacity + " kg)...");
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " kg");
    }
}


public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 1400, 8.5);
        wm.displayInfo();
        wm.turnOn();
        wm.wash();
        wm.turnOff();
    }
}
