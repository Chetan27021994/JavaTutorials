import java.util.*;


class Book {
    public String id;
    public String title;
    public String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }



    public String toString() {
        return String.format("Book[ID=%s, Title=%s, Author=%s]", id, title, author);
    }
}


public class Main {

    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();


        books.add(new Book("ABC-1234", "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("DEF-2348", "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("GHI-9099", "Animal Farm", "George Orwell"));
        books.add(new Book("JKL-0985", "Moby Dick", "Herman Melville"));
        books.add(new Book("MNO-2423", "Emma", "Jane Austen"));

        System.out.println("📚 Before Sorting:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort by title using Comparator
        books.sort(Comparator.comparing(Book::getTitle));

        System.out.println("\n✅ After Sorting by Title:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
