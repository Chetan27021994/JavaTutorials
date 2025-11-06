public class GeometryCalculator {




    public double area(double side) {
        return side * side;
    }


    public double area(double length, double width) {
        return length * width;
    }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }


    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle)
            return 0.5 * base * height;
        else
            return base * height; // fallback if not triangle
    }


    public double area(double a, double b, double height) {
        return ((a + b) / 2) * height;
    }


    public static void main(String[] args) {
        GeometryCalculator geo = new GeometryCalculator();

        System.out.println("Area of Square: " + geo.area(5.0));                // area(double)
        System.out.println("Area of Rectangle: " + geo.area(4.0, 6.0));       // area(double, double)
        System.out.println("Area of Circle: " + geo.area(3.5f));              // area(float)
        System.out.println("Area of Triangle: " + geo.area(4.0, 5.0, true));  // area(double, double, boolean)
        System.out.println("Area of Trapezium: " + geo.area(3.0, 5.0, 4.0));  // area(double, double, double)
    }
}
