class PrimeSumTask extends Thread {
    public final int start;
    public final int end;
    public long partialSum = 0;

    public PrimeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public long getPartialSum() {
        return partialSum;
    }


    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                partialSum += i;
            }
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int range = 1234;
        int numberOfThreads = 4;
        PrimeSumTask[] tasks = new PrimeSumTask[numberOfThreads];

        int chunkSize = range / numberOfThreads;
        int start = 1;


        for (int i = 0; i < numberOfThreads; i++) {
            int end = (i == numberOfThreads - 1) ? range : start + chunkSize - 1;
            tasks[i] = new PrimeSumTask(start, end);
            tasks[i].start();
            start = end + 1;
        }


        int totalSum = 0;
        for (PrimeSumTask task : tasks) {
            task.join();
            totalSum += task.getPartialSum();
        }

        System.out.println("Total sum of prime numbers from 1 to " + range + " is: " + totalSum);
    }
}
