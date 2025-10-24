import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        int length = num.length();
        int[] count = new int[length];


        for (int i = 0; i < length; i++) {
            int digit = num.charAt(i) - '0';
            if (digit < length) { // ignore digits larger than length
                count[digit]++;
            }
        }

        boolean isAuto = true;


        for (int i = 0; i < length; i++) {
            int digit = num.charAt(i) - '0';
            if (digit != count[i]) {
                isAuto = false;
                break;
            }
        }

        if (isAuto)
            System.out.println(num + " is an Autobiographical Number.");
        else
            System.out.println(num + " is NOT an Autobiographical Number.");

        scanner.close();
    }
}
