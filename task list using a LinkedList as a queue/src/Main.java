import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Task List (Queue) ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Next Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Show All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    taskQueue.offer(task);
                    System.out.println("Task added!");
                }
                case 2 -> {
                    String nextTask = taskQueue.peek();
                    if (nextTask != null) {
                        System.out.println("Next task: " + nextTask);
                    } else {
                        System.out.println("No tasks in the list.");
                    }
                }
                case 3 -> {
                    String completedTask = taskQueue.poll();
                    if (completedTask != null) {
                        System.out.println("Completed task: " + completedTask);
                    } else {
                        System.out.println("No tasks to complete.");
                    }
                }
                case 4 -> {
                    if (taskQueue.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("All tasks:");
                        for (String t : taskQueue) {
                            System.out.println(" - " + t);
                        }
                    }
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
