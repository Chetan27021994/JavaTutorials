import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("The number is: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        finally {
            System.out.println("Done");
            sc.close();
        }
    }
}
