public class Main
{
    public static void main(String[] args)
    {
        int a[]= { 19, 23, 34,56,67,55};
        int searchnum= 55;
        boolean flag = false;

        for (int i=0;i<a.length;i++)
        {
            if(searchnum==a[i])
            {
                System.out.println("Number found at :" +i);
                flag=true;
                break;

            }
        }
        if (flag==false)
        {
            System.out.println("Number not found");
        }
    }
}