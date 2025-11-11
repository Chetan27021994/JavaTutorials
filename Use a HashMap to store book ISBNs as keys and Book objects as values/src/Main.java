import java.util.HashMap;
import java.util.Map;

class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }


    public String toString() {
        return String.format("[%s] %s by %s (%d)", isbn, title, author, year);
    }
}

public class Main {
    public static void main(String[] args) {

        Map<String, Book> bookMap = new HashMap<>();


        bookMap.put("978-45655", new Book("955-12345", "The Hobbit", "J.R.R. Tolkien", 1937));
        bookMap.put("978-16765", new Book("955-23456", "1984", "George Orwell", 1949));
        bookMap.put("978-566445445", new Book("955-34567", "Brave New World", "Aldous Huxley", 1932));
        bookMap.put("978-9765544", new Book("955-45678", "Fahrenheit 451", "Ray Bradbury", 1953));

        String searchIsbn = "978-65433344";
        Book foundBook = bookMap.get(searchIsbn);
        System.out.println("Book with ISBN " + searchIsbn + ": " + foundBook);


        System.out.println("\nAll books in the map:");
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        String checkIsbn = "955-12378";
        if (bookMap.containsKey(checkIsbn)) {
            System.out.println("\nBook found for ISBN " + checkIsbn + ": " + bookMap.get(checkIsbn));
        }

        bookMap.remove("955-45678");
        System.out.println("\nAfter removing 'Fahrenheit 451':");
        for (Book b : bookMap.values()) {
            System.out.println(b);
        }
    }
}
