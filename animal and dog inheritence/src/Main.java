
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }


    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}


class Dog extends Animal {
    private String breed;


    public Dog(String name, String breed) {
        super(name); // Call parent constructor
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}


public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Generic Animal");
        a1.displayInfo();
        a1.makeSound();

        System.out.println();


        Dog d1 = new Dog("Rocket", "Pug");
        d1.displayInfo();
        d1.makeSound();
    }
}
