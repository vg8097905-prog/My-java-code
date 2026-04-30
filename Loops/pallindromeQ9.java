package Loops;

public class pallindromeQ9 {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
