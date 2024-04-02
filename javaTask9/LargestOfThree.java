//Program 7: To check largest of 3 numbers
package javaTask9;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Declaration of variables to store 3 numbers
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        // Reading input from the user
        System.out.println("Enter the First number");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the largest number");
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the largest number");
        else
            System.out.println(num3 + " is the largest number");
        sc.close();
    }
}
