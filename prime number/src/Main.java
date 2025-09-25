public class Main
{
    public static void main(String[] args)
    {
        int num= 25;
        int count=0;


        {

            for (int a = 1; a <= num; a++)
            {
                if (num % a == 0)
                    count++;
            }
            if (count == 2)
            {
                System.out.println("The number is Prime");
            } else
            {
                System.out.println("The number is not a Prime");
            }

            else
            {

                System.out.println("The number is not a  Prime");
            }
        }
    }
}