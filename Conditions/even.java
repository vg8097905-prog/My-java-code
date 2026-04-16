package Conditions;
import java.util.*;
public class even {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number:");
        int x = sc.nextInt();
        if(x %  2==0){
            System.out.println("Even");   
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }

}
