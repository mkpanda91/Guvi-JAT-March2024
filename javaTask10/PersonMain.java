//Program 1: class with main method to invoke the Constructor and the Setter, Getter methods
package javaTask10;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        // Variables declared to store the user input for Name and Age
        int personAge;
        String personName;
        Scanner sc = new Scanner(System.in);

        // Input the person name and age through user input
        System.out.println("Enter the person name");
        personName = sc.nextLine();
        System.out.println("Enter the person age");
        personAge = sc.nextInt();

        System.out.println("----------Output-----------");
        // Creating object of Person class
        Person obj1 = new Person();

        // Invoking the setter methods for name and age
        obj1.setName(personName);
        obj1.setAge(personAge);

        // Invoking the getter methods for name and age
        System.out.println("Person's name is: " + obj1.getName());
        System.out.println("Person's age is: " + obj1.getAge());
        sc.close();

    }

}
