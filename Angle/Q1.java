package Angle;
public class Q1{
    public static void main(String[] args) {
     int n =1;
    for(int i=0;i<3;i++){
        for(int j=0;j<=3;j++){ /*Here we use this condition (j<=i) 
            without using control statement.*/
            if(i>=j){
            System.out.print(n+" ");
           n=n+1;
            }
        }  
        System.out.println("");
      }

    }
}


