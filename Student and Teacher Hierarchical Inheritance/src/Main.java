
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}


class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: $" + salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bob", 25, "Art");
        Teacher t = new Teacher("Mrs Rogers ", 55, 68000);

        System.out.println("Student Info:");
        s.displayInfo();

        System.out.println("\nTeacher Info:");
        t.displayInfo();
    }
}
