
// Fibonacci series program in Java
// using iterative approach
import java.io.*;

class Main
{
    static void Fibonacci(int N)
    {
        int x= 0, y = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(x + " ");

            int z = x+y;
            x = y;
            y = z;    }
    }


    public static void main(String args[])
    {
        int N = 15;

        Fibonacci(N);
    }
}