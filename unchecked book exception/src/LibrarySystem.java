
class InvalidBookIDException extends RuntimeException {


    public InvalidBookIDException() {
        super("Invalid Book ID provided.");
    }


    public InvalidBookIDException(String message) {
        super(message);
    }


    public InvalidBookIDException(String message, Throwable cause) {
        super(message, cause);
    }


    public InvalidBookIDException(Throwable cause) {
        super(cause);
    }
}


public class LibrarySystem {


    public void findBookById(String bookId) {
        if (bookId == null || !bookId.matches("[A-Z]{3}-\\d{4}")) {
            throw new InvalidBookIDException("Book ID '" + bookId + "' is not valid. It must follow the format ABC-1234.");
        }

        System.out.println("Book with ID " + bookId + " found successfully!");
    }


    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        
        library.findBookById("ABC-1234");


        try {
            library.findBookById("1234");
        } catch (InvalidBookIDException e) {
            System.err.println(" Error: " + e.getMessage());
        }
    }
}
