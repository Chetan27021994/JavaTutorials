import java.util.*;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();


            if (age < 0 || age > 34) {
                throw new InvalidAgeException("Invalid age: " + age);
            }

            System.out.println("Age accepted: " + age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        finally {
            System.out.println("Program ended.");
            sc.close();
        }
    }
}
