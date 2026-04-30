package OOPs;
class pen{
    String color;
    String type;

    public void write(){
       System.out.println("Help in writing something");
    }
    public void printcolor(){
     System.out.println(this.color);
    }
}

public class Pantonic {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color="blue";
        p1.type="ball pen";

        pen p2 = new pen();
        p2.color="Red";
        p2.type="Gel";

        p1.write();
        p1.printcolor();
        p2.write();
        p2.printcolor();

    }
}
