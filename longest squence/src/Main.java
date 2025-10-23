import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        String lrs = findLongestRepeatingSequence(str);

        if (lrs.length() > 0)
            System.out.println("Longest repeating sequence: " + lrs);
        else
            System.out.println("No repeating sequence found.");
    }

    public static String findLongestRepeatingSequence(String str) {
        int n = str.length();
        String longest = "";


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String sub = str.substring(i, j);


                if (str.indexOf(sub, j) != -1 && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }
}
