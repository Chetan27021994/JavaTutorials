import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();


        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }


        while (num >= 10) {
            num = sumOfDigits(num);
        }


        System.out.println("Single-digit result: " + num);

        scanner.close();
    }


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
