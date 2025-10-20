import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input a positive number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Step 2: Check if it's a perfect square
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }

    // Method to check perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num); // Get integer part of the square root
        return sqrt * sqrt == num;       // Check if square of sqrt equals the number
    }
}
