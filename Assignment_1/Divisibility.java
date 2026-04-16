package Assignment_1;
import java.util.*;
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
       
        if(a%3==0 && a%5==0){//Here we write like this(a%==15).
            System.out.println("FizzBuzz");
        }
        else if (a%5==0){
            System.out.println("Buzz");
        }
         else if(a%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.print(a);
        }
        sc.close();
       }
        
    }
    

