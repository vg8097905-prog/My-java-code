package OOPs;

abstract class Vehicle1 {
    abstract void start(); // what to do

    abstract void stop();

    void fuelType() {
        System.out.println("Uses fuel or battery");
    }
}

// Child class 1
class Car extends Vehicle1 {
    void start() {
        System.out.println("Car starts with key or button");
    }

    void stop() {
        System.out.println("Car stops using brake");
    }
}

// Child class 2
class Bike extends Vehicle1 {
    void start() {
        System.out.println("Bike starts with kick or self-start");
    }

    void stop() {
        System.out.println("Bike stops using brake");
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Vehicle1 v1 = new Car();
        v1.start();
        v1.stop();
        v1.fuelType();

        System.out.println();

        Vehicle1 v2 = new Bike();
        v2.start();
        v2.stop();
        v2.fuelType();
    }
}