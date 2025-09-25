abstract class Shape
{

    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(7, 3);

        System.out.println("AREA OF CIRCLE IS: " + circle.calculateArea());
        System.out.println("AREA OF RECTANGLE IS: " + rectangle.calculateArea());
    }
}
