public class Student {
    public String name;
    public  int age;
    public String studentId;
    public  double grade;


    public Student(String name, int age, String studentId, double grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }



    public String toString() {
        return "Student Information:\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Student ID: " + studentId + "\n" +
                "Grade: " + grade;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Victor Hugo", 31, "STU123", 79.5);
        Student s2 = new Student("Frieda Kahlo", 27, "STU890", 62.0);


        System.out.println(s1);
        System.out.println("--------------------------------------");
        System.out.println(s2);
    }
}
