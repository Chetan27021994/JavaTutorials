import java.util.*;

public class Main{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaafffffaaa", "bbbbb", "fds", "ddsrddddd");


        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Sorted by length:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
