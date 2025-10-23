import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 12 == 0) {
            System.out.println(num + " is a multiple of 12.");
        } else {
            System.out.println(num + " is NOT a multiple of 12.");
        }
    }
}
