import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter four integers
        System.out.print("Enter four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        scanner.close();
    }
}
