public class Main{
    public static void main(String[] args) {
        int[] numbers = {8765, 12, 987, 434, 33};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
