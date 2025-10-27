public class Main{
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 2000000, Actual: " + counter);
    }
}
