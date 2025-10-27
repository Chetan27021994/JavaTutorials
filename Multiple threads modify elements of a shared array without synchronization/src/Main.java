public class Main {
    private static int[] data = new int[5];

    public static void main(String[] args) throws InterruptedException {
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < data.length; i++) {
                data[i] = 1;
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 0; i < data.length; i++) {
                data[i] = 2;
            }
        });

        writer1.start();
        writer2.start();
        writer1.join();
        writer2.join();


        System.out.print("Array content: ");
        for (int n : data) System.out.print(n + " ");
    }
}
