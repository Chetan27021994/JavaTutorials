class SumThread implements Runnable {
    private int[] arr;
    private int start;
    private int end;
    private int partialSum = 0;


    public SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }


    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += arr[i];
        }
        System.out.println(Thread.currentThread().getName() + " calculated partial sum: " + partialSum);
    }


    public int getPartialSum() {
        return partialSum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = {18, 25, 73, 80, 566, 123}; // Example array

        int mid = numbers.length / 2;


        SumThread t1 = new SumThread(numbers, 0, mid);
        SumThread t2 = new SumThread(numbers, mid, numbers.length);


        Thread thread1 = new Thread(t1, "Thread-1");
        Thread thread2 = new Thread(t2, "Thread-2");


        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int totalSum = t1.getPartialSum() + t2.getPartialSum();

        System.out.println("Total sum of array = " + totalSum);
    }
}
