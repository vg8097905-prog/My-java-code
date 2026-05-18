public class TCF2 {
    try {
    int arr[] = new int[5];
    arr[10] = 50; // Exception
} catch (ArrayIndexOutOfBoundsException exception2) {
    System.out.println("Array index error");
} catch (Exception exception) {
    System.out.println("General exception");
}
}
