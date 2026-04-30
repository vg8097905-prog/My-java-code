package Controlstatement;

import java.util.*;

public class CheckNumberQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("Number is positive");
        } else if (num < 0) {
            System.out.print("Number ids negative");
        } else {
            System.out.print("Number is zero");
        }
        sc.close();
    }

}
