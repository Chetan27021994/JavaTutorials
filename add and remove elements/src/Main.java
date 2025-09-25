import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original list: " + fruits);


        fruits.remove("Banana");


        System.out.println("After removing Banana: " + fruits);


        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("Iterating using regular for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }


        System.out.println("Iterating using lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
