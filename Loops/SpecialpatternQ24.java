package Loops;

public class SpecialpatternQ24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int n = i;
            for (int j = 1; j <= 3; j++) {
                if (i >= j) {
                    System.out.print(n + " ");
                    n--;
                }
            }
            System.out.println();
        }

    }
}
