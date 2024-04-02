//Program 5: To implement Anna University Grading System
package javaTask9;

import java.util.Scanner;

public class UniversityGradingSystem {
    public static void main(String[] args) {
        // Declaring variable to store the marks input by the student
        int marks;
        Scanner sc = new Scanner(System.in);
        // Accepting user input for the mark
        System.out.println("Enter the marks scored by the student");
        marks = sc.nextInt();
        System.out.println();
        // Implementing if..else.. to find the Grade of the student based on marks
        // entered
        if (marks > 100)
            System.out.println("Invalid Input");
        else if (marks == 100)
            System.out.println("Student Grade is: S");
        else if (marks >= 90 && marks <= 99)
            System.out.println("Student Grade is: A");
        else if (marks >= 80 && marks <= 89)
            System.out.println("Student Grade is: B");
        else if (marks >= 70 && marks <= 79)
            System.out.println("Student Grade is: C");
        else if (marks >= 60 && marks <= 69)
            System.out.println("Student Grade is: D");
        else if (marks >= 50 && marks <= 59)
            System.out.println("Student Grade is: E");
        else
            System.out.println("Student Grade is: F");
        sc.close();
    }
}
