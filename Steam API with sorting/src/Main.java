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
                new Book("Book g", 2015),
                new Book("Book j", 2010),
                new Book("Book l", 2025),
                new Book("Book e", 1988),
                new Book("Book q", 2009)
        );

        int yearThreshold = 1998;

        List<Book> sortedBooks = books.stream()
                .filter(book -> book.getYear() > yearThreshold)
                .sorted(Comparator.comparingInt(Book::getYear)) // sort by year
                .collect(Collectors.toList());


        System.out.println("Books published after " + yearThreshold + " (sorted by year):");
        sortedBooks.forEach(book ->
                System.out.println(book.getTitle() + " (" + book.getYear() + ")")
        );
    }
}
