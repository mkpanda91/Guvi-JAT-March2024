//Program 5: To Check if a Number is Prime or Not
package javaTask8;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        // Declaring variable to store a number. Counter is used as a variable
        // for counting divisible by numbers
        int int_num, counter = 0;
        Scanner sc = new Scanner(System.in);

        // Accepting the number through user input
        System.out.println("Enter a Number");
        int_num = sc.nextInt();

        // Logic to check if a number is Prime
        if (int_num <= 1)
            counter++;

        for (int i = 2; i < int_num; i++) {
            if (int_num % i == 0)
                counter++;
        }
        if (counter >= 1)
            System.out.println(int_num + " is not a Prime number");
        else
            System.out.println(int_num + " is a Prime number");
        sc.close();

    }

}
