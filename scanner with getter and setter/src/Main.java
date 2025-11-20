import java.util.Scanner;


class Book {
    private String title;
    private String author;
    private double price;


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


    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }


    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }


    public void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        Book userBook = new Book(title, author, price);


        userBook.display();

        sc.close();
    }
}
