import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println(num + " is positive.");
        else if (num < 0)
            System.out.println(num + " is negative.");
        else
            System.out.println("The number is zero.");


        if (num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");


        if (num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " is divisible by both 5 and 11.");
        else
            System.out.println(num + " is not divisible by both 5 and 11.");
    }
}
