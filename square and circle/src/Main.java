
abstract class Shape {
    protected String color;


    public Shape(String color) {
        this.color = color;
    }


    public abstract double getArea();
    public abstract double getPerimeter();


    public String getColor() {
        return color;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public String toString() {
        return "Circle [color=" + color +
                ", radius=" + radius +
                ", area=" + String.format("%.2f", getArea()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}


class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }


    public double getPerimeter() {
        return 4 * side;
    }


    public String toString() {
        return "Square [color=" + color +
                ", side=" + side +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() + "]";
    }
}


public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("Blue", 14.0);
        Shape square = new Square("Red", 45.0);


        System.out.println(circle);
        System.out.println(square);


        Shape[] shapes = {circle, square};
        System.out.println("\nDisplaying all shapes using a loop:");
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() +
                    " - Area: " + String.format("%.2f", s.getArea()) +
                    ", Perimeter: " + String.format("%.2f", s.getPerimeter()));
        }
    }
}
