package Array;

import java.util.*;

public class SumofElements {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number which you want to sum:");
        int n = sc.nextInt();
        int arry[] = new int[n];
        // input
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        // output
        for (int i = 1; i <= arry.length; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
// 0+1=1
// 1+2=3
// 3+3=6
// 6+4=10