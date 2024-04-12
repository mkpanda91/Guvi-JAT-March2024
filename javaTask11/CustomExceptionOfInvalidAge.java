//Program 7: Invalid age exception if entered age is less than 18
package javaTask11;

import java.util.Scanner;

//class created for custom exception
class InvalidAgeException extends Exception {
    // calling the constructor of parent class (Exception class)
    /*
     * public InvalidAgeException(String string) {
     * super(string);
     * }
     */
    public String toString() {
        // toString method will get Override here
        return "Age must be greater than 18 to vote";
    }
}

public class CustomExceptionOfInvalidAge {
    // method to check if eligible to vote or else throw an object of custom
    // exception
    static void ageCheck(int age) throws InvalidAgeException {
        if (age < 18) {
            InvalidAgeException iException = new InvalidAgeException();
            // throw new InvalidAgeException("Age is not eligible for voting");
            throw iException;
        } else
            System.out.println("As per age limit, user is eligible to vote");
    }

    public static void main(String[] args) {
        // Variable declaration to store Age
        int userAge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter age of the user");
        userAge = sc.nextInt();
        try {
            ageCheck(userAge);
        } catch (InvalidAgeException e) {
            // printing the message from CustomException object
            System.out.println(e.getClass().getSimpleName()+" : "+e);

        }

        sc.close();
    }

}
