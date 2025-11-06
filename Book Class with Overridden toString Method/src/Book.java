public class Book {

    private String title;
    private String author;
    private double price;
    private String isbn;


    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }



    public String toString() {
        return "Book Details:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Price: $" + price + "\n" +
                "ISBN: " + isbn;
    }


    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 10.99, "978-123442");
        Book book2 = new Book("1984", "George Orwell", 10.50, "978-6765555");

        // When you print an object, Java automatically calls toString()
        System.out.println(book1);
        System.out.println("---------------------------");
        System.out.println(book2);
    }
}
