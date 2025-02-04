// Interface with method signatures
interface SoundMaker {
    void makeSound();
    String getSoundType();
}

// Abstract class with both concrete and abstract methods
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " eats.");
    }

    abstract void move();
}

// Concrete class extending abstract class and implementing interface
class Dog extends Animal implements SoundMaker {
    Dog(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println(name + " runs around happily...");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof Woof!!!!");
    }

    @Override
    public String getSoundType() {
        return "Barking";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        // Test methods from Dog class, abstract class, and interface
        myDog.eat();           // Inherited from abstract class
        myDog.move();          // Implemented in concrete class
        myDog.makeSound();     // Implemented from interface
        System.out.println("Sound type: " + myDog.getSoundType());
    }
}
