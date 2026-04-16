package Assignment_3;

public class countQ11 {
     public static void main(String[] args) {
    int n = 1234, even=0, odd=0;
        while(n > 0){
            int d = n % 10;
            if(d % 2 == 0){
                 even++;
                System.out.println(even);}
            else{
                 odd++;
                 System.out.println(odd);}
            n /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
