
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        input = input.toLowerCase();

        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (Character.isLetter(ch) && !isVowel(ch)) {
                consonantCount++;
            }
        }

        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }


    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
