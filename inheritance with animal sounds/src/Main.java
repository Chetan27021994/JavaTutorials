// Base class
class Animal {

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

        Cat myCat = new Cat();
        myCat.makeSound(); //
    }
}
