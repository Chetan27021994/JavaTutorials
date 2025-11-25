import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// --------------------------------------------
// Generic Shelf<T> class with sorting
// --------------------------------------------
class Shelf<T> {
    private List<T> items;

    public Shelf() {
        this.items = new ArrayList<>();
    }

    // Add an item to the shelf
    public void add(T item) {
        items.add(item);
    }

    // Remove an item from the shelf
    public T remove(int index) {
        return items.remove(index);
    }

    // Get (but do not remove) an item
    public T get(int index) {
        return items.get(index);
    }

    // Number of items on the shelf
    public int size() {
        return items.size();
    }

    // Check if the shelf is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Return all items
    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    // Sort items (only works if T is Comparable<?>)
    public void sort() {
        if (items.isEmpty()) return;

        if (!(items.get(0) instanceof Comparable)) {
            throw new IllegalStateException("Items must implement Comparable to be sorted.");
        }

        Collections.sort((List<? extends Comparable>) items);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}

// --------------------------------------------
// Main class to test sorting with Shelf<T>
// --------------------------------------------
public class Main {
    public static void main(String[] args) {


        Shelf<String> bookShelf = new Shelf<>();
        bookShelf.add("Moral Science");
        bookShelf.add("Maths");
        bookShelf.add("English");

        System.out.println("Before sorting (books): " + bookShelf);
        bookShelf.sort();
        System.out.println("After sorting (books):  " + bookShelf);


        Shelf<Integer> numberShelf = new Shelf<>();
        numberShelf.add(345);
        numberShelf.add(66);
        numberShelf.add(2144);

        System.out.println("\nBefore sorting (numbers): " + numberShelf);
        numberShelf.sort();
        System.out.println("After sorting (numbers):  " + numberShelf);


    }
}
