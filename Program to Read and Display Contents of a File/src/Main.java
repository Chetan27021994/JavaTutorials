import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("Contents of " + fileName + ":");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
