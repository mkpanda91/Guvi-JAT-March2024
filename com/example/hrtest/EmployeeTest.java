// Java task 12 : Program 1
package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //Creating an object of Employee class and initialising the same
        Employee emp1 = new Employee("Suraj", 45, 35000);
        //Calling methods to print name and salary of the Employee
        emp1.printName();
        emp1.printSalary();
    }
}
