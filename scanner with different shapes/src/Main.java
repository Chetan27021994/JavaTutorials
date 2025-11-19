import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends Shape {
    public double a, b, c;

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


class Rectangle extends Shape {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double area() {
        return length * width;
    }


    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    double area() {
        return Math.PI * radius * radius;
    }


    double perimeter() {
        return 2 * Math.PI * radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Circle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter side a: ");
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                System.out.print("Enter side c: ");
                double c = sc.nextDouble();
                shape = new Triangle(a, b, c);
                break;

            case 2:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                shape = new Square(side);
                break;

            case 3:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                shape = new Rectangle(length, width);
                break;

            case 4:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.println("\n------ RESULTS -------");
        System.out.println("Area = " + shape.area());
        System.out.println("Perimeter = " + shape.perimeter());

        sc.close();
    }
}
