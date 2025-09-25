

public class MyThread extends Thread {


    public void run() {

        for (int i = 1; i <= 8; i++) {
            System.out.println("Thread running: " + i);

            try {

                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }


    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();


        for (int i = 1; i <= 8; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
