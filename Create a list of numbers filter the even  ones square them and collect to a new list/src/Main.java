import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 23, 34, 48, 79, 76, 145, 12, 69, 190);


        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)     // keep even numbers
                .map(n -> n * n)             // square each number
                .collect(Collectors.toList());

        System.out.println("Squared even numbers: " + result);
    }
}
