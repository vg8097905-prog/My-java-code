package OOPs;

abstract class Vehicle {
    abstract void refuel(); // what action is needed
}

// Electric vehicle
class ElectricCar extends Vehicle {
    void refuel() {
        System.out.println("Charge the battery");
    }
}

// Petrol vehicle
class PetrolCar extends Vehicle {
    void refuel() {
        System.out.println("Fill petrol");
    }
}

// Diesel vehicle
class Truck extends Vehicle {
    void refuel() {
        System.out.println("Fill diesel");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        v1.refuel();
        System.out.println();

        Vehicle v2 = new PetrolCar();
        v2.refuel();
        System.out.println();

        Vehicle v3 = new Truck();
        v3.refuel();
        System.out.println();
    }
}
