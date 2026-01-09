import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.Collections;

public class SimpleLibrary {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=================================");
        System.out.println("   Welcome to the Library System  ");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        // Current date
        Date today = new Date();
        System.out.println("Today's Date: " + today);

        // Due date (7 days later)
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 15);
        Date dueDate = cal.getTime();

        // Store book names
        ArrayList<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Python");
        books.add("C++");

        // Sort books
        Collections.sort(books);

        // Book ID and status
        HashMap<Integer, String> library = new HashMap<>();
        Random rand = new Random();

        for (String book : books) {
            int id = rand.nextInt(7680) + 56;
            library.put(id, "Available");
        }

        // Display books
        System.out.println("\nLibrary Books (BookID : Status)");
        System.out.println(library);

        // Check out a book
        System.out.print("\nEnter Book ID to check out: ");
        int bookId = sc.nextInt();

        if (library.containsKey(bookId)) {
            library.put(bookId, "Checked Out");
            System.out.println("Book checked out successfully.");
            System.out.println("Due Date: " + dueDate);
        } else {
            System.out.println("Invalid Book ID.");
        }

        sc.close();
    }
}




