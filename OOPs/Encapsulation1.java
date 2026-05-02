package OOPs;

class Account {
    private int balance;

    public int getbalance() {
        return balance;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Account b1 = new Account();
        b1.setbalance(100);
        System.out.println("balance:" + b1.getbalance());
    }
}
