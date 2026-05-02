package OOPs;

class Person {
    String name;

    // Parent class constructor
    Person(String n) {
        name = n;
        System.out.println("Person constructor called");
    }
}

class Engineer extends Person {
    int age;

    // Child class constructor
    Engineer(String n, int a) {
        super(n); // Calls parent class constructor
        age = a;
        System.out.println("Student constructor called");
    }

    /*
     * Super:-It acts as a bridge thrt allows a child class to access members-such
     * as
     * variables,methods,and constructor-that belong to parent class, even if they
     * have been hidden or overhidden.
     */
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Super {
    public static void main(String[] args) {
        Engineer s1 = new Engineer("Sunder Pichai", 45);
        s1.display();
        // Output:
        // Person constructor called
        // Student constructor called
        // Name: Vivek, Age: 22
    }
}
