package OOPs;

class Student{
    String name;
    int age;
    
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("non-parameteraised constructor");
    }
}

public class non_parameter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Vivek";
        s1.age=19;
        s1.printinfo();
    }
    
}



