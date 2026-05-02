package OOPs;

class Teacher {
    String name = "vivek";
    int age = 19;

    void display() {
        System.out.println("name is:" + name + "\n" + "age is:" + age);
    }
}

public class Simpleclassobject1 {
    public static void main(String[] args) {
        Teacher s1 = new Teacher();
        s1.display();
    }

}