import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Milk", 23);
        inventory.put("Bread", 55);
        inventory.put("Eggs", 120);


        inventory.put("Bread", inventory.get("Milk") - 7); // 1 milk sold


        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}
