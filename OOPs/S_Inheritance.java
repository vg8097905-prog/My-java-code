package OOPs;

class Grandparent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Grandparent {
    void display() {
        System.out.println("Child class");
    }
}

public class S_Inheritance {
    public static void main(String[] args) {
        Child d = new Child();
        d.show(); // Inherited method
        d.display(); // Child method
    }
}