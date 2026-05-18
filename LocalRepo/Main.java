
import java.util.Scanner;

import SmartCityManagement.Citizen;
import SmartCityManagement.Complaint;
import SmartCityManagement.ElectricityService;
import SmartCityManagement.Employee;
import SmartCityManagement.WaterService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CityManagement city = new CityManagement();

        int choice;

        do {

            System.out.println("\n===== SMART CITY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Citizen");
            System.out.println("2. Add Employee");
            System.out.println("3. Generate Electricity Bill");
            System.out.println("4. Generate Water Bill");
            System.out.println("5. Register Complaint");
            System.out.println("6. Show Citizens");
            System.out.println("7. Show Employees");
            System.out.println("8. Show Complaints");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Citizen Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Enter Citizen ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Area: ");
                    String area = sc.nextLine();

                    Citizen citizen = new Citizen(cname, cid, area);
                    city.addCitizen(citizen);

                    break;

                case 2:

                    System.out.print("Enter Employee Name: ");
                    String ename = sc.nextLine();

                    System.out.print("Enter Employee ID: ");
                    int eid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    Employee employee = new Employee(ename, eid, dept);
                    city.addEmployee(employee);

                    break;

                case 3:

                    System.out.print("Enter Electricity Units Consumed: ");
                    int eunits = sc.nextInt();

                    ElectricityService es = new ElectricityService(eunits);

                    es.serviceType();
                    es.generateBill();

                    break;

                case 4:

                    System.out.print("Enter Water Units Consumed: ");
                    int wunits = sc.nextInt();

                    WaterService ws = new WaterService(wunits);

                    ws.serviceType();
                    ws.generateBill();

                    break;

                case 5:

                    sc.nextLine();

                    System.out.print("Enter Complaint: ");
                    String text = sc.nextLine();

                    Complaint complaint = new Complaint(text);
                    city.addComplaint(complaint);

                    break;

                case 6:

                    city.displayCitizens();
                    break;

                case 7:

                    city.displayEmployees();
                    break;

                case 8:

                    city.displayComplaints();
                    break;

                case 9:

                    System.out.println("Exiting System...");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}