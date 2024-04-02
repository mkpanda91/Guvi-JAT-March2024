//Program 1: To check the string input is palindrome or not
package javaTask9;

import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String[] args) {
        // Declaration of variables to store the initial input string by user and the
        // reverse string
        String inputString, reverseString = "";
        Scanner sc = new Scanner(System.in);
        // Reading the input string from the user
        System.out.println("Please enter the string required to check for Palindrome");
        inputString = sc.nextLine();
        // Variable declared and initialized with the length of the input string
        int length = inputString.length();
        // Using for loop to fetch the reverse string
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        System.err.println();
        System.out.println("Input String is: " + inputString);

        // Using if condition and equals method to check for Palindrome
        if (reverseString.equalsIgnoreCase(inputString))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
        sc.close();
    }
}
