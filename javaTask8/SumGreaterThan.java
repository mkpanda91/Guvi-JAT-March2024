//Program 1: To check if Sum of Integers (A & B) is greater than Sum of Integers (C & D)
package javaTask8;

import java.util.Scanner;

public class SumGreaterThan {

    public static void main(String[] args) {
        // Declaring 4 Integer variables
        int int_a, int_b, int_c, int_d;
        Scanner sc = new Scanner(System.in);

        // Accepting value for 4 Integer variables through Scanner
        System.out.println("Enter First Integer value");
        int_a = sc.nextInt();
        System.out.println("Enter Second Integer value");
        int_b = sc.nextInt();
        System.out.println("Enter Third Integer value");
        int_c = sc.nextInt();
        System.out.println("Enter Fourth Integer value");
        int_d = sc.nextInt();
        sc.close();

        // Checking if Sum of First 2 Integers is greater than Sum of other 2 Integers
        if ((int_a + int_b) > (int_c + int_d))
            System.out.println(
                    "Sum of " + int_a + " and " + int_b + " is greater than sum of " + int_c + " and " + int_d);
        else
            System.out.println(
                    "Sum of " + int_a + " and " + int_b + " is not greater than sum of " + int_c + " and " + int_d);
    }
}