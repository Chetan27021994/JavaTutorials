import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false; // flag to track if input is valid

        // Keep asking until a valid integer is entered
        while (!valid) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input); // try converting string to integer
                valid = true; // valid number entered
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + input + "\" is not a valid integer. Please try again.");
            }
        }

        // Once a valid number is entered, check if it’s a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        // Handle negative numbers (treat them as not palindrome)
        if (num < 0) return false;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}
