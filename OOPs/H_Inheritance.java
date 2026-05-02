package OOPs;

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void display1() {
        System.out.println("Child1 class");
    }
}

class Child2 extends Parent {
    void display2() {
        System.out.println("Child2 class");
    }
}

public class H_Inheritance {
    public static void main(String[] args) {
        Child2 p1 = new Child2();
        p1.show();
        p1.display2();

    }
}