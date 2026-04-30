package Controlstatement;

import java.util.*;

public class Trianglevalidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a,b&c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("Triangle is valid");
        } else {
            System.out.print("Triangle is not valid");
        }
        sc.close();
    }

}
