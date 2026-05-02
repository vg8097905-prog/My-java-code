package OOPs;

class Student3 {
    String name;
    int age;

    // Default constructor
    Student3() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student3(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student3 s1 = new Student3(); // Calls default constructor
        Student3 s2 = new Student3("Vivek", 22); // Calls parameterized constructor
        s1.display(); // Output: Name: Unknown, Age: 0
        s2.display(); // Output: Name: Vivek, Age: 22
    }
}
