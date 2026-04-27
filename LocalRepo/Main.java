class Transport {
    void move() {
        System.out.println("Transport are moving");
    }

    void fuel() {
        System.out.println("Transport uses fuel");
    }
}

// Bus class
class Bus extends Transport {
    void move() {
        System.out.println("Bus run on road");
    }

    void fuel() {
        System.out.println("Bus uses diesel");
    }
}

// Train class
class Train extends Transport {
    void move() {
        System.out.println("Train run on track");
    }

    void fuel() {
        System.out.println("Train uses electricity");
    }
}

// Aeroplane class
class Aeroplane extends Transport {
    void move() {
        System.out.println("Aeroplane fly in sky");
    }

    void fuel() {
        System.out.println("Aeroplane uses aviation fuel");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t;

        t = new Bus();
        t.move();
        t.fuel();

        System.out.println();

        t = new Train();
        t.move();
        t.fuel();

        System.out.println();

        t = new Aeroplane();
        t.move();
        t.fuel();
    }
}