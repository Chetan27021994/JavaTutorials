public class Main
{
    public static void main(String[] args) {
        String input = "My Name is Chetan Bansal";

        int vowelCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
            }
        }

        System.out.println("String: " + input);
        System.out.println("Vowel Count is : " + vowelCount);
    }
}
