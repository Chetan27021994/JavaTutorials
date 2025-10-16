
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        String s = scanner.nextLine();

        // Print outputs in reverse order
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }
}
