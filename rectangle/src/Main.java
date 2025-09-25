class Rectangle
{
    int length;
     int breadth;


    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    int area()
    {

        return length * breadth;
    }

    int perimeter() {

        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(4, 7);

        System.out.println("Area: " + rect.area());


        System.out.println("Perimeter: " + rect.perimeter());
    }
}