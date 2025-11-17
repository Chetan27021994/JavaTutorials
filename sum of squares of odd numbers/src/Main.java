import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(11, 256, 323, 898, 15, 78, 90);

        int sum = nums.stream()
                .filter(n -> n % 2 != 0)   // odd
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
