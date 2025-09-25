//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


     static int largest(int x , int y , int z ) {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;


}
    public static void main(String[] args) {
        int a, b, c, largestofthree;
        a = 23;
        b = 45;
        c = 89;
        largestofthree = largest(a, b, c);

        System.out.println(largestofthree + " is the largest");
    }}
