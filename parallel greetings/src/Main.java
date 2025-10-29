

class GreetingThread extends Thread {
    private String message;

    public GreetingThread(String message) {
        this.message = message;
    }


    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println(message);
                Thread.sleep(350);
            }
        } catch (InterruptedException e) {

        }
        System.out.println(message + " thread stopped.");
    }
}

public class Main {
    public static void main(String[] args) {

        GreetingThread morning = new GreetingThread("Good Morning");
        GreetingThread afternoon = new GreetingThread("Good Afternoon");
        GreetingThread night = new GreetingThread("Good Night");


        morning.start();
        afternoon.start();
        night.start();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }


        morning.interrupt();
        afternoon.interrupt();
        night.interrupt();

        System.out.println("All greeting threads stopped!");
    }
}
