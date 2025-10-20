import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];
        int sum = 0;


        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }


        double average = (double) sum / n;
        System.out.println("Average of the array: " + average);


        System.out.println("Numbers greater than the average:");
        boolean found = false;
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        scanner.close();
    }
}
