import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pineapple");
        map.put(2, "Orange");
        map.put(3, "Cherry");
        map.put(4, "Kiwi");


        map.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );
    }
}
