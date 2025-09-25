

public class Main {

    static class Counter {
        int count = 0;

        public void increment() {
            count++;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();


        Runnable task = () -> {
            for (int i = 0; i < 1500; i++) {
                counter.increment();
            }
        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final count (should be 2000): " + counter.count);
    }
}
