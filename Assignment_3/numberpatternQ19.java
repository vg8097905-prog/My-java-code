package Assignment_3;

public class numberpatternQ19 {
     public static void main(String[] args) {
        int n=0;
        for(int i = 1; i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i>=j){
                     n=n+1;
                    System.out.print(n+" ");
                   
                }      
            } 
               System.out.println();
        }  
     }
}
