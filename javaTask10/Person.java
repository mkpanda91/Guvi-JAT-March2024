//Program 1: Person class to Implement the Constructor and the Setter & Getter methods

//Please refer the "PersonMain" CLASS for the main method
package javaTask10;

public class Person {
    // Class Attributes declared with Private access
    private String name;
    private int age;

    // Default constructor
    public Person() {
        System.out.println("Person class: Welcome to Default constructor");
    }

    // Getter method for Name of the Person
    public String getName() {
        return name;
    }

    // Setter method for Name of the Person
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for Age of the Person
    public int getAge() {
        return age;
    }

    // Setter method for Age of the Person
    public void setAge(int age) {
        this.age = age;
    }

}
