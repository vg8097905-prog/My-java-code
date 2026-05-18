import Controlstatement.Innercalci;

class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with two different parameter
    double add(double a, double b) {
        return a + b;
    }

    public class Innercalci extends Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }
}

public class Calculator1 {
    public static void main(String[] args) {

        Innercalci a2 = new Innercalci();

        System.out.println(a2.add(4, 6));
    }

}
