import java.util.HashSet;
import java.util.Objects;


class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name);
    }



    public int hashCode() {
        return Objects.hash(name, rollNo);
    }


    public String toString() {
        return name + " (" + rollNo + ")";
    }
}

public class Main
{
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Vinod", 13451));
        students.add(new Student("Bobby", 145642));
        students.add(new Student("Mary", 15553));
        students.add(new Student("Zyan", 15434));


        System.out.println("Students in HashSet: " + students);
        System.out.println("Number of students: " + students.size());
    }
}
