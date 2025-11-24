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


        Textbook tb1 = new Textbook();
        tb1.setTitle("Inferno");
        tb1.setAuthor("Dan Brown");
        tb1.setPrice(15.99);
        tb1.setSubject("Fiction");


        Textbook tb2 = new Textbook("Biology");


        Textbook tb3 = new Textbook("Basic Maths", "RD Sharma", 29.90, "Maths");


        System.out.println(tb1);
        System.out.println(tb2);
        System.out.println(tb3);
    }
}
