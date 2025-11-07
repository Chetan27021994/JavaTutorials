import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + input + "\" is not a valid integer. Please try again.");
            }
        }

        System.out.println("You entered the valid number: " + number);
        scanner.close();
    }
}
