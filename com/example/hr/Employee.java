// Java task 12 : Program 1
package com.example.hr;

public class Employee {
    private String name; // string variable declared : represents employee name
    @SuppressWarnings("unused")
    private int id; // integer variable declared : represents employee id
    private double salary; // double variable declared : represents employee salary
    // Parameterized constructor to assign the instance variables during object creation
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // Method to print the Name of the Employee
    public void printName() {
        System.out.println("\nName of the Employee is: " + name);
    }
    // Method to print the Salary of the Employee
    public void printSalary() {
        System.out.println("Salary of the Employee is: " + String.format("%.2f", salary) + " INR ");
    }

}
