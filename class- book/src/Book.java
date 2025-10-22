
public class Book {

    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Default Constructor:");
        printDetails();
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println("Constructor with Title and Author:");
        printDetails();
    }


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Constructor with Title, Author, and Price:");
        printDetails();
    }


    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }


    public static void main(String[] args) {

        Book book1 = new Book();


        Book book2 = new Book("Animal Farm", "George Orwell" , 12.99);


        Book book3 = new Book("Origin", "Dan Brown", 15.99);
    }
}

