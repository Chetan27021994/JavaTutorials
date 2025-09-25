import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String text = "apple banana apple orange banana apple";


        String[] words = text.toLowerCase().split("\\s+");


        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {

                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }


        System.out.println("Word Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " = " + wordCount.get(word));
        }
    }
}
