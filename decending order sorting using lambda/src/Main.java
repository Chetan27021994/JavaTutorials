import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("afdfgdgf", "tffvdd",  "fg", "ocvfvfdvdsssds");


        list.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        System.out.println("Sorted by descending length:");
        list.forEach(System.out::println);
    }
}
