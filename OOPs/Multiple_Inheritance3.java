package OOPs;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Multiple_Inheritance3 {
    public static void main(String[] args) {
        C a1 = new C();
        a1.methodA();
        a1.methodB();
    }
}