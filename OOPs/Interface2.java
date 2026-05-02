package OOPs;

interface UPIPayment1 {
    void UPIpay(int amount);
}

interface CardPayment {
    void Cardpay(int amount); // Abstract method
}

class SmartPayment implements UPIPayment1, CardPayment {
    public void UPIpay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    public void Cardpay(int amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        SmartPayment p1 = new SmartPayment();
        p1.UPIpay(500); // Output: Paid 500.0 using UPI.
        p1.Cardpay(1000); // Output: Paid 1000.0 using Card.
    }
}
