import java.util.Scanner;

public class Employee {

    int employeeId;
    String name;
    double basicSalary;

    void displaySalaryDetails() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        employee.employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        employee.basicSalary = sc.nextDouble();

        employee.displaySalaryDetails();

        sc.close();
    }
}