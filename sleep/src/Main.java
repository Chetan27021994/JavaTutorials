

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");

        for (int i = 1; i <= 16; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }

        System.out.println("Main thread ends.");
    }
}
