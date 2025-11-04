public class Book {

    public String title;
    public  String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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


    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }


    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        book1.displayInfo();


        book1.setTitle("Animal Farm");
        System.out.println("\nAfter updating title:");
        book1.displayInfo();
    }
}
