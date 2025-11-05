
class Book {
    private String title;
    private String author;
    private double price;


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
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}


class Textbook extends Book {
    private String subject;


    public Textbook(String title, String author, double price, String subject) {
        super(title, author, price); // Call superclass constructor
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override displayInfo to include subject
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Textbook tb = new Textbook("Introduction to Algorithms", "Thomas H. Cormen", 89.99, "Computer Science");

        tb.displayInfo();

        System.out.println("\nUpdating subject...");
        tb.setSubject("Data Structures");
        tb.displayInfo();
    }
}
