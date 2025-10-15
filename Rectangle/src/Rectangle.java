
public class Rectangle {
    public  double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getArea() {
        return length * width;
    }


    public double getPerimeter() {
        return 2 * (length + width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7.9, 5.6);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
