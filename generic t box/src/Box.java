
public class Box<T> {
    private T content;


    public Box(T content) {
        this.content = content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    // Getter
    public T getContent() {
        return content;
    }


    public void showType() {
        System.out.println("Type of T: " + content.getClass().getName());
    }
    
    public static void main(String[] args) {
        // Box holding an Integer
        Box<Integer> intBox = new Box<>(123);
        intBox.showType();
        System.out.println("Value: " + intBox.getContent());

        // Box holding a String
        Box<String> strBox = new Box<>("Hello, Generics!");
        strBox.showType();
        System.out.println("Value: " + strBox.getContent());

        // Box holding a custom object
        Box<Person> personBox = new Box<>(new Person("Alice", 30));
        personBox.showType();
        System.out.println("Value: " + personBox.getContent());
    }
}

// A simple class to demonstrate generic usage
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " years old)";
    }
}
