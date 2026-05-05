
public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("Error:" + a / b);
        } catch (ArithmeticException e) {

            System.out.println("Error: canont divide by zero");
        } finally {
            System.out.println("Error: canont divide by one");
        }

    }
}