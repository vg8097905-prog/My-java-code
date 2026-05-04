package Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of array: ");
        int n = sc.nextInt();
        int arry[] = new int[n];

        // input
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        int max = arry[0];
        // output
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        System.out.println("Largest element in array:" + max);
        sc.close();
    }
}
