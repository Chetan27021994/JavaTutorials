import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();


        char[] chars = str.toCharArray();


        Arrays.sort(chars);


        String sortedStr = new String(chars);

        System.out.println("Sorted characters: " + sortedStr);
    }
}
