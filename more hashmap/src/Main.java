import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student Age");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    students.put(name, age);
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (students.containsKey(searchName)) {
                        System.out.println("Age: " + students.get(searchName));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to update: ");
                    String updateName = scanner.nextLine();
                    if (students.containsKey(updateName)) {
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        students.put(updateName, newAge);
                        System.out.println("Age updated!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (students.containsKey(deleteName)) {
                        students.remove(deleteName);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- All Students ---");
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        for (Map.Entry<String, Integer> entry : students.entrySet()) {
                            System.out.println(entry.getKey() + " → " + entry.getValue());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
