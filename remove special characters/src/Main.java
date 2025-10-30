public class Main {
    public static void main(String[] args) {
        String input = " Ab 2 4 ?ddv ==-0 W0rld!1934oct #J@v@";
        String result = removeDigitsAndPunctuation(input);
        System.out.println("Original: " + input);
        System.out.println("Cleaned: " + result);
    }

    public static String removeDigitsAndPunctuation(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Keep only letters (a–z, A–Z) and spaces
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
