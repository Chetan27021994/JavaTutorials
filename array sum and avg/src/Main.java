public class Main {
    public static void main (String[] args)
    {
        int[] array = {37,56,12,34};
        int length = array.length;
        int sum= 0;
        for (int a=0;a<length;a++) {
            sum = sum + array[a];
        }
        System.out.println("sum :" + sum);
        float average = (float)sum / length ;
        System.out.println("average:" + average);


    }
}