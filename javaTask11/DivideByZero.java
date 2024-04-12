//Program 4: Handle Divide by Zero exception and display a message to the user
package javaTask11;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Declaration of 2 numbers
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        // Take user input from console
        System.out.println("Please enter First number");
        num1 = sc.nextInt();
        System.out.println("Please enter Second number");
        num2 = sc.nextInt();
        try {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is divisible by " + num2);
            } else
                System.out.println(num1 + " is not divisible by " + num2);
        } catch (ArithmeticException e) {
            // Catch the exception and display the related message
            System.out.println("The Exception occured is: "+e.getMessage());
        }
        sc.close();
    }
}
