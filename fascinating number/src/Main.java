import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        if (num < 100) {
            System.out.println(num + " is NOT a Fascinating Number (must have at least 3 digits).");
        } else {
            String concat = num + "" + (num * 2) + (num * 3);

            if (isFascinating(concat)) {
                System.out.println(num + " is a Fascinating Number.");
            } else {
                System.out.println(num + " is NOT a Fascinating Number.");
            }
        }

        scanner.close();
    }


    public static boolean isFascinating(String str) {
        if (str.length() != 9) return false;

        boolean[] digits = new boolean[10]; // index 0–9

        for (int i = 0; i < str.length(); i++) {
            int d = str.charAt(i) - '0';
            if (d == 0 || digits[d]) {
                return false;
            }
            digits[d] = true;
        }


        for (int i = 1; i <= 9; i++) {
            if (!digits[i]) return false;
        }

        return true;
    }
}
