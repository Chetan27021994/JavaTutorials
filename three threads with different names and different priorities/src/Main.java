

class WorkerThread extends Thread {
    public WorkerThread(String name, int priority) {
        setName(name);              // set thread name
        setPriority(priority);      // set thread priority
    }


    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(
                    getName() + " (Priority: " + getPriority() + ") - iteration " + i
            );
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " finished!");
    }
}

public class Main {
    public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread("LowPriorityThread", Thread.MIN_PRIORITY);     // 1
        WorkerThread t2 = new WorkerThread("NormalPriorityThread", Thread.NORM_PRIORITY); // 5
        WorkerThread t3 = new WorkerThread("HighPriorityThread", Thread.MAX_PRIORITY);    // 10

        System.out.println("Starting all threads...\n");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nAll threads have completed!");
    }
}
