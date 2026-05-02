package OOPs;

// Parent class
class Animal1 {
    void eat1() {
        System.out.println("This animal eats food.");
    }
}

// Child class inherits from Animal
class Dog1 extends Animal1 {
    void bark1() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat1(); // Inherited method
        d.bark1(); // Child method
    }
}
