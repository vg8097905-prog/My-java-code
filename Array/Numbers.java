package Array;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index:" + i);
            } else {
                System.out.println("Invalid number");
            }
            // System.out.println((numbers[i]));
        }
        sc.close();
    }
}
// arryname.length=size of array.