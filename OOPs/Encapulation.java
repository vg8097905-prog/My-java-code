package OOPs;

class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String n) {
        name = n;
    }

    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method with validation
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Encapulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Using setters to assign values
        s.setName("Vivek");
        s.setAge(28);

        // Using getters to access values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
