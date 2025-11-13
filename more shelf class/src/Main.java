
import java.util.ArrayList;
import java.util.List;


class Shelf<T> {
    private List<T> items = new ArrayList<>();


    public void addItem(T item) {
        items.add(item);
    }


    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }


    public List<T> getAllItems() {
        return items;
    }

    
    public int size() {
        return items.size();
    }
}

public class Main {
    public static void main(String[] args) {

        Shelf<String> stringShelf = new Shelf<>();
        stringShelf.addItem("Shoes");
        stringShelf.addItem("Socks");
        stringShelf.addItem("Sandals");
        System.out.println("String shelf: " + stringShelf.getAllItems());


        Shelf<Integer> intShelf = new Shelf<>();
        intShelf.addItem(14);
        intShelf.addItem(78);
        intShelf.addItem(35);
        System.out.println("Integer shelf: " + intShelf.getAllItems());


        Shelf<Person> personShelf = new Shelf<>();
        personShelf.addItem(new Person("VAN", 33));
        personShelf.addItem(new Person("Bobby", 62));
        System.out.println("Person shelf: " + personShelf.getAllItems());

        // Example: Access specific items
        System.out.println("First book on the string shelf: " + stringShelf.getItem(0));
        System.out.println("Total people on person shelf: " + personShelf.size());
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return name + " (age " + age + ")";
    }
}
