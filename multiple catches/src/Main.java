public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {15, 56, 332 , 67};
            int result = numbers[2] / 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
