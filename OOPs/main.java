
abstract class Vehicle {
    abstract void start();   // what to do
    abstract void stop();

    void fuelType() {
        System.out.println("Uses fuel or battery");
    }
}

// Child class 1
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key or button");
    }

    void stop() {
        System.out.println("Car stops using brake");
    }
}
// Child class 2
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick or self-start");
    }

    void stop() {
        System.out.println("Bike stops using brake");
    }
}
public class main{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
        v2.fuelType();
    }
}