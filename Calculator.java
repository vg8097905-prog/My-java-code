public class Calculator {

    int a;
    int b;
    int result;

    // set first number
    void setNum1(int n1) {
        a = n1;
    }

    // set second number
    void setNum2(int n2) {
        b = n2;
    }

    // addition
    void add() {
        result = a + b;
        System.out.println("Addition: " + result);
    }

    // subtraction
    void subtract() {
        result = a - b;
        System.out.println("Subtraction: " + result);
    }

    // multiplication
    void multiply() {
        result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // division
    void divide() {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            result = a / b;
            System.out.println("Division: " + result);
        }
    }

    public static void main(String[] args) {

        // creating objects (like s1 and s2 in your image)
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setNum1(10);
        c1.setNum2(5);

        c2.setNum1(20);
        c2.setNum2(4);

        // calling methods
        c1.add();
        c1.subtract();

        c2.multiply();
        c2.divide();
    }
}