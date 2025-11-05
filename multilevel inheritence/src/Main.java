
class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}


class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }


    public void displayShape() {
        System.out.println("This is a circle.");
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }


    public void displayShape() {
        System.out.println("This is a cylinder.");
    }
}


public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7.0, 11.0);
        c.displayShape();
        System.out.println("Area of base: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}
