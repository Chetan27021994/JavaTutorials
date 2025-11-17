import java.util.*;
import java.util.stream.Collectors;

class Book {
    public String title;
    public  int year;

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
                new Book("da vinci code ", 2007),
                new Book("1984", 1956),
                new Book("Train to Pakistan", 1999),
                new Book("Hollywood", 1967),
                new Book("Women", 1988)
        );

        int yearThreshold = 1908;


        List<Book> sortedBooks = books.stream()
                .filter(book -> book.getYear() > yearThreshold)
                .sorted(Comparator.comparing(Book::getTitle)) // SORT BY TITLE
                .collect(Collectors.toList());

        System.out.println("Books published after " + yearThreshold + " (sorted by title):");
        sortedBooks.forEach(book ->
                System.out.println(book.getTitle() + " (" + book.getYear() + ")")
        );
    }
}
