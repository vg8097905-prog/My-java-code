package Assignment_3;

public class countdigitsQ4 {
    public static void main(String[] args) {
        int n = 12345, count = 0;
        while(n > 0){
            n /= 10;
            count++;
            
        }
        System.out.println(count);
    }
    
}
