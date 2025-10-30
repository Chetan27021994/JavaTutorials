public class Main {
    public static void main(String[] args) {
        String input = "  D@anc3er  1235 cri33ker j@v@   ";
        String result = cleanString(input);
        System.out.println("Original: [" + input + "]");
        System.out.println("Cleaned: [" + result + "]");
    }

    public static String cleanString(String str) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }


        String cleaned = sb.toString();


        cleaned = cleaned.replaceAll("\\s+", " ").trim();

        return cleaned;
    }
}
