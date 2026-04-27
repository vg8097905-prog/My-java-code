package OOPs;
class circle{
    float radius;

    void area(){
        System.out.println("area="+3.14*radius*radius);
    }
}

public class Q15 {
    public static void main(String[] args) {
        circle a1 = new circle();
        a1.radius=2;

        a1.area();
    }
    
}
