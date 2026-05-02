package OOPs;

class studentrecord {
    String name;
    String Roll_no;

    void display() {
        System.out.println("name is:" + name + "\n" + "Roll_no:" + Roll_no);
    }
}

public class Studentinfo {

    public static void main(String[] args) {

        studentrecord s1 = new studentrecord();
        s1.name = "Vivek";
        s1.Roll_no = "21";

        studentrecord s2 = new studentrecord();
        s2.name = "Abhishek";
        s2.Roll_no = "22";

        s1.display();
        s2.display();
    }
}
