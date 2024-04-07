// Program 2: This class has the main method to invoke the various properties of Employee class
package javaTask10;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        // Declaring variables to store Employee id, First name, Last name, Salary and
        // Percent
        int empId, empSalary, empPercent;
        String empFirstName, empLastName;
        Scanner sc = new Scanner(System.in);

        // Accepting user input for the declared variables
        System.out.println("Enter the Employee Id");
        empId = sc.nextInt();
        System.out.println("Enter the Employee first name");
        empFirstName = sc.next();
        sc.nextLine();
        System.out.println("Enter the Employee last name");
        empLastName = sc.nextLine();
        System.out.println("Enter the Employee salary");
        empSalary = sc.nextInt();

        // Instantiating object of Employee class
        Employee empObj = new Employee(empId, empFirstName, empLastName, empSalary);

        System.out.println();
        // Printing employee details using toString method
        System.out.println(empObj.toString());
        System.out.println();
        // Printing annual salary of the employee
        System.out.println("Annual Salary without percentage hike: " + empObj.getAnnualSalary());
        System.out.println();
        // Accepting the percentage hike and Printing the salary of the employee
        // (inclusive of hike)
        System.out.println("Enter the percentage to increase the Employee salary");
        empPercent = sc.nextInt();
        System.out.println(
                "Monthly Salary of the Employee with " + empPercent + "% hike is: " + empObj.raiseSalary(empPercent));
        sc.close();
    }
}
