package OOPs;
class student{
        String name = "vivek";
         int age = 19;
         void display(){
            System.out.println( "name is:"+name +"\n"+ "age is:"+age);
        }
    }
public class Q7{
    public static void main(String[] args) {
       student s1 = new student();
       s1.display();
    }

}