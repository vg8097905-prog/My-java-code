package Controlstatement;

import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks < 50) {
            System.out.println("fail");
        } else {
            System.out.println("Invalid number");
        }
        sc.close();

    }

}
