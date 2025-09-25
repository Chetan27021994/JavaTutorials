
public class Main {


    public int sum(int a, int b)
    { return (a + b); }


    public int sum(int a, int b, int c)
    {
        return (a + b + c);
    }


    public double sum(double a, double b)
    {
        return (a + b);
    }


    public static void main(String args[])
    {
        Main s = new Main();
        System.out.println(s.sum(13, 67));
        System.out.println(s.sum(45, 23, 78));
        System.out.println(s.sum(16.78, 27.58));
    }
}