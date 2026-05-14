package OOPs;

// Parent Class
class Bank {

    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}

// Child Class SBI
class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI interest rate is 10%");
    }
}

// Child Class HDFC
class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC interest rate is 12%");
    }
}

// Child Class ICICI
class ICICI extends Bank {

    @Override
    void interestRate() {
        System.out.println("ICICI interest rate is 14%");
    }
}

// Main Class
public class bank {

    public static void main(String[] args) {

        SBI s1 = new SBI();
        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();

        s1.interestRate();
        h1.interestRate();
        i1.interestRate();
    }
}