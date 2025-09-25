

public class Main {

    public static void main(String[] args) {

        Runnable evenRunnable = () -> {
            for (int i = 2; i <= 28; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Even thread interrupted.");
                }
            }
        };


        Runnable oddRunnable = () -> {
            for (int i = 1; i <= 29; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Odd thread interrupted.");
                }
            }
        };


        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();
    }
}
