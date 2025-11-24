import java.util.Scanner;

public class Main {


    static class Book {
        public String title;
        public String author;
        public double price;


        public Book() {
            this.title = "";
            this.author = "";
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
    }


    static class Textbook extends Book {
        public String subject;

        public Textbook() {
            super();
            this.subject = "";
        }

        public Textbook(String subject) {
            super();
            this.subject = subject;
        }

        public Textbook(String title, String author, double price, String subject) {
            super(title, author, price);
            this.subject = subject;
        }

        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }


        public String toString() {
            return "Textbook{" +
                    "title='" + getTitle() + '\'' +
                    ", author='" + getAuthor() + '\'' +
                    ", price=" + getPrice() +
                    ", subject='" + subject + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter textbook information:");

        System.out.print("Title: ");
        String title = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Subject: ");
        String subject = input.nextLine();


        Textbook userBook = new Textbook(title, author, price, subject);

        System.out.println("\nYou entered:");
        System.out.println(userBook);

        input.close();
    }
}
