public class Main {
    public static void main(String[] args) {
        String input = "Love you like a love song baby";
        String result = removeVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Without vowels: " + result);
    }

    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!isVowel(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
