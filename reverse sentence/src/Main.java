import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();


        String[] words = sentence.split(" ");


        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);


            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
