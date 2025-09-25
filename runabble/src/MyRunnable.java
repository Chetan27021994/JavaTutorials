// MyRunnable.java

public class MyRunnable implements Runnable {



    public void run() {

        for (int i = 1; i <= 12; i++) {
            System.out.println("Runnable thread: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();


        Thread thread = new Thread(myRunnable);


        thread.start();


        for (int i = 1; i <= 12; i++) {
            System.out.println("Main thread: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
