package OOPs;

class Student4 {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student4(Student4 s2) {
        this.name = s2.name;// object assign values.
        this.age = s2.age;
    }

    Student4() {
    }
}

public class copy_constr {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        s1.name = "Vivek";
        s1.age = 25;
        Student4 s2 = new Student4(s1);
        s2.printinfo();
    }
}
