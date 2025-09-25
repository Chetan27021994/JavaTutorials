// MyRunnable.java

public class Main implements Runnable {

    // Implement the run() method
    @Override
    public void run() {
        // This code will run in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread: " + i);

            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted.");
            }
        }
    }

    // Main method to start the thread
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object and pass the Runnable instance to it
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Main thread continues
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
