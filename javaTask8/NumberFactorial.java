//Program 6: To find factorial of a Number
package javaTask8;

import java.util.Scanner;

public class NumberFactorial {
    // calling method to find factorial of given number
    static void factorial(int num) {
        // Declaring variable to store factorial of a number.
        long num_factorial = 1;
        for (int i = num; i > 0; i--) {
            num_factorial = num_factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + num_factorial);
    }

    public static void main(String[] args) {
        // Declaring variable to store user input number.
        int int_num;
        Scanner sc = new Scanner(System.in);

        // Accepting the number through user input
        System.out.println("Enter a Number");
        int_num = sc.nextInt();

        // Logic to find factorial of the number entered by user
        if (int_num < 0)
            System.out.println("Factorial of a Negative number is undefined. Please enter a positive integer.");
        else if (int_num == 0) {
            System.out.println("Factorial of " + int_num + " is 1");
        } else
            factorial(int_num);
        sc.close();
    }

}
