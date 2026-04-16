package Assignment_3;

public class AdvancedpatternQ21 {
    public static void main(String[] args) {
        for(int i = 1; i<=3;i++){
            for(int j=1;j<=3;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }   
              System.out.println(); 
        }
    }   
}
