import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();


        double baseFare = distance * 10;
        double finalFare;

        if (age < 5) {
            finalFare = 0;
            System.out.println("Passenger travels free (under 5 years old).");
        }
        else if (age <= 18) {
            finalFare = baseFare * 0.5; // 50% discount
            System.out.println("50% discount applied (student discount).");
        }
        else if (age >= 60) {
            finalFare = baseFare * 0.7; // 30% discount
            System.out.println("30% discount applied (senior citizen).");
        }
        else {
            finalFare = baseFare;
            System.out.println("No discount applicable.");
        }


        System.out.printf("Base Fare: ₹%.2f%n", baseFare);
        System.out.printf("Final Fare: ₹%.2f%n", finalFare);
    }
}
