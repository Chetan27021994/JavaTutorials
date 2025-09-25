class student
{
    String name;
    int rollnumber;

    student(String n , int r)
    {
        this.name=n;
                this.rollnumber=r;

    }
    public void display()
    {
        System.out.println("NAME: "+this.name);
        System.out.println("RollNumber: "+this.rollnumber);

    }
}
 public class Main
 {
 public static void main(String[] args)
 {
     student s1=new student("Rachel",45);
     s1.display();
 }
 }