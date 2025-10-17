import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            String number = scanner.nextLine();
            try {
                long n = Long.parseLong(number);

                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                // If we got here, it's definitely within long range
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
