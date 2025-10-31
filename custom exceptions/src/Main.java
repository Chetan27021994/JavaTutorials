import java.util.*;


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


class TooLargeNumberException extends Exception {
    public TooLargeNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            } else if (num > 60000) {
                throw new TooLargeNumberException("Number is too large.");
            }

            System.out.println("Number accepted: " + num);
        }
        catch (NegativeNumberException | TooLargeNumberException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        finally {
            System.out.println("Program ended.");
            sc.close();
        }
    }
}
