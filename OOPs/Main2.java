package OOPs;

// Abstract Class
abstract class Employee {

    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    abstract void calculateSalary();

    // Normal Method
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Salary: " + monthlySalary);
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Salary: " + salary);
    }
}

// Main Class
public class Main2 {

    public static void main(String[] args) {

        // Full Time Employee Object
        FullTimeEmployee f1 = new FullTimeEmployee("Rahul", 101, 50000);

        // Part Time Employee Object
        PartTimeEmployee p1 = new PartTimeEmployee("Aman", 102, 5, 500);

        // Display Full Time Employee
        f1.display();
        f1.calculateSalary();

        System.out.println();

        // Display Part Time Employee
        p1.display();
        p1.calculateSalary();
    }
}
