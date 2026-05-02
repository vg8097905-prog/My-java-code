package OOPs;

// Parent class
abstract class Payment {
    abstract void pay(double amount);
}

// Child classes
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(500); // Output: Paid 500.0 using Credit Card.

        p = new UPIPayment();
        p.pay(300); // Output: Paid 300.0 using UPI.

        p = new CashPayment();
        p.pay(200); // Output: Paid 200.0 in Cash.
    }
}
