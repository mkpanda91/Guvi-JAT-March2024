//Program 9: To check whether a person is a Senior Citizen or not
package javaTask8;

import java.util.Scanner;

public class CheckIfSeniorCitizen {
    public static void main(String[] args) {
        int age; // Declaring variable to store age of a person.
        Scanner sc = new Scanner(System.in);

        // Accepting age through user input
        System.out.println("Enter age of a person");
        age = sc.nextInt();

        if (age < 0)
            System.out.println("Entered age is Invalid");
        else if (age >= 60)
            System.out.println("Person is a Senior citizen");
        else
            System.out.println("Person is not a Senior citizen");
        sc.close();
    }

}
