package Assignment_3;

public class patternQ19 {
     public static void main(String[] args) {
        int n=1;
        for(int i = 1; i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i>=j){
                    //Here we write same n=n+1, but first initialize n=0;
                    System.out.print(n+" ");
                    n=n+1;
                }      
            } 
               System.out.println();
        }  
     }
}
