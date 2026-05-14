package OOPs;

interface Printer {
    void Printing();
}

interface Scanner {
    void Scanning();
}

interface fax {
    void faxing();
}

class All_in_one implements Printer, Scanner, fax {
    public void Printing() {
        System.out.println("Help in print hardcopy ");
    }

    public void Scanning() {
        System.out.println("Help in scan the document");
    }

    public void faxing() {
        System.out.println("Help in deliver the document");
    }
}

public class Mainq1 {
    public static void main(String[] args) {
        All_in_one a1 = new All_in_one();
        a1.Printing();
        a1.Scanning();
        a1.faxing();
    }
}