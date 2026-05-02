package OOPs;

class Car1 {
    String model;
    int year;

    public void printinfo() {
        System.out.println(this.model);
        System.out.println(this.year);
    }

    Car1() {
        System.out.println("non-parameteraised constructor");
    }
}

public class non_parameter {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.model = "generic model";
        c1.year = 2023;
        c1.printinfo();
    }
}
