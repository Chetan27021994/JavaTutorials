import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        String num = scanner.nextLine();


        if (num.charAt(0) == '0') {
            System.out.println(num + " is NOT a Duck Number (starts with zero).");
        } else {

            if (num.contains("0")) {
                System.out.println(num + " is a Duck Number.");
            } else {
                System.out.println(num + " is NOT a Duck Number (no zero found).");
            }
        }

        scanner.close();
    }
}
