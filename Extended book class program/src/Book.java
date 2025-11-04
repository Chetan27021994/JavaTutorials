public class Book {

    public String title;
    public String author;
    public int publicationYear;
    public String isbn;
    public double price;


    public Book(String title, String author, int publicationYear, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + isbn);
        System.out.printf("Price: $%.2f%n", price);
    }


    public static void main(String[] args) {
        Book book1 = new Book(
                "1984",
                "George Orwell",
                1949,
                "9780743273565",
                8.66
        );

        book1.displayInfo();


        book1.setPrice(14.87);
        book1.setPublicationYear(1984);

        System.out.println("\nAfter updating book details:");
        book1.displayInfo();
    }
}
