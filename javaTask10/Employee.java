/*Program 2: Employee class with attributes and method accepts a certain percentage as input, 
increases the employee salary by this percentage and returns the new salary */

//Please refer the "EmployeeMain" CLASS for the main method
package javaTask10;

public class Employee {
    // Declaration of Instance variables
    private int id, salary;
    private String firstName, lastName;

    // Parameterized constructor to initialize or set the attributes, when an
    // instance is created
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter method for Id of the Employee
    public int getId() {
        return id;
    }

    // Getter method for first name of the Employee
    public String getFirstName() {
        return firstName;
    }

    // Getter method for last name of the Employee
    public String getLastName() {
        return lastName;
    }

    // Getter method for the name of the Employee
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // Getter method for salary of the Employee
    public int getSalary() {
        return salary;
    }

    // Getter method for Annual salary of the Employee
    public int getAnnualSalary() {
        return salary * 12;
    }

    // method to compute new salary with specific percentage and fetch the same
    public int raiseSalary(int percent) {
        int newSalary = 0;
        newSalary = salary + ((percent * salary) / 100);
        return newSalary;
    }

    // for printing the values
    public String toString() {
        String str = "Employee [id = " + getId() + ", name = " + getName() + ", salary = " + getSalary() + "]";
        return str;
    }
}
