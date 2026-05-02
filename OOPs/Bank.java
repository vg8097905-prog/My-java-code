package OOPs;

class BankAcccount {
    int balance;
    int amount;

    void deposit() {
        System.out.println("balance=" + (balance + amount));
    }

    void withdraw() {
        System.out.println("withdraw=" + (balance - amount));
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAcccount b1 = new BankAcccount();
        b1.balance = 12000;
        b1.amount = 5000;

        b1.deposit();
        b1.withdraw();
    }

}
