package Loops;

public class Sumofsquare {
    public static void main(String[] args) {
        int n = 5,sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            sum=sum+i*i;
        }
        System.out.println("\n"+"sum of square is:"+sum);
        
    }
    
}
