import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bunty", 450);
        map.put("Babli", 289);
        map.put("Madan", 985);

        List<Thread> threads = new ArrayList<>();

        map.forEach((key, value) -> {
            Thread t = new Thread(() -> {
                try {
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("[" + key + "] iteration " + i);
                        Thread.sleep(789);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interrupted: " + key);
                }
            });
            t.start();
            threads.add(t);
        });


        for (Thread t : threads) {
            t.join();
        }

        System.out.println("All threads completed.");
    }
}
