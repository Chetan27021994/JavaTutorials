public class Main {
    public static void main(String[] args) {
        int n = 78;
        int d = 2;

        try {

            int result = n / d;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Exception caught: " + e);
            System.out.println("Cannot divide by zero.");
        } finally {

            System.out.println("Finally block executed.");
        }


        System.out.println("Program continues after try-catch-finally.");
    }
}
