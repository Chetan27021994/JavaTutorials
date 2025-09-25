public class Main{
    public static void main(String[] args) {
        String original = "My name is Chetan Bansal";


        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();


        System.out.println("The Original String is: " + original);
        System.out.println("The Reversed String is: " + reversed);
    }
}
