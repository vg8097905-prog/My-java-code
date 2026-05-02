package OOPs;

class Animal_Kingdom {
    void gpmethod() {
        System.out.println("Animal_Kingdom");
    }
}

class Bird extends Animal_Kingdom {
    void pmethod() {
        System.out.println("Bird");
    }
}

class Sparrow extends Bird {
    void cmethod() {
        System.out.println("Sparrow");
    }
}

public class ML_Inheritance {
    public static void main(String[] args) {
        Sparrow G1 = new Sparrow();
        G1.gpmethod();
        G1.pmethod();
        G1.cmethod();
    }
}
