import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbbbb");
        list.add("ccccccccccccccccccccccc");
        list.add("ddddddddddddddddd");
        list.add("eeeeeeeee");

        System.out.println("Choose sorting method:");
        System.out.println("1. Sort by length (ascending)");
        System.out.println("2. Sort by length (descending)");
        System.out.println("3. Sort using method reference");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
                break;

            case 2:
                list.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
                break;

            case 3:
                list.sort(Comparator.comparingInt(String::length));
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Sorted List:");
        list.forEach(System.out::println);
    }
}
