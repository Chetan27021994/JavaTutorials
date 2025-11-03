import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    // Constructor
    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Display method
    public void display() {
        System.out.println(name + " (Age: " + age + ", Grade: " + grade + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add custom Student objects
        students.add(new Student("Mona", 22, 76.9));
        students.add(new Student("Monet", 27, 92.8));
        students.add(new Student("Van", 33, 58.5));
        students.add(new Student("Pablo", 23, 89.2));

        System.out.println("🔹 Before Sorting:");
        students.forEach(Student::display);


        students.sort((s1, s2) -> Double.compare(s1.grade, s2.grade));

        System.out.println("\n🔹 After Sorting by Grade (Ascending):");
        students.forEach(Student::display);


        students.sort((s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("\n🔹 After Sorting by Name (Alphabetically):");
        students.forEach(Student::display);


        students.sort((s1, s2) -> Integer.compare(s2.age, s1.age));

        System.out.println("\n🔹 After Sorting by Age (Descending):");
        students.forEach(Student::display);
    }
}
