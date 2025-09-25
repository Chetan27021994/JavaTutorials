public class Main
{
    public static void main(String[] args) {
        int[] numbers = {16, 56, 456, 234, 2244};

        try {

            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception caught: " + e);
            System.out.println("Invalid array index accessed. Please use an index between 0 and " + (numbers.length - 1));
        }


        System.out.println("Program continues after the try and catch block.");
    }
}
