package Assignment_1;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a year:");
        int  Y = sc.nextInt();
      if((Y%4==0 && Y%100!=0) ||( Y%400==0)){
                System.out.print("Leap year");
        }
           else{
            System.out.println("This is not a leap year");
           }
           sc.close();
        }
    }


   

