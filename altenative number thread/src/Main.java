public class Main {
    public static final Object lock = new Object();
    public static int number = 1;
    public static final int MAX = 20;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {

                    if (number > MAX) break;

                    if (number % 2 == 1) {
                        System.out.println("Thread 1: " + number++);
                        lock.notify(); 
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (number > MAX) break;

                    if (number % 2 == 0) {
                        System.out.println("Thread 2: " + number++);
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
