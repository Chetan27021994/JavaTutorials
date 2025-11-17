import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

public class Main {
    public static void main(String[] args) {


        List<Book> books = List.of(
                new Book("Book t", 1995),
                new Book("Book h", 2000),
                new Book("Book b", 1971),
                new Book("Book j", 2012)
        );


        int yearThreshold = 1999;

        // Use Stream API to filter books
        List<Book> recentBooks = books.stream()
                .filter(book -> book.getYear() > yearThreshold)
                .collect(Collectors.toList());


        System.out.println("Books published after " + yearThreshold + ":");
        recentBooks.forEach(book ->
                System.out.println(book.getTitle() + " (" + book.getYear() + ")")
        );
    }
}
