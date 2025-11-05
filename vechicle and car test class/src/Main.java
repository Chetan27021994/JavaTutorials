
class Vehicle {
    public String brand;
    public String model;
    public double price;


    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }


    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, String model, double price, int numberOfDoors) {
        super(brand, model, price);
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors > 0) {
            this.numberOfDoors = numberOfDoors;
        } else {
            System.out.println("Number of doors must be positive!");
        }
    }



    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Maruti", "Swift", 7000, 4);
        c1.displayInfo();

        System.out.println("\nUpdating car info...");
        c1.setPrice(29500);
        c1.setNumberOfDoors(2);

        c1.displayInfo();
    }
}
