import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int H = scanner.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            int area = B * H;
            System.out.println(area);
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
