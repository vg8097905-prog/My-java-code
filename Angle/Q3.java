package Angle;

public class Q3 {
    public static void main(String[] args) {
      int n = 2;
    for(int i=0;i<3;i++){
        for(int j=0;j<=3;j++){ /*Here we use this condition (j<=i) 
            without using control statement.*/
            if(i>=j){
            System.out.print(n+" ");
            n=n*2;
             }
        }  
        System.out.println("");

         }

    }
}


