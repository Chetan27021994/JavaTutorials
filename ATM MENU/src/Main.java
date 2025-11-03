import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 9000.0;
        System.out.println("Welcome to XYZ  Bank ATM");
        System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                double w = sc.nextDouble();
                if (w > balance)
                    System.out.println("Insufficient balance!");
                else if (w <= 0)
                    System.out.println("Invalid amount!");
                else {
                    balance -= w;
                    System.out.println("Withdrawal successful! Remaining balance: " + balance);
                }
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double d = sc.nextDouble();
                if (d <= 0)
                    System.out.println("Invalid amount!");
                else {
                    balance += d;
                    System.out.println("Deposit successful! New balance: " + balance);
                }
                break;

            case 3:
                System.out.println("Current balance: " + balance);
                break;

            case 4:
                System.out.println("Thank you for using Java Bank!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
