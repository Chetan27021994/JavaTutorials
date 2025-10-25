import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ₹");
        double withdrawAmount = sc.nextDouble();

        System.out.println("----------------------------------");

        // Step 2: Validate withdrawal amount
        if (withdrawAmount <= 0) {
            System.out.println(" Invalid amount. Please enter a positive value.");
        }
        else if (withdrawAmount % 100 != 0) {
            System.out.println(" Amount must be a multiple of ₹100.");
        }
        else if (withdrawAmount > balance) {
            System.out.println(" Insufficient balance.");
        }
        else {

            balance -= withdrawAmount;
            System.out.println(" Transaction successful!");
            System.out.printf("Amount withdrawn: ₹%.2f%n", withdrawAmount);
            System.out.printf("Remaining balance: ₹%.2f%n", balance);
        }

        System.out.println("----------------------------------");
        System.out.println("Thank you for using our ATM!");
    }
}
