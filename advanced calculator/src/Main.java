import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n===== Advanced Calculator =====");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Power\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1: result = add(a, b); break;
                case 2: result = subtract(a, b); break;
                case 3: result = multiply(a, b); break;
                case 4:
                    if (b == 0) System.out.println(" Division by zero!");
                    else result = divide(a, b);
                    break;
                case 5: result = Math.pow(a, b); break;
                default: System.out.println("Invalid choice!");
            }

            System.out.println("Result: " + result);
        }
    }

    static double add(double x, double y) { return x + y; }
    static double subtract(double x, double y) { return x - y; }
    static double multiply(double x, double y) { return x * y; }
    static double divide(double x, double y) { return x / y; }
}
