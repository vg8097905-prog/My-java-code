package OOPs;

class State {
    String name;
    int year;

    // Constructor with one parameter
    State(String n) {
        this(n, 1900); // Calls another constructor in the same class
    }

    // Constructor with two parameters
    State(String n, int a) {
        name = n;
        year = a;
    }

    void display() {
        System.out.println("Name: " + name + ", year: " + year);
    }
}

public class This {
    public static void main(String[] args) {
        State s1 = new State("Uttar Pradesh"); // Calls constructor with one parameter
        State s2 = new State("Punjab", 1990); // Calls constructor with two parameters

        s1.display(); // Output: Name: Vivek, Age: 18
        s2.display(); // Output: Name: Rahul, Age: 22
    }
}
