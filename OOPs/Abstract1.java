package OOPs;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // Reference of abstract class
        a.sound(); // Output: Dog barks
        a.sleep(); // Output: Animal is sleeping
    }
}
