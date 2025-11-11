import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
        return String.format("%s by %s (%d)", title, author, year);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", 1953));


        books.sort(Comparator
                .comparing(Book::getTitle)
                .thenComparing(Book::getAuthor));

        System.out.println("Books sorted by title, then author:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
