package Controlstatement;

import java.util.*;

public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {// here we use (num%6==0).
            System.out.println("Special");
        } else if (num % 2 == 0) {
            System.out.println("Even");
        } else if (num % 3 == 0) {
            System.out.println("Three");
        } else {
            System.out.println("Normal");
        }
        sc.close();
    }
}
