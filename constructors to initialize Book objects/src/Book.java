public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
    private double price;


    public Book(String title, String author, int publicationYear, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = 0; // default value
        this.isbn = "Unknown";
        this.price = 0.0;
    }


    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.publicationYear = 0;
        this.isbn = "N/A";
        this.price = 0.0;
    }


    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + isbn);
        System.out.printf("Price: $%.2f%n", price);
    }


    public static void main(String[] args) {
        // Using full constructor
        Book book1 = new Book("1984", "George Orwell", 1949, "9780451524935", 9.99);
        book1.displayInfo();

        System.out.println("\n--------------------------");


        Book book2 = new Book("Animal Farm", "George Orwell");
        book2.displayInfo();

        System.out.println("\n-------------");


        Book book3 = new Book();
        book3.displayInfo();
    }
}
