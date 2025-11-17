import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(891, 22, 3654, 19750, 9821, 3454456);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Even: " + n));
    }
}
