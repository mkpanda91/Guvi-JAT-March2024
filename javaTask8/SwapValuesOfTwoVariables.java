//Program 4: To Swap values of two numbers using additional variable
package javaTask8;

import java.util.Scanner;

public class SwapValuesOfTwoVariables {

    public static void main(String[] args) {
        // Declaring variables for 2 numbers and a temporary variable
        float num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        // Accepting 2 numbers from user input
        System.out.println("Enter the First Number");
        num1 = sc.nextFloat();
        System.out.println("Enter the Second Number");
        num2 = sc.nextFloat();

        // Print the numbers before swapping
        System.out.println("Before Swapping, Numbers are: " + num1 + " & " + num2);

        // Logic to Swap the numbers using additional variable
        temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the numbers after swapping
        System.out.println("After Swapping, Numbers are: " + num1 + " & " + num2);
        sc.close();
    }

}
