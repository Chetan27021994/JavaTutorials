import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for Student " + i + ": ");
            marks = scanner.nextInt();

            char grade;

            if (marks > 90) {
                grade = 'A';
            } else if (marks > 70) {
                grade = 'B';
            } else if (marks >= 40) {
                grade = 'C';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " Grade: " + grade);
        }

        scanner.close();
    }
}
