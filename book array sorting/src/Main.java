import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

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



    public int compareTo(Book other) {
        int titleCompare = this.title.compareTo(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }

        int authorCompare = this.author.compareTo(other.author);
        if (authorCompare != 0) {
            return authorCompare;
        }

        return Integer.compare(this.year, other.year);
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


        Collections.sort(books);

        System.out.println("Books sorted by title, then author, then year:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
