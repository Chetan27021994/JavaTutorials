import java.io.*;

public class Main
{
    public static void main(String[] args) {
        // Change these file paths as needed
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(destinationFile)
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred during file copy:");
            e.printStackTrace();
        }
    }
}
