public class Main {


    public static void divideString(String str, int n) {
        int length = str.length();


        if (length % n != 0) {
            System.out.println("Cannot divide the string into " + n + " equal parts.");
            return;
        }

        int partSize = length / n;

        System.out.println("Dividing \"" + str + "\" into " + n + " equal parts:");
        for (int i = 0; i < length; i += partSize) {
            String part = str.substring(i, i + partSize);
            System.out.println(part);
        }
    }


    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwx";
        int numberOfParts = 4;

        divideString(input, numberOfParts);
    }
}
