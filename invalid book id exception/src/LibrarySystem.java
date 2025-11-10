
class InvalidBookIDException extends Exception {


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


public class LibrarySystem  {


    public void findBookById(String bookId) throws InvalidBookIDException {
        if (bookId == null || !bookId.matches("[A-Z]{3}-\\d{4}")) {
            throw new InvalidBookIDException("Book ID '" + bookId + "' is not valid. It must follow the format ABC-1234.");
        }

        System.out.println(" Book with ID " + bookId + " found successfully!");
    }


    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        try {

            library.findBookById("ABC-1234");


            library.findBookById("1234");
        } catch (InvalidBookIDException e) {
            System.err.println(" Error: " + e.getMessage());
        }
    }
}
