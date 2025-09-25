import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Van");
        names.add("Monet");
        names.add("Mona");
        names.add("Frank");
        names.add("Mona");
        names.add("David");

        System.out.println("Original List with duplicates:");
        System.out.println(names);


        HashSet<String> uniqueNames = new HashSet<>(names);


        ArrayList<String> namesWithoutDuplicates = new ArrayList<>(uniqueNames);

        System.out.println("List after removing duplicates:");
        System.out.println(namesWithoutDuplicates);
    }
}
