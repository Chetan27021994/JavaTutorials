class Counter {
    public int count = 0;

    public void increment(String threadName) {
        int temp = count;
        System.out.println(threadName + " read count: " + temp);
        try {

            Thread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp = temp + 1;
        System.out.println(threadName + " updating count to: " + temp);
        count = temp;
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 12; i++) {
                counter.increment(threadName);
            }
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nExpected count: 10");
        System.out.println("Actual final count: " + counter.getCount());
    }
}
