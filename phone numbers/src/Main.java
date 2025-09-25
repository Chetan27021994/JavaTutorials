import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Chetan", "1234567890");
        contacts.put("Martin", "613489000");
        contacts.put("Caro", "1234675499");


        System.out.println("Phone Contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        String name = "Danny";
        if (contacts.containsKey(name)) {
            System.out.println("\n" + name + "'s number: " + contacts.get(name));
        } else {
            System.out.println("\nContact not found: " + name);
        }



    }
}
