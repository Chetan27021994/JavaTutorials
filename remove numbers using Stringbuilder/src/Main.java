public class Main {
    public static void main(String[] args) {
        String input = "1 am a 12345ytrrg5443437ggg";
        String result = removeDigits(input);
        System.out.println("Original: " + input);
        System.out.println("Without digits: " + result);
    }

    public static String removeDigits(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
