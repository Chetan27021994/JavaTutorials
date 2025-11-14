import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\iPC\\Desktop\\hello hello.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.trim().split("\\s+");


                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
