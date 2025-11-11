import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Bob");
        names.add("Van");
        names.add("Eve");
        names.add("Bob");

        System.out.println("Original list: " + names);

        Set<String> set = new HashSet<>(names);
        List<String> uniqueNames = new ArrayList<>(set);

        System.out.println("List after removing duplicates (order not guaranteed): " + uniqueNames);
    }
}
