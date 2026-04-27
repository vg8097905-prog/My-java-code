 class Student {

    String name;
    int age;
    int rollNo;

    // set name
    void setName(String nm) {
        name = nm;
    }

    // set age
    void setAge(int ag) {
        age = ag;
    }

    // set roll number
    void setRollNo(int rno) {
        rollNo = rno;
    }

    // display student information
    void displayInfo() {
        System.out.println(name + " is " + age + " years old with Roll No " + rollNo);
    }

    public static void main(String[] args) {

        // creating objects (like s1 and s2 in the photo)
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("John");
        s1.setAge(20);
        s1.setRollNo(101);

        s2.setName("Maria");
        s2.setAge(21);
        s2.setRollNo(105);

        s1.displayInfo();
        s2.displayInfo();
    }
}