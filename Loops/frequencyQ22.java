package Loops;

public class frequencyQ22 {
    public static void main(String[] args) {
        int n = 121017151, count = 0;
        while (n > 0) {
            if (n % 10 == 1)
                count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
