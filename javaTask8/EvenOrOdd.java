//Program 2: To check if an integer number is Even or Odd
package javaTask8;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Declaring an Integer variable
        int int_num;
        Scanner sc = new Scanner(System.in);

        // Accepting value for 4 Integer variables through Scanner
        System.out.println("Enter an Integer value");
        int_num = sc.nextInt();
        System.out.println();
        if (int_num % 2 == 0)
            System.out.println(int_num + " is an Even number");
        else
            System.out.println(int_num + " is an Odd number");

        sc.close();

    }
}
