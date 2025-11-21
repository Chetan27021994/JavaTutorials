import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {


        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Honey", 234);
        map.put("Lucy", 654);
        map.put("Kamal", 843);


        map.forEach((key, value) -> {

            Thread thread = new Thread(() -> {
                try {
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(
                                Thread.currentThread().getName() +
                                        " -> " + key + " : " + value +
                                        " (iteration " + i + ")"
                        );
                        Thread.sleep(700);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + key);
                }
            });

            thread.setName("Worker-" + key);
            thread.start();
        });
    }
}
