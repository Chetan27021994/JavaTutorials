public class Main
{

    public static void main(String[] args) {
        String input = "I am Chetan Bansal";

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}

