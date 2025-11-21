import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Charu", 55);
        map.put("Alisha", 23);
        map.put("Nandu", 15);

        
        map.forEach((key, value) ->
                System.out.println(key + " : " + value)
        );
    }
}
