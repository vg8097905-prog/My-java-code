package OOPs;
class Rectangle{
    int length;
    int breadth;

    void area(){
        System.out.println("area="+length*breadth);
}
}
public class Q14 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.length=10;
        R1.breadth=20;

        R1.area();
    }
    
}
