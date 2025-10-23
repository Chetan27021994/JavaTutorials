import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        sc.close();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter.");
        } else if (area == perimeter) {
            System.out.println("Area is equal to perimeter.");
        } else {
            System.out.println("Area is NOT greater than perimeter.");
        }
    }
}
