package Loops;

public class sumofseriesQ18 {
    public static void main(String[] args) {
        int n = 3, sum = 0, digits = 0;
        for (int i = 1; i <= n; i++) {
            digits = digits * 10 + 1;
            sum += digits;
        }
        System.out.println(sum);
    }
}
