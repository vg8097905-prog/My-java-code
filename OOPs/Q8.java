package OOPs;

 class student {
     String name ;
     String Roll_no;
     void display(){
            System.out.println( "name is:"+name +"\n"+ "Roll_no:"+Roll_no);
        }
    }
public class Q8{
    public static void main(String[] args) {
       student s1 = new student();
       s1.name="Vivek";
       s1.Roll_no="21";

       student s2 = new student();
       s2.name="Wakil";
       s2.Roll_no="21";

       s1.display();
       s2.display();
    }
}
