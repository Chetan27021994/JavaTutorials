

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }


    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Step " + i);
            try {

                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " finished!");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Download Task"));
        Thread t2 = new Thread(new Task("File Writing Task"));

        System.out.println("Starting both threads...");

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished!");
    }
}
