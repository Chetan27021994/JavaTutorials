
class Book {
    public String title;
    public String author;
    public double price;


    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {


        Book b1 = new Book();
        b1.display();


        Book b2 = new Book("Inferno", "Dan Brown", 18.09);
        b2.display();


        b1.setTitle("Emma");
        b1.setAuthor("Jane Austen");
        b1.setPrice(13.99);


        b1.display();


        System.out.println("Title from getter: " + b2.getTitle());
        System.out.println("Author from getter: " + b2.getAuthor());
        System.out.println("Price from getter: $" + b2.getPrice());
    }
}
