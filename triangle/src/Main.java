import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter side 1: ");
        int a = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int b = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int c = scanner.nextInt();


        if (isValidTriangle(a, b, c)) {
            System.out.println("The given sides can form a triangle.");
        } else {
            System.out.println("The given sides cannot form a triangle.");
        }

        scanner.close();
    }


    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}


