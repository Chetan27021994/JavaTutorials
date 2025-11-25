import java.util.ArrayList;
import java.util.List;


class Shelf<T> {
    private List<T> items;

    public Shelf() {
        this.items = new ArrayList<>();
    }


    public void add(T item) {
        items.add(item);
    }


    public T remove(int index) {
        return items.remove(index);
    }
    public T get(int index) {
        return items.get(index);
    }


    public int size() {
        return items.size();
    }


    public boolean isEmpty() {
        return items.isEmpty();
    }


    public List<T> getAll() {
        return new ArrayList<>(items);
    }


    public String toString() {
        return items.toString();
    }
}


public class Main {
    public static void main(String[] args) {

        Shelf<String> bookShelf = new Shelf<>();
        bookShelf.add("MATHS");
        bookShelf.add("HINDI");
        bookShelf.add("BIOLOGY");

        System.out.println("Book Shelf: " + bookShelf);

        System.out.println("Second book: " + bookShelf.get(1));

        bookShelf.remove(0);
        System.out.println("After removing first book: " + bookShelf);


        Shelf<Integer> numberShelf = new Shelf<>();
        numberShelf.add(124);
        numberShelf.add(207);
        numberShelf.add(23);

        System.out.println("\nNumber Shelf: " + numberShelf);
        System.out.println("First number: " + numberShelf.get(0));
    }
}
