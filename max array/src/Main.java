
class Main
{
    static int arr[] = {34, 56, 523, 66, 11};


     static int max()
    {

        int max = arr[0];


        for (int a = 1; a < arr.length; a++)

            if (arr[a] > max)

                max = arr[a];

        return max;
    }

    public static void main(String[] args)
    {

        System.out.println(max());
    }
}