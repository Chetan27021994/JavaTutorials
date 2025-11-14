import java.io.*;


class Book implements Serializable {
    public static final long serialVersionUID = 1L;

    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {

        Book book = new Book("Kafka on the Shore", "Murakami", 15.76);


        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("book.ser"))) {

            oos.writeObject(book);
            System.out.println("Book serialized successfully!");
        }
        catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }


        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("book.ser"))) {

            Book deserializedBook = (Book) ois.readObject();
            System.out.println("Deserialized Book:");
            System.out.println(deserializedBook);

        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
