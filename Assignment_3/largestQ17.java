package Assignment_3;

public class largestQ17 {
     public static void main(String[] args) {
        int n = 528, max = 0;
        while(n > 0){
            int d = n % 10;
            if(d > max) 
             max = d;
            n /= 10;
        }
        System.out.println(max);
    }
}
