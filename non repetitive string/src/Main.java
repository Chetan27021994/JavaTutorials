import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int index = findFirstNonRepeatingIndex(input);

        if (index != -1) {
            System.out.println("Index of first non-repeating character: " + index);
            System.out.println("Character: " + input.charAt(index));
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    public static int findFirstNonRepeatingIndex(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
