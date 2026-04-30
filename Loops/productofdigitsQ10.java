package Loops;

public class productofdigitsQ10 {
    public static void main(String[] args) {
        int n = 1234, prod = 1;
        while (n > 0) {
            int d = n % 10;
            prod *= d;
            n /= 10;
        }
        System.out.println(prod);
    }
}
