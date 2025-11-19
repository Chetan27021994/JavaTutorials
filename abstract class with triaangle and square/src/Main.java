abstract class Shape {
  
    abstract double area();
    abstract double perimeter();
}


class Triangle extends Shape {
    public double a, b, c;  // sides of the triangle

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    double area() {

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimeter() {
        return a + b + c;
    }
}


class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }


    double area() {
        return side * side;
    }


    double perimeter() {
        return 4 * side;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(9, 6, 8);
        Shape square = new Square(7);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
