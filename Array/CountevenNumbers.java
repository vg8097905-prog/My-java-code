package Array;

public class CountevenNumbers {
    public static void main(String[] args) {
        int even[] = { 10, 5, 4, 7, 6 };
        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 == 0) {
                System.out.println("print index" + i + even[i]);
            }
        }
    }
}
