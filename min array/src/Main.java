
class Main
{
    static int arr[] = {900, 45, 76, 9, 100};


    static int mini()
    {

        int min = arr[0];

        // Traversing and comparing max element
        for (int b = 1; b <arr.length; b++)


            if (arr[b] < min)


                min = arr[b];

        return min;
    }

    public static void main(String[] args)
    {

        System.out.println(mini());
    }
}