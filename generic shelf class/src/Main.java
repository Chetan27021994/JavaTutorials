// Generic Shelf class
class Shelf<T> {
    public T item;


    public void put(T item) {
        this.item = item;
    }


    public T get() {
        return item;
    }
}


public class Main {
    public static void main(String[] args) {

        Shelf<String> stringShelf = new Shelf<>();
        stringShelf.put("Shoes");
        System.out.println("String shelf contains: " + stringShelf.get());


        Shelf<Integer> intShelf = new Shelf<>();
        intShelf.put(67);
        System.out.println("Integer shelf contains: " + intShelf.get());


        Shelf<Person> personShelf = new Shelf<>();
        personShelf.put(new Person("Vinod", 35));
        System.out.println("Person shelf contains: " + personShelf.get());
    }
}


class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (age " + age + ")";
    }
}
