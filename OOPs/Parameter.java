package OOPs;

class Student1 {
    String name;
    int age;

    public void printinfo() {
        System.out.println(name + "  " + age);

    }

    Student1(String name, int age) {
        this.name = name;// object assign values.
        this.age = age;
    }

}

public class Parameter {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Vivek", 20);
        s1.printinfo();

    }
}
