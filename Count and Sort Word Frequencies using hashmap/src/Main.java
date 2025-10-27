import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        scanner.close();

        // Convert text to lowercase and split into words
        String[] words = text.toLowerCase().split("\\W+");

        // Use a HashMap to count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Convert entries to a list for sorting
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());

        // Sort by frequency in descending order
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display the results
        System.out.println("\nWord Frequencies (sorted by count):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
