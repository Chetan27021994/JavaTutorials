import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();


        colors.add("Blue");
        colors.add("Orange");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Pink");
        colors.add("Blue");


        System.out.println("HashSet contents:");
        for (String color : colors) {
            System.out.println(color);
        }


        System.out.println("Total unique colors: " + colors.size());
    }
}
