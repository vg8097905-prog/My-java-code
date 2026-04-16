package Assignment_2;

public class countdivisiblenumbers {
    public static void main(String[] args) {
        int n = 50 ;int count=0;
        for(int i =1; i<=n;i++){
           if(i%15==0){
            System.out.print(i + ",");
            count++;
             }
        }
        System.out.println("\n"+"count is:"+count);

    
    }
    
}
